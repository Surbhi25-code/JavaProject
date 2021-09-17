package com.rupali.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Eid")
	int eid;
	
	@Column(name="Basic")
	int basic;
	
	@Column(name="DA")
	int da;
	
	@Column(name="HRA")
	int hra;
	
	@Column(name="TotalCL")
	int totalCl;
	
	
	//no argument constructor
	public Employee() {}

	//constructor with fields
	public Employee(int eid, int basic, int da, int hra, int totalCl) {
		super();
		this.eid = eid;
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.totalCl = totalCl;
	}

	public Employee(int basic, int da, int hra, int totalCl) {
		super();
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.totalCl = totalCl;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getTotalCl() {
		return totalCl;
	}

	public void setTotalCl(int totalCl) {
		this.totalCl = totalCl;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", basic=" + basic + ", da=" + da + ", hra=" + hra + ", totalCl=" + totalCl
				+ "]";
	}
	
	
	
	
	

}
