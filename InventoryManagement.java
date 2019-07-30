package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
/**
 * @author admin1
 * @purpose Calculate the value for every Inventory from JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
 */
public class InventoryManagement 
{
	public static void main(String[] args)
	{
		int ch;
		/**
		 * @purpose executes a block of code at least once
		 **/
		do 
		{
			System.out.println("=================Inventory==================");
			System.out.println("1.Rice 2.Pulses 3.Wheat");
			System.out.println("Enter the choice:");
			
			Scanner scanner = new Scanner(System.in);
			ch = scanner.nextInt();
			switch (ch)
			{
				case 1:
					calculate("Rice");
					break;
				case 2:
					calculate("Pulses");
					break;
				case 3:
					calculate("Wheat");
					break;
				default:
				
					scanner.close();
			}
		} while (ch < 3);

	}

	private static void calculate(String string) 
		{
			/**
			 * @purpose way to parse Json to Java Object
			 **/
			ObjectMapper mapper = new ObjectMapper();
			
			/**
			 * @purpose representation of a file or directory path name
			 **/
			File file = new File("/home/admin1/eclipse-workspace/shubham/Bridge/inventory.json");
			
			/**
			 * @purpose create linked list to store the data 
			 **/
			
			LinkedList<Inventory> list = new LinkedList<>();

		try 
		{
			/**
			 * @purpose Read the values which are stored in list 
			 **/
			
			list = mapper.readValue(file, new TypeReference<LinkedList<Inventory>>() {
			});

			System.out.println("Name\tWeight\tprice\tTotal");
			/**
			 * @purpose To iterate the loop 
			 **/
			
			for (int i = 0; i < list.size(); i++) 
			{
				if (list.get(i).getName().equals(string)) 
				{
					System.out.println(list.get(i).getName() + "\t" + list.get(i).getWeight() + "\t" + list.get(i).getPrice()
					+ "\t" + list.get(i).getWeight() * list.get(i).getPrice() + "    ");
				}
			}
		}
		/**
		 * @purpose to catch the exception if any occurs 
		 **/
		
		catch (IOException e) 
		{

		}
		}
		

	
}


