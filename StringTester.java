public class StringTester
{
    
    public static String weatherCondition = "tropical storm";
    public static String description = "heavy rain and windy";
    public static int temperature = 80;
    
    public static void main()
    {
        System.out.println(weatherCondition.length());
        System.out.println(weatherCondition.substring(0, weatherCondition.indexOf(" ")));
        
        String weatherCondition1 = new String("severe thunderstorms");
        String weatherCondition2 = new String("severe thunderstorms");
        
        boolean result1 = (weatherCondition1 == weatherCondition2);
        boolean result2 = (weatherCondition1.equals(weatherCondition2));
        
        System.out.println(result1);
        System.out.println(result2);
        
        String currentCondition = new String("heavy snow");
        System.out.println(currentCondition.equals("heavy snow"));
       
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "rain windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "heavy snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(100, "ash and snow"));
        
        System.out.println(WeatherConditionals.getHikingAdvice(100, 0, 0, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(32, 0, 0, "snow"));
        System.out.println(WeatherConditionals.getHikingAdvice(50, 10, 0, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(50, 0, 5, "sick"));
        System.out.println(WeatherConditionals.getHikingAdvice(50, 0, 0, "storm"));
    }
    
}