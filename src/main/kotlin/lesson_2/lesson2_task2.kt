package lesson_2
fun main() {
    val permanentEmployees = 50
    val interns = 30

    val permanentEmployeesSalary = permanentEmployees * 30000
    val internsSalary = interns * 20000
    val totalSalary = permanentEmployeesSalary + internsSalary
    val totalEmployees = permanentEmployees + interns
    val averageSalary = totalSalary / totalEmployees


    println("Расходы на выплату зарплаты постоянных сотрудников - $permanentEmployeesSalary")
    println("Общие расходы по ЗП - $totalSalary")
    println("Средняя зарплата - $averageSalary")
}
