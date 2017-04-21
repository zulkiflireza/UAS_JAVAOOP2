package com.ursabyte.pisaaksidb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_nilai")
public class JavaNilai {
	
	@Id
	@Column(name = "academic_subjects_id")
	@SequenceGenerator(name = "pk_sequence", sequenceName = "academic_subjects_academic_subjects_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	private long id_nilai;

	@Column(name = "nama_matkul")
	private long nim;
	
	@Column(name = "sks")
	private long kode_mk;
	
	@Column(name = "index_nilai")
	private String index_nilai;

	public long getId_nilai() {
		return id_nilai;
	}

	public void setId_nilai(long id_nilai) {
		this.id_nilai = id_nilai;
	}

	public long getNim() {
		return nim;
	}

	public void setNim(long nim) {
		this.nim = nim;
	}

	public long getKode_mk() {
		return kode_mk;
	}

	public void setKode_mk(long kode_mk) {
		this.kode_mk = kode_mk;
	}

	public String getIndex_nilai() {
		return index_nilai;
	}

	public void setIndex_nilai(String index_nilai) {
		this.index_nilai = index_nilai;
	}

	
}
