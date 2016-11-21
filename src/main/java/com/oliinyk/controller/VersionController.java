package com.oliinyk.controller;

import com.oliinyk.entity.Version;
import com.oliinyk.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VersionController {

    @Autowired
    VersionService service;

    @RequestMapping(value = "/getVersion", method = RequestMethod.GET)
    public Version trianglee1() {

        return service.getVersion();

    }


}
