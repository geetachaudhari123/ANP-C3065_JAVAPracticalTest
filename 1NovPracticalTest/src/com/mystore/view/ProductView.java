package com.mystore.view;

     import java.util.Scanner;
     import com.mystore.model.Product;
     import com.mystore.service.ProductService;
public class ProductView {
	    
public static void main(String[] args, Object prodClassObj, Object prodService) {
		// TODO Auto-generated method stub
              
	ProductService ProductService=new ProductService();
		Scanner sc = new Scanner(System.in);
		}
		{
		         System.out.println("Enter product id");
		         Scanner id = new Scanner(System.in);    
	
		System.out.println("Enter product Name");
        Scanner Name = new Scanner(System.in);    
             
        System.out.println("Enter product price");
        Scanner price = new Scanner(System.in);    
	    }
		Product prodClassObj=new Product(id,Name,price);{
		}
		}
		
		

