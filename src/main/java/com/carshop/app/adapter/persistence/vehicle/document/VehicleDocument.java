package com.carshop.app.adapter.persistence.vehicle.document;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Document(collection = VehicleDocument.COLLECTION_NAME)
public class VehicleDocument implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String COLLECTION_NAME = "vehicles";
    public static final String ID_FIELD = "_id";
    public static final String DELETED_FIELD = "deleted";
    public static final String ACTIVE_FIELD = "active";
    public static final String ID_BRAND = "brand._id";
    public static final String ID_MODEL = "model._id";
    public static final String ID_VERSION = "version._id";
    public static final String ID_CATEGORY = "category._id";
    public static final String ID_COLOR = "color._id";
    public static final String ID_ENGINE_TYPE = "engineType._id";
    public static final String ID_FUEL = "fuel._id";

    @Id
    private String id;
    @Field("customer")
    private VehicleCustomerDocument customer;
    @Field("brand")
    private VehicleBrandDocument brand;
    @Field("model")
    private VehicleModelDocument model;
    @Field("version")
    private VehicleVersionDocument version;
    @Field("equipments")
    private Set<VehicleEquipmentDocument> equipments;
    @Field("category")
    private VehicleCategoryDocument category;
    @Field("color")
    private VehicleColorDocument color;
    @Field("engineType")
    private VehicleEngineTypeDocument engineType;
    @Field("fuel")
    private VehicleFuelDocument fuel;
    @Field("name")
    private String name;
    @Field("description")
    private String description;
    @Field("productionYear")
    private Integer productionYear;
    @Field("releaseYear")
    private Integer releaseYear;
    @Field("sign")
    private String sign;
    @Field("running")
    private BigDecimal running;
    @Field("price")
    private BigDecimal price;
    @Field("promotion")
    private BigDecimal promotion;
    @Field("active")
    private Boolean active;
    @Field("deleted")
    private Boolean deleted;
    @Field("createdAt")
    private LocalDateTime createdAt;
    @Field("updatedAt")
    private LocalDateTime updatedAt;

    public VehicleDocument() {

    }

    public VehicleDocument(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleCustomerDocument getCustomer() {
        return customer;
    }

    public void setCustomer(VehicleCustomerDocument customer) {
        this.customer = customer;
    }

    public VehicleBrandDocument getBrand() {
        return brand;
    }

    public void setBrand(VehicleBrandDocument brand) {
        this.brand = brand;
    }

    public VehicleModelDocument getModel() {
        return model;
    }

    public void setModel(VehicleModelDocument model) {
        this.model = model;
    }

    public VehicleVersionDocument getVersion() {
        return version;
    }

    public void setVersion(VehicleVersionDocument version) {
        this.version = version;
    }

    public Set<VehicleEquipmentDocument> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<VehicleEquipmentDocument> equipments) {
        this.equipments = equipments;
    }

    public VehicleCategoryDocument getCategory() {
        return category;
    }

    public void setCategory(VehicleCategoryDocument category) {
        this.category = category;
    }

    public VehicleColorDocument getColor() {
        return color;
    }

    public void setColor(VehicleColorDocument color) {
        this.color = color;
    }

    public VehicleEngineTypeDocument getEngineType() {
        return engineType;
    }

    public void setEngineType(VehicleEngineTypeDocument engineType) {
        this.engineType = engineType;
    }

    public VehicleFuelDocument getFuel() {
        return fuel;
    }

    public void setFuel(VehicleFuelDocument fuel) {
        this.fuel = fuel;
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

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public BigDecimal getRunning() {
        return running;
    }

    public void setRunning(BigDecimal running) {
        this.running = running;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotion() {
        return promotion;
    }

    public void setPromotion(BigDecimal promotion) {
        this.promotion = promotion;
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
