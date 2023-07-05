class pbl2 {
    public static void main(String[]args) {
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        Point p2 = p;
        p2.x = 30;
        System.out.println(""+p.x);
        System.out.println(""+p.y);
        System.out.println(""+p2.x);
    } 
}
class Point{
    int x;
    int y;
}