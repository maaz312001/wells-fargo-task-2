package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Client_Portfolio {

    @Column(nullable = false)
    private String clientSalary;

    @Column(nullable = false)
    private String clientLoans;

    @Column(nullable = false)
    private String clientInvestments;

    protected Client() {

    }

    public Client(String clientName, String clientPhone) {
        this.clientSalary = clientSalary;
        this.clientLoans = clientLoans;
        this.clientInvestments = clientInvestments;
    }


    public String getClientSalary() {
        return clientSalary;
    }

    public void setClientSalary(String clientSalary) {
        this.clientSalary = clientSalary;
    }

    public String getClientLoans() {
        return clientLoans;
    }

    public void setClientLoans(String clientLoans) {
        this.clientLoans = clientLoans;
    }

    public String getClientInvestments() {
        return clientInvestments;
    }

    public void setClientInvestments(String clientInvestments) {
        this.clientInvestments = clientInvestments;
    }

}