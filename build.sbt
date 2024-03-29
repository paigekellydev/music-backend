name := """music-backend"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

val main = sbt.Project(id = appName, base = file("."))
  .settings(
    version := appVersion,
    libraryDependencies ++= appDependencies
  )

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"

enablePlugins(GitVersioning)

version := "1.0-" + git.gitCurrentBranch.value