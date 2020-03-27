package rest;

import java.util.HashMap;
import java.util.Map;

public class Database {
      private static Map<String, Model> models = new HashMap();

      public static Map<String, Model> getModels() {
            return models;
      }
}
