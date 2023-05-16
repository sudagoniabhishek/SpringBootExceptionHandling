package com.italent.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italent.dto.UserRequest;
import com.italent.entity.User;
import com.italent.exception.UserNotFoundException;
import com.italent.repo.UserRepository;

@Service
public class UserService {
	
@Autowired
UserRepository repository;
	
	
	public User getuser(int id) throws UserNotFoundException {
		User user=repository.findByUserId(id);
		if(user!=null) {
		return user;
		}
		else {
			throw new UserNotFoundException("user not available with that id "+ id );
		}
		
	}
	
	 public List<User> getALlUsers() {
		 
	        return repository.findAll();
	    }

	  public User saveUser(UserRequest userRequest) {
	        User user = new User(userRequest.getId(),userRequest.getName(),userRequest.getEmail(),userRequest.getGender(),userRequest.getMobile(),userRequest.getAge(), userRequest.getNationality());
	        return repository.save(user);
	    }	 
	 
	 
}
