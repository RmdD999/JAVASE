package ThreadDemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//exe multi
public class ThreadDemo02 extends Thread{

    private String url;
    private String name;

    public ThreadDemo02(String url, String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
//        super.run();
        WebDownloader wdl = new WebDownloader();
        wdl.download(url,name);
        System.out.println("downloaded file name is:"+name);
    }

    public static void main(String[] args) {
        ThreadDemo02 td1 = new ThreadDemo02("https://flashlight.nitecore.cn/Uploads/Album/20181112/original_img/201811121046192742.png",
                "1.png");
        ThreadDemo02 td2 = new ThreadDemo02("https://flashlight.nitecore.cn/Uploads/Album/20181112/original_img/201811121046192742.png",
                "2.png");
        ThreadDemo02 td3 = new ThreadDemo02("https://flashlight.nitecore.cn/Uploads/Album/20181112/original_img/201811121046192742.png",
                "3.png");
        td1.start();
        td2.start();
        td3.start();
    }
}

class WebDownloader{
    public void download(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO downloader exceptions.");
        }
    }
}
