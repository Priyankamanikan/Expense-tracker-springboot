package com.expensetracker.exptrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensetracker.exptrc.model.Expense;

public interface ExpenseRepository extends JpaRepository <Expense, Integer>{ 

}
