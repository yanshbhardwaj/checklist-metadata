package com.iedaas.checklistmetadata.tags.dao;

import com.iedaas.checklistmetadata.tags.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {
}
