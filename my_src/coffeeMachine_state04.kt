//https://hyperskill.org/projects/67/stages/363/implement
package machine

import java.util.*

var totalWater = 400
var totalMoney = 550
var totalMilk = 540
var totalCoffee = 120
var totalDisposableCups = 9

fun coffeeMachineState() {
    println("The coffee machine has:")
    println("$totalWater of water")
    println("$totalMilk of milk")
    println("$totalCoffee of coffee beans")
    println("$totalDisposableCups of disposable cups")
    println("$totalMoney of money")
}

fun choseAction(scanner: Scanner): String {
    println("Write action (buy, fill, take): >")
    return scanner.nextLine()
}

fun buyAction(scanner: Scanner) {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: >")

    when (scanner.nextInt()) {
        1 -> {
            totalWater -= 250
            totalCoffee -= 16
            totalMoney += 4
            totalDisposableCups--;
        }
        2 -> {
            totalWater -= 350
            totalMilk -= 75
            totalCoffee -= 20
            totalMoney += 7
            totalDisposableCups--;
        }
        3 -> {
            totalWater -= 200
            totalMilk -= 100
            totalCoffee -= 12
            totalMoney += 6
            totalDisposableCups--;
        }
    }
}

fun fillAction(scanner: Scanner) {
    println("Write how many ml of water do you want to add: >")
    totalWater += scanner.nextInt()
    println("Write how many ml of milk do you want to add: >")
    totalMilk += scanner.nextInt()
    println("Write how many grams of coffee beans do you want to add: >")
    totalCoffee += scanner.nextInt()
    println("Write how many disposable cups of coffee do you want to add: >")
    totalDisposableCups += scanner.nextInt()
}

fun takeAction(scanner: Scanner) {
    println("I gave you $totalMoney")
    totalMoney = 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    coffeeMachineState()
    when (choseAction(scanner)) {
        "buy" -> buyAction(scanner)
        "fill" -> fillAction(scanner)
        "take" -> takeAction(scanner)
    }

    coffeeMachineState()
}
