import java.util.Map;

import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.endpoint.Champion;
import com.github.brunocf.lolapi.endpoint.Game;
import com.github.brunocf.lolapi.endpoint.League;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.champion.ChampionDto;
import com.github.brunocf.lolapi.structures.champion.ChampionListDto;
import com.github.brunocf.lolapi.structures.game.GameDto;
import com.github.brunocf.lolapi.structures.game.RecentGamesDto;
import com.github.brunocf.lolapi.structures.league.LeagueDto;


public class Main {

	public static void main(String[] args) {
		try {
			
			Game ws = new Game("3c8fba77-6bbe-4f4b-bac1-06afe3b7a7a4");
			
			RecentGamesDto map = ws.getSummonerRecentGames(Region.EUNE, 40233237);
			
			for(GameDto c: map.games){
				System.out.println(c.gameId);
			}
			
		} catch (HttpGetException e) {
			e.printStackTrace();
		}

	}

}
