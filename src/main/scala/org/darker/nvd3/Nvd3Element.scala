package org.darker.nvd3

import org.singlespaced.d3js._

/**
  * Created by camilosampedro on 15/03/17.
  */
trait Nvd3Element {
  val dispatch: Dispatch
  def options(options: Any): this.type
  def update(): Unit
  val transition: (Transition[Array[Any]], Any*)
  val selection: (Selection[Array[Any]], Any*)
}
