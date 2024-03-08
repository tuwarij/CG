public class test {
    public static void main(String[] args) {
        int dx = 1 ,dy = 2;
        System.out.println(dx);
        if(dy > dx){
            int emp = dx;
            dx = dy;
            dy = emp;
        }
        System.out.println(dx);
    }
}
