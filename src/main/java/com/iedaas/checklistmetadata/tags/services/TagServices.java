package com.iedaas.checklistmetadata.tags.services;

import com.iedaas.checklistmetadata.tags.dao.TagRepository;
import com.iedaas.checklistmetadata.tags.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TagServices {

    @Autowired
    TagRepository tagRepository;

    public List<Tag> getTags(){
        return tagRepository.findAll();
    }

    public Tag addTags(Tag tag){
        return tagRepository.save(tag);
    }
}
