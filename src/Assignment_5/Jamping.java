package Assignment_5;

public class Jamping {
    public static void main(String[] args) {
        String name[]={"samman","Zim","Adro","Xim"};
        for (String nam:name){
            if (nam.equals("Adro")) break;
            System.out.println(nam);
        }
        System.out.println("-------------------");

        String names[]={"samman","Zim","Adro","Xim"};
        for(String nam:names){
            if(nam.equals("Zim")) continue;
            System.out.println(nam);
        }
    }
}
