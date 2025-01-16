package lesson_8;

public class Employee {

        private String fullName;
        private final String position;
        private final String email;
        private final String phone;
        private int salary;
        private int age;

        // Конструктор
        public Employee(String fullName, String position, String email, String phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        // Метод для вывода информации
        public void printInfo() {
            System.out.println("ФИО: " + fullName + ", Должность: " + position + ", Email: " + email +
                    ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
        }

        // Геттер для возраста
        public int getAge() {
            return age;
        }
    }


