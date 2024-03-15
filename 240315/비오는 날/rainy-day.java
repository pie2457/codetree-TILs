import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LocalDate localDate[] = new LocalDate[n];

        int cnt = 0;
        LocalDateTime local = LocalDateTime.now();
        String now = local.format(
            DateTimeFormatter.ofPattern("2024-3-15"));

        for(int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            localDate[i] = new LocalDate(date, day, weather);

            if (weather.equals("Rain") && now.compareTo(date) == -1) {
                now = date;
                cnt = i;
            }
        }

        System.out.println(localDate[cnt].date + " " + localDate[cnt].day + " " + localDate[cnt].weather);
    }

    static class LocalDate {

        String date;
        String day;
        String weather;

        public LocalDate(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }
    }
}