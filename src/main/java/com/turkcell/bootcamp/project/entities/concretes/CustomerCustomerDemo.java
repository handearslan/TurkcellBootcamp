package com.turkcell.bootcamp.project.entities.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="customer_customer_demo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCustomerDemo {
    @ManyToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name="customer_type_id")
    private CustomerDemographic customerDemographic;
}
