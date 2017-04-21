package com.ursabyte.pisaaksidb.model;


public class JavaNilaiApi {
	
	private String nama;
	private String matkul;
	private long nim;
	private long kode_mk;
	private String index_nilai;
	private int nilai;

	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getMatkul() {
		return matkul;
	}
	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}
	public String getIndex_nilai() {
		return index_nilai;
	}
	public void setIndex_nilai(String index_nilai) {
		this.index_nilai = index_nilai;
	}
	public int getNilai() {
		return nilai;
	}
	public void setNilai(int nilai) {
		this.nilai = nilai;
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
	
}
