public class RunFan {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.setSpeed(3);
        f.setRadius(10);
        f.setColor("Vàng");
        f.setOn(true);
        System.out.println("Tốc độ: " + f.getSpeed());
        System.out.println("Bán kính: " + f.getRadius());
        System.out.println("Màu sắc: " + f.getColor());
        System.out.println(f);

        System.out.println();

        Fan f2 = new Fan();
        f2.setSpeed(2);
        System.out.println("Tốc độ: " + f2.getSpeed());
        System.out.println("Bán kính: " + f2.getRadius());
        System.out.println("Màu sắc: " + f2.getSpeed());
        System.out.println(f2);
    }

}
