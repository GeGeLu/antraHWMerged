package com.example.antrahwmerged.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class EmpDep {
    @Id
    @Column(name = "E_ID")
    private Integer eId;

    @Column(name = "D_ID")
    private Integer dId;

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

}