package org.darker.nvd3

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Scale extends BaseScale[Double,Double,Scale] {

}
@js.native
trait Scale extends BaseScale[Double,Double,Scale] {

}

@js.native
trait Zoom[Datum] extends js.Function1[Selection[Datum],Unit] {

  def translate(): js.Tuple2[Double, Double] = js.native

  def translate(translate: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def scale(): Double = js.native

  def scale(scale: Double): Zoom[Datum] = js.native

  def scaleExtent(): js.Tuple2[Double, Double] = js.native

  def scaleExtent(extent: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def center(): js.Tuple2[Double, Double] = js.native

  def center(center: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def x(): zoom.Scale = js.native

  def x[S<:BaseScale[_,_,S]](x:S): Zoom[Datum] = js.native

  def y(): zoom.Scale = js.native

  def y[S<:BaseScale[_,_,S]](x:S): Zoom[Datum] = js.native

  def on(`type`: String): js.Function2[Datum, Double, Any] = js.native

  def on(`type`: String, listener: js.Function2[Datum, Double, Any]): Zoom[Datum] = js.native

  def event(selection: Selection[Datum]): Unit = js.native

  def event(transition: Transition[Datum]): Unit = js.native
}

@js.native
trait Scale extends BaseScale[Double,Double,Scale] {

}


