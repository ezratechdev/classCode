package Curl;

// initial
import java.util.*;

// added 
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

// end of added

class Curl {

    //
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    //
    public Curl(String name) {
        System.out.println("Hi i am a " + name);
    }

    public void Caller(String url) {
        System.out.println(url);
    }

    // added
    private void sendGet(String link , String token) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(link))
                // .uri(URI.create("https://httpbin.org/get"))
                .setHeader("User-Agent", "Java project Client")
                .header("Content-Type", "application/json")
                .header("Authenication", "Bearer "+token)
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // print status code
        System.out.println(response.statusCode());

        // print response body
        System.out.println(response.body() + " \nWaah!!");

    }

    private void sendPost(String link , String Email , String Password) throws Exception {

        // form parameters
        Map<Object, Object> data = new HashMap<>();
        data.put("email", Email);
        data.put("password", Password);
        // data.put("custom", "secret");
        // data.put("ts", System.currentTimeMillis());

        HttpRequest request = HttpRequest.newBuilder()
                .POST(buildFormDataFromMap(data))
                .uri(URI.create(link))
                // .uri(URI.create("https://httpbin.org/post"))
                .setHeader("User-Agent", "Java Inventory Project") // add request header
                .header("Content-Type", "application/x-www-form-urlencoded")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // print status code
        System.out.println(response.statusCode());

        // print response body
        System.out.println(response.body());

    }

    private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        System.out.println(builder.toString());
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }
    // end of added

    public static void main(String[] arguments) throws Exception {
        // Curl obj = new Curl("Ezra");
        // added
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjFlNTIzOTU2LTI4M2ItNGMwZi1iNmMxLWU1YzA4N2NjMTFmOSIsIm9wZXJhdGlvbiI6ImF1dGgiLCJpYXQiOjE2NDc5MzIwMjQsImV4cCI6MTY1MDUyNDAyNH0.Snzv5gUd6sepkFAobTJeIs7k5oVyOiP842MHwUjGxR8";
        Curl obj = new Curl("Ezra");
        obj.Caller("127.0.0.1/auth/login");

        // System.out.println("Testing 1 - Send Http GET request");
        // obj.sendGet("http://localhost/client/getavailable",token);

        // System.out.println("Testing 2 - Send Http POST request");
        obj.sendPost("http://localhost:5000/auth/login" , "ezrame254@gmail.com" ,"user");
        // end of added
    }

}