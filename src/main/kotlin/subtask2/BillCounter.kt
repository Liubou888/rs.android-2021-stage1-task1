package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var bactual = 0
        var bcharged = 0
        for ((index, costOfItem) in bill.withIndex()) {
            if (index != k) bactual += costOfItem
            bcharged += costOfItem
        }
        if (b <= bactual / 2) return ("Bon Appetit")
        return "${b - (bactual / 2)}"
    }
}



