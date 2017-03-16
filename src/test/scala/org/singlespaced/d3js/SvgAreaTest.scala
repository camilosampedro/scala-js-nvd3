package org.singlespaced.d3js

import org.darker.nvd3.nvd3
import org.scalajs.dom
import org.darker.nvd3.Ops._
import utest._

import scala.scalajs.js


object SvgAreaTest extends TestSuite {


  val elem=dom.document.createElement("svg")
  dom.document.body.appendChild(elem)


  val tests = TestSuite {
    'd3_area_xy {
      //arrange
      case class TestDatum(v:Int)
      val data=js.Array[TestDatum](TestDatum(1),TestDatum(4))
      val testee = nvd3.svg.area[TestDatum]()
      //act
      val result=testee
        .x((d:TestDatum,i:Int) =>  d.v.toDouble )
        .y((d:TestDatum,i:Int) =>  d.v.toDouble )
      //assert

      nvd3.select(elem).datum(data)
        .append("path")
        .attr("d", result)

      val actual=dom.document.getElementsByTagName("path")
      assert( actual.length == 1)
      assert( actual.item(0).asInstanceOf[dom.Element].getAttribute("d") =="M1,1L4,4L4,4L1,1Z")

    }
    'd3_area_radial {
      val area = nvd3.svg.area.radial().interpolate("basis").tension(0).radius(100)
    }
  }
}

