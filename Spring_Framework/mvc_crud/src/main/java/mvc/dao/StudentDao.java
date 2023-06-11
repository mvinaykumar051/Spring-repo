package mvc.dao;

import java.util.List;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import mvc.dto.Student;

@Component
public class StudentDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = emf.createEntityManager();

	public void save(Student student) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}

	public List<Student> fetchAll() {
		return manager.createQuery("select x from Student x").getResultList();
	}

	public List<Student> FetchByName(String name) {
		return manager.createQuery("select x from Student x where name=?1").setParameter(1, name).getResultList();
	}

	public void delete(int id) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(manager.find(Student.class, id));
		transaction.commit();
	}

	public Student FetchById(int id) {

		return manager.find(Student.class, id);
	}

	public void update(Student student) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(student);
		transaction.commit();
	}
}
