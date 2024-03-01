package com.carshop.app.modules.vehicles.dtos;

import java.io.Serializable;
import java.util.List;

public class VehiclePageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<VehicleDTO> vehicles;
    private int currentPage;
    private int totalItems;
    private int totalPages;

    public VehiclePageDTO(final List<VehicleDTO> vehicles, final int currentPage, final int totalItems, final int totalPages) {
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

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
