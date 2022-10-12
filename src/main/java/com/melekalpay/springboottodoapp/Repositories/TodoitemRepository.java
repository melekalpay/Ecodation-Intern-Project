package com.melekalpay.springboottodoapp.Repositories;


import org.springframework.data.repository.CrudRepository;

import com.melekalpay.springboottodoapp.Models.Todoitem;

public interface TodoitemRepository extends CrudRepository<Todoitem, Long> {  
}
