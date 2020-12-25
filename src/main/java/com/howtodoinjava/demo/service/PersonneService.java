package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.howtodoinjava.demo.model.Personne;
import com.howtodoinjava.demo.repository.PersonneRepository;

@Service
public class PersonneService 
{
	 @Autowired
	    PersonneRepository repository;
	 public List<Personne> getAllEmployees()
	    {
	        List<Personne> employeeList = repository.findAll();
	         
	        if(employeeList.size() > 0) {
	            return employeeList;
	        } else {
	            return new ArrayList<Personne>();
	        }
	    }
	 
	 @Transactional
	    public void save(Personne entity) 
	    {
	       
	            repository.save(entity);
	            
	        
	    }
	 
	 public List<Personne> findByRue(String email) {
			List<Personne> list = repository.findByNom(email);
			return list;
		}
	 
	 @Transactional
		public void deleteAll() {
			repository.deleteAll();
		}
}
