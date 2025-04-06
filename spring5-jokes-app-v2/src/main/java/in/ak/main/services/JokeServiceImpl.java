package in.ak.main.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chunckNorrisQuotes;
	
	public JokeServiceImpl(ChuckNorrisQuotes chunckNorrisQuotes) {
		super();
		this.chunckNorrisQuotes = chunckNorrisQuotes;
	}



	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chunckNorrisQuotes.getRandomQuote();
	}

}
