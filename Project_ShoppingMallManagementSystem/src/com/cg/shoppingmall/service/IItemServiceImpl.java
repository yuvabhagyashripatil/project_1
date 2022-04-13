package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.repository.IItemRepository;
import com.cg.shoppingmall.repository.IItemRepositoryImpl;

public class IItemServiceImpl  implements IItemService
{

	
	// Step 1: Establishing connection between Service and Repo
	
				private IItemRepository dao;
				
				public IItemServiceImpl() 
				{
					dao = new IItemRepositoryImpl();
				}
				
				
				//changes
				@Override
				public Item addItem(Item item) {
					
					dao.beginTransaction();
					dao.addItem(item);
					dao.commitTrasaction();
					return item;
				}


}
