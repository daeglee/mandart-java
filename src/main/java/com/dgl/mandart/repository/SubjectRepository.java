package com.dgl.mandart.repository;

import com.dgl.mandart.domain.Block;
import com.dgl.mandart.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
