package pe.edu.idat.demo_feign_client.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@FeignClient(name = "userClient", url = "https://rickandmortyapi.com/api")
public interface UserClient {

    @GetMapping("/character")
    Map<String, Object> obtenerUsuariosRaw();

    @GetMapping("/character/{id}")
    User obtenerUsuarioXid(@PathVariable("id") Long id);

    default List<User> obtenerUsuarios() {
        Map<String, Object> response = obtenerUsuariosRaw();
        return (List<User>) response.get("results");
    }
}
