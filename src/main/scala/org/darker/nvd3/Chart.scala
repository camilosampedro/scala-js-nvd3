package org.darker.nvd3

/**
  * Created by camilosampedro on 15/03/17.
  */
trait Chart extends Nvd3Element {
  val state: State
  val interactiveLayer: InteractiveLayer
}
