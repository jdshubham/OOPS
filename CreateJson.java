package com.bridgelabz.oops;


import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject; 
/**
 * @author admin1
 * @purpose Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
 */

public class CreateJson 
{
			 /**
			 * @purpose tells the compiler that the programmer believes the code to be safe and won't cause unexpected exceptions.
			 */
		    
		    @SuppressWarnings("unchecked")
			public static void main( String[] args )
		    {
		    	/**
			     * @ purpose Inventory Details for Rice
			     */
		    	JSONObject riceDetails = new JSONObject();
		        riceDetails.put("name", "Rice");
		        riceDetails.put("weight", "35");
		        riceDetails.put("price", "100");
		         
		        JSONObject inventoryRiceObject = new JSONObject();
		        inventoryRiceObject.put("inventory", riceDetails);
		         
		        /**
			     * @ purpose Inventory Details for Wheats
			     */
		        JSONObject wheatDetails = new JSONObject();
		        wheatDetails.put("name", "Wheat");
		        wheatDetails.put("weight", "25");
		        wheatDetails.put("price", "150");
		         
		        JSONObject inventoryWheatObject = new JSONObject();
		        inventoryWheatObject.put("inventory", wheatDetails);
		        
		        /**
			     * @ purpose Inventory Details for Pulses
			     */
		        JSONObject pulseDetails = new JSONObject();
		        pulseDetails.put("name", "Pulses");
		        pulseDetails.put("weight", "5");
		        pulseDetails.put("price", "200");
		         
		        JSONObject inventorypulseObject = new JSONObject();
		        inventorypulseObject.put("inventory", pulseDetails);
		         
		         
		        /**
			     * @ purpose Adding Inventory Details in the list
			     */
		        JSONArray inventoryList = new JSONArray();
		        inventoryList.add(inventoryRiceObject);
		        inventoryList.add(inventoryWheatObject);
		        inventoryList.add(inventorypulseObject);
		         
		        /**
			     * @ purpose write Json file
			     */
		        try (FileWriter file = new FileWriter("invent.json")) {
		 
		            file.write(inventoryList.toJSONString());
		            file.flush();
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}

		

