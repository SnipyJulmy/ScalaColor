name := "ScalaColor"

version := "1.0"

scalaVersion := "2.12.1"

organization := "com.github.SnipyJulmy"

homepage := Some(url("https://github.com/SnipyJulmy/ScalaColor"))

scmInfo := Some(ScmInfo(
    url("https://github.com/SnipyJulmy/ScalaColor"),
    "git@github.com:SnipyJulmy/ScalaColor.git"
    ))

developers += Developer(
    "SnipyJulmy",
    "Sylvain Julmy",
    "sylvain.julmy@gmail.com",
    url("https://github.com/SnipyJulmy")
  )

licenses += ("GPLv3",url("https://www.gnu.org/licenses/gpl-3.0.en.html"))

pomIncludeRepository := (_ => false)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

coverageEnabled := true

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"


scalacOptions ++= Seq(
  "-language:postfixOps",
  "-language:implicitConversions",
  "-deprecation"
)