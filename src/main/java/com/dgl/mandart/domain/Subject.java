package com.dgl.mandart.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "subject", cascade=CascadeType.PERSIST)
    @Size(max=9)
    private List<Block> blockList = new ArrayList<>();

    @ManyToOne
    private Mandart mandart;
}
