package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor      // 기본 생성자
@Entity
//@Table(name = "user")     // class name과 table name이 동일하다면 굳이 선언 안 해도 자동으로 mapping
public class User {

    @Id     // 식별자
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

//    @Column(name="account")       // column name과 동일하면 선언 안 해도 됨
    private String account;

    private String password;

    private String status;

    private String email;

    private String phoneNumber;     // underbar 안 맞춰도 JPA가 자동 매칭

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

//    // 1:N
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")  // 객체이름 user
//    private List<OrderDetail> orderDetailList;
}
