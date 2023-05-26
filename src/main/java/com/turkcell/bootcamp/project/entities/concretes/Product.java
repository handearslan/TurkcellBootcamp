package com.turkcell.bootcamp.project.entities.concretes;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//product içindeki eksik alanları tamamla
//11 tane alan var biz 3 tanesini ekledik.
public class Product {

    @Column(name="product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short productID;

    @Column(name="product_name")
    private String productName;  //varchar=string


    @ManyToOne
    @JoinColumn(name="supplier_id")
    private  Supplier supplierID;


    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;


    @Column(name="quantity_per_unit")
    private String quantityPerUnit; //varchar=string


    @Column(name="unit_price")
    private float unitPrice; //real=float


    @Column(name="units_in_stock")
    private short unitsInStock;  //smallint


    @Column(name="units_on_order")
    private short unitsOnOrder; //smallint


    @Column(name="reorder_level")
    private short reorderLevel; //smallint


    @Column(name="discontinued")
    private int discontinued;  //integer

    @Column(name="quantity_unit")
    private String quantityUnit; //varchar








}
