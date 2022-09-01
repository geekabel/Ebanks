/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entities.CompteEpargne;
import javax.ejb.Stateless;

/**
 *
 * @author godwin
 */
@Stateless
public class ComptEpargneDaoBean extends GenericDAOBean<CompteEpargne, Long> {
    
      public ComptEpargneDaoBean() {
        super(CompteEpargne.class);
    }
}
