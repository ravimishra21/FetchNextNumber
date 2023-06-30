package com.fetchNextNumber.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="fetchNextNumberApi")
public class Fetch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="categoryCodeId")
	private int categoryCodeId;
	private int value;
	private int newValue;
	
	

	public Fetch(int categoryCodeId, int value ,int newValue) {
		super();
		this.categoryCodeId = categoryCodeId;
		this.value = value;
		this.newValue = newValue;
	}
	
	public Fetch() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCategoryCodeId() {
		return categoryCodeId;
	}
	public void setCategoryCodeId(int categoryCodeId) {
		this.categoryCodeId = categoryCodeId;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getNewValue() {
		return newValue;
	}

	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}

	@Override
	public String toString() {
		return "Fetch [categoryCodeId=" + categoryCodeId + ", value=" + value + "]";
	}
	
	

}
