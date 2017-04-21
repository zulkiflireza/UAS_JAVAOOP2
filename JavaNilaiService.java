package com.ursabyte.pisaaksidb.service;

import java.util.List;

import com.ursabyte.pisaaksidb.model.JavaNilai;

public interface JavaNilaiService {
	void saveNilai(JavaNilai javaNilai);
	List<JavaNilai> getAllData();
}
