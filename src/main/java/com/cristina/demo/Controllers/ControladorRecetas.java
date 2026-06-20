package com.cristina.demo.Controllers;


import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControladorRecetas {

    private static String[] listaRecetas = {
            "Pizza",
            "Espagueti",
            "Lasaña"
    };

    private static HashMap<String, String[]> recetasConIngredientes =
            new HashMap<String, String[]>();

    public ControladorRecetas() {

        String[] pizza = {
                "Pan",
                "Salsa de tomate",
                "Queso",
                "Pepperoni"
        };
        recetasConIngredientes.put("Pizza", pizza);

        String[] espagueti = {
                "Pasta",
                "Salsa de tomate",
                "Carne molida",
                "Queso parmesano"
        };
        recetasConIngredientes.put("Espagueti", espagueti);

        String[] lasaña = {
                "Pasta",
                "Salsa de tomate",
                "Queso",
                "Albahaca",
                "Espinaca",
                "Champiñones"
        };
        recetasConIngredientes.put("Lasaña", lasaña);
    
    }
    
    @RequestMapping ("/recetas")
    public String obtenerTodasLasRecetas(Model model) {
    	model.addAttribute("listaRecetas", listaRecetas); 
    	
    	return "recetas.jsp";
    	
    	//"listaRecetas"  (String) que será el nombre del atributo que llegará al JSP.
        //listaRecetas es la variable declarada en  controlador
    }
    
    
    @RequestMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable ("nombre") String nombre, Model model) {
    	
    	 if (recetasConIngredientes.containsKey(nombre)) {

             model.addAttribute("nombreReceta", nombre);
             model.addAttribute(
                     "ingredientes",
                     recetasConIngredientes.get(nombre)
             );

         } else {

             model.addAttribute(
                     "mensaje",
                     "La receta no se encuentra en nuestra lista.");
             
}
    	 
    	 return "detalleReceta.jsp";

    }
    
}


	        
	        