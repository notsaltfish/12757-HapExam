package com.hand.hap.sale.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaleOrderInfoDTO {
	
    private String orderNumber;

    private Long companyId;

    private Date orderDate;

    private String orderStatus;

    private Long customerId;
    
    private String customerName;
    
    private List<HapInvInventoryItems> items;
    
    private List<HapOmOrderLines> lines;
    
    private String companyName;
    
    private Long totalMoney;
   
    private Long headerId;
    
    private Long inventoryItemId;
    
    private String itemDescription;
    
    private List<SaleOrderDetail> details;
    
    

	public List<SaleOrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<SaleOrderDetail> details) {
		this.details = details;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public List<HapInvInventoryItems> getItems() {
		return items;
	}

	public void setItems(List<HapInvInventoryItems> items) {
		this.items = items;
	}

	public List<HapOmOrderLines> getLines() {
		return lines;
	}

	public void setLines(List<HapOmOrderLines> lines) {
		this.lines = lines;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
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


    
}
