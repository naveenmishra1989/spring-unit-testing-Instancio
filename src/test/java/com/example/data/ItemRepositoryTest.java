package com.example.data;

import com.example.model.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository repository;
	
	@Test
	public void testFindAll() {
		List<Item> items = repository.findAll();
		assertEquals(3,items.size());
	}

	@Test
	public void testFindOne() {
		Item item = repository.findById(10001).get();
		
		assertEquals("Item1",item.getName());
	}

}
