package br.com.waiso.dao.generic;

import java.io.Serializable;
import java.util.List;

public interface IDao<T extends Serializable> {

	void insert(T entity);
	void insertAll(List<T> entities);
	void update(T entity);
	void delete(Integer primaryKey) throws Exception;
	List<T> findAll();
	List<T> findEspecific(Integer id);
	T findById(Integer primaryKey);
	
}