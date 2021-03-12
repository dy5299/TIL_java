package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private String content;


    // 1:N
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetailList;

//    Fetch
//    LAZY: 지연로딩. SELECT * FROM item WHERE id=?
//    EAGER:즉시로딩. 연관관계가 설정된 모든 테이블에 대해서 JOIN. 1:1 관계 시 사용추천
}
