package com.carshop.app.domain;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class Vehicle implements Serializable {

    private String id;
    @NotNull(message = "Customer must not be null")
    private Customer customer;
    @NotNull(message = "Brand must not be null")
    private Brand brand;
    @NotNull(message = "Model must not be null")
    private Model model;
    @NotNull(message = "Version must not be null")
    private Version version;
    private Set<Equipment> equipments;
    @NotNull(message = "Category must not be null")
    private Category category;
    @NotNull(message = "Color must not be null")
    private Color color;
    @NotNull(message = "Engine type must not be null")
    private EngineType engineType;
    @NotNull(message = "Fuel must not be null")
    private Fuel fuel;
    @NotNull(message = "Name must not be null")
    private String name;
    private String description;
    @NotNull(message = "Production year must not be null")
    private Integer productionYear;
    @NotNull(message = "Release year must not be null")
    private Integer releaseYear;
    @NotNull(message = "Sign year must not be null")
    private String sign;
    @NotNull(message = "Running year must not be null")
    private BigDecimal running;
    @NotNull(message = "Price year must not be null")
    private BigDecimal price;
    private BigDecimal promotion;
    @NotNull(message = "Active year must not be null")
    private Boolean active;
    @NotNull(message = "Deleted year must not be null")
    private Boolean deleted;
    @NotNull(message = "Created at year must not be null")
    private LocalDateTime createdAt;
    @NotNull(message = "Updated at year must not be null")
    private LocalDateTime updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
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
