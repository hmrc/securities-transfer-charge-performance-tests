import sbt.*

object Dependencies {

  private val gatlingVersion = "3.15.1"

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"          %% "performance-test-runner"   % "6.3.0"         % Test,
    "com.typesafe"            % "config"                    % "1.4.9"        % Test,
    "io.gatling"              % "gatling-test-framework"    % gatlingVersion % Test,
    "io.gatling.highcharts"   % "gatling-charts-highcharts" % gatlingVersion % Test,
    "org.scala-lang.modules" %% "scala-xml"                 % "2.5.0"        % Test,
    "org.scalacheck"         %% "scalacheck"                % "1.20.0"       % Test
  )

}
