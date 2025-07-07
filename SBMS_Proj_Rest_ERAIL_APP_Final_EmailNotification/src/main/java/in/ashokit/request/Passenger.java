package in.ashokit.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Passenger_data") 
public class Passenger {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name = "name")
	private String name;

	@Column(name="fromm")
	private String from;
	
	@Column(name="too")
	private String to;
	
	@Column(name="cost")
	private String cost;
	
	@Column(name="email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", from=" + from + ", to=" + to + ", cost=" + cost
				+ ", email=" + email + "]";
		
	}
	
	
	

	
}
