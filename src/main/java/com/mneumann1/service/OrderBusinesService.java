/**
 * 
 */
package com.mneumann1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mneumann1.model.OrderModel;

/**
 * @author MNEUMANN1
 *
 */
//@Service
//@Primary // if defined 2 or more OrderBusinesServices of the OrderBusinesServiceInterface --> the one with @Primary will be called
public class OrderBusinesService implements OrderBusinesServiceInterface {

	@Override
	public void test() {
		System.out.println("OrderBusinesService is working");
	}

	@Override
	public List<OrderModel> getOrders() {

		List<OrderModel> orders = new ArrayList<>();
		
		orders.add(new OrderModel(0L,  "000", "Sky diving experience", 1500.0f, 1));
		orders.add(new OrderModel(1L,  "001", "Run with the bulls in Pamplona", 120.0f,51));
		orders.add(new OrderModel(2L,  "002", "Orbit the moon with SpaceX", 5000000.0f, 2));
		orders.add(new OrderModel(3L,  "003", "Shot from a cannon", 420.0f, 1));
		orders.add(new OrderModel(4L,  "004", "Zip line the Grand Canyon", 470.0f, 1));
		orders.add(new OrderModel(5L,  "005", "The whole enchilada ride in Moab", 220.0f, 3));
		orders.add(new OrderModel(6L,  "006", "Wingsuit jumping lessons in Norway", 900.0f, 4));
		orders.add(new OrderModel(7L,  "007", "Backpacking tour to peak of Kilimandjaro", 300.0f, 4));
		orders.add(new OrderModel(8L,  "008", "Sled race in the Iditarod", 3500.0f, 2));
		orders.add(new OrderModel(9L,  "009", "SCUBA dive Jellyfish Lake in Palau", 40.0f, 2));
		orders.add(new OrderModel(10L, "010", "Lemonade by the pool and a book", 2.0f, 1));
		
		return orders;
	}

	@Override
	public void init() {
		System.out.println("Init method of the Orders Business Service");	
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the Orders Business Service");
	}

}
