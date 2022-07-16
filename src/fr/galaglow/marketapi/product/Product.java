package fr.galaglow.marketapi.product;

public class Product {
	
	public final String productName;
	public final String productDescription;
	public Integer productQuantity;
	public Integer productPrice;
	public Boolean isProductInStock;
	public final String productImagePath;
	public Boolean isProductBuy;

	public Product(String name, String description, Integer quantity, Integer price, Boolean isInStock, String imagePath, Boolean isBuy) {
		
		this.productName = name;
		this.productDescription = description;
		this.productQuantity = quantity;
		this.productPrice = price;
		this.isProductInStock = isInStock;
		this.productImagePath = imagePath;
		this.isProductBuy = isBuy;
		
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public String getProductPath() {
		return productImagePath;
	}
	
	public Integer getProductQuantity() {
		return productQuantity;
	}
	
	public Integer getProductPrice() {
		return productPrice;
	}
	
	public Boolean isProductInStock() {
		return isProductInStock;
	}
	
	public Boolean isProductBuy() {
		return isProductBuy;
	}
	
	public void setProductQuantity(Integer quantity) {
		this.productQuantity = quantity;
	}
	
	public void setProductPrice(Integer price) {
		this.productPrice = price;
	}
	
	public void setIsProductInStock(Boolean inStock) {
		this.isProductInStock = inStock;
	}
	
	public void setIsProductBuy(Boolean buy) {
		this.isProductBuy = buy;
	}
	
	public void applyPercentReductionToProduct(Integer reduction) {
		if (reduction >= 1 && reduction <= 100) {
			this.productPrice = this.productPrice * ((100 - reduction) / 100);
		} else {
			System.out.println("[MARKETAPI] applyPercentREductionToProduct error --> The integer must be between 1 & 100");
		}
	}

}
