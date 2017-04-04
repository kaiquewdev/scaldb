import Dependencies._


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "br.com.kaiquesilva",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Scal DB",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "io.reactivex" %% "rxscala" % "0.26.5"
  )
