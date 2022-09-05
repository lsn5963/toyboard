package com.study.board.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //테이블을 의미한다.
@Getter
@Setter
public class Board {
    public Board(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }


    public Board(){

    }
    @Id //primary key를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mariadb에서 사용하는 것
    private Integer id;
    private String title;
    private String content;

    private String filename;

    private String filepath;
}
