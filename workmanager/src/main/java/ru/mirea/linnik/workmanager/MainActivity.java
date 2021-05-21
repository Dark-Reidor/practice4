package ru.mirea.linnik.workmanager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkRequest uploadWorkRequest =
                new OneTimeWorkRequest.Builder(ru.mirea.linnik.workmanager.UploadWorker.class)
                        .build();
        WorkManager
                .getInstance(this)
                .enqueue(uploadWorkRequest);
    }
}
