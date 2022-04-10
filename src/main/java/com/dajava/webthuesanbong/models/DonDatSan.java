package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class DonDatSan {
	@Id
	@GeneratedValue
	private int maDDS;
	private long ngayDat;
	private long gioDat;
	private long ngayLapDon;

	@OneToMany
	private List<DonThanhToan> donThanhToans;
	
	@OneToMany
    private List<ChiTietDDS> chiTietDDSList;
}
