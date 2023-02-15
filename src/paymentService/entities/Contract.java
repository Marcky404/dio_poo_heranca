package paymentService.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Instalment> instalments = new ArrayList<>();

    public Contract(){}
    public Contract(LocalDate date, Double totalValue){
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void addInstalment(Instalment instalment){
        instalments.add(instalment);
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Instalment> getInstalments() {
        return instalments;
    }

    public void setInstalments(List<Instalment> instalments) {
        this.instalments = instalments;
    }
}
