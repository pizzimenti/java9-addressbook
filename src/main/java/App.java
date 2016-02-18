import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String newFirstName = request.queryParams("firstName");
      String newLastName = request.queryParams("lastName");
      Contact newContact = new Contact(newFirstName, newLastName);

      model.put("allContacts", Contact.all());
      model.put("template", "/templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/displayContact", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();


      model.put("template", "/templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
} //end of App
