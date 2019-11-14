package thinking.in.spring.boot.firstappbygui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import thinking.in.spring.boot.config.WebConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebConfiguration.class)
public class FirstAppByGuiApplicationTests {
	@Autowired
	private ApplicationRunner applicationRunner;
	@Test
	public void contextLoads() {
		System.out.println();
	}

}
