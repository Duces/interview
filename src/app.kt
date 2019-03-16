fun main() {

    val stravaService = StravaService()
    val rwgpsService = RWGPSService()
    val komootService = KomootService()

    fun getAllRoutes(): List<String> {
        return mutableListOf<String>().apply {
            addAll(stravaService.getAllRoutes())
            addAll(rwgpsService.getAllRoutes())
            addAll(komootService.getAllRoutes())
        }
    }

    val userId = "17"

    fun getAllRoutesForUser(userId: String): List<String> {
        return mutableListOf<String>().apply {
            addAll(stravaService.getUserRoutes(userId))
            addAll(rwgpsService.getUserRoutes(userId))
            addAll(komootService.getUserRoutes(userId))
        }
    }

    fun getRoutesForUserByRoute(userId: String, vararg route: String): List<String>{
        val list = mutableListOf<String>()
        route.forEach {
            when (it) {
                stravaService.getLabel() -> {
                    list.addAll(stravaService.getUserRoutes(userId))
                }
                rwgpsService.getLabel() -> {
                    list.addAll(rwgpsService.getUserRoutes(userId))
                }
                komootService.getLabel() -> {
                    list.addAll(komootService.getUserRoutes(userId))
                }
            }
        }
        return list
    }



    println("All routes: ${getAllRoutes()}")

    println("Unique routes: " + getAllRoutes().distinctBy { it })

    println("For user $userId: ${getAllRoutesForUser(userId)} ")

    println("For user $userId: services [\"${komootService.getLabel()}\", \"${rwgpsService.getLabel()}\"] ${getRoutesForUserByRoute(userId, komootService.getLabel(), rwgpsService.getLabel())} ")

}
