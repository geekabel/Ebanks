/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.local.GenericDAOBeanLocal;
import entities.Client;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.ClientServiceBeanLocal;

/**
 *
 * @author godwin
 */
@Stateless
public class ClientServiceBean extends GenericServiceBean<Client, Long> 
        implements ClientServiceBeanLocal{
    
    @EJB
    private ClientServiceBeanLocal dao;
    
    private final Logger logger;

    public ClientServiceBean() {
        this.logger = Logger.getLogger(ClientServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<Client, Long> getDAO() {
        return (GenericDAOBeanLocal<Client, Long>) this.dao;
    }
    
     @Override
    public void addOne(Client e) {
        this.getDAO().addOne(e);
    }

    @Override
    public Client getOne(Long idAgence) {
        return this.getDAO().getOne(idAgence);
    }
    
    @Override
    public List<Client> getAll() {
        return this.getDAO().getAll();
    }
}
