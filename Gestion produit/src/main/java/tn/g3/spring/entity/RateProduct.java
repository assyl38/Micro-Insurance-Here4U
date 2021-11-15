package tn.g3.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rate")
public class RateProduct implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int rate;
	@ManyToOne
	@JoinColumn(name = "idProduct")
	private Product product;
	// @ManyToOne
	//@JoinColumn(name = "user_id", nullable = false)
	//private User user;

	public RateProduct(long id, int rate, Product product) {
		this.id = id;
		this.rate = rate;
		this.product = product;
		//this.user = user;
	}

	public RateProduct() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/*  public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }*/




	@Override
	public String toString() {
		return "Rate{" +
				"id=" + id +
				", rate=" + rate +
				", product=" + product.getIdProduct() +
				// ", user=" + user.getId() +
				'}';
	}

}

