package com.iedaas.checklistmetadata.category.controller;

import com.iedaas.checklistmetadata.category.entity.Category;
import com.iedaas.checklistmetadata.category.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryServices categoryServices;

    @GetMapping("/category")
    public List<Category> getCategories(){
        return categoryServices.getCategories();
    }

    @PostMapping("/category")
    public Category addCategory(@RequestBody Category category){
        return categoryServices.addCategory(category);
    }
}
