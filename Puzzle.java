import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Puzzle extends JFrame implements ActionListener{
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, next;
	Container cont;
	JLabel jl;
	JPanel jp;
	int count=0;
	int score = 0;
	public Puzzle() {
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		cont =  getContentPane();
		cont.setLayout(new GridLayout(4, 4));
		jl = new JLabel("Hello");
		
		b1 = new JButton("1");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setFont(font1);
		
		b2 = new JButton("2");
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b2.setFont(font1);
		
		b3 = new JButton("3");
		b3.setBackground(Color.BLUE);
		b3.setForeground(Color.WHITE);
		b3.setFont(font1);
		
		b4 = new JButton("4");
		b4.setBackground(Color.BLUE);
		b4.setForeground(Color.WHITE);
		b4.setFont(font1);
		
		b5 = new JButton(" ");
		b5.setBackground(Color.BLUE);
		b5.setForeground(Color.WHITE);
		b5.setFont(font1);
		
		b6 = new JButton("6");
		b6.setBackground(Color.BLUE);
		b6.setForeground(Color.WHITE);
		b6.setFont(font1);
		
		b7 = new JButton("7");
		b7.setBackground(Color.BLUE);
		b7.setForeground(Color.WHITE);
		b7.setFont(font1);
		
		b8 = new JButton("8");
		b8.setBackground(Color.BLUE);
		b8.setForeground(Color.WHITE);
		b8.setFont(font1);
		
		b9 = new JButton("5");
		b9.setBackground(Color.BLUE);
		b9.setForeground(Color.WHITE);
		b9.setFont(font1);
		
		b10 = new JButton();
		b10.setBackground(Color.yellow);
		b10.setForeground(Color.BLACK);
		b10.setFont(font1);
		b10.setLabel("Score");
		b10.setEnabled(false);
		
		b11 = new JButton();
		b11.setBackground(Color.GREEN);
		b11.setForeground(Color.BLACK);
		b11.setFont(font1);
		b11.setLabel("Moves");
		b11.setEnabled(false);
		
		
		next = new JButton("Try Again");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		
		cont.add(b1);
			
		cont.add(b2);
		
		cont.add(b3);
		
		cont.add(b4);
		
		cont.add(b5);
		
		cont.add(b6);
		
		cont.add(b7);
		
		cont.add(b8);
		
		cont.add(b9);

		cont.add(next);
		cont.add(b10);
		cont.add(b11);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		next.addActionListener(this);
		
		setVisible(true);
		setSize(300, 370);
		setResizable(false);
		setTitle("Puzzle Game");
		setLocation(500, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Puzzle();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		b10.setLabel(""+score);
		b11.setLabel(""+count);
		
		
		if(e.getSource()== b1){
			String b = b1.getLabel();
			if(b2.getLabel().equals(" ")){
				b2.setLabel(b);
				b1.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b4.getLabel().equals(" ")){
				b4.setLabel(b);
				b1.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		
		if(e.getSource()== b2){
			String b = b2.getLabel();
			if(b1.getLabel().equals(" ")){
				b1.setLabel(b);
				b2.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b3.getLabel().equals(" ")){
				b3.setLabel(b);
				b2.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b5.getLabel().equals(" ")){
				b5.setLabel(b);
				b2.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		
		if(e.getSource()== b3){
			String b = b3.getLabel();
			if(b2.getLabel().equals(" ")){
				b2.setLabel(b);
				b3.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b6.getLabel().equals(" ")){
				b6.setLabel(b);
				b3.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		if(e.getSource()== b4){
			String b = b4.getLabel();
			if(b1.getLabel().equals(" ")){
				b1.setLabel(b);
				b4.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b5.getLabel().equals(" ")){
				b5.setLabel(b);
				b4.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b7.getLabel().equals(" ")){
				b7.setLabel(b);
				b4.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		if(e.getSource()== b5){
			String b = b5.getLabel();
			if(b2.getLabel().equals(" ")){
				b2.setLabel(b);
				b5.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b4.getLabel().equals(" ")){
				b4.setLabel(b);
				b5.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b6.getLabel().equals(" ")){
				b6.setLabel(b);
				b5.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b8.getLabel().equals(" ")){
				b8.setLabel(b);
				b5.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		if(e.getSource()== b6){
			String b = b6.getLabel();
			if(b3.getLabel().equals(" ")){
				b3.setLabel(b);
				b6.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b5.getLabel().equals(" ")){
				b5.setLabel(b);
				b6.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b9.getLabel().equals(" ")){
				b9.setLabel(b);
				b6.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		if(e.getSource()== b7){
			String b = b7.getLabel();
			if(b4.getLabel().equals(" ")){
				b4.setLabel(b);
				b7.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b8.getLabel().equals(" ")){
				b8.setLabel(b);
				b7.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			
		}
		if(e.getSource()== b8){
			String b = b8.getLabel();
			if(b7.getLabel().equals(" ")){
				b7.setLabel(b);
				b8.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b9.getLabel().equals(" ")){
				b9.setLabel(b);
				b8.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b5.getLabel().equals(" ")){
				b5.setLabel(b);
				b8.setLabel(" ");
				count = count +1;
				score = score+5;
			}
		}
		if(e.getSource()== b9){
			String b = b9.getLabel();
			if(b8.getLabel().equals(" ")){
				b8.setLabel(b);
				b9.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			else if(b6.getLabel().equals(" ")){
				b6.setLabel(b);
				b9.setLabel(" ");
				count = count +1;
				score = score+5;
			}
			
		}
		
		
		if(e.getSource()== next){
			count = count -1;
			b11.setLabel(""+count);
			int input = JOptionPane.showConfirmDialog(null, "Want To start a new Game?." +
					" Your Score is: "+score+" Totals Moves are : "+count);
			if(input == JOptionPane.YES_OPTION){
				String s=b4.getLabel();  
				b4.setLabel(b9.getLabel());  
				b9.setLabel(s);  
				s=b1.getLabel();  
				b1.setLabel(b5.getLabel());  
				b5.setLabel(s);  
				s=b2.getLabel();  
				b2.setLabel(b7.getLabel());  
				b7.setLabel(s);
				
			}
			
		}
		if(b1.getLabel().equals("1") && b2.getLabel().equals("2") && b4.getLabel().equals("3")
				&& b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") 
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8")){
				
			JOptionPane.showMessageDialog(null, "You Won !!! . Your Score is "+score+ " Total Moves are : "+count);
		}
	}
	
}
