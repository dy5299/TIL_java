package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity     // 데이터베이스 테이블에는 order_detail 로 접근함
@ToString(exclude = {"user", "item"})   // 밑에서 서로 상호참조해서 써 줄 필요. 연관관계하는 변수는 exclude해주는게 좋아.
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderAt;

    // N : 1    OrderDetail 입장에서 many to one
    @ManyToOne
    private User user;      // hibernate를 통해 할 땐 객체를 적어야. 자동으로 user_id를 찾아간다.
//    private Long userId;

    @ManyToOne
    private Item item;
//    private Long itemId;
}
