package com.enedilim.rest.client;

import com.enedilim.rest.model.WordList;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.filter.LoggingFilter;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordApiTest {

    private WordApi wordApi;

    @Before
    public void init() {

        String REST_URL = "http://www.enedilim.com/sozluk/xmlv2soz/";

        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(REST_URL)
                .register(new LoggingFilter());

        wordApi = WebResourceFactory.newResource(WordApi.class, target);
    }

    @Test
    public void getWordTest() {
        WordList wordList = wordApi.getWord("at");

        Assert.assertThat(wordList.getWordItem().size(), equalTo(2));
    }

}
