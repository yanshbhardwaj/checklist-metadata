package com.iedaas.checklistmetadata.category.services;

import com.iedaas.checklistmetadata.category.dao.CategoryRepository;
import com.iedaas.checklistmetadata.category.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServices {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category){
        return categoryRepository.save(category);
    }
}
