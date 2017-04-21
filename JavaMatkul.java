package com.ursabyte.pisaaksidb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_matkul")
public class JavaMatkul {
	
	@Id
	@Column(name = "academic_subjects_id")
	@SequenceGenerator(name = "pk_sequence", sequenceName = "academic_subjects_academic_subjects_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	private long kode_mk;

	@Column(name = "nama_matkul")
	private String namaMatkul;
	
	@Column(name = "sks")
	private String sks;

	public long getKode_mk() {
		return kode_mk;
	}

	public void setKode_mk(long kode_mk) {
		this.kode_mk = kode_mk;
	}

	public String getNamaMatkul() {
		return namaMatkul;
	}

	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}

	public String getSks() {
		return sks;
	}

	public void setSks(String sks) {
		this.sks = sks;
	}
	
	
}
