/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.utils.entity;

/**
 *
 * @author jimenezelkg
 */
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class requestConsulta {

    @Getter
    @Setter
    private String accountNumber;
    @Getter
    @Setter
    private String customerIdentification;
    @Getter
    @Setter
    private String idCategory;
    @Getter
    @Setter
    private String idSubcategory;
    @Getter
    @Setter
    private String idCustomerVoice;
    @Getter
    @Setter
    private String idCloseCode;
    @Getter
    @Setter
    private String service;
    @Getter
    @Setter
    private String node;
    @Getter
    @Setter
    private String CCMM;
    @Getter
    @Setter
    private String idCase;
    @Getter
    @Setter
    private String status;
    @Getter
    @Setter
    private String fechaIncio;
    @Getter
    @Setter
    private String fechaFin;
    @Getter
    @Setter
    private String caseAssignmentGroup;

    public boolean lleno(String campo) {
        if (campo == null || campo.equals("") || campo.equals("\"\"") || campo.equals("null")) {
            return false;
        } else {
            return true;
        }
    }

    public requestConsulta crearValidaciones(requestConsulta request) {
        requestConsulta actualizado = new requestConsulta();

        // NUMERO DE CUENTA
        if (lleno(request.getAccountNumber())) {
            actualizado.setAccountNumber("p.accountNumber='" + request.getAccountNumber() + "' ");
        } else {
            actualizado.setAccountNumber("");
        }

        // NUMERO DE DOCUMENTO
        if (lleno(request.getCustomerIdentification())) {
            actualizado.setCustomerIdentification("AND p.customerIdentification='" + request.getCustomerIdentification() + "' ");
        } else {
            actualizado.setCustomerIdentification("");
        }

        // ID DE LA CATEGORIA
        if (lleno(request.getIdCategory())) {
            actualizado.setIdCategory("AND p.idCategory='" + request.getIdCategory() + "' ");
        } else {
            actualizado.setIdCategory("");
        }

        // ID DE SUBCATEGORIA
        if (lleno(request.getIdSubcategory())) {
            actualizado.setIdSubcategory("AND p.idSubcategory='" + request.getIdSubcategory() + "' ");
        } else {
            actualizado.setIdSubcategory("");
        }

        // ID VOZ DEL CLIENTE
        if (lleno(request.getIdCustomerVoice())) {
            actualizado.setIdCustomerVoice("AND p.idCustomerVoice='" + request.getIdCustomerVoice() + "' ");
        } else {
            actualizado.setIdCustomerVoice("");
        }

        // ID CODIGO CIERRE
        if (lleno(request.getIdCloseCode())) {
            actualizado.setIdCloseCode("AND p.idCloseCode='" + request.getIdCloseCode() + "' ");
        } else {
            actualizado.setIdCloseCode("");
        }

        // SERVICIO
        if (lleno(request.getService())) {
            actualizado.setService("AND p.service='" + request.getService() + "' ");
        } else {
            actualizado.setService("");
        }

        // NODO
        if (lleno(request.getNode())) {
            actualizado.setNode("AND p.node='" + request.getNode() + "' ");
        } else {
            actualizado.setNode("");
        }

        // CCMM
        if (lleno(request.getCCMM())) {
            actualizado.setCCMM("AND p.ccmm='" + request.getCCMM() + "' ");
        } else {
            actualizado.setCCMM("");
        }

        // ID_CASE
        if (lleno(request.getIdCase())) {
            actualizado.setIdCase("AND p.idCase='" + request.getIdCase() + "' ");
        } else {
            actualizado.setIdCase("");
        }

        // STATUS
        if (lleno(request.getStatus())) {
            actualizado.setStatus("AND p.status='" + request.getStatus() + "' ");
        } else {
            actualizado.setStatus("");
        }

        // CASE_ASSIGNMENT_GROUP
        if (lleno(request.getCaseAssignmentGroup())) {
            actualizado.setCaseAssignmentGroup("AND p.caseAssignmentGroup='" + request.getCaseAssignmentGroup() + "' ");
        } else {
            actualizado.setCaseAssignmentGroup("");
        }

        // FECHAS
        if (lleno(request.getFechaIncio() + "") && lleno(request.getFechaFin() + "")) {
            actualizado.setFechaIncio("AND p.dateCase BETWEEN '" + request.getFechaIncio() + "' AND '" + request.getFechaFin() + "'");
        } else {
            actualizado.setFechaIncio("");
        }

        return actualizado;
    }

    public boolean validarNulos(requestConsulta request) {
        if (request.getAccountNumber() != null
                || request.getCustomerIdentification() != null
                || request.getIdCategory() != null
                || request.getIdSubcategory() != null
                || request.getIdCustomerVoice() != null
                || request.getIdCloseCode() != null
                || request.getService() != null
                || request.getNode() != null
                || request.getCCMM() != null
                || request.getIdCase() != null
                || request.getCaseAssignmentGroup() != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean algunCampo(requestConsulta request) {
        if (lleno(request.getAccountNumber())
                || lleno(request.getCustomerIdentification())
                || lleno(request.getIdCategory())
                || lleno(request.getIdSubcategory())
                || lleno(request.getIdCustomerVoice())
                || lleno(request.getIdCloseCode())
                || lleno(request.getService())
                || lleno(request.getNode())
                || lleno(request.getCCMM())
                || lleno(request.getIdCase())
                || lleno(request.getCaseAssignmentGroup())
                || lleno(request.getFechaIncio() + "")
                || lleno(request.getFechaFin() + "")) {
            return true;
        } else {
            return false;
        }
    }

    public String limpiarCampo(String campo) {
        if (lleno(campo)) {
            return campo.replace("\"", "");
        } else {
            return null;
        }
    }

}
