package com.example.greendaocomplex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.greendaocomplex.data.local.database.model.DaoSession;
import com.example.greendaocomplex.data.local.database.model.Definition;
import com.example.greendaocomplex.data.local.database.model.Flag;
import com.example.greendaocomplex.data.local.database.model.FlagDefinition;
import com.example.greendaocomplex.data.local.database.model.Picture;
import com.example.greendaocomplex.data.local.database.model.Plant;
import com.example.greendaocomplex.data.local.database.model.SpaceAssociation;

public class MainActivity extends AppCompatActivity {
    DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daoSession = ((App)getApplication()).getDaoSession();

        insertData();


    }

    private void insertData() {
        insertDefinitions();
        insertFlags();
        insertFlagDefinitions();
        insertPictures();
        insertPlants();
        insertSpaceAssociations();
    }

    private void insertSpaceAssociations() {
        daoSession.getSpaceAssociationDao().deleteAll();

        daoSession.getSpaceAssociationDao().insert(new SpaceAssociation(null, 1L,1L,1L,1L));
    }

    private void insertPlants() {
        daoSession.getPlantDao().deleteAll();

        daoSession.getPlantDao().insert(new Plant(null,1L,4L,1L));
        daoSession.getPlantDao().insert(new Plant(null,2L,5L,2L));
        daoSession.getPlantDao().insert(new Plant(null,3L,6L,3L));
        daoSession.getPlantDao().insert(new Plant(null,4L,7L,4L));
        daoSession.getPlantDao().insert(new Plant(null,5L,8L,5L));
        daoSession.getPlantDao().insert(new Plant(null,6L,9L,6L));
        daoSession.getPlantDao().insert(new Plant(null,7L,10L,7L));
        daoSession.getPlantDao().insert(new Plant(null,8L,11L,8L));
        daoSession.getPlantDao().insert(new Plant(null,9L,12L,9L));
        daoSession.getPlantDao().insert(new Plant(null,10L,13L,10L));
        daoSession.getPlantDao().insert(new Plant(null,11L,14L,11L));
        daoSession.getPlantDao().insert(new Plant(null,12L,15L,12L));
        daoSession.getPlantDao().insert(new Plant(null,13L,16L,13L));
        daoSession.getPlantDao().insert(new Plant(null,14L,17L,14L));
        daoSession.getPlantDao().insert(new Plant(null,15L,18L,15L));
        daoSession.getPlantDao().insert(new Plant(null,16L,19L,16L));
        daoSession.getPlantDao().insert(new Plant(null,17L,20L,17L));
        daoSession.getPlantDao().insert(new Plant(null,18L,21L,18L));
        daoSession.getPlantDao().insert(new Plant(null,19L,22L,19L));
        daoSession.getPlantDao().insert(new Plant(null,20L,23L,20L));
        daoSession.getPlantDao().insert(new Plant(null,21L,24L,21L));
        daoSession.getPlantDao().insert(new Plant(null,22L,25L,22L));
        daoSession.getPlantDao().insert(new Plant(null,23L,26L,23L));
        daoSession.getPlantDao().insert(new Plant(null,24L,27L,24L));
        daoSession.getPlantDao().insert(new Plant(null,25L,28L,25L));
        daoSession.getPlantDao().insert(new Plant(null,26L,29L,26L));
        daoSession.getPlantDao().insert(new Plant(null,27L,30L,27L));
        daoSession.getPlantDao().insert(new Plant(null,28L,31L,28L));
        daoSession.getPlantDao().insert(new Plant(null,29L,32L,29L));
        daoSession.getPlantDao().insert(new Plant(null,30L,33L,30L));
        daoSession.getPlantDao().insert(new Plant(null,31L,34L,31L));
        daoSession.getPlantDao().insert(new Plant(null,32L,35L,32L));
        daoSession.getPlantDao().insert(new Plant(null,33L,36L,33L));
        daoSession.getPlantDao().insert(new Plant(null,34L,37L,34L));
        daoSession.getPlantDao().insert(new Plant(null,35L,38L,35L));
        daoSession.getPlantDao().insert(new Plant(null,36L,39L,36L));
        daoSession.getPlantDao().insert(new Plant(null,37L,40L,37L));
        daoSession.getPlantDao().insert(new Plant(null,38L,41L,38L));
        daoSession.getPlantDao().insert(new Plant(null,39L,42L,39L));
        daoSession.getPlantDao().insert(new Plant(null,40L,43L,40L));
        daoSession.getPlantDao().insert(new Plant(null,41L,44L,41L));
        daoSession.getPlantDao().insert(new Plant(null,42L,45L,42L));
        daoSession.getPlantDao().insert(new Plant(null,43L,46L,43L));
        daoSession.getPlantDao().insert(new Plant(null,44L,47L,44L));
        daoSession.getPlantDao().insert(new Plant(null,45L,48L,45L));
        daoSession.getPlantDao().insert(new Plant(null,46L,49L,46L));
        daoSession.getPlantDao().insert(new Plant(null,47L,50L,47L));
        daoSession.getPlantDao().insert(new Plant(null,48L,51L,48L));
        daoSession.getPlantDao().insert(new Plant(null,49L,52L,49L));
        daoSession.getPlantDao().insert(new Plant(null,50L,53L,50L));
        daoSession.getPlantDao().insert(new Plant(null,51L,54L,51L));
        daoSession.getPlantDao().insert(new Plant(null,52L,55L,52L));
        daoSession.getPlantDao().insert(new Plant(null,53L,56L,53L));
        daoSession.getPlantDao().insert(new Plant(null,54L,57L,54L));
        daoSession.getPlantDao().insert(new Plant(null,55L,58L,55L));
        daoSession.getPlantDao().insert(new Plant(null,56L,59L,56L));
        daoSession.getPlantDao().insert(new Plant(null,57L,60L,57L));
        daoSession.getPlantDao().insert(new Plant(null,58L,61L,58L));
        daoSession.getPlantDao().insert(new Plant(null,59L,62L,59L));
        daoSession.getPlantDao().insert(new Plant(null,60L,63L,60L));
        daoSession.getPlantDao().insert(new Plant(null,61L,64L,61L));
        daoSession.getPlantDao().insert(new Plant(null,62L,65L,62L));
        daoSession.getPlantDao().insert(new Plant(null,63L,66L,63L));
        daoSession.getPlantDao().insert(new Plant(null,64L,67L,64L));
        daoSession.getPlantDao().insert(new Plant(null,65L,68L,65L));
        daoSession.getPlantDao().insert(new Plant(null,66L,69L,66L));
        daoSession.getPlantDao().insert(new Plant(null,67L,70L,67L));
        daoSession.getPlantDao().insert(new Plant(null,68L,71L,68L));
    }

    private void insertPictures() {
        daoSession.getPictureDao().deleteAll();

        daoSession.getPictureDao().insert(new Picture(null,1L,1L,"ail"));
        daoSession.getPictureDao().insert(new Picture(null,2L,2L,"artichaud"));
        daoSession.getPictureDao().insert(new Picture(null,3L,3L,"asperge"));
        daoSession.getPictureDao().insert(new Picture(null,4L,4L,"aubergine"));
        daoSession.getPictureDao().insert(new Picture(null,5L,5L,"basilic"));
        daoSession.getPictureDao().insert(new Picture(null,6L,6L,"betterave"));
        daoSession.getPictureDao().insert(new Picture(null,7L,7L,"blette"));
        daoSession.getPictureDao().insert(new Picture(null,8L,8L,"bourrache"));
        daoSession.getPictureDao().insert(new Picture(null,9L,9L,"brocoli"));
        daoSession.getPictureDao().insert(new Picture(null,10L,10L,"camomille"));
        daoSession.getPictureDao().insert(new Picture(null,11L,11L,"carotte"));
        daoSession.getPictureDao().insert(new Picture(null,12L,12L,"celeri_branches"));
        daoSession.getPictureDao().insert(new Picture(null,13L,13L,"celeri_rave"));
        daoSession.getPictureDao().insert(new Picture(null,14L,14L,"chou_chinois"));
        daoSession.getPictureDao().insert(new Picture(null,15L,15L,"chou_de_bruxelles"));
        daoSession.getPictureDao().insert(new Picture(null,16L,16L,"chou_fleut"));
        daoSession.getPictureDao().insert(new Picture(null,17L,17L,"chou_frise"));
        daoSession.getPictureDao().insert(new Picture(null,18L,18L,"chou_pomme"));
        daoSession.getPictureDao().insert(new Picture(null,19L,19L,"chou_rave"));
        daoSession.getPictureDao().insert(new Picture(null,20L,20L,"ciboulette"));
        daoSession.getPictureDao().insert(new Picture(null,21L,21L,"concombre"));
        daoSession.getPictureDao().insert(new Picture(null,22L,22L,"consoude"));
        daoSession.getPictureDao().insert(new Picture(null,23L,23L,"coriandre"));
        daoSession.getPictureDao().insert(new Picture(null,24L,24L,"cornichon"));
        daoSession.getPictureDao().insert(new Picture(null,25L,25L,"cosmos"));
        daoSession.getPictureDao().insert(new Picture(null,26L,26L,"courgette"));
        daoSession.getPictureDao().insert(new Picture(null,27L,27L,"echalote"));
        daoSession.getPictureDao().insert(new Picture(null,28L,28L,"endive"));
        daoSession.getPictureDao().insert(new Picture(null,29L,29L,"epinard"));
        daoSession.getPictureDao().insert(new Picture(null,30L,30L,"estragon"));
        daoSession.getPictureDao().insert(new Picture(null,31L,31L,"fenouil"));
        daoSession.getPictureDao().insert(new Picture(null,32L,32L,"feve"));
        daoSession.getPictureDao().insert(new Picture(null,33L,33L,"fraise"));
        daoSession.getPictureDao().insert(new Picture(null,34L,34L,"framboise"));
        daoSession.getPictureDao().insert(new Picture(null,35L,35L,"groseille"));
        daoSession.getPictureDao().insert(new Picture(null,36L,36L,"haricot_grain"));
        daoSession.getPictureDao().insert(new Picture(null,37L,37L,"haricot_vert"));
        daoSession.getPictureDao().insert(new Picture(null,38L,38L,"hysope"));
        daoSession.getPictureDao().insert(new Picture(null,39L,39L,"laitue"));
        daoSession.getPictureDao().insert(new Picture(null,40L,40L,"lavande"));
        daoSession.getPictureDao().insert(new Picture(null,41L,41L,"luzerne"));
        daoSession.getPictureDao().insert(new Picture(null,42L,42L,"mache"));
        daoSession.getPictureDao().insert(new Picture(null,43L,43L,"melon"));
        daoSession.getPictureDao().insert(new Picture(null,44L,44L,"menthe"));
        daoSession.getPictureDao().insert(new Picture(null,45L,45L,"moutarde"));
        daoSession.getPictureDao().insert(new Picture(null,46L,46L,"myrtille"));
        daoSession.getPictureDao().insert(new Picture(null,47L,47L,"navet"));
        daoSession.getPictureDao().insert(new Picture(null,48L,48L,"œillet"));
        daoSession.getPictureDao().insert(new Picture(null,49L,49L,"oignon"));
        daoSession.getPictureDao().insert(new Picture(null,50L,50L,"origan"));
        daoSession.getPictureDao().insert(new Picture(null,51L,51L,"panais"));
        daoSession.getPictureDao().insert(new Picture(null,52L,52L,"pomme_de_terre"));
        daoSession.getPictureDao().insert(new Picture(null,53L,53L,"patate_douce"));
        daoSession.getPictureDao().insert(new Picture(null,54L,54L,"pavot"));
        daoSession.getPictureDao().insert(new Picture(null,55L,55L,"persil"));
        daoSession.getPictureDao().insert(new Picture(null,56L,56L,"pois"));
        daoSession.getPictureDao().insert(new Picture(null,57L,57L,"piment"));
        daoSession.getPictureDao().insert(new Picture(null,58L,58L,"poireau"));
        daoSession.getPictureDao().insert(new Picture(null,59L,59L,"poivron"));
        daoSession.getPictureDao().insert(new Picture(null,60L,60L,"potiron"));
        daoSession.getPictureDao().insert(new Picture(null,61L,61L,"radis"));
        daoSession.getPictureDao().insert(new Picture(null,62L,62L,"rhubarbe"));
        daoSession.getPictureDao().insert(new Picture(null,63L,63L,"roquette"));
        daoSession.getPictureDao().insert(new Picture(null,64L,64L,"salsifis"));
        daoSession.getPictureDao().insert(new Picture(null,65L,65L,"thym"));
        daoSession.getPictureDao().insert(new Picture(null,66L,66L,"tomate"));
        daoSession.getPictureDao().insert(new Picture(null,67L,67L,"topinambour"));
        daoSession.getPictureDao().insert(new Picture(null,68L,68L,"vigne"));
    }

    private void insertFlagDefinitions() {
        daoSession.getFlagDefinitionDao().deleteAll();

        daoSession.getFlagDefinitionDao().insert(new FlagDefinition(null,1L,"favorable"));
        daoSession.getFlagDefinitionDao().insert(new FlagDefinition(null,2L,"neutre"));
        daoSession.getFlagDefinitionDao().insert(new FlagDefinition(null,3L,"défavorable"));
        daoSession.getFlagDefinitionDao().insert(new FlagDefinition(null,4L,"débat"));
        daoSession.getFlagDefinitionDao().insert(new FlagDefinition(null,5L,"na"));
    }

    private void insertFlags() {
        daoSession.getFlagDao().deleteAll();

        daoSession.getFlagDao().insert(new Flag(null, 1L, 1L));
        daoSession.getFlagDao().insert(new Flag(null, 2L, 2L));
        daoSession.getFlagDao().insert(new Flag(null, 3L, 4L));
        daoSession.getFlagDao().insert(new Flag(null, 4L, 3L));
        daoSession.getFlagDao().insert(new Flag(null, 5L, 5L));
    }

    private void insertDefinitions() {
        daoSession.getDefinitionDao().deleteAll();

        daoSession.getDefinitionDao().insert(new Definition(null,4L,"ail"));
        daoSession.getDefinitionDao().insert(new Definition(null,5L,"artichaut"));
        daoSession.getDefinitionDao().insert(new Definition(null,6L,"asperges"));
        daoSession.getDefinitionDao().insert(new Definition(null,7L,"aubergine"));
        daoSession.getDefinitionDao().insert(new Definition(null,8L,"basilic"));
        daoSession.getDefinitionDao().insert(new Definition(null,9L,"betterave"));
        daoSession.getDefinitionDao().insert(new Definition(null,10L,"blette"));
        daoSession.getDefinitionDao().insert(new Definition(null,11L,"bourrache"));
        daoSession.getDefinitionDao().insert(new Definition(null,12L,"brocoli"));
        daoSession.getDefinitionDao().insert(new Definition(null,13L,"camomille"));
        daoSession.getDefinitionDao().insert(new Definition(null,14L,"carotte"));
        daoSession.getDefinitionDao().insert(new Definition(null,15L,"celeri branches"));
        daoSession.getDefinitionDao().insert(new Definition(null,16L,"celeri rave"));
        daoSession.getDefinitionDao().insert(new Definition(null,17L,"chou chinois"));
        daoSession.getDefinitionDao().insert(new Definition(null,18L,"chou de bruxelles"));
        daoSession.getDefinitionDao().insert(new Definition(null,19L,"chou fleur"));
        daoSession.getDefinitionDao().insert(new Definition(null,20L,"chou frise"));
        daoSession.getDefinitionDao().insert(new Definition(null,21L,"chou pomme"));
        daoSession.getDefinitionDao().insert(new Definition(null,22L,"chou rave"));
        daoSession.getDefinitionDao().insert(new Definition(null,23L,"ciboulette"));
        daoSession.getDefinitionDao().insert(new Definition(null,24L,"concombre"));
        daoSession.getDefinitionDao().insert(new Definition(null,25L,"consoude"));
        daoSession.getDefinitionDao().insert(new Definition(null,26L,"coriandre"));
        daoSession.getDefinitionDao().insert(new Definition(null,27L,"cornichon"));
        daoSession.getDefinitionDao().insert(new Definition(null,28L,"cosmos"));
        daoSession.getDefinitionDao().insert(new Definition(null,29L,"courgette"));
        daoSession.getDefinitionDao().insert(new Definition(null,30L,"echalote"));
        daoSession.getDefinitionDao().insert(new Definition(null,31L,"endive"));
        daoSession.getDefinitionDao().insert(new Definition(null,32L,"epinard"));
        daoSession.getDefinitionDao().insert(new Definition(null,33L,"estragon"));
        daoSession.getDefinitionDao().insert(new Definition(null,34L,"fenouil"));
        daoSession.getDefinitionDao().insert(new Definition(null,35L,"feve"));
        daoSession.getDefinitionDao().insert(new Definition(null,36L,"fraise"));
        daoSession.getDefinitionDao().insert(new Definition(null,37L,"framboise"));
        daoSession.getDefinitionDao().insert(new Definition(null,38L,"groseille"));
        daoSession.getDefinitionDao().insert(new Definition(null,39L,"haricot grain"));
        daoSession.getDefinitionDao().insert(new Definition(null,40L,"haricot vert"));
        daoSession.getDefinitionDao().insert(new Definition(null,41L,"hysope"));
        daoSession.getDefinitionDao().insert(new Definition(null,42L,"laitue"));
        daoSession.getDefinitionDao().insert(new Definition(null,43L,"lavande"));
        daoSession.getDefinitionDao().insert(new Definition(null,44L,"luzerne"));
        daoSession.getDefinitionDao().insert(new Definition(null,45L,"mache"));
        daoSession.getDefinitionDao().insert(new Definition(null,46L,"melon"));
        daoSession.getDefinitionDao().insert(new Definition(null,47L,"menthe"));
        daoSession.getDefinitionDao().insert(new Definition(null,48L,"moutarde"));
        daoSession.getDefinitionDao().insert(new Definition(null,49L,"myrtille"));
        daoSession.getDefinitionDao().insert(new Definition(null,50L,"navet"));
        daoSession.getDefinitionDao().insert(new Definition(null,51L,"œillet"));
        daoSession.getDefinitionDao().insert(new Definition(null,52L,"oignon"));
        daoSession.getDefinitionDao().insert(new Definition(null,53L,"origan"));
        daoSession.getDefinitionDao().insert(new Definition(null,54L,"panais"));
        daoSession.getDefinitionDao().insert(new Definition(null,55L,"pomme de terre"));
        daoSession.getDefinitionDao().insert(new Definition(null,56L,"patate douce"));
        daoSession.getDefinitionDao().insert(new Definition(null,57L,"pavot"));
        daoSession.getDefinitionDao().insert(new Definition(null,58L,"persil"));
        daoSession.getDefinitionDao().insert(new Definition(null,59L,"pois"));
        daoSession.getDefinitionDao().insert(new Definition(null,60L,"piment"));
        daoSession.getDefinitionDao().insert(new Definition(null,61L,"poireau"));
        daoSession.getDefinitionDao().insert(new Definition(null,62L,"poivron"));
        daoSession.getDefinitionDao().insert(new Definition(null,63L,"potiron"));
        daoSession.getDefinitionDao().insert(new Definition(null,64L,"radis"));
        daoSession.getDefinitionDao().insert(new Definition(null,65L,"rhubarbe"));
        daoSession.getDefinitionDao().insert(new Definition(null,66L,"roquette"));
        daoSession.getDefinitionDao().insert(new Definition(null,67L,"salsifis"));
        daoSession.getDefinitionDao().insert(new Definition(null,68L,"thym"));
        daoSession.getDefinitionDao().insert(new Definition(null,69L,"tomate"));
        daoSession.getDefinitionDao().insert(new Definition(null,70L,"topinambour"));
        daoSession.getDefinitionDao().insert(new Definition(null,71L,"vigne"));
    }
}
