package tr.com.htr.camera.camera;
import java.awt.*;
import java.lang.management.BufferPoolMXBean;
import java.net.Socket;
import java.net.*;
import java.io.IOException;

import lombok.Setter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.tools.jar.CommandLine;

@Component
public class commandRunner implements CommandLineRunner {
    public static final String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\cagri.civici\\exceldeneme.xlsx";



    public static boolean status(String ip){

            String addr = ip;
            int openPort = 22;   // openPort =  22 - ssh, 80 or 443 - webserver, 25 - mailserver etc.
            int timeOutMillis = 2000;

            try {
                try (Socket soc = new Socket()) {
                    soc.connect(new InetSocketAddress(addr, openPort), timeOutMillis);
                }
                return true;
            } catch (IOException ex) {
                return false;
            }


        }


    @Autowired
    @Getter
    @Setter
    private CameraRepository cameraRepository;


    @Override
    public void run(String... args) throws Exception {

        CameraTest c1 = new CameraTest();
        CameraTest c2 = new CameraTest();
        CameraTest c3 = new CameraTest();
        CameraTest c4 = new CameraTest();
        CameraTest c5 = new CameraTest();
        CameraTest c6 = new CameraTest();
        CameraTest c7 = new CameraTest();
        CameraTest c8 = new CameraTest();
        CameraTest c9 = new CameraTest();
        CameraTest c10 = new CameraTest();
        CameraTest c11 = new CameraTest();

        c1.setCameraName("acamera");
        c1.setCameraDesc("TAKIM KAMERA");
        c1.setCameraRev("AA");
        c1.setCameraSerialNO("0000883");
        c1.setCameraIP("172.16.30.91");
//        c1.setCameraPass(status("172.16.30.91"));
        c1.setCameraPass(status(c1.getCameraIP()));
        getCameraRepository().save(c1);

        c2.setCameraName("acamera");
        c2.setCameraDesc("TAKIM KAMERA ");
        c2.setCameraRev("AA");
        c2.setCameraSerialNO("0000884");
        c2.setCameraIP("172.16.30.92");
        //c2.setCameraPass(status("172.16.30.92"));
        c2.setCameraPass(status(c2.getCameraIP()));
        getCameraRepository().save(c2);

        c3.setCameraName("acamera");
        c3.setCameraDesc("TAKIM KAMERA ");
        c3.setCameraRev("AA");
        c3.setCameraSerialNO("0000885");
        c3.setCameraIP("172.16.30.93");
       // c3.setCameraPass(status("172.16.30.93"));
        c3.setCameraPass(status(c3.getCameraIP()));
        getCameraRepository().save(c3);

        c4.setCameraName("acamera");
        c4.setCameraDesc("TAKIM KAMERA ");
        c4.setCameraRev("AA");
        c4.setCameraSerialNO("0000886");
        c4.setCameraIP("172.16.30.94");
//        c4.setCameraPass(status("172.16.30.94"));
        c4.setCameraPass(status(c4.getCameraIP()));
        getCameraRepository().save(c4);

        c5.setCameraName("acamera");
        c5.setCameraDesc("TAKIM KAMERA ");
        c5.setCameraRev("AA");
        c5.setCameraSerialNO("0000887");
        c5.setCameraIP("172.16.30.95");
//      c5.setCameraPass(status("172.16.30.95"));
        c5.setCameraPass(status(c5.getCameraIP()));
        getCameraRepository().save(c5);

        c6.setCameraName("acamera");
        c6.setCameraDesc("TAKIM KAMERA ");
        c6.setCameraRev("AA");
        c6.setCameraSerialNO("0000888");
        c6.setCameraIP("172.16.30.96");
//        c6.setCameraPass(status("172.16.30.96"));
        c6.setCameraPass(status(c6.getCameraIP()));
        getCameraRepository().save(c6);

        c7.setCameraName("acamera");
        c7.setCameraDesc("TAKIM KAMERA ");
        c7.setCameraRev("AA");
        c7.setCameraSerialNO("0000889");
        c7.setCameraIP("172.16.30.97");
//        c7.setCameraPass(status("172.16.30.97"));
        c7.setCameraPass(status(c7.getCameraIP()));
        getCameraRepository().save(c7);

        c8.setCameraName("acamera");
        c8.setCameraDesc("TAKIM KAMERA ");
        c8.setCameraRev("AA");
        c8.setCameraSerialNO("0000890");
        c8.setCameraIP("172.16.30.106");
//        c8.setCameraPass(status("172.16.30.106"));
        c8.setCameraPass(status(c8.getCameraIP()));
        getCameraRepository().save(c8);

        c9.setCameraName("acamera");
        c9.setCameraDesc("TAKIM KAMERA ");
        c9.setCameraRev("AA");
        c9.setCameraSerialNO("0000891");
        c9.setCameraIP("172.16.30.107");
//        c9.setCameraPass(status("172.16.30.107"));
        c9.setCameraPass(status(c9.getCameraIP()));
        getCameraRepository().save(c9);

        c10.setCameraName("acamera");
        c10.setCameraDesc("TAKIM KAMERA");
        c10.setCameraRev("AA");
        c10.setCameraSerialNO("0000892");
        c10.setCameraIP("172.16.30.115");
//        c10.setCameraPass(status("172.16.30.115"));
        c10.setCameraPass(status(c10.getCameraIP()));
        getCameraRepository().save(c10);

        c11.setCameraName("acamera");
        c11.setCameraDesc("TAKIM KAMERA");
        c11.setCameraRev("AA");
        c11.setCameraSerialNO("0000892");
        c11.setCameraIP("172.16.30.117");
//        c11.setCameraPass(status("172.16.30.117"));
        c11.setCameraPass(status(c11.getCameraIP()));
        getCameraRepository().save(c11);

    }

    @Test
    public void camstatusTest(){ //testing accuracy camera status

        CameraTest c1 = new CameraTest();
        CameraTest c2 = new CameraTest();
        CameraTest c3 = new CameraTest();
        CameraTest c4 = new CameraTest();
        CameraTest c5 = new CameraTest();
        CameraTest c6 = new CameraTest();
        CameraTest c7 = new CameraTest();
        CameraTest c8 = new CameraTest();
        CameraTest c9 = new CameraTest();
        CameraTest c10 = new CameraTest();
        CameraTest c11 = new CameraTest();


        assertEquals("1. kamera Hata var ",  true,status("172.16.30.91"));
        assertEquals("2. kamera Hata var  ", true,status("172.16.30.92"));
        assertEquals("3. kamera Hata var  ", true,status("172.16.30.93"));
        assertEquals("4. kamera Hata var  ", true,status("172.16.30.94"));
        assertEquals("5. kamera Hata var  ", true,status("172.16.30.95"));
        assertEquals("6. kamera Hata var  ", true,status("172.16.30.96"));
        assertEquals("7. kamera Hata var  ", true,status("172.16.30.97"));
        assertEquals("8. kamera Hata var  ", true,status("172.16.30.106"));
        assertEquals("9. kamera Hata var  ", true,status("172.16.30.107"));
        assertEquals("10. kamera Hata var  ",true,status("172.16.30.115"));
        assertEquals("11. kamera Hata var  ",true,status("172.16.30.117"));

    }


    @Test
    public void runTester() {   //testing accuracy writing in database
        CameraTest c1 = new CameraTest();
        CameraTest c2 = new CameraTest();
        CameraTest c3 = new CameraTest();
        CameraTest c4 = new CameraTest();
        CameraTest c5 = new CameraTest();
        CameraTest c6 = new CameraTest();
        CameraTest c7 = new CameraTest();
        CameraTest c8 = new CameraTest();
        CameraTest c9 = new CameraTest();
        CameraTest c10 = new CameraTest();
        CameraTest c11 = new CameraTest();

        assertEquals("1. kamera Hata var ",status("172.16.30.91"),c1.isCameraPass());
        assertEquals("2. kamera Hata var  ",status("172.16.30.92"),c2.isCameraPass());
        assertEquals("3. kamera Hata var  ",status("172.16.30.93"),c3.isCameraPass());
        assertEquals("4. kamera Hata var  ",status("172.16.30.94"),c4.isCameraPass());
        assertEquals("5. kamera Hata var  ",status("172.16.30.95"),c5.isCameraPass());
        assertEquals("6. kamera Hata var  ",status("172.16.30.96"),c6.isCameraPass());
        assertEquals("7. kamera Hata var  ",status("172.16.30.97"),c7.isCameraPass());
        assertEquals("8. kamera Hata var  ",status("172.16.30.106"),c8.isCameraPass());
        assertEquals("9. kamera Hata var  ",status("172.16.30.107"),c9.isCameraPass());
        assertEquals("10. kamera Hata var  ",status("172.16.30.115"),c10.isCameraPass());
        assertEquals("11. kamera Hata var  ",status("172.16.30.117"),c11.isCameraPass());
    }

}
