package com.enedilim.rest.client;

import com.enedilim.rest.model.WordList;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.filter.LoggingFilter;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Consume without the WordApi proxy
 */
public class ConsumeWithoutProxy {

    private WebTarget target;

    @Before
    public void init() {
        String REST_URL = "http://www.enedilim.com/sozluk/xmlv2soz/";

        Client client = ClientBuilder.newBuilder().build();
        target = client.target(REST_URL);
                //.register(new LoggingFilter());
    }

    @Test
    public void getWordTest() {
        String word = "at";
        WordList wordList = target.path(word).request().get(WordList.class);

        Assert.assertThat(wordList.getWordItem().size(), equalTo(2));
    }

    @Test
    public void getWordAsXmlStringTest() {
        String word = "at";
        String xmlString = target.path(word).request().get(String.class);

        Assert.assertThat(xmlString, CoreMatchers.containsString("<word hom=\"1\">at</word>"));
    }
}
