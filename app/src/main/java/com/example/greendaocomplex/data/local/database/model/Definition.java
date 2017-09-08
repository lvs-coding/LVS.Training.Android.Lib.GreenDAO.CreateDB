package com.example.greendaocomplex.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "definition")
public class Definition {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "definition_id")
    private Long definitionId;
    
    @Property(nameInDb = "definition")
    private String definition;

    @Generated(hash = 1190365283)
    public Definition(Long id, Long definitionId, String definition) {
        this.id = id;
        this.definitionId = definitionId;
        this.definition = definition;
    }

    @Generated(hash = 76402987)
    public Definition() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public long getDefinitionId() {
        return this.definitionId;
    }

    public void setDefinitionId(long definitionId) {
        this.definitionId = definitionId;
    }

    public void setDefinitionId(Long definitionId) {
        this.definitionId = definitionId;
    }
}
