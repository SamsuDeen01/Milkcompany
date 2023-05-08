package com.example.study.Model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Citizen {
	@Id
	public int citizenid;
	public String citizen;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	public Aadhar ad;

	public int getCitizenid() {
		return citizenid;
	}
	public void setCitizenid(int citizenid) {
		this.citizenid = citizenid;
	}
	public String getCitizen() {
		return citizen;
	}
	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}
	public Aadhar getAd() {
		return ad;
	}
	public void setAd(Aadhar ad) {
		this.ad = ad;
	}

}
