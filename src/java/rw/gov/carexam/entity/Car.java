/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    
    @Id
    @Column
    private String plateNo;
    @Column
    private String model;
    @Column
    private String institution;
    @Column
    private int manufacturingYear;
    @Column
    private Date entranceDate;
    @Column
    private Long purchaseCost;

    public Car() {
    }

    public Car(String plateNo, String model, String institution, int manufacturingYear, Date entranceDate, Long purchaseCost) {
        this.plateNo = plateNo;
        this.model = model;
        this.institution = institution;
        this.manufacturingYear = manufacturingYear;
        this.entranceDate = entranceDate;
        this.purchaseCost = purchaseCost;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public Long getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(Long purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    @Override
    public String toString() {
        return "Car{" + "plateNo=" + plateNo + ", model=" + model + ", institution=" + institution + ", manufacturingYear=" + manufacturingYear + ", entranceDate=" + entranceDate + ", purchaseCost=" + purchaseCost + '}';
    }
    
    
    
}
