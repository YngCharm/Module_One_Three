public class Park {
    public static class innerClass{
        String attraction;
        String schedule;
        String price;

        public innerClass(String attraction, String schedule, String price) {
            this.attraction = attraction;
            this.schedule = schedule;
            this.price = price;
        }

        public void info(){
            System.out.println( attraction + " " + price + " " + schedule + " ");
        }
    }
}
