/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.TransactionDaoBeanLocal;
import entities.Transaction;
import javax.ejb.Stateless;

/**
 *
 * @author godwin
 */
@Stateless
public class TransactionDaoBean extends GenericDAOBean<Transaction, Long> implements TransactionDaoBeanLocal {
     public TransactionDaoBean() {
        super(Transaction.class);
    }
}
