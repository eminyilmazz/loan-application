package com.loanapp.loanapplication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @Column(name = "tckn", nullable = false)
    @Digits(fraction = 0, integer = 11)
    private Long tckn;

    @Transient
    @JsonIgnore
    private Integer creditScore;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    @Pattern(regexp = "^[0-9]{10}", message = "Phone number needs to be 10 digits and can only contain only numbers.")
    private String phoneNumber;

    @Column(name = "monthly_salary")
    private double monthlySalary;

    @Transient
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Loan> loanList;

    public Customer(String name, String lastName, Long tckn, String phoneNumber, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        this.tckn = tckn;
        this.phoneNumber = phoneNumber;
        this.monthlySalary = monthlySalary;
    }
}
