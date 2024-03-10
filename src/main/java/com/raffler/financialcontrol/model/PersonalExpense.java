package com.raffler.financialcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "personal_expenses")
public class PersonalExpense extends BaseEntity{

}