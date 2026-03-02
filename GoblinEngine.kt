class GoblinEngine(
    private val personalityManager: PersonalityManager,
    private val moodEngine: MoodEngine
) {

    fun generateReply(message: String): String {

        moodEngine.updateMood(message)

        val personality = personalityManager.currentPersonality()
        val mood = moodEngine.currentMood()

        return when (personality) {

            PersonalityType.FRIEND ->
                "بص يا نجم 😎 (${mood})\n$message؟ طب خليني أقولك رأيي..."

            PersonalityType.PROGRAMMER ->
                "خلينا نحللها تقنيًا 🧠 (${mood})\n$message"

            PersonalityType.POLITICAL ->
                "الموضوع سياسي شوية 🏛 (${mood})\n$message"
        }
    }
}
