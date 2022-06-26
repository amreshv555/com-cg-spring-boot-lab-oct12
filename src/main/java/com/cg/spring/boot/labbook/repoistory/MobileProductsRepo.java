package com.cg.spring.boot.labbook.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spring.boot.labbook.model.MobileProducts;

public interface MobileProductsRepo extends JpaRepository<MobileProducts,Integer>{

}
