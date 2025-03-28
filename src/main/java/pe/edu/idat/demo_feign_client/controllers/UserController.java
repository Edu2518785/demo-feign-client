package pe.edu.idat.demo_feign_client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.User;
import pe.edu.idat.demo_feign_client.services.IUserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/character")
public class UserController {
    private  final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }
    @GetMapping
    public List<User> getUser(){
        return  iUserService.obtenerUserClient();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return  iUserService.obtenerUserClientXid(id);
    }
}
