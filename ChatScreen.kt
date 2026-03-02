@Composable
fun ChatScreen() {

    var message by remember { mutableStateOf("") }
    val engine = remember {
        GoblinEngine(PersonalityManager(), MoodEngine())
    }

    Column(Modifier.fillMaxSize()) {

        Button(onClick = {
            message = engine.generateReply("إزيك يا جوبلن؟")
        }) {
            Text("كلم جوبلن")
        }

        Text(text = message)
    }
}
