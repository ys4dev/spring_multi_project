package app.web;

import app.Application;
import app.domain.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
public class ControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void before() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void index() throws Exception {
        MvcResult result = mvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        System.out.println(result);
    }
}
