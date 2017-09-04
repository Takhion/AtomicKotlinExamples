// Interfaces/NoMultipleInheritance.kt
package interfaces1

open class Animal
open class Mammal : Animal()
open class AquaticAnimal : Animal()

// More than one base class won't compile:
// class Dolphin: Mammal(), AquaticAnimal()
