package utilities;




public class Test {
    public static void main(String[] args) throws InterruptedException {

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        System.out.println(firstName+" "+lastName);


    }
}
