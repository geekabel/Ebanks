/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.local.CompteEpargneDaoBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.CompteEpargne;
import java.util.logging.Logger;
import javax.ejb.EJB;
import services.local.CompteEpargneServiceBeanLocal;

/**
 *
 * @author godwin
 */
public class CompteEpargneServiceBean extends GenericServiceBean<CompteEpargne, Long>
        implements CompteEpargneServiceBeanLocal {

    @EJB
    private CompteEpargneDaoBeanLocal dao;

    private final Logger logger;

    public CompteEpargneServiceBean() {
        this.logger = Logger.getLogger(CompteEpargneServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<CompteEpargne, Long> getDAO() {
        return this.dao;
    }
}
