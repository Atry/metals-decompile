package mypackage
opaque type MyOpaqueType <: Int = Int
object MyOpaqueType {
  def apply(i: Int): MyOpaqueType = i
}
