ThisBuild / organization := "ch.snipy.scalacolor"
ThisBuild / organizationName := "snipy"
ThisBuild / organizationHomepage := Some(url("https://github.com/SnipyJulmy/ScalaColor"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/SnipyJulmy/ScalaColor"),
    "scm:git@github.com:SnipyJulmy/ScalaColor.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "SnipyJulmy",
    name = "Sylvain Julmy",
    email = "sylvain.julmy@gmail.com",
    url = url("https://github.com/SnipyJulmy")
  )
)

ThisBuild / description := "Simple utility to colorize scala String when they are printed"
ThisBuild / licenses := List("GPLv3" -> url("https://www.gnu.org/licenses/gpl-3.0.en.html"))
ThisBuild / homepage := Some(url("https://github.com/SnipyJulmy/ScalaColor"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

ThisBuild / publishMavenStyle := true
