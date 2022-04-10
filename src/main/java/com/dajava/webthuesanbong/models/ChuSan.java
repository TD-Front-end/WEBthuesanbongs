package com.dajava.webthuesanbong.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "maChuSan")
public class ChuSan {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int maChuSan;
	private String tenChuSan;
    private String sDT;	
	//
	@ManyToOne
	@JoinColumn(name="user_id", insertable=false, updatable=false)
	private User user;
	private int user_id;
	//
	public int getMaChuSan() {
		return maChuSan;
	}
	public void setMaChuSan(int maChuSan) {
		this.maChuSan = maChuSan;
	}
	public String getTenChuSan() {
		return tenChuSan;
	}
	public void setTenChuSan(String tenChuSan) {
		this.tenChuSan = tenChuSan;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}

}
