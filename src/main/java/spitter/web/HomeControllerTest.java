package spitter.web;

import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.View;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by liumolong on 18/4/22.
 */

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
        HomeController controller=new HomeController();
//        MockMvc mockMvc=standaloneSetup(controller).build();
//        mockMvc.perform(get("/")).andExpect(view().name("home"));
        assertEquals("home",controller.home());
    }
}
