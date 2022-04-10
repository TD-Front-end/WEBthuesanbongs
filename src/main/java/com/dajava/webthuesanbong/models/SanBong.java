package com.dajava.webthuesanbong.models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "maSan")
public class SanBong {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maSan;
	private String tenSan;
	private String dienTich;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime thoiGianDat;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime thoiGianTra;
	private String diaChi;
	private String tinhTrang;
	private Double donGia;
	@ManyToOne
	@JoinColumn(name="maKhu", insertable=false, updatable=false)
	private KhuVuc khuvuc;
	private int maKhu;
	//
	public Integer getMaSan() {
		return maSan;
	}
	public void setMaSan(Integer maSan) {
		this.maSan = maSan;
	}
	public String getTenSan() {
		return tenSan;
	}
	public void setTenSan(String tenSan) {
		this.tenSan = tenSan;
	}
	public String getDienTich() {
		return dienTich;
	}
	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	public int getMaKhu() {
		return maKhu;
	}
	public void setMaKhu(int maKhu) {
		this.maKhu = maKhu;
	}
	public LocalDateTime getThoiGianDat() {
		return thoiGianDat;
	}
	public void setThoiGianDat(LocalDateTime thoiGianDat) {
		this.thoiGianDat = thoiGianDat;
	}
	public LocalDateTime getThoiGianTra() {
		return thoiGianTra;
	}
	public void setThoiGianTra(LocalDateTime thoiGianTra) {
		this.thoiGianTra = thoiGianTra;
	}
	
}
