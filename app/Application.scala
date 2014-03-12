import com.softwaremill.macwire.MacwireMacros._
import controllers.Application

object Application {
  val application = wire[Application]
}
