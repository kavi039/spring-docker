package com.javatechie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class SpringDockerApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingEndpoint() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/greeting"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("w1elcome to java docker development"));
	}

}
