package com.sts.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Orders;
import com.sts.rest.repository.OrderRepository;

@Service

public class OrderServices {
	@Autowired
	private OrderRepository serviceRepo;
	public List<Orders> getAllOrders()
	{
		List<Orders> list=new ArrayList<Orders>();
		this.serviceRepo.findAll().forEach(list::add); //reference method is add, directly adding
		return list;
	}
	public Orders addOrder(Orders order)
	{
		return this.serviceRepo.save(order);
	}
	public Orders updateOrder(Integer id, Orders order){
		return this.serviceRepo.save(order);
	}
	public void deleteOrder(Integer id)
	{
		this.serviceRepo.deleteById(id);
		
	}
}
