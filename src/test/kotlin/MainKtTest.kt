import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculationVk() {
        val card = "Vk Pay"
        val previousTransfer = 0
        val amount = 1000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(0, result)
    }
    @Test
    fun commissionCalculationMaster() {
        val card = "MasterCard"
        val previousTransfer = 0
        val amount = 1000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(0, result)
    }
    @Test
    fun commissionCalculationMaster2() {
        val card = "MasterCard"
        val previousTransfer = 76000_00
        val amount = 10000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(62000, result)
    }
    @Test
    fun commissionCalculationVisa() {
        val card = "Visa"
        val previousTransfer= 0
        val amount = 10000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(75000, result)
    }
    @Test
    fun commissionCalculationZiro() {
        val card = "Ziro"
        val previousTransfer= 0
        val amount = 10000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(0, result)
    }
    @Test
    fun commissionCalculationMaestro() {
        val card = "Maestro"
        val previousTransfer = 0
        val amount = 1000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(0, result)
    }
    @Test
    fun commissionCalculationMaestro2() {
        val card = "Maestro"
        val previousTransfer = 76000_00
        val amount = 10000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(62000, result)
    }
    @Test
    fun commissionCalculationMir() {
        val card = "Мир"
        val previousTransfer= 0
        val amount = 10000_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(75000, result)
    }
    @Test
    fun commissionCalculationMir2() {
        val card = "Мир"
        val previousTransfer= 0
        val amount = 100_00

        val result = commissionCalculation(card, previousTransfer, amount)
        assertEquals(3500, result)
    }
}