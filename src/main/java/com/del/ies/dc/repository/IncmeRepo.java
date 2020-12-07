package com.del.ies.dc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.dc.entity.CreatePlanEntity;
import com.del.ies.dc.entity.IncomePlnEntity;

public interface IncmeRepo extends JpaRepository<IncomePlnEntity,Serializable>{

}
