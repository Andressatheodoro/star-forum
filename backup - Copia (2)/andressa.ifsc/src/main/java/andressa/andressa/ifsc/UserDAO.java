package andressa.andressa.ifsc;

import java.util.List;

import javax.persistence.EntityManager;

import andressa.database.Conn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class UserDAO implements InterfaceDAO<Criar> {


	private static ObservableList<Criar> criarr;

	@Override
	public Criar get(String id) {
		if (criarr != null) 
			for (Criar criar : criarr) 
				if (criar.getTitle().contentEquals(id))
					return criar;

		EntityManager entityMng = Conn.getEntityManager();
		Criar criar = entityMng.find(Criar.class, id);
		entityMng.close();
		return criar;
	}

	@Override
	public List<Criar> getAll() {
		if (criarr == null) {
			EntityManager entityMng = Conn.getEntityManager();
			criarr = FXCollections.observableArrayList(
					entityMng.createQuery("select user from Criar as user", Criar.class).getResultList());
			entityMng.close();
		}
		return criarr;
	}

	@Override
	public void add(Criar criar) {
		EntityManager entityMng = Conn.getEntityManager();
		entityMng.getTransaction().begin();
		entityMng.persist(criar);
		entityMng.getTransaction().commit();

		if (criarr != null)
			criarr.add(criar);
	}

	@Override
	public void delete(Criar obj) {
		EntityManager entityMng = Conn.getEntityManager();
		entityMng.getTransaction().begin();
		Criar userDB = entityMng.find(Criar.class, obj.getTitle());
		entityMng.remove(userDB);
		entityMng.getTransaction().commit();
		entityMng.close();

		Criar found = null;
		if (criarr != null)
			for (Criar criar : criarr)
				if (criar.getTitle().contentEquals(obj.getTitle()))
					found = criar;
		if (found != null)
			criarr.remove(found);
	}

	@Override
	public void update(Criar obj) {
		EntityManager entityMng = Conn.getEntityManager();
		entityMng.getTransaction().begin();
		Criar userDB = entityMng.find(Criar.class, obj.getTitle());
		userDB.setTitle(obj.getTitle());
		
		
		entityMng.getTransaction().commit();
		entityMng.close();

		if (criarr != null) {
			for (Criar criar : criarr) {
				if (criar.getTitle().contentEquals(obj.getTitle())) {
					criar.setTitle(obj.getTitle());
					
				}
			}
		}

	}
}
