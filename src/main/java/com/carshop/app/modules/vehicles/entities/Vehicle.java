package com.carshop.app.modules.vehicles.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.carshop.app.validator.annotation.Required;

@Document("vehicles")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ID_FIELD = "_id";
    public static final String DELETED_FIELD = "deleted";
    public static final String ACTIVE_FIELD = "active";
    public static final String CUSTOMER_ID_FIELD = "id_customer";
    public static final String NAME_FIELD = "name";
    public static final String DESCRIPTION_FIELD = "name";
    public static final String MODEL_NAME_FIELD = "name_model";

    @Id
    private String id;

    @Field("id_customer")
    @Required
    private Integer customerId;

    @Field("name")
    @Required
    private String name;

    @Field("description")
    private String description;

    @Field("year_production")
    @Required
    private Integer yearProduction;

    @Field("year_release")
    @Required
    private Integer yearRelease;

    @Field("sign")
    private String sign;

    @Field("running")
    @Required
    private Integer running;

    @Field("id_brand")
    @Required
    private Integer brandId;

    @Field("name_brand")
    @Required
    private String brandName;

    @Field("id_color")
    @Required
    private Integer colorId;

    @Field("name_color")
    @Required
    private String colorName;

    @Field("id_model")
    @Required
    private Integer modelId;

    @Field("name_model")
    @Required
    private String modelName;

    @Field("active")
    @Required
    private Integer active;

    @Field("deleted")
    @Required
    private Integer deleted;

    @Field("created_at")
    @Required
    private LocalDateTime createdAt;

    @Field("updated_at")
    @Required
    private LocalDateTime updatedAt;

    public Vehicle() {

    }

    public Vehicle(String id) {
        this.id = id;
    }

    public Vehicle(String id, Integer customerId) {
        this.id = id;
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(Integer yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Integer getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(Integer yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
