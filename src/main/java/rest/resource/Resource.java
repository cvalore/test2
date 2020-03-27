package rest.resource;

import rest.Model;
import rest.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/resources")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
      private Service service = new Service();

      @GET
      public List<Model> getModels() {
            return service.getModels();
      }

      @GET
      @Path("/{uuid}")
      public Model getModel(@PathParam("uuid") String uuid) {
            return service.getModel(uuid);
      }

      @POST
      public Model addModel(Model model) {
            return service.addModel(model);
      }
}
