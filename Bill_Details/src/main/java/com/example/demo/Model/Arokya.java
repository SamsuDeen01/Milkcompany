package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductBillDetails")
public class Arokya {
	@Id
	public int id;
	public String name;
	public String quantity;
	public int pieces;
	public float costperpiece;
	public float sellercost;
	public double mrp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public float getCostperpiece() {
		return costperpiece;
	}
	public void setCostperpiece(float costperpiece) {
		this.costperpiece = costperpiece;
	}
	public float getSellercost() {
		return sellercost;
	}
	public void setSellercost(float sellercost) {
		this.sellercost = sellercost;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	@Override
	public String toString() {
		return "Arokya [id=" + id + ", name=" + name + ", quantity=" + quantity + ", pieces=" + pieces
				+ ", costperpiece=" + costperpiece + ", sellercost=" + sellercost + ", mrp=" + mrp + "]";
	}
}


