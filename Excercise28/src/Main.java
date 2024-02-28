//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-------Question1---------");
        Book b = new Book("Relentless",19.99,"Tim Grover");
        System.out.println("Discount for " + b.getName() + ": " + b.getDiscount()+ "%");
        System.out.println("Price after Discount:" + (b.getPrice() -(b.getPrice()*b.getDiscount()/100)));
        Movie m = new Movie("Spiderman",25.50,"Benedict Cumberbatch");
        System.out.println("Discount: " + m.getName() + ": " + m.getDiscount() + "%");
        System.out.println("Price after Discount:" + (m.getPrice() -(m.getPrice()*m.getDiscount()/100)));
        System.out.println("-------Question2---------");
        MovablePoint mp = new MovablePoint(20,40,60,80);
        System.out.print("MoveUp:" );
        mp.moveUp();
        System.out.print("MoveDown:");
        mp.moveDown();
        System.out.print("MoveLeft:");
        mp.moveLeft();
        System.out.print("MoveRight:");
        mp.moveRight();


    }
}