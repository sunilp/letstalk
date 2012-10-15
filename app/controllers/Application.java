package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Hello Sunil"));
  }
  

  public static Result talkabout() {
  	System.out.println("reached about  .");
    return ok(about.render("me"));
  }

}