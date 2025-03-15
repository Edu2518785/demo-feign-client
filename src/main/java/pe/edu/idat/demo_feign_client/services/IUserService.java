package pe.edu.idat.demo_feign_client.services;

import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.User;
import java.util.List;

public interface IUserService {

    List<User> obtenerUserClient();

    User obtenerUserClientXid(Long id);

}