package org.omf.messy.bot

import org.telegram.telegrambots.api.methods.send.SendMessage
import org.telegram.telegrambots.api.objects.Update
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.exceptions.TelegramApiException

class Bot extends TelegramLongPollingBot {

    private static final String TOKEN = "382865603:AAF83T2rEGIy0e95sTbWrfn-ucaEWGSVnbM"
    private static final String USERNAME = "sdfsdfsdtwyitykgdfsdgsdhs_bot"

    @Override
    String getBotUsername() {
        return USERNAME
    }

    @Override
    void onUpdateReceived(final Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage().setChatId(update.getMessage().getChatId())
                    .setText(update.getMessage().getText())
            try {
                sendMessage(message);
            } catch (TelegramApiException e) {
                e.printStackTrace()
            }
        }
    }

    @Override
    String getBotToken() {
        return TOKEN
    }
}
