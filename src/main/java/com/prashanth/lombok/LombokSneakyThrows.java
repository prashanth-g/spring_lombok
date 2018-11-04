package com.prashanth.lombok;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.InputStream;


public class LombokSneakyThrows {

    class SneakyRunnable implements Runnable {
        @SneakyThrows
        public void run() {
            throw new InterruptedException();
        }
    }

    @SneakyThrows
    void readFile() {
        InputStream inputStream = new FileInputStream("test.txt");
    }
}
