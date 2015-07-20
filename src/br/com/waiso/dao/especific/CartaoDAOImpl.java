package br.com.waiso.dao.especific;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.CartaoEntity;

public class CartaoDAOImpl extends JpaGenericDao<CartaoEntity> implements ICartaoDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	public CartaoDAOImpl() {
		entityManager = getEntityManager();
	}
	
	
}