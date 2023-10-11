package com.universal.containx.service;

import java.util.List;

import com.universal.containx.model.CoinTransaction;
import com.universal.containx.model.User;




public interface CoinTransactionsService {
	List<CoinTransaction> findByUser(User user);

}
