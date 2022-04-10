package com.dajava.webthuesanbong.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuSan {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int maChuSan;
	private String tenChuSan;
    private String sDT;
	private String userName;
	private String passWord;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
