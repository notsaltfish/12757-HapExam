package com.hand.hap.sale.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaleOrderInfoDTO {
	
    private String orderNumber;

    private Long companyId;

    private Date orderDate;

    private String orderStatus;

    private Long customerId;
    
    private String customerName;
    
    private String itemCode;
    
    private String companyName;
    
    private Long totalMoney;

    private Long inventoryItemId;
    
    private String itemDescription;
    
    public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	private Long orderQuantity;
    
    private String orderQuantityUOM;
    
    private Long unitSellingPrice;
    
    private String description;
    
    private Long headerId;
    
    
    
    
	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getOrderQuantityUOM() {
		return orderQuantityUOM;
	}

	public void setOrderQuantityUOM(String orderQuantityUOM) {
		this.orderQuantityUOM = orderQuantityUOM;
	}

	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}

	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descrtiption) {
		this.description = descrtiption;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Long totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
    
	
    
}
