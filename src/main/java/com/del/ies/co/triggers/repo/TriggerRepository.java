package com.del.ies.co.triggers.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.co.triggers.domain.COTrigger;
import com.del.ies.co.triggers.entity.COTriggerEntity;


public interface TriggerRepository extends JpaRepository<COTriggerEntity,Serializable> {

	public COTriggerEntity findByTriStatus(Integer cId);
}
