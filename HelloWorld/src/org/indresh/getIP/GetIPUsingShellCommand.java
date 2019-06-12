package org.indresh.getIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetIPUsingShellCommand {

    public static void main(String[] args) {

        ProcessBuilder processBuilder = new ProcessBuilder();
        //String addressIP[]=new String[2];
        // Windows
        processBuilder.command("cmd.exe", "/c", "nslookup  http://bot.whatismyipaddress.com");

        try {

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line,ip="";
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String addressIP[] = line.split(":");
                if(addressIP[0].equals("Address"))
                {
                	ip=addressIP[1];
                }
            }
        	System.out.println(ip);
           
            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

