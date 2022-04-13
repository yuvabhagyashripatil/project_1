package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.Employee;
import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.Shop;
import com.cg.shoppingmall.repository.IShopRepository;
import com.cg.shoppingmall.repository.IShopRepositoryImpl;

public class IShopServiceImpl implements IShopService
{

	// Step 1: Establishing connection between Service and Repo
	
				private IShopRepository dao;
				
				public IShopServiceImpl() 
				{
					dao = new IShopRepositoryImpl();
				}
				
		// Step 2: Service calls to perform CRUD Operation

		@Override
		public Shop addShop(Shop shop) {
			dao.beginTransaction();
			dao.addShop(shop);
			dao.commitTransaction();
			return shop;
		}

		@Override
		public Shop updateShop(Shop shop)
		{
			dao.beginTransaction();
			dao.updateShop(shop);
			dao.commitTransaction();
			return shop;		
		}

		@Override
		public Shop searchShopById(int id)
		{
			Shop shop = dao.searchShopById(id);
			return shop;
		}

		
		@Override
		public boolean deleteShop(int id)
		{
			dao.beginTransaction();
			dao.deleteShop(id);
			dao.commitTransaction();		
			return false;
			
		}

		
		
}
