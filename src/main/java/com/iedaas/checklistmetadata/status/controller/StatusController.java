package com.iedaas.checklistmetadata.status.controller;

import com.iedaas.checklistmetadata.status.entity.Status;
import com.iedaas.checklistmetadata.status.services.StatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StatusController {

    @Autowired
    StatusServices statusServices;

    @GetMapping("/status")
    public List<Status> getStatuses(){
        return statusServices.getStatuses();
    }

    @PostMapping("/status")
    public Status addStatus(@RequestBody Status status){
        return statusServices.addStatus(status);
    }
}
