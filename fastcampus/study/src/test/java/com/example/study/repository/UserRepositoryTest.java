package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import org.apache.tomcat.jni.Local;
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
        String account = "Test01";
        String password = "Test01";
        String status = "REGISTERED";
        String email = "Test01@gmail.com";
        String phoneNumber = "010-1111-2222";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser = userRepository.save(user);

        Assertions.assertNotNull(newUser);

    }

    @Test
    @Transactional      // 써야 오류가 안 나네. (없을 때 오류는 아래 forEach 문장)
    public void read(){

        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-1111-2222");

        if(user != null) {
            user.getOrderGroupList().stream().forEach(orderGroup -> {

                System.out.println("--------------주문묶음---------------------");
                System.out.println("수령인 : " + orderGroup.getRevName());
                System.out.println("수령지 : " + orderGroup.getRevAddress());
                System.out.println("총금액 : " + orderGroup.getTotalPrice());
                System.out.println("총수량 : " + orderGroup.getTotalQuantity());


                System.out.println("--------------주문상세---------------------");
                orderGroup.getOrderDetailList().forEach(orderDetail -> {
                    System.out.println("파트너사 이름 : "+orderDetail.getItem().getPartner().getName());
                    System.out.println("파트너사 카테고리 : "+orderDetail.getItem().getPartner().getCategory().getTitle());
                    System.out.println("주문 상품 : "+orderDetail.getItem().getName());
                    System.out.println("고객센터 번호 : "+orderDetail.getItem().getPartner().getCallCenter());
                    System.out.println("주문의 상태 : "+orderDetail.getStatus());
                    System.out.println("도착예정일자 : "+orderDetail.getArrivalDate());


                });

            });
        }

        Assertions.assertNotNull(user);
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
