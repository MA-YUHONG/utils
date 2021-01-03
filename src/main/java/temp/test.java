package temp;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "确认对话框", JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION) {

//    JOptionPane.showMessageDialog(new JFrame(),"已删除");

            System.out.println("执行确定的操作");



        } else if (n == JOptionPane.NO_OPTION) {

//    JOptionPane.showMessageDialog(new JFrame(),"已取消");



            System.out.println("执行取消的操作");

        }
    }
}
