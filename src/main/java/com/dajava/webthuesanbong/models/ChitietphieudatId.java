package com.dajava.webthuesanbong.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChitietphieudatId implements Serializable {
    private static final long serialVersionUID = -530486169955114308L;
    @Column(name = "MaSanBong", nullable = false)
    private Integer maSanBong;

    @Column(name = "MaPhieuDat", nullable = false)
    private Integer maPhieuDat;

    public Integer getMaSanBong() {
        return maSanBong;
    }

    public void setMaSanBong(Integer maSanBong) {
        this.maSanBong = maSanBong;
    }

    public Integer getMaPhieuDat() {
        return maPhieuDat;
    }

    public void setMaPhieuDat(Integer maPhieuDat) {
        this.maPhieuDat = maPhieuDat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ChitietphieudatId entity = (ChitietphieudatId) o;
        return Objects.equals(this.maPhieuDat, entity.maPhieuDat) &&
                Objects.equals(this.maSanBong, entity.maSanBong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPhieuDat, maSanBong);
    }
}
