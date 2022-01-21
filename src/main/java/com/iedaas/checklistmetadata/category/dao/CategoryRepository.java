package com.iedaas.checklistmetadata.category.dao;

import com.iedaas.checklistmetadata.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
