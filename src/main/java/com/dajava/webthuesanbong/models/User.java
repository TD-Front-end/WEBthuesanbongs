package com.dajava.webthuesanbong.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int user_id;	
	private String password;
	private String username;
	//
	@OneToMany(mappedBy="user")
	private List<ChuSan> chusans;
	//
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<ChuSan> getChusans() {
		return chusans;
	}
	public void setChusans(List<ChuSan> chusans) {
		this.chusans = chusans;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
