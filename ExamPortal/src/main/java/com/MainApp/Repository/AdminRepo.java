package com.MainApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MainApp.Pojo.Admin;
@Repository
public interface AdminRepo extends CrudRepository<Admin, String> {
	
	Admin findByUsernameAndPassword(String name, String pass);
}
