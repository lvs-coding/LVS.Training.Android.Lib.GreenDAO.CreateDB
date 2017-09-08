package com.example.greendaocomplex.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "plant")
public class Plant {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "plant_id")
    private Long plantId;

    @Property(nameInDb = "definition_id")
    private Long definitionId;

    @Property(nameInDb = "picture_id")
    private Long pictureId;

    @Generated(hash = 1688321470)
    public Plant(Long id, Long plantId, Long definitionId, Long pictureId) {
        this.id = id;
        this.plantId = plantId;
        this.definitionId = definitionId;
        this.pictureId = pictureId;
    }

    @Generated(hash = 878011190)
    public Plant() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlantId() {
        return this.plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public Long getDefinitionId() {
        return this.definitionId;
    }

    public void setDefinitionId(Long definitionId) {
        this.definitionId = definitionId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }
}
