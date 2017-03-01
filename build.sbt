name := "scala_color"

version := "1.0"

scalaVersion := "2.12.1"

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://jsuereth.com/scala-arm</url>
    <licenses>
      <license>
        <name>BSD-style</name>
        <url>http://www.opensource.org/licenses/bsd-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:jsuereth/scala-arm.git</url>
      <connection>scm:git:git@github.com:jsuereth/scala-arm.git</connection>
    </scm>
    <developers>
      <developer>
        <id>jsuereth</id>
        <name>Josh Suereth</name>
        <url>http://jsuereth.com</url>
      </developer>
    </developers>)