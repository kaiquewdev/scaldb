package shaft_alignment

trait BothAxis {
  var first: Axis
  var last: Axis
}

class Edge(var first: Axis = new Axis(), var last: Axis = new Axis()) extends Axis with BothAxis {}
