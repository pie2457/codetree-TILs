import java.util.Scanner; 
import java.util.Arrays; 
import java.util.Collections;

class Data implements Comparable<Data>{
    String date, day, weather;

    public Data (String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    @Override
    public int compareTo(Data data) {
        return this.date.compareTo(data.date);
    }   
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Data[] datas = new Data[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            datas[i] = new Data(date, day, weather);
        }

        Arrays.sort(datas, 0, n);

        for(Data data : datas) {
            if (data.weather.equals("Rain")) {
                System.out.println(data.date + " " + data.day + " " + data.weather);
                break;
            }
        }
    }
}