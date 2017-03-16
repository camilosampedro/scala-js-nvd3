package org.darker.nvd3


import org.singlespaced.d3js.d3.Primitive

import scala.language.implicitConversions
import scala.scalajs.js

/**
  *  Implicit conversion from [scala.Function1] and [scala.Function2] to [[js.Function3]].
  *  Implicit conversion for a Function using [Primitive]
  */
object Ops {

  @inline implicit def fromFunction1To3StringPrimitive[Datum](value: Datum => String): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction1To3DoublePrimitive[Datum](value: Datum => Double): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction1To3IntPrimitive[Datum](value: Datum =>  Int): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction1To3BooleanPrimitive[Datum](value: Datum => Boolean): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3StringPrimitive[Datum](value: (Datum, Int) => String): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3DoublePrimitive[Datum](value: (Datum, Int) => Double): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3BooleanPrimitive[Datum](value: (Datum, Int) => Boolean): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3IntPrimitive[Datum](value: (Datum, Int) => Int): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction1To3StringPrimitive[Datum](value: js.Function1[Datum,String]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction1To3DoublePrimitive[Datum](value: js.Function1[Datum,Double]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction1To3IntPrimitive[Datum](value: js.Function1[Datum,Int]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction1To3BooleanPrimitive[Datum](value: js.Function1[Datum,Boolean]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction2To3StringPrimitive[Datum](value: js.Function2[Datum, Int,String]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction2To3DoublePrimitive[Datum](value: js.Function2[Datum, Int, Double]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction2To3BooleanPrimitive[Datum](value: js.Function2[Datum, Int, Boolean]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)

  @inline implicit def fromJsFunction2To3IntPrimitive[Datum](value: js.Function2[Datum, Int, Int]): js.Function3[Datum, Int, js.UndefOr[Int], Primitive] =
    asPrimitive(value)


  @inline implicit def asPrimitive[Datum, T](value: Datum => T) =
    fromFunction1To3(value.andThen(_.asInstanceOf[Primitive]))

  @inline implicit def asPrimitive[Datum, T](value: (Datum, Int) => T) =
    fromFunction2To3((d: Datum, i: Int) => value.apply(d, i).asInstanceOf[Primitive])

  @inline implicit def fromFunction1To3[Datum, M](value: Datum => M): js.Function3[Datum, Int, js.UndefOr[Int], M] =
    (d: Datum, i: Int, x: js.UndefOr[Int]) => value.apply(d)

  @inline implicit def fromFunction1To2[Datum, M](value: Datum => M): js.Function2[Datum, Int, M] =
    (d: Datum, i: Int) => value.apply(d)

  @inline implicit def fromFunction2To3[Datum, M](value: (Datum, Int) => M): js.Function3[Datum, Int, js.UndefOr[Int], M] =
    (d: Datum, i: Int, x: js.UndefOr[Int]) => value.apply(d, i)


}
