package com.ursabyte.pisaaksidb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ursabyte.pisaaksidb.model.JavaMahasiswa;
import com.ursabyte.pisaaksidb.model.JavaMatkul;

@Service
public class JavaMatkulServiceImpl implements JavaMatkulService{
	
	@Autowired
	JavaMatkulService javaMatkulService;

	public JavaMatkulService getJavaMatkulService() {
		return javaMatkulService;
	}

	public void setJavaMatkulService(JavaMatkulService javaMatkulService) {
		this.javaMatkulService = javaMatkulService;
	}

	@Transactional
	@Override
	public JavaMatkul getbyNamaMatkul(String namaMatkul) {
		// TODO Auto-generated method stub
		 return this.javaMatkulService.getbyNamaMatkul(namaMatkul);
	}
	
	
}
