package com.wlp.services;

import java.io.Serializable;
import java.util.List;

/**
 * interface deve ser implementada por todos os serviços que implementam metodos CRUD
 *
 * @param <T> - tipo de entidade que o serviço manipula
 * @param <S> -  qualquer serializable
 */
public interface ICrudService<T, S extends Serializable> {

    public List<T> getAll();

    public T getById(S id);



    public T create(T entity);

    public T remove(T entity);

    public T update(T entity);
}
