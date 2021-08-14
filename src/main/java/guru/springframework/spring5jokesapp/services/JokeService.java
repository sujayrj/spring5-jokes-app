package guru.springframework.spring5jokesapp.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    String getJoke();
}
