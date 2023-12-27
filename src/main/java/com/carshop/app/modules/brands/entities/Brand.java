package com.carshop.app.modules.brands.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.carshop.app.validator.annotation.Required;

@Entity(name = "brands")
@Where(clause = "deleted = 0")
@SQLDelete(sql = "UPDATE brands SET deleted = id WHERE id = ?")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "id_customer", nullable = false)
    private Integer customerId;

    @Required
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "deleted", insertable = false)
    private Integer deleted;

    @Column(name = "created_at", insertable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;

    public Brand() {

    }

    public Brand(Integer id) {
        this.id = id;
    }

    public Brand(String name) {
        this.name = name;
    }

    public Brand(Integer id, Integer customerId) {
        this.id = id;
        this.customerId = customerId;
    }

    public Brand(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand(Integer id, Integer customerId, String name) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}