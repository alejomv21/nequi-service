package com.example.Nequi_service.application.nequiService.model.request;

public class ProductUpdateQuantityRequest {
    private String id;
    private int quantity;

    public ProductUpdateQuantityRequest(String id, int quantity){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
