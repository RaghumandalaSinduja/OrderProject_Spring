package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Orders;
import com.sts.rest.services.OrderServices;



@RestController
public class OrderController {
	@Autowired
	private OrderServices service;
@GetMapping("/Orders")
public List<Orders> getAllOrders()
{
	
	System.out.println("orders");
	return service.getAllOrders();
	
}

@PostMapping("/addorders")
public Orders addOrder(@RequestBody Orders order) {
	return this.service.addOrder(order);
}
@DeleteMapping("/deleteorder/{ordid}")
public void deleteOrder(@PathVariable int ordid) {
	this.service.deleteOrder(ordid);
}
@PutMapping("/updateorder/{ordid}")
public Orders updateOrder(@PathVariable int ordid, @RequestBody Orders order)
{
	return this.service.updateOrder(ordid, order);
	
}

	

}
