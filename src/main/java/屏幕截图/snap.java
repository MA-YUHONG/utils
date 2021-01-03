package 屏幕截图;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.Robot;

import java.awt.Toolkit;
import java.io.IOException;

/**
 * 普通截图
 */
public class snap {

    private String fileName;
    static int serialNum = 0;
    private String imageFormat;//图像文件的格式
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();


    public snap(String s, String format) {

        fileName = s;

        imageFormat = format;

    }

    /**
     * 对屏幕进行拍照
     **/

    public void snapshot() {

        try {

//拷贝屏幕到一个BufferedImage对象screenshot

            BufferedImage screenshot = (new Robot()).createScreenCapture(
                    new Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight()));
            serialNum++;

//根据文件前缀变量和文件格式变量，自动生成文件名

            String name = fileName + String.valueOf(serialNum) + "." + imageFormat;
            System.out.println(name);
            File f = new File(name);
            System.out.println("Save File-" + name);

//将screenshot对象写入图像文件
            ImageIO.write(screenshot, imageFormat, f);
            System.out.println("..Finished");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void snap(int height,int width,String filename) {

        try {
            Robot robot=new Robot();
            //根据指定的区域抓取屏幕的指定区域，1300是长度，800是宽度。
            BufferedImage bi=robot.createScreenCapture(new Rectangle(height,width));
            //把抓取到的内容写到一个jpg文件中
            ImageIO.write(bi, "jpg", new File(filename+".png"));

        } catch (AWTException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
    public static void main(String[] args) {


        snap cam = new snap("D:\\temp\\java截图", "png");
        //全屏截图
        cam.snapshot();
        //指定大小截图
        cam.snap(200,200,"D:\\temp\\jav截图");
    }
}
