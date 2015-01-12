import spray.revolver.RevolverPlugin._

name := "MyHyperQuote"

organization := "com.quotes"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"

seq(Revolver.settings: _*)

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.9.2"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.2"
