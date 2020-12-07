package com.del.ies.dc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.ar.entity.RegistrationEntity;
import com.del.ies.dc.entity.CreateCaseEntity;

public interface  CaseCreateRepo extends JpaRepository<CreateCaseEntity,Serializable>{ 

	
}
