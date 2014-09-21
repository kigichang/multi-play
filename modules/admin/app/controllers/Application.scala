package controllers.admin

import play.api._
import play.api.mvc._
import views.html._

object Application extends Controller {

  def index = Action { implicit request =>
    val config = com.typesafe.config.ConfigFactory.load()
    //Ok("admin - " + config.getString("my") + " : " + config.getString("application.secret"))
    println("admin", config.getString("my"), config.getString("application.secret"))
    Ok(views.html.admin.aa())
  }
}
