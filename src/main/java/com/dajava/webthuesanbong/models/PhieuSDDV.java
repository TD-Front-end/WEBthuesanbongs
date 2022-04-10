package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class PhieuSDDV {
	@Id
    @GeneratedValue
    private int maPhieuSDDV;
    private long ngayDat;
    private long gioDat;
    private long ngayLapPhieu;
    
    @ManyToOne
    @JoinColumn(name = "maDV")
    private DichVu dichVu;
    
    @OneToMany
    private List<DonThanhToan> donThanhToans;
    @OneToMany
    private List<ChiTietSDDV> chiTietSDDVS;
    
}
