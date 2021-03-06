name := """multi-play"""

version := "1.0-SNAPSHOT"

EclipseKeys.skipParents in ThisBuild := false

lazy val core = project in file("core")

lazy val admin= (project in file("modules/admin")).enablePlugins(PlayScala).dependsOn(core)

lazy val root = (project in file(".")).enablePlugins(PlayScala).dependsOn(core, admin).aggregate(core, admin)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
