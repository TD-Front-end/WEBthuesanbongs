package com.dajava.webthuesanbong.models;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nguoidung")
public class Nguoidung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaNguoiDung", nullable = false)
	private Integer id;

	@Column(name = "TenNguoiDung", nullable = false)
	private String tenNguoiDung;

	@Column(name = "Email", nullable = false, length = 100)
	private String email;

	@Column(name = "TenTaiKhoan", nullable = false, length = 100)
	private String tenTaiKhoan;

	@Column(name = "MatKhau", nullable = false, length = 100)
	private String matKhau;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MaVaiTro", insertable=false, updatable=false)
	private Vaitro vaitro;


	private int MaVaiTro;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenNguoiDung() {
		return tenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public int getMaVaiTro() {
		return MaVaiTro;
	}

	public void setMaVaiTro(int maVaiTro) {
		this.MaVaiTro = maVaiTro;
	}





}
