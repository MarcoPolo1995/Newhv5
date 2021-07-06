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



