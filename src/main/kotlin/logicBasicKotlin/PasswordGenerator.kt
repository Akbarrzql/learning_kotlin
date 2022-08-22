fun main() {

    println("Masukkan Password : ")
    val passwordGenerator = PasswordGenerator()

    val newPassword1 = passwordGenerator.generatePassword(
        isWithLetters = true,
        isWithUppercase = true,
        isWithNumbers = true,
        isWithSpecial = true,
        length = 20
    )
    val newPassword2 = passwordGenerator.generatePassword(
        isWithLetters = true,
        isWithUppercase = false,
        isWithNumbers = true,
        isWithSpecial = false,
        length = 25
    )
    val newPassword3 = passwordGenerator.generatePassword(
        isWithLetters = false,
        isWithUppercase = true,
        isWithNumbers = true,
        isWithSpecial = false,
        length = 15
    )

    val newPassword4 = passwordGenerator.generatePassword(
        isWithLetters = false,
        isWithUppercase = true,
        isWithNumbers = true,
        isWithSpecial = false,
        length = 30
    )

    println("Password Baru 1 : $newPassword1")
    println("Password Baru 2 : $newPassword2")
    println("Password Baru 3 : $newPassword3")
    println("Password Baru 4 : $newPassword4")
}

