/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.local;

import entities.CompteCourant;
import javax.ejb.Local;

/**
 *
 * @author godwin
 */
@Local
public interface CompteCourantDaoBeanLocal extends GenericDAOBeanLocal<CompteCourant, Long> {
    
}
