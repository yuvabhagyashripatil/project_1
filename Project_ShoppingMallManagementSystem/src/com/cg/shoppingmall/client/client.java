package com.cg.shoppingmall.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.shoppingmall.entities.Customer;
import com.cg.shoppingmall.entities.Employee;
import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.Mall;
import com.cg.shoppingmall.entities.MallAdmin;
import com.cg.shoppingmall.entities.OrderDetails;
import com.cg.shoppingmall.entities.Shop;
import com.cg.shoppingmall.entities.ShopOwner;
import com.cg.shoppingmall.entities.User;
import com.cg.shoppingmall.repository.ICustomerRepository;
import com.cg.shoppingmall.repository.ICustomerRepositoryImpl;
import com.cg.shoppingmall.repository.IItemRepository;
import com.cg.shoppingmall.repository.IItemRepositoryImpl;
import com.cg.shoppingmall.repository.IMallAdminRepository;
import com.cg.shoppingmall.repository.IMallAdminRepositoryImpl;
import com.cg.shoppingmall.repository.IMallRepository;
import com.cg.shoppingmall.repository.IMallRepositoryImpl;
import com.cg.shoppingmall.repository.IShopOwnerRepository;
import com.cg.shoppingmall.repository.IShopOwnerRepositoryImpl;
import com.cg.shoppingmall.service.IEmployeeService;
import com.cg.shoppingmall.service.IEmployeeServiceImpl;
import com.cg.shoppingmall.service.IOrderService;
import com.cg.shoppingmall.service.IOrderServiceImpl;
import com.cg.shoppingmall.service.IShopService;
import com.cg.shoppingmall.service.IShopServiceImpl;
import com.cg.shoppingmall.service.IUserService;
import com.cg.shoppingmall.service.IUserServiceImpl;

public class client 
{
	public static void main(String[] args) {
		
	

	/*	
				
		//CRUD operation  of employees
 
		Employee employee = new Employee();
		IEmployeeService service= new IEmployeeServiceImpl();
		
//Customer object
		Customer customer =new Customer();
		ICustomerRepository icr = new ICustomerRepositoryImpl();
	
//Shop object
			Shop shop = new Shop();
			IShopService iss= new IShopServiceImpl();
	
//Order object
			OrderDetails order=new OrderDetails();
      	   IOrderService ios= new IOrderServiceImpl();
      	  
//User object	
		User user = new User();
			IUserService cservice = new IUserServiceImpl();
			
//Item object	
			Item item=new Item();
			IItemRepository iir=new IItemRepositoryImpl();
			
//Shop Owner object
			ShopOwner shopowner= new ShopOwner();
			IShopOwnerRepository isor= new IShopOwnerRepositoryImpl();
//Mall object
			Mall mall=new Mall();
			IMallRepository imr=new IMallRepositoryImpl();
//Mall Admin object
			MallAdmin malladmin=new MallAdmin();
			IMallAdminRepository imar = new IMallAdminRepositoryImpl();



//Create Operation 1 for employee
		
	employee.setId(1);
	employee.setName("Ramya");
	employee.setDob("08-04-1987");
	employee.setSalary(45000);
	employee.setAddress("London");
	employee.setDesignation("Sales");
		System.out.println("Added  employee to database.");
	
//Create Operation2 for employee
		
	//at this breakpoint, we have added one record to table
	employee.setId(2);
	employee.setName("Mark");
	employee.setDob("03-05-1989");
	employee.setSalary(55000);
	employee.setAddress("London");
	employee.setDesignation("Manager");
		System.out.println("added employee: "+ employee.getId()+" "+employee.getName()+" "+employee.getDob()+" "+employee.getSalary()+" "+employee.getAddress()
	+" "+employee.getDesignation());
	service.addEmployee(employee);

//Create Operation3 for customer
	customer.setId(1);
	customer.setName("Amit");
	customer.setPhone("8104848845");
	customer.setEmail("manuaradhy45a98@gmail.com");
	icr.addCustomer(customer);
		System.out.println("added customer details");

//Create Operation4 for shop
	shop.setShopId(1);
	 shop.setShopCategory("Grocery");   
	//shop.setShopEmployeeId("JK_3");
	 shop.setShopName("FORTUNE");
	 //shop.setCustomers("ABC");   
	  shop.setShopStatus("GOOD");
	 //shop.setShopOwner("KJ ROHEE");
	  shop.setLeaseStatus("Rented");
	   iss.addShop(shop);
	    System.out.println("Shop details added");

//Create operation of order
	order.setId(101);
	order.setDateOfPurchase("01-03-2000");
	order.setTotal(200);
	order.setPaymentMode("cash");
	ios.addOrder(order);
		System.out.println(" database created");

//create operation of user
	user.setId(11);
	user.setName("bhayashri");
	user.setType("normal");
	user.setPassword("kbc");
	cservice.addUser(user);
		System.out.println("new user Added");

//create operation of item
	item.setId(1);
	item.setName("IPhone");
	item.setManufacturing("2021");
	item.setExpiry("2028");
	item.setCategory("Mobile");
	item.setPrice(25000);
	iir.addItem(item);
		System.out.println("new item Added");

//create operation of shop owner
	shopowner.setId(201);
	shopowner.setName("Chris");
	shopowner.setDob("13-02-1987");
	shopowner.setAddress("Mysore");
	isor.addShopOwner(shopowner);
	    System.out.println("new shop owner data added");

//create operation of mall
		mall.setId(111);
		mall.setMallName("Floria");
		mall.setCategories(null);
		mall.setLocation("Bangalore");
		imr.addMall(mall);
		System.out.println("mall details added");

//create operation of mall admin
		malladmin.setId(301);
		malladmin.setName("Nick");
		malladmin.setPhone("9864835211");
		malladmin.setPassword("****");
		imar.addMallAdmin(malladmin);
		   System.out.println("admin details added to database");


*/

	}
	
}