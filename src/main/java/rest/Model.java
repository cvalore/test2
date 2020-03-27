package rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Model {
      private String uuid;
      private String name;

      public Model() {
      }

      public Model(String name) {
            this.name = name;
      }

      public String getUuid() {
            return uuid;
      }

      public void setUuid(String uuid) {
            this.uuid = uuid;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }
}
