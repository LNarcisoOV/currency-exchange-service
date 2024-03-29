package com.udemy.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
}
