package spittr.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static
	org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static
	org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static
	org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		//Spring 3.2开始有了MockMvc
		MockMvc mockMvc =
				standaloneSetup(controller).build();
		
		mockMvc.perform(get("/"))
				.andExpect(view().name("home"));//预测得到home视图
	}

}
