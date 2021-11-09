package br.com.fiap.dao;

import java.util.List;

public interface IDataHandler<T> {

	public List<?> getAll();

	public T getById(int id);

	public int add(T obj);

	public int delete(int id);

	public int update(T obj);
	
}