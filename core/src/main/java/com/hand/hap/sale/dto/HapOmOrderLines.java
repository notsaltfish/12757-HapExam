package com.hand.hap.sale.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="hap_om_order_lines")
public class HapOmOrderLines {
	@Id
	@GeneratedValue
    private Long lineId;

    private Long headerId;

    private Long lineNumber;

    private Long inventoryItemId;

    private Long orderdQuantity;

    private String orderQuantityUom;

    private Long unitSellingPrice;

    private String description;

    private Long companyId;

    private String addition1;

    private String addition2;

    private String addition3;

    private String addition4;

    private String addition5;

    private BigDecimal objectVersionNumber;

    private Long requestId;

    private Long programId;

    private Date creationDate;

    private BigDecimal createdBy;

    private BigDecimal lastUpdatedBy;

    private Date lastUpdateDate;

    private BigDecimal lastUpdateLogin;

    private String attributeCategory;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String attribute11;

    private String attribute12;

    private String attribute13;

    private String attribute14;

    private String attribute15;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
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
        this.orderQuantityUom = orderQuantityUom == null ? null : orderQuantityUom.trim();
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
        this.description = description == null ? null : description.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1 == null ? null : addition1.trim();
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2 == null ? null : addition2.trim();
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3 == null ? null : addition3.trim();
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4 == null ? null : addition4.trim();
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5 == null ? null : addition5.trim();
    }

    public BigDecimal getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(BigDecimal objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(BigDecimal lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory == null ? null : attributeCategory.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11 == null ? null : attribute11.trim();
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12 == null ? null : attribute12.trim();
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13 == null ? null : attribute13.trim();
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14 == null ? null : attribute14.trim();
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15 == null ? null : attribute15.trim();
    }
}