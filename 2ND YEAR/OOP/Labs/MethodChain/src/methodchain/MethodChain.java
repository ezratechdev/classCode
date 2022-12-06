/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodchain;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author ezra
 */
public class MethodChain {

    /**
     * @param args the command line arguments
     */
    public MethodChain(){
        Scanner myScan = new Scanner(System.in);
        System.out.println(myScan.nextLine());
    }
    public MethodChain Get(){
        System.out.println("hi am the get func");
        return this;
    }
        public MethodChain Set(){
        System.out.println("hi am the Set func");
        return this;
    }

    public MethodChain Caller() throws MalformedURLException, ProtocolException, IOException{
        URL url = new URL("https://reqbin.com/echo/post/json");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer mt0dgHmLJMVQhvjpNXDyA83vA_PxH23Y");
http.setRequestProperty("Content-Type", "application/json");

String data = "{\n  \"Id\": 12345,\n  \"Customer\": \"John Smith\",\n  \"Quantity\": 1,\n  \"Price\": 10.00\n}";

byte[] out = data.getBytes(StandardCharsets.UTF_8);

OutputStream stream = http.getOutputStream();
stream.write(out);

System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();
        return null;
    }        
    public static void main(String[] args) throws ProtocolException, IOException {
        // TODO code application logic here
        MethodChain obj = new MethodChain();
        obj.Get().Set().Get().Get().Set();
        obj.Caller();
    }
    
}
