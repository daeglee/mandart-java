package com.dgl.mandart.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;



    @ManyToOne
    private Subject subject;
}
