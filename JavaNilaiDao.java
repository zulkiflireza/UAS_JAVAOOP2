package com.ursabyte.pisaaksidb.dao;

import java.util.List;

import com.ursabyte.pisaaksidb.model.JavaNilai;

public interface JavaNilaiDao {
	void saveNilai(JavaNilai javaNilai);
	List<JavaNilai> getAllData();
}
