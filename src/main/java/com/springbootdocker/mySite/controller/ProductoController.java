package com.springbootdocker.mySite.controller;

import com.springbootdocker.mySite.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductoController {
    @GetMapping("/")
    public String mostrarProductos(Model model) {
        List<Producto> lista = Arrays.asList(
                new Producto("Camisa", 25.99),
                new Producto("Pantalón", 49.50),
                new Producto("Zapatos", 89.00)
        );
        model.addAttribute("productos", lista);
        return "index"; 
    }
}
