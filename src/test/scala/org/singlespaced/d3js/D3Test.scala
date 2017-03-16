package org.singlespaced.d3js

import org.darker.nvd3.nvd3
import org.scalajs.dom
import org.darker.nvd3.Ops._
import org.darker.nvd3.nvd3.Primitive
import utest._

import scala.scalajs.js

object D3Test extends TestSuite {


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)
  val sel=nvd3.selectAll("p").data(js.Array(5))

  val tests = TestSuite {
    'd3_selection_attr_fun1WithInt {
      sel.attr("tabindex", (d:Int) => d*2 )
      assert("10" == elem.getAttribute("tabindex"))
    }
    'd3_selection_classed_fun2WithBoolean {
      val f= (d:Int,i:Int) => d==5
      sel.classed("myclass", f )
      assert(elem.classList.contains("myclass"))
    }

  }
}

