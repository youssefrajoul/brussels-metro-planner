package dao;

import exception.RepositoryException;

import java.util.List;

public interface Dao<K, T> {
    K create(T item) throws RepositoryException;

    void read(K key) throws RepositoryException;

    void update(T item) throws RepositoryException;

    void delete(K key) throws RepositoryException;

    List<T> selectAll() throws RepositoryException;
}
