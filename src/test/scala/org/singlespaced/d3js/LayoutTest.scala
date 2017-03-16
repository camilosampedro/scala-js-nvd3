package org.singlespaced.d3js

import org.darker.nvd3.nvd3
import org.scalajs.dom
import utest._

import scala.scalajs.js

object LayoutTest extends TestSuite {

  val elem = dom.document.createElement("p")
  dom.document.body.appendChild(elem)

  val tests = TestSuite {

    'd3_forcelayout_simplelink_source {
      //arrange
      val node1 = "one"
      val node2 = "two"
      //act
      val testee=SimpleLink[String](node1,node2)
      //assert
      val actualSource=testee.asInstanceOf[js.Dynamic].source
      assert(node1 == actualSource)
    }

    'd3_forcelayout_node_afterstart_runtime_attr {
      //arrange
      case class Test(id:String) extends forceModule.Node
      val node1 = new Test("one")
      val node2 = new Test("two")
      val link = SimpleLink[Test](node1,node2)
      val force = nvd3.layout.force[Test, Link[Test]]()
        .nodes(js.Array(node1,node2))
        .links(js.Array(link))
        .charge(-400)
        .linkDistance(120)
        .size(js.Tuple2(100, 100))
      //act
      force.start()
      //assert
      val actualX=node1.asInstanceOf[js.Dynamic].x

      assert( actualX.isInstanceOf[Double] )
      assert( node1.x.isInstanceOf[Double] )
      assert( node1.x == actualX )
    }


  }
}

