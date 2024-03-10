package com.raffler.financialcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "variable_group")
public class VariableGroup extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "idvariables", nullable = false)
    private Variable variable;

}