package com.epam.campus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="payrolls")
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="employee_id" , nullable = false ,unique = true)
	private Employee employee;
	
	@Column(name="salary",nullable = false)
	private double salary;
	
	@Column(name="bonus",nullable=false)
	private double bonus;
	
	@Column(name="total_pay",nullable=false)
	private double totalPay;

	public Payroll() {
		super();
	}

	public Payroll(Employee employee, double salary, double bonus) {
		super();
		this.employee = employee;
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		this.totalPay=this.salary+this.bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
		this.totalPay=this.salary+this.bonus;
	}

	public double getTotalPay() {
		return totalPay;
	}

	@Override
	public String toString() {
		return "Payroll [id=" + id + ", employee=" + employee + ", salary=" + salary + ", bonus=" + bonus
				+ ", totalPay=" + totalPay + "]";
	}

	
	
	
}
	


