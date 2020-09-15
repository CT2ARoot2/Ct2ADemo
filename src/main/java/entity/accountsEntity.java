
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class accountsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int transaction_id;
    private int Customer_id;
    private String Ballance;
    private String type;
    
    @ManyToOne
    @JoinColumn(name="studentId")
    private customerEntity customer;
    
    @ManyToOne
    @PrimaryKeyJoinColumn
    private transactionsEntity test;

    public accountsEntity() {
    }

    public accountsEntity(int id, int transaction_id, int Customer_id, String Ballance, String type) {
        this.id = id;
        this.transaction_id = transaction_id;
        this.Customer_id = Customer_id;
        this.Ballance = Ballance;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int Customer_id) {
        this.Customer_id = Customer_id;
    }

    public String getBallance() {
        return Ballance;
    }

    public void setBallance(String Ballance) {
        this.Ballance = Ballance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
