package com.icia.member.memberproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_imcreament
    @Column(name = "member_id") // 별도 컬럼이름 지정할 때
    private Long id;

    // memberEmail: 크기 50, unique
    @Column(length = 50, unique = true) //카멜케이스는 자동으로 언더바 붙여버림
    private String memberEmail;

    // memberPassword: 크기 20
    @Column(length = 20)
    private String memberPassword;

    // Column 생략하면 default 크기 255로 지정됨
    private String memberName;
}
