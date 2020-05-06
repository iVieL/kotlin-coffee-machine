import java.util.Scanner

enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "");

    companion object {
        fun findByCountry(name: String): Country {
            for (enum in values()) {
                if (enum.country == name) return enum
            }
            return NULL
        }

        fun checkSameCurrency(country1: Country, country2: Country): Boolean {
            return country1.currency == country2.currency
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val country1 = input.next()
    val country2 = input.next()

    val entry1 = Country.findByCountry(country1)
    val entry2 = Country.findByCountry(country2)

    println(Country.checkSameCurrency(entry1, entry2))
}