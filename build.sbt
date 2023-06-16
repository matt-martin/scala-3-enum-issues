val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala_3_enum_issue",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version
  )
