
import dao.GenericDAOBean;
import dao.local.AgenceDaoBeanLocal;
import entities.Agence;
import javax.ejb.Stateless;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author godwin
 */
@Stateless
public class AgenceDaoBean extends GenericDAOBean<Agence, Long> implements AgenceDaoBeanLocal {

    public AgenceDaoBean() {
        super(Agence.class);
    }
}
