package com.tiburela.boottelegram.library.src.main.java.com.pengrad.telegrambot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class SMSreceiver extends BroadcastReceiver {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle extras = intent.getExtras();

        String strMessage = "";

        if ( extras != null )
        {
            Object[] smsextras = (Object[]) extras.get( "pdus" );

            for ( int i = 0; i < smsextras.length; i++ )
            {
                SmsMessage smsmsg = SmsMessage.createFromPdu((byte[])smsextras[i]);

                String strMsgBody = smsmsg.getMessageBody().toString();
                String strMsgSrc = smsmsg.getOriginatingAddress();

                strMessage += "SMS from " + strMsgSrc + " : " + strMsgBody;

                Log.i("foregttss", strMessage);
            }

        }

    }

}