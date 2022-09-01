/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.local.AgenceDaoBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.Agence;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.AgenceServiceBeanLocal;

/**
 *
 * @author godwin
 */
@Stateless
public class AgenceServiceBean extends GenericServiceBean<Agence, Long>
        implements AgenceServiceBeanLocal {

    @EJB
    private AgenceDaoBeanLocal dao;

    private final Logger logger;

    public AgenceServiceBean() {
        this.logger = Logger.getLogger(AgenceServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<Agence, Long> getDAO() {
        return this.dao;
    }

    @Override
    public void addOne(Agence e) {
        this.getDAO().addOne(e);
    }

    @Override
    public Agence getOne(Long idAgence) {
        return this.getDAO().getOne(idAgence);
    }
    
    @Override
    public List<Agence> getAll() {
        return this.getDAO().getAll();
    }
}
