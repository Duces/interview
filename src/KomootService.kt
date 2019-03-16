class KomootService: ServiceRulesInterface {

    private val ROUTES = listOf("SRT","Welsh Mountain", "Oaks to Philly")
    private val LABEL = "Komoot"

    override fun getAllRoutes(): List<String> {
        return ROUTES
    }

    override fun getUserRoutes(userId: String): List<String> {
        return ROUTES.map { userId + it + userId }
    }

    override fun getLabel(): String {
        return LABEL
    }
}