package com.melekalpay.springboottodoapp.Config;

import com.melekalpay.springboottodoapp.Models.Todoitem;
import com.melekalpay.springboottodoapp.Repositories.TodoitemRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoitemDataloader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(TodoitemDataloader.class);

    @Autowired
    TodoitemRepository todoItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (todoItemRepository.count() == 0) {
            Todoitem todoItem1 = new Todoitem("get the milk");
            Todoitem todoItem2 = new Todoitem("rake the leaves");

            todoItemRepository.save(todoItem1);
            todoItemRepository.save(todoItem2); 
        }

        logger.info("Number of Todoitems: {}", todoItemRepository.count());
    }
    
}