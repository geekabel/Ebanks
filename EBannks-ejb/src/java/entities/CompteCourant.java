/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author godwin
 */
@Entity
@DiscriminatorValue("Courant")
public class CompteCourant extends Compte implements Serializable {


    private Integer fraisVersement;


    public CompteCourant(){

    }

    public Integer getFraisVersement() {
        return fraisVersement;
    }

    public void setFraisVersement(Integer fraisVersement) {
        this.fraisVersement = fraisVersement;
    }
    
}
