package com.zakariaahnaf.collepsingtoolber.utils;

//import android.app.AlertDialog;
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.view.Gravity;
//import android.view.LayoutInflater;
//import android.view.View;
//
//import androidx.appcompat.widget.AppCompatButton;
//
//import com.zakariaahnaf.collepsingtoolber.R;
//
//
//public class NetworkChangeListener extends BroadcastReceiver {
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        if (!Common.isConnectedToInternet(context)) { //Internet is not Connected
//            AlertDialog.Builder builder = new AlertDialog.Builder(context);
//            View layout_dialog = LayoutInflater.from(context).inflate(R.layout.dialog_custom, null) ;
//            builder. setView(layout_dialog);
//            AppCompatButton btnRetry = layout_dialog.findViewById(R.id.btn_accept);
//
//            //Show dialog
//            AlertDialog dialog = builder.create();
//            dialog.show();
//            dialog.setCancelable(false);
//            dialog.getWindow().setGravity(Gravity.CENTER);
//            btnRetry.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    dialog.dismiss();
//                    onReceive(context, intent);
//                }
//            });
//        }
//    }
//}