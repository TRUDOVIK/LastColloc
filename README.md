Для тестирования приложения его необходимо запустить, и начать вписывать следующие запросы в postman:
1) Для начала добавим пару студентов. Для этого выберем POST и впишем URL http://localhost:8080/students Во вкладке Body впишем
{
  "name": "Ivan",
  "age": 21,
  "specialization": "SoftwareEnginer"
}
так же впишем
{
  "name": "Andrew",
  "age": 21,
  "specialization": "SoftwareEnginer"
}
2) Мы добавили двух студентов. Теперь можно посмотреть список студентов. Для этого нужно выбрать GET и ввести URL http://localhost:8080/students
3) Теперь проставим студентам оценки. Для этого выберем POST и впишем URL http://localhost:8080/grades во вкладке Body введем следующее
{
  "studentId": 2,
  "subject": "KPO",
  "score": 5
}
затем
{
  "studentId": 2,
  "subject": "Algosi",
  "score": 6
}
затем
{
  "studentId": 1,
  "subject": "KPO",
  "score": 8
}
и затем
{
  "studentId": 1,
  "subject": "Algosi",
  "score": 9
}
4) И наконец посмотрим оценки конкретного студента. Для этого выберем GET и введем URL http://localhost:8080/grades/1 Что бы посмотреть оценки первого студента или http://localhost:8080/grades/2 что бы посмотреть оценки второго студента
