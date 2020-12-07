package com.del.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.admin.entity.PlanEntity;

public interface PlainRegistrationRepo extends JpaRepository<PlanEntity,Serializable> {

}
