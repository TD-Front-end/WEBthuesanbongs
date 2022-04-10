package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DonThanhToan {
	@Id
    @GeneratedValue
    private int maDTT;
    private long tongTien;
    private boolean ttThanhToan;
    
    @ManyToOne
    @JoinColumn(name="maHTTT")
    private HinhThucThanhToan hinhThucThanhToan;
    
    @ManyToOne
    @JoinColumn(name="userName")
    private KhachHang khachHang;
    
    @ManyToOne
    @JoinColumn(name = "maDDS")
    private DonDatSan donDatSan;
    
    @ManyToOne
    @JoinColumn(name="maPhieuSDDV")
    private PhieuSDDV phieuSDDV;
}
