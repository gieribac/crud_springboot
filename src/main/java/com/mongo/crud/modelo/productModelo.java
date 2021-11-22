package com.mongo.crud.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class productModelo {
    @Id
    private String _id;
    private String name;
    private String size_weight;
    private String unit_measurement;
    private String price;
    private String laboratory_brand;
    private String description;
    private String form_presentation;
    private String dueDate;
    private String batch;
    private String order_quantity;
    private String noRef;
    
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize_weight() {
        return size_weight;
    }

    public void setSize_weight(String size_weight) {
        this.size_weight = size_weight;
    }

    public String getUnit_measurement() {
        return unit_measurement;
    }

    public void setUnit_measurement(String unit_measurement) {
        this.unit_measurement = unit_measurement;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLaboratory_brand() {
        return laboratory_brand;
    }

    public void setLaboratory_brand(String laboratory_brand) {
        this.laboratory_brand = laboratory_brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getForm_presentation() {
        return form_presentation;
    }

    public void setForm_presentation(String form_presentation) {
        this.form_presentation = form_presentation;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(String order_quantity) {
        this.order_quantity = order_quantity;
    }

    public String getNoRef() {
        return noRef;
    }

    public void setNoRef(String noRef) {
        this.noRef = noRef;
    }

    
}
