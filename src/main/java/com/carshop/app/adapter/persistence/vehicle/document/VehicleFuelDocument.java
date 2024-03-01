package com.carshop.app.adapter.persistence.vehicle.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = VehicleDocument.COLLECTION_NAME)
public class VehicleFuelDocument implements Serializable {

    private Long id;
    private String name;

    public VehicleFuelDocument() {

    }

    public VehicleFuelDocument(Long id, String name) {
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
