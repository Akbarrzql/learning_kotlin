import java.security.SecureRandom

class PasswordGenerator {

    companion object {
        const val letters : String = "abcdefghijklmnopqrstuvwxyz"
        const val uppercaseLetters : String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        const val numbers : String = "0123456789"
        const val special : String = "@#=+!£$%&?*()_-[]{}"
    }

    fun generatePassword(
        isWithLetters: Boolean,
        isWithUppercase: Boolean,
        isWithNumbers: Boolean,
        isWithSpecial: Boolean,
        length: Int
    ) : String {

        var generatedPassword = ""
        var idx = 0

        if(isWithLetters){
            generatedPassword += letters
        }

        if(isWithUppercase){
            generatedPassword += uppercaseLetters
        }

        if(isWithNumbers){
            generatedPassword += numbers
        }

        if(isWithSpecial){
            generatedPassword += special
        }

        val randomAlgorithm = SecureRandom.getInstance("SHA1PRNG")
        val sb = StringBuilder(length)

        while (idx < length) {
            val randomInt : Int = randomAlgorithm.nextInt(generatedPassword.length)
            sb.append(generatedPassword[randomInt])
            idx++
        }

        return sb.toString()
    }

}