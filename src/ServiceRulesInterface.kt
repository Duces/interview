interface ServiceRulesInterface {
    fun getAllRoutes(): List<String>
    fun getUserRoutes(userId: String): List<String>
    fun getLabel(): String
}