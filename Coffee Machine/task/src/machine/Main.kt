
package machine

import java.util.*

enum class States(val state: String = "") {
    START,
    BUY,
    FILL,
    TAKE,
    REMAINING,
    EXIT;
}

object MachineState {
    var state = States.START
        private set

    fun nextState(input: String): States {
        when (input) {
            "buy" -> state = States.BUY
            "fill" -> state = States.FILL
            "take" -> state = States.TAKE
            "remaining" ->state = States.REMAINING
            "exit" -> state = States.EXIT
            else -> state = States.START
        }
        return state
    }
}

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
    println("$$totalMoney of money")
}

fun choseAction(scanner: Scanner): States {
    print("Write action (buy, fill, take, remaining, exit): > ")
    return MachineState.nextState(scanner.nextLine())
}

fun validationForResource(opt: Int, value: Int, resource: String, limits: IntArray): String? {
    val template = "Sorry, not enough $resource!"
    return if (value < limits[opt]) {
        template
    } else {
        null
    }
}

fun validationForWater(opt: String): String? {
    return validationForResource(opt.toInt() - 1, totalWater, "water", intArrayOf(250, 350, 200))
}

fun validationForCoffee(opt: String): String? {
    return validationForResource(opt.toInt() - 1, totalCoffee, "coffee", intArrayOf(16, 20, 12))
}

fun validationForMilk(opt: String): String? {
    return validationForResource(opt.toInt() - 1, totalMilk, "milk", intArrayOf(0, 75, 100))
}

fun validationForDisposableCups(opt: String): String? {
    return validationForResource(opt.toInt() - 1, totalDisposableCups, "disposable", intArrayOf(1, 1, 1))
}

fun buyAction(scanner: Scanner) {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back -> back: > ")
    val opt = scanner.nextLine()
    var coffee: String? = null
    var water: String? = null
    var milk: String? = null
    var disposableCup: String? = null

    val state = opt

    when (opt) {
        "1" -> {
            coffee = validationForCoffee(state)
            water = validationForWater(state)
            disposableCup = validationForDisposableCups(state)
            if (coffee == null && water == null && disposableCup == null) {
                totalWater -= 250
                totalCoffee -= 16
                totalMoney += 4
                totalDisposableCups--;
            }
        }
        "2" -> {
            coffee = validationForCoffee(state)
            water = validationForWater(state)
            milk = validationForMilk(state)
            disposableCup = validationForDisposableCups(state)
            if (coffee == null && water == null && disposableCup == null && milk == null) {
                totalWater -= 350
                totalMilk -= 75
                totalCoffee -= 20
                totalMoney += 7
                totalDisposableCups--;
            }
        }
        "3" -> {
            coffee = validationForCoffee(state)
            water = validationForWater(state)
            milk = validationForMilk(state)
            disposableCup = validationForDisposableCups(state)
            if (coffee == null && water == null && disposableCup == null && milk == null) {
                totalWater -= 200
                totalMilk -= 100
                totalCoffee -= 12
                totalMoney += 6
                totalDisposableCups--;
            }
        }
        "back" -> return
        else -> return
    }

    val message: String?
    when {
        coffee != null -> {
            message = coffee
        }
        water != null -> {
            message = water
        }
        milk != null -> {
            message = milk
        }
        disposableCup != null -> {
            message = disposableCup
        }
        else -> {
            message = "I have enough resources, making you a coffee!"
        }
    }

    println(message)
}

fun fillAction(scanner: Scanner) {
    print("Write how many ml of water do you want to add: > ")
    totalWater += scanner.nextLine().toInt()
    print("Write how many ml of milk do you want to add: > ")
    totalMilk += scanner.nextLine().toInt()
    print("Write how many grams of coffee beans do you want to add: > ")
    totalCoffee += scanner.nextLine().toInt()
    print("Write how many disposable cups of coffee do you want to add: > ")
    totalDisposableCups += scanner.nextLine().toInt()
}

fun takeAction(scanner: Scanner) {
    println("I gave you $$totalMoney")
    totalMoney = 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    do {
        val action = choseAction(scanner)
        when (action) {
            States.BUY -> buyAction(scanner)
            States.FILL -> fillAction(scanner)
            States.TAKE -> takeAction(scanner)
            States.REMAINING -> coffeeMachineState()
        }
        println()
    } while(action != States.EXIT)
}
