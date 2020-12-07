package com.del.ies.co.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.co.triggers.entity.COTriggerEntity;




public interface CORepository extends JpaRepository<COTriggerEntity,Serializable>{

	
}
