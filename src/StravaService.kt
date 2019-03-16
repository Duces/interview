class StravaService: ServiceRulesInterface {

    private val ROUTES = listOf("SRT", "CVT","Perkiomen")
    private val LABEL = "Strava"

    override fun getAllRoutes(): List<String> {
        return ROUTES
    }

    override fun getUserRoutes(userId: String): List<String> {
        return ROUTES.map { userId + it}
    }

    override fun getLabel(): String {
        return LABEL
    }
}