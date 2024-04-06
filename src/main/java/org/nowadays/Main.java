package org.nowadays;

public class Main {
    private static final String BOT_TOKEN = "6701995256:AAGwXl3nUpRLs5dQK9QzwIlgbI_tL-nNbPw";
    private static final String PROVIDER_TOKEN = "381764678:TEST:82145";
    public static void main(String[] args) {
        TelegramBotApp app = TelegramBotApp.builder().botToken(BOT_TOKEN).providerToken(PROVIDER_TOKEN).build();

        app.run();
    }
}