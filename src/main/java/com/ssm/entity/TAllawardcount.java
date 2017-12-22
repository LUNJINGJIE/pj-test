package com.ssm.entity;

import java.util.HashSet;
import java.util.Set;

public class TAllawardcount{

    // Fields

    private Integer allCountId;
    private Integer quantity;
    private Set<User> users = new HashSet<User>(0);

    // Constructors

    /** default constructor */
    public TAllawardcount() {
    }

    /** full constructor */
    public TAllawardcount(Integer quantity, Set<User> users) {
        this.quantity = quantity;
        this.users = users;
    }

    public Integer getAllCountId() {
        return this.allCountId;
    }

    public void setAllCountId(Integer allCountId) {
        this.allCountId = allCountId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}