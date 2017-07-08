package org.omf.messy.controller

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.TelegramBotAdapter
import okhttp3.OkHttpClient
import org.omf.messy.util.Bot

/**
 * Primary controller for the messy bot.
 */
class BotController {

    private TelegramBot telegramBot = TelegramBotAdapter.buildCustom(Bot.getBotToken(), new OkHttpClient())

    // TODO: Define functionality here


}
