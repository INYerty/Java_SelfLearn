package Java_Assignment.ass10_30;
public class Weather2 {
    interface WeatherCondition {
        void weathermode();
    }
    public void weatherReport2(WeatherCondition con) {
        con.weathermode();
    }
    public static void main(String[] args) {
        Weather2 weather = new Weather2();
        // 晴天
        weather.weatherReport2(new WeatherCondition() {
            public void weathermode() {
                System.out.println("今天天气晴朗，适合外出游玩！");
            }
        });
        // 下雨
        weather.weatherReport2(new WeatherCondition() {

            public void weathermode() {
                System.out.println("今天下雨了，记得带伞，路上小心滑倒！");
            }
        });
        // 雪天
        weather.weatherReport2(new WeatherCondition() {
            public void weathermode() {
                System.out.println("今天下雪了，天气寒冷，注意保暖！");
            }
        });
    }

}
