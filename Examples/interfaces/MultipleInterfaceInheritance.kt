// Interfaces/MultipleInterfaceInheritance.kt
package interfaces2

interface Animal
interface Mammal: Animal
interface AquaticAnimal: Animal

// Now compiles!
class Dolphin: Mammal, AquaticAnimal
