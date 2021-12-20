package com.api.apirest.controllers;

import com.api.apirest.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserControllers {

    //Trae todos los usuarios
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setNombre("icaro");
        user.setApellido("De Creta");
        list.add(user);
        return list;
    }

    //Trae usuario por id que es lo que recibe
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id){
        User user = new User();
        user.setNombre("icaro");
        user.setApellido("De Creta");
        return user;
    }

    //@RequestBody recibe el cuerpo del objeto declarado dentro de los ()
    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user){
        //Todo registrado en la base de datos
        return user;
    }

    //Put para actualizar y recibe el valor id
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user){
        //Todo lo actualiza en la base de datos
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
       //No devuelve nada solo borra el usuario por "id"
    }



}
