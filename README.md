# Rest

auth?login=<login>&password=<password>&register=1 {"status":"success","id": id_созданного_юзера}
в случае ошибки {"status":"Текст_ошибки"}, например:
{"status":"Login busy already"}
Регистрация нового пользователя с данными логин и пароль
auth?login=<login>&password=<password> {"status":"success","id": id_залогиненного_юзера}
в случае ошибки
{"status":"Wrong password"}
{"status":"Wrong login"}
{"status":"Error", "id":0}
Попытка авторизации
logout {"status":"success"} Разлогиниться
balance?set=12.231 {"status":"success","balance":"123.23"} Установить/получить баланс
Если есть параметр set = установка баланса
если нет ­ получение. Вывод всегда один.
categories {"status":"success", [
{"id":1,"title":"\u0422\u0440\u0430\u043d\u0441\u043f\
u043e\u0440\u0442"},
{"id":2,"title":"\u0415\u0434\u0430"},
{"id":3,"title":"\u0420\u0430\u0437\u0432\u043b\u0435\
u0447\u0435\u043d\u0438\u044f"} ]}
Получить список всех категорий пользователя
categories/synch {"status":"success","data":[{"id":1,"title":"\u0422\u0440\
u0430\u043d\u0441\u043f\u043e\u0440\u0442"},{"id":2
,"title":"\u0415\u0434\u0430"},{"id":3,"title":"\u0420\u0
430\u0437\u0432\u043b\u0435\u0447\u0435\u043d\u04
38\u044f"}]}
или
{"status":"error"}
Синхронизация всех категорий (без транзакций) для одного
пользователя. Либо через GET, либо через POST нужно
передать массив с id и title:
?data=’[ {“id”:<id>, “title”: <title>}, ...]’
categories/add?title=<название_категории> {"status":"success","data":{"title":"Category1","id":9}} Создать категорию и возвращает статус и созданную
категорию (название и id)
categories/edit?title=<новое название категории>&id=<id> {"status":"success","data":{"id":1,"title":"Category"}} Изменить категорию по id
categories/del?id=<id> Удалить категорию по id
