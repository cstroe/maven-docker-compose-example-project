package com.github.cstroe.example;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MainIT {
    @Test
    public void index_page_should_load() throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://localhost:8080").asString();
        assertThat(response.getStatus(), is(equalTo(200)));
        assertThat(response.getBody(), containsString("Hello"));
        fail();
    }
}