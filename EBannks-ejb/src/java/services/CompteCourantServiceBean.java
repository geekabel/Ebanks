/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.local.CompteCourantDaoBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.CompteCourant;
import java.util.logging.Logger;
import javax.ejb.EJB;
import services.local.CompteCourantServiceBeanLocal;

/**
 *
 * @author godwin
 */
public class CompteCourantServiceBean extends GenericServiceBean<CompteCourant, Long> 
        implements CompteCourantServiceBeanLocal {
    
    
    @EJB
    private CompteCourantDaoBeanLocal dao;
    
    private final Logger logger;

    public CompteCourantServiceBean() {
        this.logger = Logger.getLogger(CompteCourantServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<CompteCourant, Long> getDAO() {
        return this.dao;
    }
   
}
