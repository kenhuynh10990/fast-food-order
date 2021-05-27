package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "order_food")
public class OrderFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_food_id")
    private Integer orderFoodId;

    @Column(name = "order_food_quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "account_id" , referencedColumnName = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "product_id" , referencedColumnName = "product_id")
    private Product product;

    public Integer getOrderFoodId() {
        return orderFoodId;
    }

    public void setOrderFoodId(Integer orderFoodId) {
        this.orderFoodId = orderFoodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
