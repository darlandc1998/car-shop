package com.carshop.app.modules.colors.entities;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity(name = "colors")
@SQLRestriction("deleted = false")
@SQLDelete(sql = "UPDATE colors SET deleted = true WHERE id = ?")
public class ColorEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "id_customer")
    private Integer customerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "rgb")
    private String rgb;

    @Column(name = "active", insertable = false)
    private Boolean active;

    @Column(name = "deleted", insertable = false, updatable = false)
    private Boolean deleted;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;

    public ColorEntity() {

    }

    public ColorEntity(final Integer id) {
        this.id = id;
    }

    public ColorEntity(final String name) {
        this.name = name;
    }

    public ColorEntity(final Integer customerId, final String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public ColorEntity(final Integer id, final Integer customerId) {
        this.id = id;
        this.customerId = customerId;
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

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
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
