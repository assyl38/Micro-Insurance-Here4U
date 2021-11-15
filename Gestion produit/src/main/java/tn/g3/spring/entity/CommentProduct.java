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
@Table(name = "comment")
public class CommentProduct implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String text;
	@ManyToOne
	@JoinColumn(name = "idProduct")
	private Product product;
	// @ManyToOne
	//@JoinColumn(name = "user_ID", nullable = false)
	//private User user;


	public CommentProduct(long id, String text, Product product) {
		this.id = id;
		this.text = text;
		this.product = product;
		//  this.user = user;
	}

	public CommentProduct() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/*public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }*/



	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", text='" + text + '\'' +
				", product=" + product.getIdProduct() +
				// ", user=" + user.getId() +
				'}';
	}

}
