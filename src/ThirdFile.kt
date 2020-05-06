class StringParser(var string: String) {
    fun removeHTMLTags(): String {
        string = Regex("<[^>]*>").replace(string, "")
        return string
    }

    fun removeSpecialCharacters(): String {
        string = Regex("[^A-Za-z0-9 ]").replace(string, "")
        return string
    }

    fun removeLeadingAndTrailingSpaces(): String {
        return string.trim()
    }
}

fun main() {
    val testUnderScoreNumbers = 5_0_1_0_1
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(testUnderScoreNumbers)
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
    val htmlString = """
        <html>
            <header><title>This is a title</title></header>
            <body>
                Hello world!!!
            </body>
        </html>
    """.trimIndent()
    val stringParser = StringParser(htmlString)

    val response = with(stringParser) {
        removeHTMLTags()
        removeSpecialCharacters()
        removeLeadingAndTrailingSpaces()
    }

    println(response)
    // This is a title            Hello world
}