package 屏幕截图;

   

import java.awt.Rectangle;  

import java.awt.Robot;   

import java.awt.image.BufferedImage;  

import java.io.File;  

  

import javax.imageio.ImageIO;


/**
 * 截取任意位置，任意大小图片
 */
public class snapFree {

    public static void main(String[] args) {

        //"C:\\sally\\bootstrap栅格"是根据自己随意找的一个图片形式，"png"是图片的格式
        snapFree cam=new snapFree("D:\\temp\\java指定截图","jpg");
        cam.snapshot(200,200,300,400);

    }

    private String fileName;
    static int serialNum=0;
    private String imageFormat;//图像文件的格式

    public snapFree(String s,String format) {
        fileName=s;
        imageFormat=format;  

    }  

    /**
     * 对屏幕进行拍照
     *
     * **/
    public void snapshot(int x,int y,int width,int Height){
        try {
            //拷贝屏幕到一个BufferedImage对象screenshot
            BufferedImage screenshot=(new Robot()).createScreenCapture(
                    new Rectangle(x,y,width,Height));
            serialNum++;
            //根据文件前缀变量和文件格式变量，自动生成文件名
            String name=fileName+String.valueOf(serialNum)+"."+imageFormat;
            System.out.println(name);
            File f=new File(name);
            System.out.println("Save File-"+name);
            //将screenshot对象写入图像文件
            ImageIO.write(screenshot, imageFormat, f);
            System.out.println("截图完成");

        } catch (Exception e) {
            System.out.println(e);
        }  

    }  


}