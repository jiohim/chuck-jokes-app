package pl.jiohim.chuckjokesapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeStringService implements JokeService {


    private final ChuckNorrisQuotes chuckNorrisQuotes;


    public JokeStringService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String randomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
