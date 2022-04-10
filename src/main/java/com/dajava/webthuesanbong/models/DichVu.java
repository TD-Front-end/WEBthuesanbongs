package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class DichVu {
	@Id
	@GeneratedValue
	private int maDV;
	private String tenDV;
	private float donGia;
	private long tgDat;
	@ManyToOne
	@JoinColumn(name = "maChuSan")
	private ChuSan chuSan;
	@OneToMany
	List<PhieuSDDV> phieuSDDVS;
}
