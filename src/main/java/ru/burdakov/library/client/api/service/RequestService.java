package ru.burdakov.library.client.api.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import ru.burdakov.library.client.api.entity.*;
import ru.burdakov.library.client.api.util.LocalDateAdapter;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestService {

    private static final String REQUEST_BOOKS = "http://%s:%s/books";
    private static final String REQUEST_AUTHORS = "http://%s:%s/authors";
    private static final String REQUEST_CLIENTS = "http://%s:%s/clients";
    private static final String REQUEST_RENTS = "http://%s:%s/rents";

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

    private static Reader getPostRequest(String url, String jsonEntity) {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(url);
        StringEntity entity = new StringEntity(jsonEntity, Charsets.UTF_8);
        postRequest.setHeader("Accept", "application/json");
        postRequest.setHeader("Content-type", "application/json");
        postRequest.setEntity(entity);
        HttpResponse response = null;
        try {
            response = client.execute(postRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reader;
    }

    private static Reader getPostRequest(String url) {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(url);
        HttpResponse response = null;
        try {
            response = client.execute(postRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reader;
    }

    private static void getDeleteRequest(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpDelete httpDelete = new HttpDelete(url);
        try {
            HttpResponse response = httpclient.execute(httpDelete);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getUpdateRequest(String url, String jsonEntity) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPut httpPut = new HttpPut(url);
        StringEntity entity = new StringEntity(jsonEntity, Charsets.UTF_8);
        httpPut.setHeader("Accept", "application/json");
        httpPut.setHeader("Content-type", "application/json");
        httpPut.setEntity(entity);
        try {
            HttpResponse response = httpClient.execute(httpPut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<BookEntity> getBooks() {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<BookEntity>>() {
        }.getType();
        List<BookEntity> books = gson.fromJson(getRequest(String.format(REQUEST_BOOKS, ServerSettings.IP, ServerSettings.PORT)), listType);
        return books;
    }

    public static BookEntity[] getArrayBooks() {
        Gson gson = new Gson();
        return gson.fromJson(getRequest(String.format(REQUEST_BOOKS, ServerSettings.IP, ServerSettings.PORT)), BookEntity[].class);
    }

    public static List<BookEntity> getBookByAuthorId(Integer authorId){
        Gson gson = new Gson();
        Type listType = new TypeToken<List<BookEntity>>() {
        }.getType();
        List<BookEntity> books = gson.fromJson(getRequest(String.format(REQUEST_BOOKS+"/author/%s", ServerSettings.IP, ServerSettings.PORT, authorId)), listType);
        return books;
    }

    public static BookEntity addBook(BookEntity book) {
        Gson gson = new Gson();
        return gson.fromJson(getPostRequest(String.format(REQUEST_BOOKS, ServerSettings.IP, ServerSettings.PORT), gson.toJson(book)), BookEntity.class);
    }

    public static void deleteBook(Integer bookId) {
        getDeleteRequest(String.format(REQUEST_BOOKS + "?id=%s", ServerSettings.IP, ServerSettings.PORT, bookId));
    }

    public static void updateBook(BookEntity book) {
        Gson gson = new Gson();
        getUpdateRequest(String.format(REQUEST_BOOKS, ServerSettings.IP, ServerSettings.PORT), gson.toJson(book));
    }

    public static List<AuthorEntity> getAuthors() {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<AuthorEntity>>() {
        }.getType();
        return gson.fromJson(getRequest(String.format(REQUEST_AUTHORS, ServerSettings.IP, ServerSettings.PORT)), listType);
    }

    public static AuthorEntity addAuthor(AuthorEntity author) {
        Gson gson = new Gson();
        return gson.fromJson(getPostRequest(String.format(REQUEST_AUTHORS, ServerSettings.IP, ServerSettings.PORT), gson.toJson(author)), AuthorEntity.class);
    }

    public static void deleteAuthor(Integer authorId) {
        getDeleteRequest(String.format(REQUEST_AUTHORS + "?id=%s", ServerSettings.IP, ServerSettings.PORT, authorId));
    }

    public static void updateAuthor(AuthorEntity author) {
        Gson gson = new Gson();
        getUpdateRequest(String.format(REQUEST_AUTHORS, ServerSettings.IP, ServerSettings.PORT), gson.toJson(author));
    }

    public static List<ClientEntity> getClients() {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<ClientEntity>>() {
        }.getType();
        return gson.fromJson(getRequest(String.format(REQUEST_CLIENTS, ServerSettings.IP, ServerSettings.PORT)), listType);
    }

    public static ClientEntity[] getArrayClient() {
        Gson gson = new Gson();
        return gson.fromJson(getRequest(String.format(REQUEST_CLIENTS, ServerSettings.IP, ServerSettings.PORT)), ClientEntity[].class);
    }

    public static ClientEntity addClient(ClientEntity client) {
        Gson gson = new Gson();
        return gson.fromJson(getPostRequest(String.format(REQUEST_CLIENTS, ServerSettings.IP, ServerSettings.PORT), gson.toJson(client)), ClientEntity.class);
    }

    public static void deleteClient(Integer clientId) {
        getDeleteRequest(String.format(REQUEST_CLIENTS + "?id=%s", ServerSettings.IP, ServerSettings.PORT, clientId));
    }

    public static void updateClient(ClientEntity client) {
        Gson gson = new Gson();
        getUpdateRequest(String.format(REQUEST_CLIENTS, ServerSettings.IP, ServerSettings.PORT), gson.toJson(client));
    }

    public static List<RentEntity> getRents() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();
        Type listType = new TypeToken<List<RentEntity>>() {
        }.getType();
        return gson.fromJson(getRequest(String.format(REQUEST_RENTS, ServerSettings.IP, ServerSettings.PORT)), listType);
    }

    public static List<RentEntity> getRents(Integer clientId) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();
        Type listType = new TypeToken<List<RentEntity>>() {
        }.getType();
        return gson.fromJson(getRequest(String.format(REQUEST_RENTS+"/%s", ServerSettings.IP, ServerSettings.PORT, clientId)), listType);
    }

    public static RentEntity addRent(Integer bookId, Integer clientId) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();
        return gson.fromJson(getPostRequest(String.format(REQUEST_RENTS + "/%s/%s", ServerSettings.IP, ServerSettings.PORT, bookId, clientId)), RentEntity.class);
    }

    public static void deleteRent(Integer bookId, Integer clientId, ReviewEntity reviewEntity) {
        Gson gson = new Gson();
        getUpdateRequest(String.format(REQUEST_RENTS + "/%s/%s", ServerSettings.IP, ServerSettings.PORT, bookId, clientId), gson.toJson(reviewEntity));
    }

}
