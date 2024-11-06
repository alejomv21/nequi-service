package com.example.Nequi_service.application.nequiService.model.response;

public class BranchProductStockResponse {
    private String branchId;
    private String branchName;
    private String productName;
    private int quantity;

    public BranchProductStockResponse(String branchId, String branchName, String productName, int quantity){
        this.branchId = branchId;
        this.branchName = branchName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
