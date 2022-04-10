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
public class HinhThucThanhToan {
	@Id
    @GeneratedValue
    private int maHTTT;
    private String tenHTTT;
    @OneToMany
    private List<DonThanhToan> donThanhToans = new ArrayList<>();
}
