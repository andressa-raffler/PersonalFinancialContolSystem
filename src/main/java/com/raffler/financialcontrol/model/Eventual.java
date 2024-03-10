package com.raffler.financialcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "eventual")
public class Eventual extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "idpersonal_expenses", nullable = false)
    private PersonalExpense personalExpense;
}
