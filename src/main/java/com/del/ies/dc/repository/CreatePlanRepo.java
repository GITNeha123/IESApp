package com.del.ies.dc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.dc.entity.CreateCaseEntity;
import com.del.ies.dc.entity.CreatePlanEntity;

public interface CreatePlanRepo extends JpaRepository<CreatePlanEntity,Serializable>{ 

}
