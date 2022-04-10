package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ChiTietDDS {
	@Id
	@GeneratedValue
	private int maChiTietDDS;
	private String tenSan;
	private float donGia;
	private float tienCoc;
	@ManyToOne
	@JoinColumn(name = "maSan")
	private SanBong sanBong;
	@ManyToOne
	@JoinColumn(name = "maDDS")
	private DonDatSan donDatSan;
}
