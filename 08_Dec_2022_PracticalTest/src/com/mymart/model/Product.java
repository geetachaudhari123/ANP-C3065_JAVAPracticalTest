package com.mymart.model;

import java.util.Objects;

public class Product {
         private int  ProductId;
         private String  ProductName;
         private double  ProductPrice;
		public int getProductId() {
			return ProductId;
		}
		public void setProductId(int productId) {
			ProductId = productId;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public double getProductPrice() {
			return ProductPrice;
		}
		public void setProductPrice(double productPrice) {
			ProductPrice = productPrice;
		}
		@Override
		public String toString() {
			return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
					+ ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
					+ ", getProductPrice()=" + getProductPrice() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(ProductId, ProductName, ProductPrice);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return ProductId == other.ProductId && Objects.equals(ProductName, other.ProductName)
					&& Double.doubleToLongBits(ProductPrice) == Double.doubleToLongBits(other.ProductPrice);
		}
            
}

