/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.*;
import AccesoDatos.*;

/**
 * @author Emilio
 */
public class PersonaBL {
    private PersonaDA accesoDatosPersona;

        public PersonaBL()
        {
            accesoDatosPersona = new PersonaDA();
        }

        public boolean agregarPersona(Persona p)
        {
            return accesoDatosPersona.agregarPersona(p);
        }
}
