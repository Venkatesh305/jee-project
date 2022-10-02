package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="orders")
public class Orders {
	
	@Id	
	@Column(name="id")
	int id;
	
	@Column(name="orderId")
	int orderId;
	
	@Column(name="orderedPersonName")
	String orderedPersonName;
	
	@Column(name="product_id")
	int productId;
	
	@Column(name="quantity")
	int quantity;
}










