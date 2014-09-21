package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
  	val config = com.typesafe.config.ConfigFactory.load()
    println("home", config.getString("my"), config.getString("application.secret"), config.getString("logger.application"))
    Ok(views.html.aa())
  }

}