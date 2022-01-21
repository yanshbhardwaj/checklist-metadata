package com.iedaas.checklistmetadata.tags.controller;

import com.iedaas.checklistmetadata.tags.entity.Tag;
import com.iedaas.checklistmetadata.tags.services.TagServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {

    @Autowired
    TagServices tagServices;

    @GetMapping("/tag")
    public List<Tag> getTags(){
        return tagServices.getTags();
    }

    @PostMapping("/tag")
    public Tag addTag(@RequestBody Tag tag){
        return tagServices.addTags(tag);
    }
}
