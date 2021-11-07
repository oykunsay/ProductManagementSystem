package model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "product_id")
	private String product_id;

	@Column(name = "product_name")
	private String product_name;

	@Column(name = "status")
	private String status;

	@Column(name = "category_id")
	private String category_id;

	@Column(name = "inventory_id")
	private String inventory_id;

	@Column(name = "created_at")
	private String created_at;

	@Column(name = "modified_at")
	private String modified_at;

	public Product() {

	}

	public Product(String id, String productId, String productName, String status, String categoryId,
			String inventoryId, String createdAt, String modifiedAt) {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(String inventory_id) {
		this.inventory_id = inventory_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	public String toString() {
		return "Product [id=" + id + ", productId=" + product_id + ", productName=" + product_name + ", status="
				+ status + ", categoryId=" + category_id + ", inventoryId=" + inventory_id + ", createdAt=" + created_at
				+ ", modifiedAt=" + modified_at + "]";
	}

}