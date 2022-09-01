/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author godwin
 */
@Entity
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTrans;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateTrans;
    private Float montant;
    private String typeTrans;

    @ManyToOne
    @JoinColumn(name="idCompte")
    private Compte compte;

    public Transaction() {
    }

    public Transaction(Integer idTrans, Date dateTrans, Float montant, String typeTrans) {
        this.idTrans = idTrans;
        this.dateTrans = dateTrans;
        this.montant = montant;
        this.typeTrans = typeTrans;
    }

    public Integer getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(Integer idTrans) {
        this.idTrans = idTrans;
    }

    public Date getDateTrans() {
        return dateTrans;
    }

    public void setDateTrans(Date dateTrans) {
        this.dateTrans = dateTrans;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public String getTypeTrans() {
        return typeTrans;
    }

    public void setTypeTrans(String typeTrans) {
        this.typeTrans = typeTrans;
    }

}
