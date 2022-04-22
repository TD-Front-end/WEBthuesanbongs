package com.dajava.webthuesanbong.models;


import javax.persistence.*;

@Entity
@Table(name = "vaitro")
public class Vaitro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaVaiTro", nullable = false)
    private Integer id;

    @Column(name = "TenVaiTro", nullable = false, length = 50)
    private String tenVaiTro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }
}
