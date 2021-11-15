package pe.edu.uandina.demoSpring.vista;

import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.uandina.demoSpring.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioVista {
    @GetMapping("/Usuario")
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        Usuario u01 = new Usuario();
        u01.setId(1);
        u01.setLogin("agallardo");
        u01.setContrasena("123456");
        Usuario u02 = new Usuario();
        u02.setId(2);
        u02.setLogin("agallardo");
        u02.setContrasena("123456");
        lista.add(u01);
        lista.add(u02);
        return lista;
    }
}
