public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        if(description.indexOf("windy") != -1) windy = true;
        if(windy == true) return("Too windy or cold! Enjoy watching the weather through the window.");      
        else if(description.indexOf("snow") != -1 && temperature < 31)return("Too windy or cold! Enjoy watching the weather through the window.");
        else if(description.indexOf("snow") != -1 && temperature == 33)return("It's safe to go outside, " + temperature + " degrees and snow.");
        else if(description.indexOf("sunny") != -1 && temperature > 33)return("It's safe to go outside, " + temperature + " degrees and sunny.");
        else if(description.indexOf("snow") != -1 && temperature > 99)return("A volcano exploded!");
        else return(" ");
    }
    
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description)
    {
        if(temperature < 30 || temperature > 80)return("It's too hot or cold, " + temperature + " degrees." );
        else if(windchill >= 4)return("It's way to windy out there.");
        else if(humidity >= 1)return("Why is there so much water vapor in the air!");
        else if(description.indexOf("snow") != -1 || description.indexOf("rain") != -1 || description.indexOf("volcano") != -1)return("DO NOT GO HIKING! " + "(" + description + ")");
        else return("Hike time!");
    }
}