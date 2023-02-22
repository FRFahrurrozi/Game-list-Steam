package tech.noope.common.domain

object RawgUrl {

    const val RAWG_API_KEY = "24a0a11019674f9aa4fdcc4b1ea82ad0"
    const val PARAM_GAME_ID = "id"

    const val BASE_RAWG_URL = "https://api.rawg.io/api/"
    const val URL_LIST_GAME = "games"
    const val URL_GAME_DETAIL = "games/{$PARAM_GAME_ID}"
}