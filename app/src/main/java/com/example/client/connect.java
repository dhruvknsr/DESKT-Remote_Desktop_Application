package com.example.client;

import android.os.AsyncTask;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class connect extends AsyncTask<String,Void,Void>{

    String message;
    Socket s;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {
            String message = voids[0];
        try {
            s = new Socket("192.168.0.100", 13000);
            //byte[] data = message.getBytes(StandardCharsets.US_ASCII); - [convert string into bytes]

            pw = new PrintWriter(s.getOutputStream());


            //OutputStream outputStream = s.getOutputStream();
            //pw.write(data);

            pw.write(message);
            pw.flush();
            s.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    }
