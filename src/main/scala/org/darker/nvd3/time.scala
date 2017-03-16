package org.darker.nvd3

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{Date, `|`}

@JSName("d3.time.format")
@js.native
trait FormatObject extends js.Object {
  def multi(formats: js.Array[js.Tuple2[String, js.Function1[Date, Boolean | Double]]]): Format = js.native

  def utc(specifier: String): Format = js.native

  var iso: Format = js.native

  //Forwarders
  def utc: formatModule.UtcObject = js.native
}

@JSName("d3.time.format.utc")
@js.native
trait UtcObject extends js.Object {
  def multi(formats: js.Array[js.Tuple2[String, js.Function1[Date, Boolean | Double]]]): Format = js.native
}


@JSName("d3.time.format")
@js.native
trait FormatObject extends js.Object {
  def multi(formats: js.Array[js.Tuple2[String, js.Function1[Date, Boolean | Double]]]): Format = js.native

  def utc(specifier: String): Format = js.native

  var iso: Format = js.native

  //Forwarders
  def utc: formatModule.UtcObject = js.native
}

@js.native
trait Format extends js.Object {
  def apply(d: Date): String = js.native

  def parse(input: String): Date = js.native
}

@JSName("d3.time.scale")
@js.native
trait ScaleObject extends js.Object {
  def utc(): Scale[Double, Double] = js.native

  //TODO def utc[Output](): Scale[Output, Output] = js.native
  //TODO def utc[Range, Output](): Scale[Range, Output] = js.native
}

@js.native
trait Scale[Range, Output] extends BaseScale[Date,Range,Scale[Range, Output]] {
  def apply(x: Date): Output = js.native

  def nice(): Scale[Range, Output] = js.native

  def nice(interval: Interval, step: Double): Scale[Range, Output] = js.native

  def rangeRound(values: js.Array[Double]): Scale[Double, Double] = js.native

  def interpolate(): js.Function2[Range, Range, js.Function1[Double, Output]] = js.native

  def interpolate(factory: js.Function2[Range, Range, js.Function1[Double, Output]]): Scale[Range, Output] = js.native

  def clamp(): Boolean = js.native

  def clamp(clamp: Boolean): Scale[Range, Output] = js.native

  def ticks(): js.Array[Date] = js.native

  def ticks(interval: Interval, step: Double): js.Array[Date] = js.native

  def ticks(count: Double): js.Array[Date] = js.native

  def tickFormat(count: Double): js.Function1[Date, String] = js.native

  def copy(): Scale[Range, Output] = js.native
}


@JSName("d3.time.format.utc")
@js.native
trait UtcObject extends js.Object {
  def multi(formats: js.Array[js.Tuple2[String, js.Function1[Date, Boolean | Double]]]): Format = js.native
}

