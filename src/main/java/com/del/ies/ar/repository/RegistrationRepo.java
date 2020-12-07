package com.del.ies.ar.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.ar.entity.RegistrationEntity;

public interface RegistrationRepo extends JpaRepository<RegistrationEntity,Serializable>{
	public RegistrationEntity findByArID(String arID);
}
