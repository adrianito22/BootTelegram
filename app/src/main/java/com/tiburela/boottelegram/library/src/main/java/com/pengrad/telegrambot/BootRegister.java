package com.tiburela.boottelegram.library.src.main.java.com.pengrad.telegrambot;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ForceReply;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetWebhook;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.SendResponse;

import java.io.File;
import java.io.IOException;

public class BootRegister {

  //  TelegramBot bot = new TelegramBot("BOT_TOKEN");



    private void botter(String id){

        TelegramBot bot = new TelegramBot("5762677106:AAFc-tNCZyZnRuRa7MHyRZeLESDmOj84EuE");


        SendMessage request = new SendMessage(id, "hola")
                .parseMode(ParseMode.HTML)
                .disableWebPagePreview(true)
                .disableNotification(true)
                .replyToMessageId(1)
                .replyMarkup(new ForceReply());



        long chatId = update.message().chat().id();
        SendResponse response = bot.execute(new SendMessage(chatId, "Hello!"));


        SendResponse sendResponse = bot.execute(request);
        boolean ok = sendResponse.isOk();
        Message message = sendResponse.message();
        GetUpdates getUpdates = new GetUpdates().limit(100).offset(0).timeout(0);

       // long chatId = update.message().chat().id();
      //  SendResponse response = bot.execute(new SendMessage(chatId, "Hello!"));





    }






    }
