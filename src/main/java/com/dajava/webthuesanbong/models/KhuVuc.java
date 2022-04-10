package com.dajava.webthuesanbong.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhuVuc {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maKhu;	
	private String tenKhu;
	private String diaChi;
    private Double donGia;
    
    @OneToMany(mappedBy="khuvuc")
	private List<SanBong> sanbongs;
    //
    public Integer getMaKhu() {
		return maKhu;
	}

	public void setMaKhu(Integer makhu) {
		this.maKhu = makhu;
	}

	public String getTenKhu() {
		return tenKhu;
	}

	public void setTenKhu(String tenKhu) {
		this.tenKhu = tenKhu;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Double getDonGia() {
		return donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public List<SanBong> getSanbongs() {
		return sanbongs;
	}

	public void setSanbongs(List<SanBong> sanbongs) {
		this.sanbongs = sanbongs;
	}
    

}
