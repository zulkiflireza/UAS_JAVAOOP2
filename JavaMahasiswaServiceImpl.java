package com.ursabyte.pisaaksidb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ursabyte.pisaaksidb.dao.JavaMahasiswaDao;
import com.ursabyte.pisaaksidb.model.JavaMahasiswa;

@Service
public class JavaMahasiswaServiceImpl implements JavaMahasiswaService{

	@Autowired
	JavaMahasiswaDao javaMahasiswaDao;
	
	
	public JavaMahasiswaDao getJavaMahasiswaDao() {
		return javaMahasiswaDao;
	}


	public void setJavaMahasiswaDao(JavaMahasiswaDao javaMahasiswaDao) {
		this.javaMahasiswaDao = javaMahasiswaDao;
	}

	@Transactional
	@Override
	public JavaMahasiswa getbyUsername(String nama) {
		// TODO Auto-generated method stub
		return this.javaMahasiswaDao.getbyUsername(nama);
	}

}
