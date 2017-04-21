package com.ursabyte.pisaaksidb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_mahasiswa")
public class JavaMahasiswa {

	@Id
	@Column(name = "academic_subjects_id")
	@SequenceGenerator(name = "pk_sequence", sequenceName = "academic_subjects_academic_subjects_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	private long nim;

	@Column(name = "nama")
	private String namaMahasiswa;

	@Column(name = "tanggal_lahir")
	private Date tanggalLahir  ;
	
	@Column(name = "alamat")
	private String alamat;
	
	@Column(name = "phone")
	private String phone;

	public long getNim() {
		return nim;
	}

	public void setNim(long nim) {
		this.nim = nim;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
