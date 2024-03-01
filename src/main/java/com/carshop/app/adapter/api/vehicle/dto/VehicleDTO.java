package com.carshop.app.adapter.api.vehicle.dto;

import com.carshop.app.adapter.api.brand.dto.BrandDTO;
import com.carshop.app.adapter.api.category.dto.CategoryDTO;
import com.carshop.app.adapter.api.color.dto.ColorDTO;
import com.carshop.app.adapter.api.customer.dto.CustomerDTO;
import com.carshop.app.adapter.api.engineType.dto.EngineTypeDTO;
import com.carshop.app.adapter.api.fuel.dto.FuelDTO;
import com.carshop.app.adapter.api.model.dto.ModelDTO;
import com.carshop.app.adapter.api.version.dto.VersionDTO;

import java.io.Serializable;
import java.math.BigDecimal;

public class VehicleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private CustomerDTO customer;
    private BrandDTO brand;
    private ModelDTO model;
    private VersionDTO version;
    private CategoryDTO category;
    private ColorDTO color;
    private EngineTypeDTO engineType;
    private FuelDTO fuel;
    private String name;
    private String description;
    private Integer productionYear;
    private Integer releaseYear;
    private String sign;
    private BigDecimal running;
    private BigDecimal price;
    private BigDecimal promotion;

    public VehicleDTO() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public BrandDTO getBrand() {
        return brand;
    }

    public void setBrand(BrandDTO brand) {
        this.brand = brand;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    public VersionDTO getVersion() {
        return version;
    }

    public void setVersion(VersionDTO version) {
        this.version = version;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public ColorDTO getColor() {
        return color;
    }

    public void setColor(ColorDTO color) {
        this.color = color;
    }

    public EngineTypeDTO getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeDTO engineType) {
        this.engineType = engineType;
    }

    public FuelDTO getFuel() {
        return fuel;
    }

    public void setFuel(FuelDTO fuel) {
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
}
