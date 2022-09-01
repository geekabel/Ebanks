/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.local;

import java.io.Serializable;
import java.util.List;


/**
 *@author godwin
 * @param <E> L'entité qui implemente le GéneriqueDaoBean
 * @param <ID> La clé primaire de l'entité
 */
public interface GenericDAOBeanLocal<E extends Serializable, ID> {

    /**
     * Persiste l'objet passé en paramètre.
     *
     * @param e L'objet à persister.
     */
    void addOne(E e);

    E addOneWithFlush(E e);

    E updateOne(E e);

    void deleteOne(E e);

    void deleteOne(ID id);

    void deleteAll();

    E getOne(ID id);

    List<E> getAll();

    Long count();

    boolean exists(ID id);
}
