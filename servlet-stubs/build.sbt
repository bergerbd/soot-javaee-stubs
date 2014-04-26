name := "servlet-stubs"

organization := "soot.javaee.stubs"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.0"

sbtVersion := "0.13.2"

Common.settings

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0"
