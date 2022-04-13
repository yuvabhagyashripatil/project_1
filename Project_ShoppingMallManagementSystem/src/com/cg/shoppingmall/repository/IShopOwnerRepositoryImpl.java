package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.ShopOwner;

public class IShopOwnerRepositoryImpl implements IShopOwnerRepository
{
	//Step 1: Start JPA LifeCycle
	
	private EntityManager entityManager;
	public IShopOwnerRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
   // Create operation - Repo/DAO
	
	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		entityManager.merge(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner searchShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class,id);
		return shopOwner;
	}

	@Override
	public ShopOwner deleteShopOwner(int id) {
		ShopOwner shopOwner	= entityManager.find(ShopOwner.class, id);
		entityManager.remove(shopOwner);
		return shopOwner;
	}

}
