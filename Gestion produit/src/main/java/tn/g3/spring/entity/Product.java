package tn.g3.spring.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long idProduct;
	@Enumerated(EnumType.STRING)
	@Column(name="Productype")
	private ProductType productType;

	@Column(name="Description")
	private String descriptionProduct;

	@Temporal (TemporalType.DATE)
	@Column(name="Start")
	private Date startProduct;

	@Temporal (TemporalType.DATE)
	@Column(name="Expire")
	private Date finishProduct;

	@Enumerated(EnumType.STRING)
	@Column(name="ProductStatus")
	private ProductStatus statusProduct;

	


	public long getIdProduct() {
		return idProduct;
	}



	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public ProductType getProductType(){
		return productType;
	}
	public void setProductType(ProductType productType){
		this.productType=productType;
	}
	public ProductStatus getProductStatus(){
		return statusProduct;
	}
	public void setProductStatus(ProductStatus statusProduct){
		this.statusProduct=statusProduct;
	}
	public String getDescription() {
		return descriptionProduct;
	}
	public void setDescription(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}
	public Date getStartProduct(){
		return startProduct;
	}
	public void setStartProduct(Date startProduct){
		this.startProduct=startProduct;
	}
	public Date getFinishProduct(){
		return finishProduct;
	}
	public void setfinishProduct(Date finishProduct){
		this.finishProduct=finishProduct;
	}



	@Override
	public String toString() {
		return "Product [id=" + idProduct + ", productType=" + productType + ", descriptionProduct=" + descriptionProduct
				+ ", startProduct=" + startProduct + ", statusProduct=" + statusProduct + ", finishProduct=" + finishProduct+
				"]";
	}

	public Product(){
		super();
	}

	public Product(long idProduct,ProductType productType,String descriptionProduct,Date startProduct,Date finishProduct,ProductStatus statusProduct){
		this.idProduct=idProduct;
		this.productType=productType;
		this.descriptionProduct=descriptionProduct;
		this.startProduct=startProduct;
		this.finishProduct=finishProduct;
		this.statusProduct=statusProduct;

	}

}