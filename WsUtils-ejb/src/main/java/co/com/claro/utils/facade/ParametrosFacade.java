/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.utils.facade;

import co.com.claro.utils.entity.Parametros;
import co.com.claro.utils.entity.requestConsulta;
import co.com.claro.utils.entity.responseConsulta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jimenezelkg
 */
@Stateless
public class ParametrosFacade extends AbstractFacade<Parametros> {

    @PersistenceContext(unitName = "QueryCase")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParametrosFacade() {
        super(Parametros.class);
    }

    public responseConsulta consultaCasos(requestConsulta request) {
        responseConsulta response = new responseConsulta();
        try {
            String query = "SELECT p FROM Parametros p WHERE ";
            String consulta = request.getAccountNumber()
                    + request.getCustomerIdentification()
                    + request.getIdCategory()
                    + request.getIdSubcategory()
                    + request.getIdCustomerVoice()
                    + request.getIdCloseCode()
                    + request.getService()
                    + request.getNode()
                    + request.getCCMM()
                    + request.getIdCase()
                    + request.getStatus()
                    + request.getCaseAssignmentGroup()
                    + request.getFechaIncio();
            int buscarAnd = "AND".indexOf(consulta.substring(0, 2));
            if (buscarAnd != -1) {
                consulta = consulta.substring(3, consulta.length() - 1);
            }
            List<Parametros> casos = (List<Parametros>) em.createQuery(query + consulta).getResultList();
            if (casos.size() > 0) {
                response.isValid = true;
                response.description = "Transaction complete";
                response.results = casos;
            } else {
                response.isValid = false;
                response.description = "No se encontraron casos tecnicos con los campos enviados para la consulta.";
                response.results = null;
            }
        } catch (Exception e) {
            response.isValid = false;
            response.description = "Falla en la consulta a la base de datos. Descripcion: " + e.getMessage();
            response.results = null;
        }
        return response;
    }

}
