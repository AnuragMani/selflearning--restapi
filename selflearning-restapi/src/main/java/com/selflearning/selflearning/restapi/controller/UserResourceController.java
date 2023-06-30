package com.selflearning.selflearning.restapi.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.selflearning.selflearning.restapi.repository.UserRepository;
import com.selflearning.selflearning.restapi.service.UserDaoService;
import com.selflearning.selflearning.restapi.user.Post;
import com.selflearning.selflearning.restapi.user.User;

import jakarta.validation.Valid;

@RestController
public class UserResourceController {
	
	private UserDaoService userDaoService;

	private UserRepository userRepository;
	
	public UserResourceController(UserDaoService userDaoService,UserRepository userRepository) {
		this.userDaoService = userDaoService;
		this.userRepository = userRepository;
	}

	@GetMapping(path = "/jpa/users")
	public List<User> getAllDetails() {
		return userRepository.findAll();
	}
	
	/*
	 * @GetMapping(path = "/jpa/users/{id}") public EntityModel<User>
	 * getAllUserIdDetailshateos(@PathVariable int id) { User user =
	 * userDaoService.getUserId(id); if(user ==null) //{ throw new
	 * UserNotFoundException("Id:"+id);
	 * 
	 * EntityModel<User> entityModel = EntityModel.of(user); //} WebMvcLinkBuilder
	 * link = linkTo(methodOn(this.getClass()).getAllDetails());
	 * entityModel.add(link.withRel("all-users")); return entityModel; }
	 */
	
	
	/*
	 * @DeleteMapping(path = "/jpa/users/{id}") public void
	 * deleteByUserIdDetails(@PathVariable int id) { userRepository.deleteById(id);
	 * }
	 */
	  
	  @GetMapping(path = "/jpa/users/{id}/posts") 
	  public List<Post> retriveByUserIdDetails(@PathVariable int id) {
		 Optional<User> userList = userRepository.findById(id);
		 
		 if(userList.isEmpty()) {
			 throw new UserNotFoundException("Id  :"+id);
		 }
		 
		 return userList.get().getPosts();
	  }
	 
//	@PostMapping(path = "/jpa/usersave")
//	public User saveUser(@RequestBody User user) {
//		return userDaoService.saveUser(user);
//	}

	/*
	 * @PostMapping(path = "/jpa/usersavetest") public ResponseEntity<User>
	 * saveUserResponseBody(@Valid @RequestBody User user) { User saveUser =
	 * userDaoService.saveUser(user); URI location =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/" + "{id}")
	 * .buildAndExpand(saveUser.getId()).toUri(); return
	 * ResponseEntity.created(location).build(); }
	 */
	

}
