package com.dgl.mandart.repository;

import com.dgl.mandart.domain.Mandart;
import com.dgl.mandart.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MandartRepository extends JpaRepository<Mandart, Long> {

}
