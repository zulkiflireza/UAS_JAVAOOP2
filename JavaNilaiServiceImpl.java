package com.ursabyte.pisaaksidb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ursabyte.pisaaksidb.dao.JavaNilaiDao;
import com.ursabyte.pisaaksidb.model.JavaNilai;

@Service
public class JavaNilaiServiceImpl implements JavaNilaiService{
	
	@Autowired
	JavaNilaiDao javaNilaiDao; 
	
	public JavaNilaiDao getJavaNilaiDao() {
		return javaNilaiDao;
	}

	public void setJavaNilaiDao(JavaNilaiDao javaNilaiDao) {
		this.javaNilaiDao = javaNilaiDao;
	}

	@Transactional
	@Override
	public void saveNilai(JavaNilai javaNilai) {
		// TODO Auto-generated method stub
		this.javaNilaiDao.saveNilai(javaNilai);
	}

	@Transactional
	@Override
	public List<JavaNilai> getAllData() {
		// TODO Auto-generated method stub
		return this.javaNilaiDao.getAllData();
	}

}
