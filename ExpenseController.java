package com.expensetracker.exptrc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expensetracker.exptrc.model.Expense;
import com.expensetracker.exptrc.service.ExpenseService;

@RestController

public class ExpenseController {
	
	 @Autowired
	    private ExpenseService service;
	 
	  @PostMapping("/expenses")
	  
	  public Expense addExpense(@RequestBody Expense expense) {
		  
	        return service.addExpense(expense);
	        }
	  
	  @GetMapping("/expenses")
	  
	    public List<Expense> getExpenses() {
		  
	        return service.getAllExpenses();
	        
	        }
	  @DeleteMapping("/expenses/{id}")
	    public String deleteExpense(@PathVariable int id) {
		  
	        service.deleteExpense(id);
	        return "Deleted Successfully";
	        
	    }
	  
	  }
