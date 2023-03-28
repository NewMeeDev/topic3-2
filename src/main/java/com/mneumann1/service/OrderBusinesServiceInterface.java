/**
 * 
 */
package com.mneumann1.service;

import java.util.List;

import com.mneumann1.model.OrderModel;

/**
 * @author MNEUMANN1
 *
 */
public interface OrderBusinesServiceInterface {
	
	public void test();
	
	public List<OrderModel> getOrders();
	
	public void init();
	
	public void destroy();
	
	
	//  future methods
	
	// searchOrders(String searchTerm)
	
	// addOrder(OrderModel new0)
	
	// deleteOrder(Long id)
	
	// updateOrder(OrderModel updateMe)
	
	// getOneOrder(Long id)

}
