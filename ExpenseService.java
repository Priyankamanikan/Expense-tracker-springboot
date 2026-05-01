package com.expensetracker.exptrc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensetracker.exptrc.model.Expense;
import com.expensetracker.exptrc.repository.ExpenseRepository;

@Service
public class ExpenseService {
	 @Autowired
	 private ExpenseRepository repository;
	 
	 public Expense addExpense(Expense expense)
	 {
		 return repository.save(expense);
	 }
	 public List<Expense> getAllExpenses(){
		 return repository.findAll();
		 
	 }
	 public void deleteExpense( int id) {
		 repository.deleteById(id);
	 }
	
}
