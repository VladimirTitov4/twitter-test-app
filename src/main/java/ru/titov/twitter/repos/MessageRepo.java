package ru.titov.twitter.repos;

import org.springframework.data.repository.CrudRepository;
import ru.titov.twitter.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
