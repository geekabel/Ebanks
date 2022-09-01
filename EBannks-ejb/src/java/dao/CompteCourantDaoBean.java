/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.CompteCourantDaoBeanLocal;
import entities.CompteCourant;
import javax.ejb.Stateless;

/**
 *
 * @author godwin
 */
@Stateless
public class CompteCourantDaoBean extends GenericDAOBean<CompteCourant, Long> implements CompteCourantDaoBeanLocal {
    
     public CompteCourantDaoBean() {
        super(CompteCourant.class);
    }
}
