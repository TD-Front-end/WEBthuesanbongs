package com.dajava.webthuesanbong.models;


import javax.persistence.*;

@Entity
@Table(name = "nuocgiaikhat")
public class Nuocgiaikhat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNuoc", nullable = false)
    private Integer id;

    @Column(name = "TenNuoc", nullable = false)
    private String tenNuoc;

    @Column(name = "DonGia")
    private Double donGia;

    @Column(name = "DVT", length = 20)
    private String dvt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }
}
