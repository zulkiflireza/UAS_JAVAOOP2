package com.ursabyte.pisaaksidb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ursabyte.pisaaksidb.model.AcademicSubjects;
import com.ursabyte.pisaaksidb.model.JavaNilai;

@Repository
public class JavaNilaiDaoImpl implements JavaNilaiDao{

	private static final Logger logger = LoggerFactory.getLogger(PetugasDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Transactional
	@Override
	public void saveNilai(JavaNilai javaNilai) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(javaNilai);
	}

	@Transactional
	@Override
	@SuppressWarnings("unchecked")
	public List<JavaNilai> getAllData() {
		Session session = this.sessionFactory.getCurrentSession();
		List<JavaNilai> listnilai = session.createQuery("from JavaNilai").list();
		return listnilai;
	}

}
