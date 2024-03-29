package com.team.mgmt.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.entity.EmpBasic;

public interface EmpAdvancedRepository extends JpaRepository<EmpAdvanced, Long> {
	@Transactional
	@Modifying
	@Query("DELETE FROM EmpAdvanced a WHERE a.employeeId= ?1")
	void deleteEmpDetails(EmpBasic empBasic);
}
