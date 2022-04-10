package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ChiTietSDDV {
	@Id
	@GeneratedValue
	private int maCTSDDV;
	private String tenDV;
	private float donGia;
	private int soLuong;

	@ManyToOne
	@JoinColumn(name = "maSan")
	private SanBong sanBong;

	@ManyToOne
	@JoinColumn(name = "maPhieuSDDV")
	private PhieuSDDV phieuSDDV;
}
