package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Financial_Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String advisorName;

    @Column(nullable = false)
    private String advisorRank;


    protected Financial_Advisor() {

    }

    public Financial_Advisor(String advisorName, String advisorRank) {
        this.advisorName = advisorName;
        this.advisorRank = advisorRank;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getAdvisorRank() {
        return advisorRank;
    }

    public void setAdvisorRank(String advisorRank) {
        this.advisorRank = advisorRank;
    }


}
