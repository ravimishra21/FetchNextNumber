package com.fetchNextNumber.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fetchNextNumber.dao.FetchRepository;
import com.fetchNextNumber.entities.Fetch;
import com.fetchNextNumber.service.FetchApiService;




@RestController
public class MyController {
	
	@Autowired
	private FetchApiService fetchApiService;
	
	@GetMapping("/fetchNextNumber/{categoryCodeId}")
	public ResponseEntity<Fetch> getFetch(@PathVariable("categoryCodeId") int categoryCodeId){
		
		Fetch fetch= fetchApiService.getFetchNumberByCategoryId(categoryCodeId);
		 if(fetch == null) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 return ResponseEntity.of(Optional.of(fetch));
	}
	
//	new book Adding handler
	@PostMapping("/addFetchValue")
	public ResponseEntity<Fetch> addFetchValue(@RequestBody Fetch fetch){
		
		Fetch f=null;
		try {
			f=this.fetchApiService.addCategoryCode(fetch);
			return ResponseEntity.of(Optional.of(f));
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
