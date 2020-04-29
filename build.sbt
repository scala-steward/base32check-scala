name := "base32check-scala"
version := "0.0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatestplus" %% "scalacheck-1-14" % "3.1.1.1" % Test

Compile / doc / sources := Seq.empty

version := {
  val tagPrefix = "refs/tags/"
  sys.env.get("CI_VERSION").filter(_.startsWith(tagPrefix)).map(_.drop(tagPrefix.length)).getOrElse(version.value)
}
