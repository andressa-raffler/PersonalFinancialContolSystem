package com.raffler.financialcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "installment")
public class Installment extends BaseEntity{

    @Column(name = "portion", nullable = false)
    private String portion;

    @ManyToOne
    @JoinColumn(name = "idpersonal_expenses", nullable = false)
    private PersonalExpense personalExpense;

}