/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.ClientDaoBeanLocal;
import entities.Client;
import javax.ejb.Stateless;

/**
 *
 * @author godwin
 */
@Stateless
public class ClientDaoBean extends GenericDAOBean<Client, Long> implements ClientDaoBeanLocal {

    public ClientDaoBean() {
        super(Client.class);
    }
}
