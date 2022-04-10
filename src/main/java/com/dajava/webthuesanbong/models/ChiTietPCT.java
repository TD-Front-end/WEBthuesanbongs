package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ChiTietPCT {
	 @Id
	    @GeneratedValue
	    private int maCTPCT;
	    private float giaCT;
	    private int sl;
	    @ManyToOne
	    @JoinColumn(name = "maSan")
	    private SanBong sanBong ;
	    @ManyToOne
	    @JoinColumn(name = "maPCT")
	    private PhieuCT phieuCT ;
}
