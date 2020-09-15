
package entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "transactions")
public class transactionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private String transaction_type;
    private int AccountId1;
    private int AccountId2;
    private String Amount;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<accountsEntity> testList;
    
    public transactionsEntity() {
    }

    public transactionsEntity(int transaction_id, String transaction_type, int AccountId1, int AccountId2, String Amount, LocalDate date) {
        this.transaction_id = transaction_id;
        this.transaction_type = transaction_type;
        this.AccountId1 = AccountId1;
        this.AccountId2 = AccountId2;
        this.Amount = Amount;
        this.date = date;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public int getAccountId1() {
        return AccountId1;
    }

    public void setAccountId1(int AccountId1) {
        this.AccountId1 = AccountId1;
    }

    public int getAccountId2() {
        return AccountId2;
    }

    public void setAccountId2(int AccountId2) {
        this.AccountId2 = AccountId2;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
