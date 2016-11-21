package com.oliinyk.controller;


import com.oliinyk.configuration.ApplicationConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class TriangleCalculatorControllerTest {

    @Autowired
    private TriangleCalculatorController triangleCalculatorController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(triangleCalculatorController).build();
    }

    @Test
    public void checkHypotenuse() throws Exception {

        this.mockMvc.perform(get("/calculate/cathetusA=2/cathetusB=2")).andDo(print()).andExpect(status()
                .isOk()).andExpect(jsonPath("$.hypotenuse").value("2.83"));
    }


}
