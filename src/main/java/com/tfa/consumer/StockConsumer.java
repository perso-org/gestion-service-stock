package com.tfa.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.tfa.dto.EvenementCommande;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StockConsumer {

	@KafkaListener(topics = "${apache.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
	public void consommerStock(EvenementCommande commande) {
		log.info("Commande prise en charge {}",commande);
	}
}
