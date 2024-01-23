package br.com.ada.pooii.aula6.ExercicioTrade;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TradingSystem {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");
    private boolean isAfterWorkingHours(Transaction transaction){
        LocalDateTime.of(2024, 1, 19,22, 0, 0)
    }
    void executeTrade(Transaction transaction){
        if(transaction.getAmount().compareTo(MAX_DAILY_LIMIT) >= 0){
            throw new RuntimeException("Invalid Transaction: MaxLimit");
        }
        if(isAfterWorkingHours(transaction)){
            throw new RuntimeException("Invalid Transaction After Working Hours");
        }
        efetuarTransaction(transaction);
    }

    private void efetuarTransaction(Transaction transaction){
        System.out.println("Transaction succeed: " + transaction);
    }
}
