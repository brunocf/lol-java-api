import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.endpoint.Champion;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.champion.ChampionDto;
import com.github.brunocf.lolapi.structures.champion.ChampionListDto;


public class Main {

	public static void main(String[] args) {
		try {
			
			Champion ws = new Champion("3c8fba77-6bbe-4f4b-bac1-06afe3b7a7a4");
			ChampionListDto list = ws.getFeeWeekChampionList(Region.NA);
			
			for(ChampionDto c: list.champions){
				System.out.println(c.name);
			}
			
		} catch (HttpGetException e) {
			e.printStackTrace();
		}

	}

}
