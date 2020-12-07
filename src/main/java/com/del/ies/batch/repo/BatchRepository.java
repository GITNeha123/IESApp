package com.del.ies.batch.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.batch.entity.BatchEntity;


public interface BatchRepository extends JpaRepository<BatchEntity,Serializable> {

}
