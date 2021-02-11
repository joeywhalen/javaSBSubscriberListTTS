package com.tts.subscriberlisttts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.subscriberlisttts.model.Subscriber;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

}
