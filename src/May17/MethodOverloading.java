package May17;

public class MethodOverloading {

    public String name(String firstname){
        return "" + firstname;
    }

    public String name(String firstname, String middlename){
        return "" +firstname + "" + middlename;
    }

    public String name(String firstname, String middlename, String lastname){
        return "" +firstname + "" + middlename + "" +lastname;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        String fn = mo.name("Utsav");
        System.out.println(fn);
        String mn = mo.name("Utsav", "Shaileshbhai");
        System.out.println(mn);
        String ln = mo.name("Utsav", "Shaileshbhai", "Patel");
        System.out.println(ln);
    }
}
