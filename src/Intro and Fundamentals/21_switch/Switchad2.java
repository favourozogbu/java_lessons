public class Switchad2 {
        public static String getDayType(String day) {
            return switch (day.toLowerCase()) {
                case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Weekday";
                case "saturday", "sunday" -> "Weekend";
                default -> "Invalid day";
            };
        }

        public static String nullNotAllowed(Object value){
            return switch (value) {
                case null -> "Null not Allowed";
                default -> value.toString();
            };


        }
    
        public static void main(String[] args) {
            System.out.println(getDayType("Not a day"));
            System.out.println(nullNotAllowed(23));
            System.out.println(nullNotAllowed(null));
            System.out.println(nullNotAllowed("sting is good"));
        }
    
}
