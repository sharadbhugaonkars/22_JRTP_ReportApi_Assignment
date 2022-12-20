package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PlanHolder;
import com.example.demo.repo.PlanHolderRepository;
import com.example.demo.service.IPlanHolderService;

@Service

public class PlanHoderServiceImpl implements IPlanHolderService {
	
	@Autowired
	private PlanHolderRepository repo;
	
	public List<PlanHolder> getReportByPlanNameStatus(){
		
		List<PlanHolder> list =repo.findByPlanNameAndPlanStatus("Life Insurance","A");
		
		return list;
	}
	

}
