package com.carshop.app.adapter.persistence.vehicle.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = VehicleDocument.COLLECTION_NAME)
public class VehicleCustomerDocument {

    private Long id;
    private String name;

    public VehicleCustomerDocument() {

    }

    public VehicleCustomerDocument(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
