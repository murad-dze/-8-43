Gradle: Добавлена библиотека navigation-compose.
Enum: Создан класс Screen со списком экранов.
Экраны: Search и Settings теперь просто функции (принимают onBack), а не классы Activity.
Хост: Создан PlaylistHost, где прописана карта переходов.
Main: В MainActivity теперь создается navController и запускается PlaylistHost.
Манифест: Убраны (или можно убрать) лишние <activity> для поиска и настроек.