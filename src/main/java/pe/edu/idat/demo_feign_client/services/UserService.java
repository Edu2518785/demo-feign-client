package pe.edu.idat.demo_feign_client.services;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.User;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.UserClient;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    @Override
    public List<User> obtenerUserClient() {
        return userClient.obtenerUsuarios();
    }

    @Override
    public User obtenerUserClientXid(Long id) {
        return userClient.obtenerUsuarioXid(id);
    }
}