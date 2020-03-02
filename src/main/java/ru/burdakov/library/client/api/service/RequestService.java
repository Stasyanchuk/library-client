package ru.burdakov.library.client.api.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import ru.burdakov.library.client.api.entity.BookEntity;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestService {

    private static final String REQUEST_BOOKS = "http://%s:%s/books";

    private static Reader getRequest(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet getRequest = new HttpGet(url);
        HttpResponse response = null;
        try {
            response = httpClient.execute(getRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reader;
    }

    private static void getPostRequest(String url, String jsonEntity) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(url);
        StringEntity entity = null;
        entity = new StringEntity(jsonEntity, Charsets.UTF_8);
        postRequest.setHeader("Accept", "application/json");
        postRequest.setHeader("Content-type", "application/json");
        postRequest.setEntity(entity);
        HttpResponse response = client.execute(postRequest);

        client.close();

    }

    public static List<BookEntity> getBooks() {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<BookEntity>>() {
        }.getType();
        List<BookEntity> books = gson.fromJson(getRequest(String.format(REQUEST_BOOKS, "localhost", 8080)), listType);
        return books;
    }

    public static void addBook(BookEntity book) {
        Gson gson = new Gson();
        try {
            getPostRequest(String.format(REQUEST_BOOKS, "localhost", 8080), gson.toJson(book));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
