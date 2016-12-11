package com.marmansys.entity;
// Generated Dec 10, 2016 3:49:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MedicalRepresentative generated by hbm2java
 */
@Entity
@Table(name="medical_representative"
    ,catalog="mr_database"
)
public class MedicalRepresentative  implements java.io.Serializable {


     private Integer mrId;
     private Manager manager;
     private Zone zone;
     private String mrName;
     private String mrAddress;
     private String mrMobile;
     private String mrEmail;
     private Set<Order> orders = new HashSet<Order>(0);
     private Set<ShopUser> shopUsers = new HashSet<ShopUser>(0);
     private Set<Zone> zones = new HashSet<Zone>(0);

    public MedicalRepresentative() {
    }

	
    public MedicalRepresentative(Manager manager, Zone zone, String mrName, String mrAddress, String mrMobile, String mrEmail) {
        this.manager = manager;
        this.zone = zone;
        this.mrName = mrName;
        this.mrAddress = mrAddress;
        this.mrMobile = mrMobile;
        this.mrEmail = mrEmail;
    }
    public MedicalRepresentative(Manager manager, Zone zone, String mrName, String mrAddress, String mrMobile, String mrEmail, Set<Order> orders, Set<ShopUser> shopUsers, Set<Zone> zones) {
       this.manager = manager;
       this.zone = zone;
       this.mrName = mrName;
       this.mrAddress = mrAddress;
       this.mrMobile = mrMobile;
       this.mrEmail = mrEmail;
       this.orders = orders;
       this.shopUsers = shopUsers;
       this.zones = zones;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mr_id", unique=true, nullable=false)
    public Integer getMrId() {
        return this.mrId;
    }
    
    public void setMrId(Integer mrId) {
        this.mrId = mrId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="manager_id", nullable=false)
    public Manager getManager() {
        return this.manager;
    }
    
    public void setManager(Manager manager) {
        this.manager = manager;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zone_id", nullable=false)
    public Zone getZone() {
        return this.zone;
    }
    
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    
    @Column(name="mr_name", nullable=false, length=45)
    public String getMrName() {
        return this.mrName;
    }
    
    public void setMrName(String mrName) {
        this.mrName = mrName;
    }

    
    @Column(name="mr_address", nullable=false, length=200)
    public String getMrAddress() {
        return this.mrAddress;
    }
    
    public void setMrAddress(String mrAddress) {
        this.mrAddress = mrAddress;
    }

    
    @Column(name="mr_mobile", nullable=false, length=45)
    public String getMrMobile() {
        return this.mrMobile;
    }
    
    public void setMrMobile(String mrMobile) {
        this.mrMobile = mrMobile;
    }

    
    @Column(name="mr_email", nullable=false, length=45)
    public String getMrEmail() {
        return this.mrEmail;
    }
    
    public void setMrEmail(String mrEmail) {
        this.mrEmail = mrEmail;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="medicalRepresentative")
    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="medicalRepresentative")
    public Set<ShopUser> getShopUsers() {
        return this.shopUsers;
    }
    
    public void setShopUsers(Set<ShopUser> shopUsers) {
        this.shopUsers = shopUsers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="medicalRepresentative")
    public Set<Zone> getZones() {
        return this.zones;
    }
    
    public void setZones(Set<Zone> zones) {
        this.zones = zones;
    }




}

