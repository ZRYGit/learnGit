package com.game.plane;

import javax.swing.JFrame;

/**
 * ��Ϸ���
 * @author zry
 *
 */

public class GameFrame extends JFrame{
	public void InitFrame(){
			this.setTitle("��ʼ��");
			this.setVisible(true);
			this.setSize(500, 500);
			this.setLocation(300, 300);
			this.addWindowListener(new WindowAdapter());
	}
	public static void main(String[] args){
		GameFrame star = new GameFrame();
		star.InitFrame();

		
	}
}
