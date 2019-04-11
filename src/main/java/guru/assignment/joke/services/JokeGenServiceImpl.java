package guru.assignment.joke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeGenServiceImpl implements JokeGenService{

	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public JokeGenServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String jokeGrabber() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
