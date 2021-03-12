package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor      // 기본 생성자
@Entity
@ToString(exclude = {"orderGroup"})

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

    // user 1 : OrderGroup N
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<OrderGroup> orderGroupList;
}
