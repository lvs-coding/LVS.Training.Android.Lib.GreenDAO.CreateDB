package com.example.greendaocomplex.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "flag")
public class Flag {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "flag_id")
    private Long flagId;

    @Property(nameInDb = "flag_definition_id")
    private Long flagDefinitionId;

    @Generated(hash = 1995933213)
    public Flag(Long id, Long flagId, Long flagDefinitionId) {
        this.id = id;
        this.flagId = flagId;
        this.flagDefinitionId = flagDefinitionId;
    }

    @Generated(hash = 325057191)
    public Flag() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getFlagDefinitionId() {
        return this.flagDefinitionId;
    }

    public void setFlagDefinitionId(long flagDefinitionId) {
        this.flagDefinitionId = flagDefinitionId;
    }

    public Long getFlagId() {
        return this.flagId;
    }

    public void setFlagId(long flagId) {
        this.flagId = flagId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }

    public void setFlagDefinitionId(Long flagDefinitionId) {
        this.flagDefinitionId = flagDefinitionId;
    }
}
