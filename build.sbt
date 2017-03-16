enablePlugins(ScalaJSPlugin)

name := "ScalaJS NvD3"

normalizedName := "scala-js-nvd3"

organization := "org.crudha"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-deprecation", "-feature")

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

resolvers += Resolver.jcenterRepo

// D3 dependency
libraryDependencies += "org.singlespaced" %%% "scalajs-d3" % "0.3.4"

jsDependencies += "org.webjars" % "nvd3" % "1.8.2" / "1.8.2/nvd3.min.js"

jsDependencies += RuntimeDOM

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.4" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

homepage := Some(url("https://github.com/camilosampedro/scala-js-nvd3"))
licenses += ("GNU General Public License", url("https://github.com/spaced/scala-js-nvd3/blob/master/LICENSE"))


scmInfo := Some(ScmInfo(
  url("https://github.com/camilosampedro/scala-js-nvd3"),
  "scm:git:git@github.com:camilosampedro/scala-js-nvd3.git",
  Some("scm:git:git@github.com:camilosampedro/scala-js-nvd3.git")))


pomExtra :=
  <developers>
    <developer>
      <id>camilosampedro</id>
      <name>Camilo Sampedro</name>
      <url>http://camilosampedro.me</url>
    </developer>
  </developers>

publishMavenStyle := true

// TODO: When done, edit this publishing to Sonatype: http://central.sonatype.org/pages/producers.html

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

releasePublishArtifactsAction := PgpKeys.publishSigned.value

useGpg := true

//bintray.Keys.repository := "maven"
