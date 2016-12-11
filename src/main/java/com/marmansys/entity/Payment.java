package com.marmansys.entity;
// Generated Dec 10, 2016 3:49:06 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name="payment"
    ,catalog="mr_database"
)
public class Payment  implements java.io.Serializable {


     private Integer paymentId;
     private int companyId;
     private int managerId;
     private int mrId;
     private int shopId;

    public Payment() {
    }

    public Payment(int companyId, int managerId, int mrId, int shopId) {
       this.companyId = companyId;
       this.managerId = managerId;
       this.mrId = mrId;
       this.shopId = shopId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="payment_id", unique=true, nullable=false)
    public Integer getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    
    @Column(name="company_id", nullable=false)
    public int getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    
    @Column(name="manager_id", nullable=false)
    public int getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    
    @Column(name="mr_id", nullable=false)
    public int getMrId() {
        return this.mrId;
    }
    
    public void setMrId(int mrId) {
        this.mrId = mrId;
    }

    
    @Column(name="shop_id", nullable=false)
    public int getShopId() {
        return this.shopId;
    }
    
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }




}

