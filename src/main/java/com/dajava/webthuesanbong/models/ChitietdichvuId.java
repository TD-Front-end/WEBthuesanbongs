package com.dajava.webthuesanbong.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChitietdichvuId implements Serializable {
    private static final long serialVersionUID = -6699606923016625716L;
    @Column(name = "MaNuoc", nullable = false)
    private Integer maNuoc;

    @Column(name = "MaPhieuDat", nullable = false)
    private Integer maPhieuDat;

    public Integer getMaNuoc() {
        return maNuoc;
    }

    public void setMaNuoc(Integer maNuoc) {
        this.maNuoc = maNuoc;
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
        ChitietdichvuId entity = (ChitietdichvuId) o;
        return Objects.equals(this.maPhieuDat, entity.maPhieuDat) &&
                Objects.equals(this.maNuoc, entity.maNuoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPhieuDat, maNuoc);
    }
}
