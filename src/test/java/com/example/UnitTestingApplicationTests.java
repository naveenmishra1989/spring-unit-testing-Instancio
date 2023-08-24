package com.example;

import com.example.model.Item;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
//@TestPropertySource(locations= {"classpath:test-configuration.properties"})
public class UnitTestingApplicationTests {

	@Test
	public void contextLoads() {
		List<Item> items = Instancio.stream(Item.class).limit(5).collect(Collectors.toList());
	}

}
