package com.dgl.mandart.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Mandart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String title;

    @OneToMany(mappedBy = "mandart", cascade=CascadeType.PERSIST)
    @Size(max=9)
    private List<Subject> subjectList = new ArrayList<>();
}
