
package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class customerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String customer_name;
    private String customer_password;
    private String sex;
    private String email;
    private String phone;
    private String nationlaty;
    private String birthDay;
    private String address;
    private String idCard;
    private String dateIssueIdcard;
    private String activate;
    
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<accountsEntity> testList;

    public customerEntity() {
    }

    public customerEntity(int id, String customer_name, String customer_password, String sex, String email, String phone, String nationlaty, String birthDay, String address, String idCard, String dateIssueIdcard, String activate) {
        this.id = id;
        this.customer_name = customer_name;
        this.customer_password = customer_password;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.nationlaty = nationlaty;
        this.birthDay = birthDay;
        this.address = address;
        this.idCard = idCard;
        this.dateIssueIdcard = dateIssueIdcard;
        this.activate = activate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_password() {
        return customer_password;
    }

    public void setCustomer_password(String customer_password) {
        this.customer_password = customer_password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationlaty() {
        return nationlaty;
    }

    public void setNationlaty(String nationlaty) {
        this.nationlaty = nationlaty;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDateIssueIdcard() {
        return dateIssueIdcard;
    }

    public void setDateIssueIdcard(String dateIssueIdcard) {
        this.dateIssueIdcard = dateIssueIdcard;
    }

    public String getActivate() {
        return activate;
    }

    public void setActivate(String activate) {
        this.activate = activate;
    }
    
    
    
    
}
