package com.iedaas.checklistmetadata.status.dao;

import com.iedaas.checklistmetadata.status.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
