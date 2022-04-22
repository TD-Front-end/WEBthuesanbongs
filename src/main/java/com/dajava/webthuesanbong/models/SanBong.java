package com.dajava.webthuesanbong.models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.*;

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
	@Column(name = "MaSanBong", nullable = false)
	private Integer id;

	@Column(name = "TenSanBong", nullable = false)
	private String tenSanBong;

	@Column(name = "AnhSan")
	private String anhSan;

	@Column(name = "DiaChi")
	private String diaChi;

	@Column(name = "ChieuRong")
	private Integer chieuRong;

	@Column(name = "ChieuDai")
	private Integer chieuDai;

	@Column(name = "DonGia", nullable = false)
	private Double donGia;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MaKhuVuc", nullable = false)
	private KhuVuc maKhuVuc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenSanBong() {
		return tenSanBong;
	}

	public void setTenSanBong(String tenSanBong) {
		this.tenSanBong = tenSanBong;
	}

	public String getAnhSan() {
		return anhSan;
	}

	public void setAnhSan(String anhSan) {
		this.anhSan = anhSan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Integer getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(Integer chieuRong) {
		this.chieuRong = chieuRong;
	}

	public Integer getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(Integer chieuDai) {
		this.chieuDai = chieuDai;
	}

	public Double getDonGia() {
		return donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public KhuVuc getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(KhuVuc maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}
	
}
