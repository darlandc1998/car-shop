package com.carshop.app.modules.vehicles.dtos;

import java.io.Serializable;
import java.util.List;

public class VehiclePageDTO implements Serializable {

    private List<VehicleDTO> vehicles;
    private Integer currentPage;
    private Integer totalItems;
    private Integer totalPages;

    public VehiclePageDTO(final List<VehicleDTO> vehicles, final Integer currentPage, final Integer totalItems, final Integer totalPages) {
        this.vehicles = vehicles;
        this.currentPage = currentPage;
        this.totalItems = totalItems;
        this.totalPages = totalPages;
    }

    public VehiclePageDTO(final List<VehicleDTO> vehicles) {
        this.vehicles = vehicles;
    }

    public List<VehicleDTO> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleDTO> vehicles) {
        this.vehicles = vehicles;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

}
