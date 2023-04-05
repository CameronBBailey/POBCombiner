package org.Connection;

import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class PostmanContentFetcher {

    public String URL = "https://pastebin.com/raw/LpFByWnD";

    public static void getContent(String URL)  {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpUriRequest request = RequestBuilder.get()
                    .setUri(URL)
//                    .setHeader(HttpHeaders.HOST, "pastebin.com" )
//                    .setHeader("Authorization", "Bearer 123token")
                    // add request body
//                    .setEntity(new StringEntity("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}"))
                    .build();

            // specify the POST body to send to the server as part of the request
//            httpPost.setEntity(new StringEntity("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}"));

            System.out.println("Executing GET request...");
            HttpResponse response = httpclient.execute(request);

            System.out.println("Status code: " + response.getStatusLine().getStatusCode());

            String responseBody = new BasicResponseHandler().handleResponse(response);

            System.out.println("Response: " + responseBody);
        } catch(IOException e) {
            System.out.println("SOMETHING IS WRONG BUT IDK WHAT");
        }
    }
}