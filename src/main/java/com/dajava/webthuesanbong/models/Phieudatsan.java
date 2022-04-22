package com.dajava.webthuesanbong.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "phieudatsan")
public class Phieudatsan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaPhieuDat", nullable = false)
    private Integer id;

    @Column(name = "NgayDat", nullable = false)
    private LocalDate ngayDat;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MaNguoiDung", nullable = false)
    private Nguoidung maNguoiDung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Nguoidung getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(Nguoidung maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }


}
