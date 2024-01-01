package leetcode.arrayrelated;
import java.util.*;
import java.io.*;
import java.net.*;

class Testing {

    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader bR = new BufferedReader(  new InputStreamReader(inputStream));
                String line = "";

                StringBuilder responseStrBuilder = new StringBuilder();
                while((line =  bR.readLine()) != null){

                    responseStrBuilder.append(line);
                }
                inputStream.close();
                String getValue=responseStrBuilder.substring(responseStrBuilder.toString().indexOf(":")+2,responseStrBuilder.toString().indexOf("}")-1);
                //String newV=getValue.replace("")
                String [] strArray=getValue.replace(",","").split(" ");
                int count=0;
                for (int i=0;i<strArray.length;i++) {
                    if(strArray[i].contains("age=") && Integer.parseInt(strArray[i].replace("age=",""))>=50) {
                        count+=1;
                    }
                }
                System.out.println(count);
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}
