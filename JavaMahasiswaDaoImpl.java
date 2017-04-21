package com.ursabyte.pisaaksidb.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ursabyte.pisaaksidb.model.JavaMahasiswa;
import com.ursabyte.pisaaksidb.model.UserTb;

@Repository
public class JavaMahasiswaDaoImpl implements JavaMahasiswaDao{

	private static final Logger logger = LoggerFactory.getLogger(PetugasDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Transactional
	@Override
	public JavaMahasiswa getbyUsername(String nama) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM JavaMahasiswa WHERE LOWER(nama) = :nama");
		query.setString("username", nama);
		
		try {
			if (query.list().isEmpty()) {
				return null;
			}

			return (JavaMahasiswa) query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
