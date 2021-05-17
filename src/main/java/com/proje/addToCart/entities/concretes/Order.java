package com.proje.addToCart.entities.concretes;
import javax.persistence.*;

@Entity
@Table(name="Orders")
public class Order {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int OrderId;
	
	@Column(name="CustomerId")
	private int CustomerId;
	
	@Column(name="EmployeeId")
	private int EmployeeId;
	
	@Column(name="OrderDate")
	private String OrderDate;
	
	@Column(name="ShipCity")
	private String ShipCity;

	public Order() {
		
	}
	
	public Order(int orderId, int customerId, int employeeId, String orderDate, String shipCity) {
		super();
		OrderId = orderId;
		CustomerId = customerId;
		EmployeeId = employeeId;
		OrderDate = orderDate;
		ShipCity = shipCity;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}

	public String getShipCity() {
		return ShipCity;
	}

	public void setShipCity(String shipCity) {
		ShipCity = shipCity;
	}
	
	
	

}
