package com.example.greendaocomplex.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "picture")
public class Picture {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "picture_id")
    private Long pictureId;

    @Property(nameInDb = "plant_id")
    private Long plantId;

    @Property(nameInDb = "picture_file")
    private String pictureFile;

    @Generated(hash = 120230320)
    public Picture(Long id, Long pictureId, Long plantId, String pictureFile) {
        this.id = id;
        this.pictureId = pictureId;
        this.plantId = plantId;
        this.pictureFile = pictureFile;
    }

    @Generated(hash = 1602548376)
    public Picture() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPlantId() {
        return this.plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public String getPictureFile() {
        return this.pictureFile;
    }

    public void setPictureFile(String pictureFile) {
        this.pictureFile = pictureFile;
    }
}
