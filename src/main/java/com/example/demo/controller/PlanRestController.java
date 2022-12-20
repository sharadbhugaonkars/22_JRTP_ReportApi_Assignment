package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PlanHolder;
import com.example.demo.service.IPlanHolderService;
@RestController
@RequestMapping("/v1/api")
public class PlanRestController {
	
	@Autowired
	private IPlanHolderService service;
	
     @GetMapping("/show")
	 public ResponseEntity<List<PlanHolder>> getReportByPlanNameStatus() {
	
    	 List<PlanHolder> list = service.getReportByPlanNameStatus();
    	 
    	 return ResponseEntity.ok(list);
}
   
}