class MoodEngine {

    private var mood: String = "هادئ"

    fun updateMood(text: String) {
        mood = if (text.contains("مشكلة")) "مركز" else "مبسوط"
    }

    fun currentMood(): String = mood
}
