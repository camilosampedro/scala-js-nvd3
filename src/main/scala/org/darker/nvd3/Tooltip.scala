package org.darker.nvd3

import org.scalajs.dom.raw.HTMLElement

/**
  * Created by camilosampedro on 15/03/17.
  */
trait Tooltip {

  /**
    * For tooltip: Parent dom element of the SVG that holds the chart. This will make the tooltip dom be created inside
    * this container instead of on the document body.
    *
    * @param el
    * @return
    */
  def chartContainer(el: HTMLElement): this.type

  /**
    * For tooltip: Parent dom element of the SVG that holds the chart. This will make the tooltip dom be created inside
    * this container instead of on the document body.
    *
    * @return
    */
  def chartContainer: HTMLElement

  /**
    * Attaches additional CSS classes to the tooltip DIV that is created.
    *
    * @param classes
    * @return
    */
  def classes(classes: String): this.type

  /**
    * Attaches additional CSS classes to the tooltip DIV that is created.
    *
    * @return
    */
  def classes: String

  /**
    * Function that generates the tooltip content html.
    *
    * @param func
    * @return
    */
  def contentGenerator(func: Any => String): this.type

  /**
    * Function that generates the tooltip content html.
    *
    * @return
    */
  def contentGenerator(): Any => String

  def data(value: Any): this.type

  def data: Any

  def distance(value: Double): this.type

  def distance: Double

  /**
    * Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.
    *
    * @param value
    * @return
    */
  def duration(value: Double): this.type

  def duration: Double

  /**
    * For tooltip: completely enables or disabled the tooltip
    *
    * @param value
    * @return
    */
  def enabled(value: Boolean): this.type

  /**
    * For tooltip: completely enables or disabled the tooltip
    *
    * @return
    */
  def enabled: Boolean

  /**
    * For tooltip: If not null, this fixes the top position of the tooltip.
    *
    * @param value
    * @return
    */
  def fixedTop(value: Double): this.type

  /**
    * For tooltip: If not null, this fixes the top position of the tooltip.
    *
    * @return
    */
  def fixedTop: Double

  /**
    * Determines how tooltip is positioned
    *
    * @param value Can be 'n','s','e','w'
    * @return
    */
  def gravity(value: String): this.type

  /**
    * Can be 'n','s','e','w'. Determines how tooltip is positioned
    *
    * @return
    */
  def gravity: String

  /**
    * For tooltip: show the x axis value in the tooltip or not (not valid for pie charts for instance)
    */
  def headerEnabled(value: Boolean): this.type

  /**
    * For tooltip: show the x axis value in the tooltip or not (not valid for pie charts for instance)
    */
  def headerEnabled: Boolean

  /**
    * For tooltip: formats the x axis value in the tooltip
    */
  def headerFormatter(func: (Any) => String): this.type

  /**
    * For tooltip: formats the x axis value in the tooltip
    */
  def headerFormatter: Any => String

  /**
    * For tooltip: show or hide the tooltip by setting this to true or false. Tooltips used to be created and destroyed,
    * but now we re-used the element and set opacity to 1 or 0.
    */
  def hidden(value: Boolean): this.type

  /**
    * For tooltip: show or hide the tooltip by setting this to true or false. Tooltips used to be created and destroyed,
    * but now we re-used the element and set opacity to 1 or 0.
    */
  def hidden: Boolean


  /**
    * Delay in ms before the tooltip hides itself after a mouseout event. A new mouseover event cancels the hide if within this timeout period.
    */
  def hideDelay(value: Double): this.type

  /**
    * Delay in ms before the tooltip hides itself after a mouseout event. A new mouseover event cancels the hide if within this timeout period.
    */
  def hideDelay: Double

  /**/
  def id: Any

  def keyFormatter: (Any, Double) => String

  def keyFormatter(func: (Any, Double) => String): this.type

  def offset: Offset

  def offset(value: Offset): this.type

  /**
    * Sets the top/left positioning for the tooltip. Should be given an object with 'left' and/or 'top' attributes.
    * You can override just one, just like the 'margin' option on charts
    */
  def position: Offset

  /**
    * Sets the top/left positioning for the tooltip. Should be given an object with 'left' and/or 'top' attributes.
    * You can override just one, just like the 'margin' option on charts
    */
  def position(value: Offset): this.type

  /**
    * Tolerance allowed before tooltip is moved from its current position (creates 'snapping' effect)
    */
  def snapDistance: Double

  /**
    * Tolerance allowed before tooltip is moved from its current position (creates 'snapping' effect)
    */
  def snapDistance(value: Double): this.type

  /**
    * returns the dom element of the tooltip.
    */
  def tooltipElem: HTMLElement

  /**
    * formats the y axis value(s) in the tooltip
    */
  def valueFormatter: (Any) => String

  /**
    * formats the y axis value(s) in the tooltip
    */
  def valueFormatter(func: Any => String): this.type
}
