/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.utils.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jimenezelkg
 */
@Entity
@Table(name = "PQR_CASE_CV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametros.findAll", query = "SELECT p FROM Parametros p")
})
public class Parametros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @Getter
    @Setter
    private Long id;
    @Size(max = 300)
    @Column(name = "REQUEST")
    @Getter
    @Setter
    private String request;
    @Size(max = 300)
    @Column(name = "REASON")
    @Getter
    @Setter
    private String reason;
    @Size(max = 20)
    @Column(name = "PHONE_NUMBER")
    @Getter
    @Setter
    private String phoneNumber;
    @Size(max = 100)
    @Column(name = "ADDRESSED_TO")
    @Getter
    @Setter
    private String addressedTo;
    @Size(max = 100)
    @Column(name = "APPLICANT_NAME")
    @Getter
    @Setter
    private String applicantName;
    @Size(max = 100)
    @Column(name = "APPLICANT_SURNAME")
    @Getter
    @Setter
    private String applicantSurname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    @Getter
    @Setter
    private String email;
    @Size(max = 20)
    @Column(name = "CONTACT_NUMBER")
    @Getter
    @Setter
    private String contactNumber;
    @Size(max = 4000)
    @Column(name = "REQUEST_OBJECT")
    @Getter
    @Setter
    private String requestObject;
    @Size(max = 4000)
    @Column(name = "FACTS_REQUEST")
    @Getter
    @Setter
    private String factsRequest;
    @Size(max = 100)
    @Column(name = "ACCOUNT_NUMBER")
    @Getter
    @Setter
    private String accountNumber;
    @Size(max = 100)
    @Column(name = "TRANSACTION")
    @Getter
    @Setter
    private String transaction;
    @Column(name = "ID_STATE")
    @Getter
    @Setter
    private Short idState;
    @Column(name = "DATE_CASE")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date dateCase;
    @Size(max = 100)
    @Column(name = "ID_CATEGORY")
    @Getter
    @Setter
    private String idCategory;
    @Size(max = 100)
    @Column(name = "ID_SUBCATEGORY")
    @Getter
    @Setter
    private String idSubcategory;
    @Size(max = 100)
    @Column(name = "ID_CUSTOMER_VOICE")
    @Getter
    @Setter
    private String idCustomerVoice;
    @Size(max = 100)
    @Column(name = "ID_CLOSE_CODE")
    @Getter
    @Setter
    private String idCloseCode;
    @Size(max = 100)
    @Column(name = "ORIGIN_CASE")
    @Getter
    @Setter
    private String originCase;
    @Column(name = "CASE_DATE_END")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date caseDateEnd;
    @Column(name = "CASE_HOUR")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date caseHour;
    @Column(name = "CASE_HOUR_END")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date caseHourEnd;
    @Size(max = 100)
    @Column(name = "CHANNEL")
    @Getter
    @Setter
    private String channel;
    @Size(max = 100)
    @Column(name = "ADVISER")
    @Getter
    @Setter
    private String adviser;
    @Size(max = 4000)
    @Column(name = "COMMENTS")
    @Getter
    @Setter
    private String comments;
    @Size(max = 100)
    @Column(name = "CUSTOMER_IDENTIFICATION")
    @Getter
    @Setter
    private String customerIdentification;
    @Size(max = 20)
    @Column(name = "PERSON_REPORT")
    @Getter
    @Setter
    private String personReport;
    @Size(max = 100)
    @Column(name = "NAME_PERSON_REPORT")
    @Getter
    @Setter
    private String namePersonReport;
    @Size(max = 100)
    @Column(name = "NODE")
    @Getter
    @Setter
    private String node;
    @Size(max = 100)
    @Column(name = "CCMM")
    @Getter
    @Setter
    private String ccmm;
    @Size(max = 100)
    @Column(name = "PRODUCT")
    @Getter
    @Setter
    private String product;
    @Size(max = 100)
    @Column(name = "SERVICE")
    @Getter
    @Setter
    private String service;
    @Size(max = 100)
    @Column(name = "SUBSERVICE")
    @Getter
    @Setter
    private String subservice;
    @Size(max = 100)
    @Column(name = "FUNCTIONALITY")
    @Getter
    @Setter
    private String functionality;
    @Size(max = 100)
    @Column(name = "STATUS_REASON")
    @Getter
    @Setter
    private String statusReason;
    @Size(max = 100)
    @Column(name = "TIME_BY_STATE")
    @Getter
    @Setter
    private String timeByState;
    @Size(max = 100)
    @Column(name = "SLA")
    @Getter
    @Setter
    private String sla;
    @Size(max = 300)
    @Column(name = "ADDRESS_FAILS")
    @Getter
    @Setter
    private String addressFails;
    @Size(max = 100)
    @Column(name = "CITY")
    @Getter
    @Setter
    private String city;
    @Size(max = 100)
    @Column(name = "DEPARTMENT")
    @Getter
    @Setter
    private String department;
    @Size(max = 100)
    @Column(name = "LATITUDE")
    @Getter
    @Setter
    private String latitude;
    @Size(max = 100)
    @Column(name = "LONGITUDE")
    @Getter
    @Setter
    private String longitude;
    @Size(max = 100)
    @Column(name = "SECTOR")
    @Getter
    @Setter
    private String sector;
    @Size(max = 100)
    @Column(name = "ZONE")
    @Getter
    @Setter
    private String zone;
    @Size(max = 100)
    @Column(name = "ZONE_TYPE")
    @Getter
    @Setter
    private String zoneType;
    @Size(max = 4000)
    @Column(name = "DIAGNOSIS_LEVEL")
    @Getter
    @Setter
    private String diagnosisLevel;
    @Size(max = 4000)
    @Column(name = "TYPIFICATION_CLOSE_CASE")
    @Getter
    @Setter
    private String typificationCloseCase;
    @Size(max = 4000)
    @Column(name = "DIAGNOSTIC_GUIDE")
    @Getter
    @Setter
    private String diagnosticGuide;
    @Size(max = 100)
    @Column(name = "CAUSE")
    @Getter
    @Setter
    private String cause;
    @Size(max = 100)
    @Column(name = "ACTION")
    @Getter
    @Setter
    private String action;
    @Size(max = 100)
    @Column(name = "CASE_ASSIGNMENT_GROUP")
    @Getter
    @Setter
    private String caseAssignmentGroup;
    @Size(max = 4000)
    @Column(name = "INCIDENT_ASSIGNMENT_GROUP")
    @Getter
    @Setter
    private String incidentAssignmentGroup;
    @Size(max = 100)
    @Column(name = "NOTES")
    @Getter
    @Setter
    private String notes;
    @Size(max = 100)
    @Column(name = "IMPACT")
    @Getter
    @Setter
    private String impact;
    @Size(max = 100)
    @Column(name = "URGENCY")
    @Getter
    @Setter
    private String urgency;
    @Size(max = 100)
    @Column(name = "PRIORITY")
    @Getter
    @Setter
    private String priority;
    @Size(max = 100)
    @Column(name = "RELATED_INCIDENT")
    @Getter
    @Setter
    private String relatedIncident;
    @Size(max = 100)
    @Column(name = "RELATED_CHANGE")
    @Getter
    @Setter
    private String relatedChange;
    @Size(max = 100)
    @Column(name = "ID_PUBLICATION")
    @Getter
    @Setter
    private String idPublication;
    @Column(name = "FAILURE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date failureDate;
    @Column(name = "FAILURE_DATE_SOLUTION")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date failureDateSolution;
    @Size(max = 100)
    @Column(name = "INCIDENT_MANAGEMENT_SYSTEM")
    @Getter
    @Setter
    private String incidentManagementSystem;
    @Size(max = 100)
    @Column(name = "BASE_STATIONS")
    @Getter
    @Setter
    private String baseStations;
    @Size(max = 100)
    @Column(name = "MSISDN_FAILURE")
    @Getter
    @Setter
    private String msisdnFailure;
    @Size(max = 100)
    @Column(name = "TECHNOLOGY")
    @Getter
    @Setter
    private String technology;
    @Size(max = 100)
    @Column(name = "LINE_TYPE")
    @Getter
    @Setter
    private String lineType;
    @Size(max = 100)
    @Column(name = "PLAN_TYPE")
    @Getter
    @Setter
    private String planType;
    @Size(max = 100)
    @Column(name = "EQUIPMENT_MODEL")
    @Getter
    @Setter
    private String equipmentModel;
    @Size(max = 100)
    @Column(name = "ID_CASE")
    @Getter
    @Setter
    private String idCase;
    @Size(max = 100)
    @Column(name = "USER_MOD")
    @Getter
    @Setter
    private String userMod;
    @Column(name = "DATE_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date dateMod;
    @Size(max = 100)
    @Column(name = "STATUS")
    @Getter
    @Setter
    private String status;
    @Size(max = 100)
    @Column(name = "TYPE_REQUEST")
    @Getter
    @Setter
    private String typeRequest;
    @Size(max = 100)
    @Column(name = "PROBLEM")
    @Getter
    @Setter
    private String problem;
    @Size(max = 100)
    @Column(name = "REMEDY")
    @Getter
    @Setter
    private String remedy;
    @Size(max = 100)
    @Column(name = "USER_CREATE")
    @Getter
    @Setter
    private String userCreate;
    @Column(name = "DATE_CREATE")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date dateCreate;
    @Size(max = 100)
    @Column(name = "REGIONAL")
    @Getter
    @Setter
    private String regional;
    @Size(max = 100)
    @Column(name = "REPORT_IDENTIFICATION")
    @Getter
    @Setter
    private String reportIdentification;
    @Size(max = 100)
    @Column(name = "RELATED_PROYECT")
    @Getter
    @Setter
    private String relatedProyect;
    @Size(max = 100)
    @Column(name = "CMTS")
    @Getter
    @Setter
    private String cmts;
    @Size(max = 100)
    @Column(name = "TYPEDOCUMENT")
    @Getter
    @Setter
    private String typeDocument;

    public Parametros() {
    }

    public Parametros(Long id) {
        this.id = id;
    }

}
