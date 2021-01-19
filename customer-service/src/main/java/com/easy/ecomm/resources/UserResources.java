package com.easy.ecomm.resources;

import com.easy.ecomm.model.User;
import com.easy.ecomm.model.UserRegisterRequest;
import com.easy.ecomm.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResources {

    @Inject
    UserService userService;

    @POST
    public Response saveUser(UserRegisterRequest user){
        return Response.status(Response.Status.CREATED)
                .entity(userService.saveUser(user)).build();
    }

    @GET
    public Iterable<User> findAll(){
        return userService.findAll();
    }
    @GET
    @Path("{id}")
    public User findByUserById(@PathParam("id") int id){
        return userService.findUserById(id);
    }

    @GET
    @Path("email/{email}")
    public User findUserByEmail(@PathParam("email") String email){
        return userService.finderByEmail(email);
    }

}
