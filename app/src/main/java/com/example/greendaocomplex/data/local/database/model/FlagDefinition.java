package com.example.greendaocomplex.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "flag_definition")
public class FlagDefinition {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "flag_definition_id")
    private Long flagDefinitionId;

    @Property(nameInDb = "definition")
    private String definition;

    @Generated(hash = 1691322646)
    public FlagDefinition(Long id, Long flagDefinitionId, String definition) {
        this.id = id;
        this.flagDefinitionId = flagDefinitionId;
        this.definition = definition;
    }

    @Generated(hash = 1409436902)
    public FlagDefinition() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlagDefinitionId() {
        return this.flagDefinitionId;
    }

    public void setFlagDefinitionId(Long flagDefinitionId) {
        this.flagDefinitionId = flagDefinitionId;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
