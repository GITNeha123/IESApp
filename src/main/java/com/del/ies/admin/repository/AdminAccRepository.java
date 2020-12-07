package com.del.ies.admin.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.admin.entity.PlanEntity;

public interface AdminAccRepository extends JpaRepository<AdminAccEntity,Serializable> {
	public AdminAccEntity findByEmail(String email);
	public AdminAccEntity findByEmail(Integer id);
	public List<AdminAccEntity> findByRole(String role);
	
	
	}


