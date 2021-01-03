package robot模拟机器人;

import java.awt.*;
import java.awt.event.KeyEvent;

public class test {
    public static void main(String[] args) throws AWTException {

        mouseMoveToXY(50,50);
        automaticFullScreen();
        System.out.println("66");
    }


    /**
     * 自动将鼠标移动到指定的位置
     * 如果参数x与y为null,则默认将鼠标放在屏幕右侧中间隐藏
     *
     * @param x：x坐标 ,左上角 为0----设定值超过屏幕分辨率也没关系
     * @param y：y坐标 ,左上角 为0----设定值超过屏幕分辨率也没关系
     */
    public static final void mouseMoveToXY(Integer x, Integer y) throws AWTException {
        Robot robot=new Robot();
            robot.mouseMove(x, y);
            robot.delay(100);

    }


    /**
     * ，模拟按 WIN+D
     * 切记当同时按有顺序的组合键时，应该在间隔处添加细微的延时，否则容易引起失败(因为按键速度太快，导致混乱)
     */
    public static void automaticFullScreen() {
        try {
            /**clickScreenByXY(null, null);*/
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_D);
            robot.delay(200);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
//    编号	按键事件	描述	对应数值
//1	KeyEvent.VK_PAGE_UP	PgUp （下一页）	33
//        2	KeyEvent.VK_PAGE_DOWN	PgDn（下一页）	34
//        3	KeyEvent.VK_HOME	Home 键	36
//        4	KeyEvent.VK_END	End 键	35
//        5	KeyEvent.VK_CONTROL	Ctrl 键	17
//        6	KeyEvent.VK_ALT	Alt 键	18
//        7	KeyEvent.VK_SPACE	空格 键	32
//        8	KeyEvent.VK_A	字母 A，VK_A 到 VK_Z 与 ASCII 的 ‘A’ 到 ‘Z’ (0x41 - 0x5A)  对应	65-90
//        9	KeyEvent.VK_0	数字 0，VK_0 到 VK_9 与 ASCII 的 ‘0’ 到 ‘9’ (0x30 - 0x39) 对应	48-57
//        10	KeyEvent.VK_F1	F1 键，VK_F1 到 VK_F12 对应键盘上的 F1 到 F12 键	112-123
//        11	KeyEvent.VK_BACK_SPACE	Backspace 键	8
//        12	KeyEvent.VK_DOWN	非数字键盘向下箭头键	40
//        13	KeyEvent.VK_LEFT	非数字键盘向左箭头键	37
//        14	KeyEvent.VK_UP	非数字键向上箭头键	38
//        15	KeyEvent.VK_RIGHT	非数字键向右箭头键	39
//        16	KeyEvent.VK_ENTER	回车键	10
//        17	KeyEvent.VK_ESCAPE	Esc 建	27
//        18	KeyEvent.VK_INSERT	Insert 键	155
//        19	KeyEvent.VK_SHIFT	Shift 键	16
//        20	KeyEvent.VK_TAB	Tab 键	9
//        21	KeyEvent.VK_WINDOWS	"Windows" 键	524