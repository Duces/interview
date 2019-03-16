class RWGPSService: ServiceRulesInterface {

    private val ROUTES = listOf("CVT", "Perkiomen", "Welsh Mountain")
    private val LABEL = "RWGPS"

    override fun getAllRoutes(): List<String> {
        return ROUTES
    }

    override fun getUserRoutes(userId: String): List<String> {
        return ROUTES.map { it + userId }
    }

    override fun getLabel(): String {
        return LABEL
    }
}