package com.del.ies.ed.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.ed.entity.EligliblityDetilsEntity;

public interface EDRepository extends JpaRepository<EligliblityDetilsEntity,Serializable>{

}
