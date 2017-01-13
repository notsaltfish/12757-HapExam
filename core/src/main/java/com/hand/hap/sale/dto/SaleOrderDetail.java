package com.hand.hap.sale.dto;

import java.util.Date;
import java.util.List;

public class SaleOrderDetail {
	   private String companyName;
	    
	    private Long lineMoney;
	   
	    private Long headerId;
	    
	    private Long inventoryItemId;
	    
	    private String orderNumber;

	    private Long companyId;

	    private Date orderDate;

	    private String orderStatus;

	    private Long customerId;
	    
	    private String customerName;
	    
	    private Long lineId;

	    private Long lineNumber;

	    private Long orderdQuantity;

	    private String orderQuantityUom;

	    private Long unitSellingPrice;

	    private String description;

	    private String itemCode;

	    private String itemDescription;

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public Long getLineMoney() {
			return lineMoney;
		}

		public void setLineMoney(Long lineMoney) {
			this.lineMoney = lineMoney;
		}

		public Long getHeaderId() {
			return headerId;
		}

		public void setHeaderId(Long headerId) {
			this.headerId = headerId;
		}

		public Long getInventoryItemId() {
			return inventoryItemId;
		}

		public void setInventoryItemId(Long inventoryItemId) {
			this.inventoryItemId = inventoryItemId;
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

		public Long getLineId() {
			return lineId;
		}

		public void setLineId(Long lineId) {
			this.lineId = lineId;
		}

		public Long getLineNumber() {
			return lineNumber;
		}

		public void setLineNumber(Long lineNumber) {
			this.lineNumber = lineNumber;
		}

		public Long getOrderdQuantity() {
			return orderdQuantity;
		}

		public void setOrderdQuantity(Long orderdQuantity) {
			this.orderdQuantity = orderdQuantity;
		}

		public String getOrderQuantityUom() {
			return orderQuantityUom;
		}

		public void setOrderQuantityUom(String orderQuantityUom) {
			this.orderQuantityUom = orderQuantityUom;
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

		public void setDescription(String description) {
			this.description = description;
		}

		public String getItemCode() {
			return itemCode;
		}

		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}

		public String getItemDescription() {
			return itemDescription;
		}

		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}

		public void setLinesInfo(HapOmOrderLines lines) {
				this.setDescription(lines.getDescription());
				this.setLineId(lines.getLineId());
				this.setOrderdQuantity(lines.getOrderdQuantity());
				this.setOrderQuantityUom(lines.getOrderQuantityUom());
				this.setUnitSellingPrice(lines.getUnitSellingPrice());
				this.setLineNumber(lines.getLineNumber());
				this.setLineMoney(lines.getUnitSellingPrice()*lines.getOrderdQuantity());
				
		}

		public void setItemsInfo(HapInvInventoryItems item) {
			this.setInventoryItemId(item.getInventoryItemId());
			this.setItemDescription(item.getItemDescription());
			this.setItemCode(item.getItemCode());
			
		}

		public void setHeaderInfo(SaleOrderInfoDTO dto) {
					this.setHeaderId(dto.getHeaderId());
					this.setCompanyId(dto.getCustomerId());
					this.setCompanyName(dto.getCompanyName());
					this.setCustomerId(dto.getCustomerId());
					this.setCustomerName(dto.getCustomerName());
					this.setCompanyName(dto.getCustomerName());
					this.setOrderDate(dto.getOrderDate());
					this.setOrderNumber(dto.getOrderNumber());
					this.setOrderStatus(dto.getOrderStatus());
					//this.setTotalMoney(dto.getTotalMoney());
		}

	    
}
