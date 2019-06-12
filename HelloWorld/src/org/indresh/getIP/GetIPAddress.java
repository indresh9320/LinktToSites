package org.indresh.getIP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GetIPAddress {

	public static void main(String args[]) 
	        throws UnknownHostException 
	    { 
	        String systemipaddress = ""; 
	        try { 
	            //URL url_name = new URL("http://bot.whatismyipaddress.com"); 
	        	URL url_name = new URL("http://msplwa121.corp.medtronic.com");
	            BufferedReader sc = new BufferedReader( 
	                new InputStreamReader(url_name.openStream())); 
	  
	            // reads system IPAddress 
	            systemipaddress = sc.readLine().trim(); 
	        } 
	        catch (Exception e) { 
	        	int a=1+3;
	        	System.out.println(a);
	        	System.out.println(e);
	            systemipaddress = "Cannot Execute Properly"; 
	        } 
	        // Print IP address 
	        System.out.println("Public IP Address: "
	                           + systemipaddress + "\n"); 
	    } 
}
