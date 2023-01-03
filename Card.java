import java.math.BigDecimal;

public class Card {
    private Integer id;
    private String number;
    private String axpireDate;
    private BigDecimal balance;
    private Integer history_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAxpireDate() {
        return axpireDate;
    }

    public void setAxpireDate(String axpireDate) {
        this.axpireDate = axpireDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getHistory_id() {
        return history_id;
    }

    public void setHistory_id(Integer history_id) {
        this.history_id = history_id;
    }
}
