package com.wozu.ccidproject.cicdproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment =
        SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test() throws Exception {
        Integer expected = 7;
        Integer actual = this.restTemplate.getForObject("http://localhost" + port + "/add/4/3", Integer.class);
     //   assertThat(.contains(7));
        System.out.println(actual);
        assertEquals(expected,actual);
    }
}
