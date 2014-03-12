import play.Project._

name := "delorean"

version := "1.0"

playScalaSettings

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  "com.softwaremill.macwire" %% "macros" % "0.5"
)