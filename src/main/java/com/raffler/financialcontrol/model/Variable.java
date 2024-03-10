package com.raffler.financialcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "variables")
public class Variable extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "idpersonal_expenses", nullable = false)
    private PersonalExpense personalExpense;

}