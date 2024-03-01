package com.carshop.app.adapter.api.vehicle.dto;

import java.io.Serializable;

public class VehicleFilterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int page;
    private int size;
    private String search;
    private String sort;
    private String brands;
    private String models;
    private String versions;
    private String categories;
    private String colors;
    private String engineTypes;
    private String equipments;
    private String fuels;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getEngineTypes() {
        return engineTypes;
    }

    public void setEngineTypes(String engineTypes) {
        this.engineTypes = engineTypes;
    }

    public String getEquipments() {
        return equipments;
    }

    public void setEquipments(String equipments) {
        this.equipments = equipments;
    }

    public String getFuels() {
        return fuels;
    }

    public void setFuels(String fuels) {
        this.fuels = fuels;
    }
}
