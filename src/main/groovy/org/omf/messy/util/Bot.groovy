package org.omf.messy.util

import com.pengrad.telegrambot.model.Update
import org.apache.commons.lang3.StringUtils

class Bot {

    private Bot(){}

    String getBotUsername() {
        return "sdfsdfsdtwyitykgdfsdgsdhs_bot"
    }

    String getBotToken() {
        return "382865603:AAF83T2rEGIy0e95sTbWrfn-ucaEWGSVnbM"
    }

    void onUpdateReceived(Update update) {
        if (StringUtils.isNotBlank(update.message())) {
            // TODO: do something with this
        }
    }
}
