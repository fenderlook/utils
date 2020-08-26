/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.utils.ws;

import co.com.claro.utils.entity.Parametros;
import co.com.claro.utils.entity.requestConsulta;
import co.com.claro.utils.entity.responseConsulta;
import co.com.claro.utils.facade.ParametrosFacade;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 *
 * @author omarMad
 */
@Path("utils")
@Stateless
@TransactionManagement
public class WsUtilsService {

    public WsUtilsService() {
    }

    @EJB
    private ParametrosFacade pqrFacade;

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("consulta")
    public responseConsulta consulta(
            @QueryParam("accountNumber") String numCuenta,
            @QueryParam("customerIdentification") String numDocumento,
            @QueryParam("idCategory") String idCategoria,
            @QueryParam("idSubcategory") String idSubCategoria,
            @QueryParam("idCustomerVoice") String idVozCliente,
            @QueryParam("idCloseCode") String idCodigoCierre,
            @QueryParam("service") String servicio,
            @QueryParam("node") String nodo,
            @QueryParam("CCMM") String CCMM,
            @QueryParam("fechaInicio") String fechaInicio,
            @QueryParam("fechaFin") String fechaFin,
            @QueryParam("idCase") String idDelCaso,
            @QueryParam("status") String status,
            @QueryParam("caseAssignmentGroup") String caseAssignmentGroup
    ) {
        responseConsulta response = new responseConsulta();
        try {
            requestConsulta request = new requestConsulta();
            request.setAccountNumber(request.limpiarCampo(numCuenta));
            request.setCustomerIdentification(request.limpiarCampo(numDocumento));
            request.setIdCategory(request.limpiarCampo(idCategoria));
            request.setIdSubcategory(request.limpiarCampo(idSubCategoria));
            request.setIdCustomerVoice(request.limpiarCampo(idVozCliente));
            request.setIdCloseCode(request.limpiarCampo(idCodigoCierre));
            request.setService(request.limpiarCampo(servicio));
            request.setNode(request.limpiarCampo(nodo));
            request.setCCMM(request.limpiarCampo(CCMM));
            request.setFechaIncio(request.limpiarCampo(fechaInicio));
            request.setFechaFin(request.limpiarCampo(fechaFin));
            request.setIdCase(request.limpiarCampo(idDelCaso));
            request.setStatus(request.limpiarCampo(status));
            request.setCaseAssignmentGroup(request.limpiarCampo(caseAssignmentGroup));
            if (request.lleno(request.getAccountNumber()) || request.lleno(request.getCaseAssignmentGroup()) || request.lleno(request.getService()) || request.lleno(request.getIdCase())) {
                if (request.validarNulos(request)) {
                    if (request.algunCampo(request)) {
                        request = request.crearValidaciones(request);
                        response = pqrFacade.consultaCasos(request);
                    } else {
                        response.isValid = false;
                        response.description = "Parametro(s) sin contenido para la consulta de casos tecnicos.";
                        response.results = null;
                    }
                } else {
                    response.isValid = false;
                    response.description = "Se debe enviar minimo un parametro valido para realizar la consulta de casos tecnicos.";
                    response.results = null;
                }
            } else {
                // CUANDO NI LA CUENTA NI EL SERVICIO NI EL ID DEL CASO LLEGA
                response.isValid = false;
                response.description = "Se debe enviar el número de la cuenta, el servicio, el id del caso o el grupo resolutor para realizar la consulta de casos tecnicos.";
                response.results = null;
            }
        } catch (Exception e) {
            // ERROR INESPERADO EN EL SERVICIO DE CONSULTA
            response.isValid = false;
            response.description = "Falla en el servicio de consulta de casos tecnicos. Descripcion: " + e.getMessage();
            response.results = null;
        }
        return response;
    }
}
