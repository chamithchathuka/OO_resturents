package entity;

import java.math.BigDecimal;

public class ProductsEntity {
    private int productId;
    private String productName;
    private Integer categoryId;
    private String quantityPerUnit;
    private Double unitPrice;
    private Short unitsInStock;
    private Short unitsOnOrder;
    private Short reorderLevel;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (productId != that.productId) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (quantityPerUnit != null ? !quantityPerUnit.equals(that.quantityPerUnit) : that.quantityPerUnit != null)
            return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (unitsInStock != null ? !unitsInStock.equals(that.unitsInStock) : that.unitsInStock != null) return false;
        if (unitsOnOrder != null ? !unitsOnOrder.equals(that.unitsOnOrder) : that.unitsOnOrder != null) return false;
        if (reorderLevel != null ? !reorderLevel.equals(that.reorderLevel) : that.reorderLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (quantityPerUnit != null ? quantityPerUnit.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (unitsInStock != null ? unitsInStock.hashCode() : 0);
        result = 31 * result + (unitsOnOrder != null ? unitsOnOrder.hashCode() : 0);
        result = 31 * result + (reorderLevel != null ? reorderLevel.hashCode() : 0);
        return result;
    }
}
