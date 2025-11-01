package Java_Assignment.ass10_30;

interface WeatherType {
    void weatherReport();
}

class Sunny implements WeatherType {
    public void weatherReport() {
        System.out.println("今天天气晴朗，阳光明媚。");
    }
}

class Rainy implements WeatherType {
    public void weatherReport() {
        System.out.println("今天有雨，出门请带伞。");
    }
}

class Snowy implements WeatherType {
    public void weatherReport() {
        System.out.println("今天下雪，注意保暖。");
    }
}

public class Weather {
    public void weatherReport(WeatherType w) {
        w.weatherReport();
    }
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.weatherReport(new Sunny());
        weather.weatherReport(new Rainy());
        weather.weatherReport(new Snowy());
    }
}
