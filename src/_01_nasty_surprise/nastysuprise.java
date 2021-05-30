package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysuprise implements ActionListener {
	JButton one = new JButton();
	JButton two = new JButton();
public static void main(String[] args) {
	 new nastysuprise().method();
	
	
}

void method() {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	
	f.setVisible(true);
	f.add(p);
	p.add(one);
	p.add(two);
	f.pack();
	one.setText("Trick");
	two.setText("Treat");
	
	
	one.addActionListener(this);
	two.addActionListener(this);
	
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==one) {
		showPictureFromTheInternet("https://thumbs-prod.si-cdn.com/7UodV-s6j5aEVfrYwg5KQ26oBLY=/fit-in/1600x0/https://public-media.si-cdn.com/filer/d6/93/d6939718-4e41-44a8-a8f3-d13648d2bcd0/c3npbx.jpg");
	}
	if(e.getSource()== two) {
		showPictureFromTheInternet("https://i.pinimg.com/originals/4b/f1/d3/4bf1d36cdb4993fcd01769c6161d79ca.jpg");
	}
	
	
	
	
}
}
