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
 * Order generated by hbm2java
 */
@Entity
@Table(name="order"
    ,catalog="mr_database"
)
public class Order  implements java.io.Serializable {


     private Integer orderId;
     private MedicalRepresentative medicalRepresentative;
     private Medicine medicine;
     private Offer offer;
     private Date orderDate;
     private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

    public Order() {
    }

	
    public Order(MedicalRepresentative medicalRepresentative, Medicine medicine, Offer offer, Date orderDate) {
        this.medicalRepresentative = medicalRepresentative;
        this.medicine = medicine;
        this.offer = offer;
        this.orderDate = orderDate;
    }
    public Order(MedicalRepresentative medicalRepresentative, Medicine medicine, Offer offer, Date orderDate, Set<OrderDetail> orderDetails) {
       this.medicalRepresentative = medicalRepresentative;
       this.medicine = medicine;
       this.offer = offer;
       this.orderDate = orderDate;
       this.orderDetails = orderDetails;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="order_id", unique=true, nullable=false)
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mr_id", nullable=false)
    public MedicalRepresentative getMedicalRepresentative() {
        return this.medicalRepresentative;
    }
    
    public void setMedicalRepresentative(MedicalRepresentative medicalRepresentative) {
        this.medicalRepresentative = medicalRepresentative;
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
    @JoinColumn(name="offer_id", nullable=false)
    public Offer getOffer() {
        return this.offer;
    }
    
    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="order_date", nullable=false, length=19)
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderDetail> getOrderDetails() {
        return this.orderDetails;
    }
    
    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }




}

