package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PlanHolder;


public interface PlanHolderRepository extends JpaRepository<PlanHolder, Integer> {

	
	//SQL: SELECT * FROM PlanHolder WHERE PlanName="PlanName" AND PlanStatus="PlanStatus";
		List<PlanHolder> findByPlanNameAndPlanStatus(String expression1,String expression2);

}
