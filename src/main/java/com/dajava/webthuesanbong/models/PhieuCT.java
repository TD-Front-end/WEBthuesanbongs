package com.dajava.webthuesanbong.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class PhieuCT {
	@Id
    @GeneratedValue
    private int maPCT;
    private String ngayNhap;
    @ManyToOne
    @JoinColumn(name="maChuSan")
    private ChuSan chuSan;
    
    @OneToMany
    private List<ChiTietPCT> chiTietPCTS;
}
