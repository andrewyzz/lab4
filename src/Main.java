package src;

public class Main {
    public static void main(String[] args) {
        Dog caine1 = new Dog("Rex","Labrador");
        Dog caine2 = new Dog("Max","Boxer");
        System.out.println(caine1.getName());
        caine1.setName("Bella");
        System.out.println(caine1.getName());
        System.out.println(caine2.getBreed());
        caine2.setBreed("Husky");
        System.out.println(caine2.getBreed());;
    }
    public static int afisIntreg(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static String mijloc(String sir) {
        int lungime = sir.length();
        int mij = lungime / 2;
        return (lungime % 2 == 0) ? sir.substring(mij - 1, mij + 1) : sir.substring(mij,mij+1);
    }
}
