package lesso5;

public class persson {

    private String FIO;
    private String position;
    private String email;

    private int phone;
    private int money;
    private int age;

    public persson(String FIO, String position, String email , int phone, int money, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.money= money;
        this.phone = phone;
        this.age = age;

    }
    public void info (){
        System.out.println(FIO+position+email+phone+money+age);
    }

    int getAge() {return age;};

}

public class mainhw5class {
    public static void main(String[] args) {
        persson[] staff = new persson[5];
        staff[0]= new persson("Ivanov Ivan", "disagner", "tol@mail.ru",6745,30000,25);
        staff[1]= new persson("Petrov Petr", "master", "tyu@mail.ru", 8906, 10000,47);
        staff[2]= new persson("Ivanov Pavel", "admin","bik@mail.ru",23423,30000,41);
        staff [3]= new persson("Anatoli Lop", "computer","sxce@mail.ru", 345345, 345, 47);
        staff [4]= new persson("Nikolai Nikolaev", "director","dir@mail.ru",90007, 1000000, 41);


        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge()>40){
                System.out.println(staff[i]);
            }

        }


    }


}



