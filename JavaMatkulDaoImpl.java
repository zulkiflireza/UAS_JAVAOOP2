package com.ursabyte.pisaaksidb.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ursabyte.pisaaksidb.model.JavaMahasiswa;
import com.ursabyte.pisaaksidb.model.JavaMatkul;


@Repository
public class JavaMatkulDaoImpl implements JavaMatkulDao{
	
	private static final Logger logger = LoggerFactory.getLogger(PetugasDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Transactional
	@Override
	public JavaMatkul getbyNamaMatkul(String namaMatkul) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM JavaMatkul WHERE LOWER(namaMatkul) = :namaMatkul");
		query.setString("namaMatkul", namaMatkul);
		
		try {
			if (query.list().isEmpty()) {
				return null;
			}

			return (JavaMatkul) query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
