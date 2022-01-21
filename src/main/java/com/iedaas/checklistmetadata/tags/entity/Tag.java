package com.iedaas.checklistmetadata.tags.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "tag_uid")
    @Type(type= "uuid-char")
    private UUID tagUid;

    @Column(name = "tag_description")
    private String description;

    @Column(name = "tag_status")
    private int statusTag=1;

    @Column(name = "created_date")
    private Timestamp createdDate=Timestamp.valueOf(LocalDateTime.now());

    @Column(name = "updated_date")
    private Timestamp updatedDate=Timestamp.valueOf(LocalDateTime.now());

    public Tag() {
    }

    public Tag(UUID tagId, String description, int statusTag, Timestamp createdDate, Timestamp updatedDate) {
        this.tagUid = tagId;
        this.description = description;
        this.statusTag = statusTag;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public UUID getTagUid() {
        return tagUid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatusTag() {
        return statusTag;
    }

    public void setStatusTag(int statusTag) {
        this.statusTag = statusTag;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }
}
