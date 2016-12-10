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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Company generated by hbm2java
 */
@Entity
@Table(name="company"
    ,catalog="mr_database"
)
public class Company  implements java.io.Serializable {


     private Integer companyId;
     private String companyName;
     private String companyAddress;
     private String companyEmail;
     private String companyPhone;
     private String companyMobile;
     private Set<Manager> managers = new HashSet<Manager>(0);

    public Company() {
    }

	
    public Company(String companyName, String companyAddress, String companyEmail, String companyPhone, String companyMobile) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyEmail = companyEmail;
        this.companyPhone = companyPhone;
        this.companyMobile = companyMobile;
    }
    public Company(String companyName, String companyAddress, String companyEmail, String companyPhone, String companyMobile, Set<Manager> managers) {
       this.companyName = companyName;
       this.companyAddress = companyAddress;
       this.companyEmail = companyEmail;
       this.companyPhone = companyPhone;
       this.companyMobile = companyMobile;
       this.managers = managers;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="company_id", unique=true, nullable=false)
    public Integer getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    @Column(name="company_name", nullable=false, length=45)
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    @Column(name="company_address", nullable=false, length=200)
    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    
    @Column(name="company_email", nullable=false, length=45)
    public String getCompanyEmail() {
        return this.companyEmail;
    }
    
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    
    @Column(name="company_phone", nullable=false, length=45)
    public String getCompanyPhone() {
        return this.companyPhone;
    }
    
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    
    @Column(name="company_mobile", nullable=false, length=45)
    public String getCompanyMobile() {
        return this.companyMobile;
    }
    
    public void setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="company")
    public Set<Manager> getManagers() {
        return this.managers;
    }
    
    public void setManagers(Set<Manager> managers) {
        this.managers = managers;
    }




}


