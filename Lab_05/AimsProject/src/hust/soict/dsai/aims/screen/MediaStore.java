package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.*;

public class MediaStore extends JPanel {
	private Media media;
	public MediaStore (Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN,20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+ media.getCost()+ "$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		container.add(new JButton("Add to cart"));
		if (media instanceof Playable) {
			container.add(new JButton("Play"));
			
		}
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	private class ClickedListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) { 
			try {
				media.play();
			} catch (PlayerException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage().toString(), "Alert", JOptionPane.ERROR_MESSAGE);
				e1.printStackTrace();
			}
		}
	}
}
	

