package com.example.greendaocomplex.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "space_association")
public class SpaceAssociation {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "space_association_id")
    private Long spaceAssociationId;

    @Property(nameInDb = "plant_id_1")
    private Long plantId1;

    @Property(nameInDb = "plant_id_2")
    private Long plantId2;

    @Property(nameInDb = "flag_id")
    private Long flagId;

    @Generated(hash = 1343811263)
    public SpaceAssociation(Long id, Long spaceAssociationId, Long plantId1,
            Long plantId2, Long flagId) {
        this.id = id;
        this.spaceAssociationId = spaceAssociationId;
        this.plantId1 = plantId1;
        this.plantId2 = plantId2;
        this.flagId = flagId;
    }

    @Generated(hash = 2042184735)
    public SpaceAssociation() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpaceAssociationId() {
        return this.spaceAssociationId;
    }

    public void setSpaceAssociationId(Long spaceAssociationId) {
        this.spaceAssociationId = spaceAssociationId;
    }

    public Long getPlantId1() {
        return this.plantId1;
    }

    public void setPlantId1(Long plantId1) {
        this.plantId1 = plantId1;
    }

    public Long getPlantId2() {
        return this.plantId2;
    }

    public void setPlantId2(Long plantId2) {
        this.plantId2 = plantId2;
    }

    public Long getFlagId() {
        return this.flagId;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }
}
