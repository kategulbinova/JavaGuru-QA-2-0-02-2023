package homeworks.homework7;

class JobStatusChanger {
    public void hire(Person person) {
        if (person.getAge() >= 18) person.setHired(true);

    }
    public void fire(Person person) {
        person.setHired(false);
    }

    static void hireOrFireStatic(Person person) {
        int age = person.getAge();
        person.setHired(age >= 18 && age <= 65);
    }

}
