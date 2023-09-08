package Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Perssone;
import util.HiberneteUtil;

public class PersonneController {
	public void savePerssone(Perssone prs) {
		Transaction transaction = null;
		try (Session session = HiberneteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(prs);
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void updatePerssone(Perssone prs) {
		Transaction transaction = null;
		try (Session session = HiberneteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			 Perssone s=session.get(Perssone.class, prs.getId());
			s.setNom(prs.getNom());
			s.setPrenom(prs.getPrenom());
			s.setAge(prs.getAge());
			session.save(prs);
			

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deletePerssone(long l) {

		Transaction transaction = null;
		try (Session session = HiberneteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a student object
			Perssone perssone = session.get(Perssone.class, l);
			if (perssone != null) {
				session.delete(perssone);
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public Perssone getPerssone(int id) {

		Transaction transaction = null;
		Perssone student = null;
		try (Session session = HiberneteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// get an student object
			student = session.get(Perssone.class, id);
			
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return student;
	}


	public List<Perssone> getPerssone() {
		try (Session session = HiberneteUtil.getSessionFactory().openSession()) {
			return session.createQuery(" from Perssone", Perssone.class).list();
		}
	}
}
