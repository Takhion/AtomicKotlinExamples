// SealedClasses/UnSealed.kt
package withoutsealedclasses
import atomictest.*

private val trace = Trace()

open class Transport

data class Train(
  val line: String
) : Transport()

data class Bus(
  val number: String,
  val capacity: Int
) : Transport()

fun travel(transport: Transport) =
  when (transport) {
    is Train ->
      trace("Train ${transport.line}")
    is Bus ->
      trace("Bus ${transport.number}, " +
        "size ${transport.capacity}")
    else -> trace("$transport is in limbo!")
  }

fun main() {
  listOf(Train("S1"), Bus("11", 90))
    .forEach(::travel)
  trace eq """
  Train S1
  Bus 11, size 90
  """
}
