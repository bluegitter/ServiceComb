package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-05-06T06:56:25.185Z")

@RestSchema(schemaId = "servicestaged5hdv3")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Servicestaged5hdv3Impl {

    @Autowired
    private Servicestaged5hdv3Delegate userServicestaged5hdv3Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServicestaged5hdv3Delegate.helloworld(name);
    }

}
