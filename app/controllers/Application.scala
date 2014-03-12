package controllers

import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import models.Task

class Application extends Controller {

  def about = Action {
    Ok(views.html.about())
  }

  def gettingStarted = Action {
    Ok(views.html.getting_started())
  }

  def index = Action {
    Ok(views.html.index())
  }

}