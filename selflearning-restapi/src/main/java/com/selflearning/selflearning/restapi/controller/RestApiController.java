/*
 * package com.selflearning.selflearning.restapi.controller;
 * 
 * import java.net.URI; import java.util.List; import static
 * org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*; import
 * org.springframework.hateoas.EntityModel; import
 * org.springframework.hateoas.server.mvc.WebMvcLinkBuilder; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 * 
 * import com.selflearning.selflearning.restapi.service.UserDaoService; import
 * com.selflearning.selflearning.restapi.user.User;
 * 
 * import jakarta.validation.Valid;
 * 
 * @RestController //@RequestMapping("/myappdb") public class RestApiController
 * {
 * 
 * 
 * @RequestMapping(method= RequestMethod.GET, path ="/myapp" ) public String
 * getString() { return "MyAppDB"; }
 * 
 * 
 * 
 * private MessageSource messageSource;
 * 
 * 
 * public RestApiController(MessageSource messageSource) { this.messageSource =
 * messageSource;
 * 
 * }
 * 
 * 
 * private UserDaoService userDaoService;
 * 
 * public RestApiController(UserDaoService userDaoService) { this.userDaoService
 * = userDaoService; }
 * 
 * @GetMapping(path = "/myapp") public String getString() { return "MyAppDB"; }
 * 
 * @GetMapping(path = "/happy") public String getString1() { return "Test"; }
 * 
 * 
 * @GetMapping(path = "/getInternationalizedMessage") public String
 * getInternationalizedMessage() { Locale locale =
 * LocaleContextHolder.getLocale();
 * messageSource.getMessage("good.morning.message", null,"default Message" ,
 * locale); return "Test"; }
 * 
 * 
 * @GetMapping(path = "/hello-world/path-variable/{name}") public HelloWorldBean
 * helloWorldBean(@PathVariable String name) { // return new
 * HelloWorldBean("hello-world" + name); return new
 * HelloWorldBean(String.format("Hellow World, %s", name)); }
 * 
 * @GetMapping(path = "/retriveUserDetails") public List<User> getAllDetails() {
 * return userDaoService.getAllList();
 * 
 * }
 * 
 * @GetMapping(path = "/retriveUserDetails/{id}") public User
 * getAllUserIdDetails(@PathVariable int id) { User user =
 * userDaoService.getUserId(id); if(user ==null) { throw new
 * UserNotFoundException("Id:"+id); } return user; }
 * 
 * @GetMapping(path = "/retriveUserDetailshateos/{id}") public EntityModel<User>
 * getAllUserIdDetailshateos(@PathVariable int id) { User user =
 * userDaoService.getUserId(id); if(user ==null) //{ throw new
 * UserNotFoundException("Id:"+id);
 * 
 * EntityModel<User> entityModel = EntityModel.of(user); //} WebMvcLinkBuilder
 * link = linkTo(methodOn(this.getClass()).getAllDetails());
 * entityModel.add(link.withRel("all-users")); return entityModel; }
 * 
 * @DeleteMapping(path = "/retriveUserDetails/{id}") public void
 * deleteByUserIdDetails(@PathVariable int id) {
 * userDaoService.deleteByUserId(id); }
 * 
 * 
 * @PostMapping(path = "/usersave") public User saveUser(@RequestBody User user)
 * { return userDaoService.saveUser(user); }
 * 
 * @PostMapping(path = "/usersave1") public ResponseEntity<User>
 * saveUserResponseBody(@Valid @RequestBody User user) { User saveUser =
 * userDaoService.saveUser(user); URI location =
 * ServletUriComponentsBuilder.fromCurrentRequest().path("/" + "{id}")
 * .buildAndExpand(saveUser.getId()).toUri(); return
 * ResponseEntity.created(location).build(); } }
 */