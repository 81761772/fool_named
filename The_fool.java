package fool_named;

import java.awt.*;
import javax.swing.*;

public class The_fool extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public The_fool(String[] line){
		setTitle("");
		setSize(200,150);
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		String str1 = line[line.length-1];
		JLabel jl1 = new JLabel("      "+str1);
		con.add(jl1,BorderLayout.NORTH);
		String str2 = "           ��ϲ�ɺأ���ϲ�ɺ�";
		JLabel jl2 = new JLabel(str2);
		con.add(jl2,BorderLayout.SOUTH);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((width-windowWidth)/2,(height-windowHeight)/2);
	}
}
