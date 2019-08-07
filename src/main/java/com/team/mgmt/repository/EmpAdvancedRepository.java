package com.team.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.entity.EmpBasic;

public interface EmpAdvancedRepository extends JpaRepository<EmpAdvanced, Long>{

}
