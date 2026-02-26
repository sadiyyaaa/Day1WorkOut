class Overloading {
    Overloading(){
        System.out.println("constuct 01");
    }
    Overloading(int a, int b){
        System.out.println("construct 02");
    }
    Overloading(float a){
        System.out.println("construct 03");
    }
    
}
class Over{
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(10, 20);
        Overloading o3 = new Overloading(5.5f);
    }
}
