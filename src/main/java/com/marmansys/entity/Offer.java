package com.marmansys.entity;
// Generated Dec 10, 2016 3:49:06 PM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Offer generated by hbm2java
 */
@Entity
@Table(name="offer"
    ,catalog="mr_database"
)
public class Offer  implements java.io.Serializable {


     private Integer offerId;
     private Generic generic;
     private Medicine medicine;
     private MedicineType medicineType;
     private String offerTitle;
     private String offerDetails;
     private Date startTime;
     private Date endTime;
     private Set<Order> orders = new HashSet<Order>(0);

    public Offer() {
    }

	
    public Offer(Generic generic, Medicine medicine, MedicineType medicineType, String offerTitle, String offerDetails, Date startTime, Date endTime) {
        this.generic = generic;
        this.medicine = medicine;
        this.medicineType = medicineType;
        this.offerTitle = offerTitle;
        this.offerDetails = offerDetails;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Offer(Generic generic, Medicine medicine, MedicineType medicineType, String offerTitle, String offerDetails, Date startTime, Date endTime, Set<Order> orders) {
       this.generic = generic;
       this.medicine = medicine;
       this.medicineType = medicineType;
       this.offerTitle = offerTitle;
       this.offerDetails = offerDetails;
       this.startTime = startTime;
       this.endTime = endTime;
       this.orders = orders;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="offer_id", unique=true, nullable=false)
    public Integer getOfferId() {
        return this.offerId;
    }
    
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="generic_id", nullable=false)
    public Generic getGeneric() {
        return this.generic;
    }
    
    public void setGeneric(Generic generic) {
        this.generic = generic;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="medicine_id", nullable=false)
    public Medicine getMedicine() {
        return this.medicine;
    }
    
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type_id", nullable=false)
    public MedicineType getMedicineType() {
        return this.medicineType;
    }
    
    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }

    
    @Column(name="offer_title", nullable=false, length=45)
    public String getOfferTitle() {
        return this.offerTitle;
    }
    
    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    
    @Column(name="offer_details", nullable=false, length=200)
    public String getOfferDetails() {
        return this.offerDetails;
    }
    
    public void setOfferDetails(String offerDetails) {
        this.offerDetails = offerDetails;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time", nullable=false, length=19)
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time", nullable=false, length=19)
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="offer")
    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }




}

