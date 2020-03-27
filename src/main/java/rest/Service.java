package rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Service {

      private Map<String, Model> dbModels = Database.getModels();

      public List<Model> getModels() {
            return new ArrayList<>(dbModels.values());
      }

      public Model getModel(String uuid) {
            return dbModels.get(uuid);
      }

      public Model addModel(Model model) {
            String uuid = UUID.randomUUID().toString().split("-")[0];
            model.setUuid(uuid);
            dbModels.put(uuid, model);
            return model;
      }
}
