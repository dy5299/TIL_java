package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // String sql = insert into user (%s, %s, %d) value (account, email, age);
        // 식으로 커리문으로 값을 매칭하여 실행했었어.
        // JPA는 object로 DB를 관리할 수 있도록 도와주는 툴
        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);
        System.out.println("newUser : "+newUser);
    }

    @Test
    @Transactional      // 써야 오류가 안 나네. (없을 때 오류는 아래 forEach 문장) 왜지
    public void read(){
//        Optional<User> user = userRepository.findById(3L);      // L은 Long이기 때문
        // select row 시 보통 SQL 구문으로. select * from user where id = ?
        Optional<User> user = userRepository.findByAccount("TestUser03");

        user.ifPresent(selectUser ->{
            // order ERD 테스트
            selectUser.getOrderDetailList().stream().forEach(detail ->{
                Item item = detail.getItem();
                System.out.println(item);
            });

            // User table 연결 테스트
//            System.out.println("user : "+selectUser);
//            System.out.println("email : "+selectUser.getEmail());
        });
    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);  // 2번 select

        user.ifPresent(selectUser ->{
//            selectUser.setId(3L);     // 위에서 2L로 찾았는데 3L을 설정하면 3L을 update하는 것이므로 주의
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });

    }

    @Test
    @Transactional      // rollback 됨. for Testing
    public void delete(){       // delete는 row가 지워지므로 반환형이 없다.
        Optional<User> user = userRepository.findById(3L);

        Assertions.assertTrue(user.isPresent());        // true

        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });


        Optional<User> deleteUser = userRepository.findById(3L);

        // 존재 확인
//        if(deleteUser.isPresent()){
//            System.out.println("데이터 존재 : "+deleteUser.get());
//        }else {
//            System.out.println("데이터 삭제 데이터 없음");
//        }

        // 존재 확인 2
        Assertions.assertFalse(deleteUser.isPresent());     // false

    }



}
