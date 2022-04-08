import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Api {
	public ArrayList<ArrayList> apiCall() throws IOException, InterruptedException {
		
	    	HttpRequest request = HttpRequest.newBuilder()
	    			.uri(URI.create("https://google-news1.p.rapidapi.com/top-headlines?country=US&lang=en&limit=50"))
	    			.header("x-rapidapi-host", "google-news1.p.rapidapi.com")
	    			.header("x-rapidapi-key", "306f4e01e6msha6d33d641b17c51p1793cfjsn63053f8e1f0b")
	    			.method("GET", HttpRequest.BodyPublishers.noBody())
	    			.build();
	    	HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
	    
	    	parser ps = new parser();
	    	String dummy = "{\"statusCode\":200,\"articles\":[{\"published_date\":\"2022-02-05T22:16:00+00:00\",\"title\":\"Moroccan boy trapped in well has died, according to state media - CNN\",\"link\":\"https://www.cnn.com/2022/02/05/africa/morocco-well-rescue-intl/index.html\",\"source\":{\"title\":\"CNN\",\"url\":\"https://www.cnn.com\"}},{\"published_date\":\"2022-02-06T02:30:00+00:00\",\"title\":\"Russia has 70% of the military capabilities in place for full-scale invasion - CNN\",\"link\":\"https://www.cnn.com/2022/02/05/politics/russia-military-ukraine/index.html\",\"source\":{\"title\":\"CNN\",\"url\":\"https://www.cnn.com\"}},{\"published_date\":\"2022-02-06T03:10:00+00:00\",\"title\":\"Cal Golden Bears basketball legend Gene Ransom fatally shot on I-880 in Oakland - New York Post\",\"link\":\"https://nypost.com/2022/02/05/cal-golden-bears-basketball-legend-gene-ransom-fatally-shot-on-i-880/\",\"source\":{\"title\":\"New York Post\",\"url\":\"https://nypost.com\"}},{\"published_date\":\"2022-02-06T01:53:00+00:00\",\"title\":\"Covid-19 Live Updates: Vaccines and Testing News - The New York Times\",\"link\":\"https://www.nytimes.com/live/2022/02/05/world/covid-test-vaccine-cases\",\"source\":{\"title\":\"The New York Times\",\"url\":\"https://www.nytimes.com\"}},{\"published_date\":\"2022-02-06T02:48:45+00:00\",\"title\":\"One dead, four injured in shooting at hookah lounge near Virginia Tech - WTOP\",\"link\":\"https://wtop.com/virginia/2022/02/blacksburg-police-respond-to-shooting-near-virginia-tech/\",\"source\":{\"title\":\"WTOP\",\"url\":\"https://wtop.com\"}},{\"published_date\":\"2022-02-06T00:10:24+00:00\",\"title\":\"Police killing of Amir Locke sparks scrutiny of no-knock warrants, now suspended in Minneapolis - The Washington Post\",\"link\":\"https://www.washingtonpost.com/nation/2022/02/05/no-knock-warrants-amir-locke/\",\"source\":{\"title\":\"The Washington Post\",\"url\":\"https://www.washingtonpost.com\"}},{\"published_date\":\"2022-02-05T16:36:22+00:00\",\"title\":\"Power outages, icy roads, frigid cold from Texas to Northeast after winter storm dumped 17 inches of snow in some areas - USA TODAY\",\"link\":\"https://www.usatoday.com/story/news/nation/2022/02/05/power-outages-icy-roads-winter-storm-pummels-texas-northeast/6674908001/\",\"source\":{\"title\":\"USA TODAY\",\"url\":\"https://www.usatoday.com\"}},{\"published_date\":\"2022-02-05T18:56:32+00:00\",\"title\":\"US COVID-19 death toll breaches 900K mark - Fox News\",\"link\":\"https://www.foxnews.com/health/us-covid-death-toll-breaches-900k-mark\",\"source\":{\"title\":\"Fox News\",\"url\":\"https://www.foxnews.com\"}},{\"published_date\":\"2022-02-04T23:36:24+00:00\",\"title\":\"North Carolina Supreme Court strikes down GOP-drawn congressional map - Yahoo News\",\"link\":\"https://news.yahoo.com/north-carolina-supreme-court-strikes-233624742.html\",\"source\":{\"title\":\"Yahoo News\",\"url\":\"https://news.yahoo.com\"}},{\"published_date\":\"2022-02-05T17:58:49+00:00\",\"title\":\"Renowned Maine artist and author Ashley Bryan dies at 98 - Press Herald\",\"link\":\"https://www.pressherald.com/news/localstate/\",\"source\":{\"title\":\"Press Herald\",\"url\":\"https://www.pressherald.com\"}}]}\r\n"
	    			+ "";
	    
return ps.parser(response.body());


		
	}

}
