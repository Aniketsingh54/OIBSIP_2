package numbers;
import RoundButton;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class RoundButton extends JButton {
    RoundButton(String text) {
        super(text);
        setPreferredSize(new Dimension(25, 25)); // Adjust the size as per your requirement
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
        g2.setColor(Color.green); // Adjust the color of the button text
        g2.drawString(getText(), getWidth() / 2 - g2.getFontMetrics().stringWidth(getText()) / 2,
                getHeight() / 2 + g2.getFontMetrics().getHeight() / 4);
        g2.dispose();
    }
}

public class Main 
{
    static public int secretNumber,tries=0;
    public static void main(String[] args) 
    {
        Random ran=new Random();
        secretNumber=ran.nextInt(100);
        // System.out.println(secretNumber);
        ImageIcon playicon=new ImageIcon("play.jpg");
        ImageIcon map=new ImageIcon("map.jpg");
        ImageIcon arrival =new ImageIcon("arrival.jpg");
        ImageIcon chestlook=new ImageIcon("just_before.jpg");
        ImageIcon chestmain=new ImageIcon("chesting.png");
        ImageIcon button=new ImageIcon("playgod.png");
        ImageIcon up = new ImageIcon("up.png");
        ImageIcon down = new ImageIcon("down.png");
        ImageIcon lucky=new ImageIcon("lucky.jpg");
        ImageIcon unlucky=new ImageIcon("unlucky.png");

        Border border=BorderFactory.createLineBorder(new Color(0,0,0,98));
        Border red =BorderFactory.createLineBorder(new Color(255,0,0));
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        Font relax=new Font("Comic Sans MS",Font.BOLD,30);
        Font square=new Font("Agency FB",Font.BOLD,30);
        Font horror=new Font("Chiller",Font.BOLD,30);
        Font wine=new Font("Harrington",Font.BOLD,30);



        //play 

        JFrame play = new JFrame("Treasure Hunt");
        play.setIconImage(playicon.getImage());
        play.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image originalImage = playicon.getImage();
        int originalWidth = playicon.getIconWidth();
        int originalHeight = playicon.getIconHeight();
        int newWidth =(int) (originalWidth *0.67);    
        int newHeight =(int) (originalHeight *0.67) ;  
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedIcon);
        play.getContentPane().add(imageLabel);
        play.pack();
        play.setResizable(false);
        play.setLocationRelativeTo(null);
        
        JLabel head= new JLabel("GUESS THE NUMBER");
        head.setFont(wine);
        head.setBounds(120,40,400,100);
        imageLabel.add(head);

        Image originalImage0 = button.getImage();
        int originalWidth0 = button.getIconWidth();
        int originalHeight0 = button.getIconHeight();
        int newWidth0 =(int) (originalWidth0*0.8);    
        int newHeight0 =(int) (originalHeight0*0.8) ;  
        Image resizedImage0 = originalImage0.getScaledInstance(newWidth0, newHeight0, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon0 = new ImageIcon(resizedImage0);
        JButton playBtn=new JButton(resizedIcon0);
        playBtn.setBounds(215,240,resizedIcon0.getIconWidth(),resizedIcon0.getIconHeight());
        playBtn.setBorder(border);
        playBtn.setCursor(cursor);

        imageLabel.add(playBtn);
        play.setVisible(true);
                
        //map

        JFrame scene1 = new JFrame("Treasure Hunt");
        scene1.setIconImage(map.getImage());
        scene1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image originalImage1 = map.getImage();
        int originalWidth1 = map.getIconWidth();
        int originalHeight1 = map.getIconHeight();
        int newWidth1 = (int)(originalWidth1*0.6);    
        int newHeight1 = (int)(originalHeight1*0.6);  
        Image resizedImage1 = originalImage1.getScaledInstance(newWidth1, newHeight1, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon1 = new ImageIcon(resizedImage1);
        JLabel imageLabel1 = new JLabel(resizedIcon1);
        JLabel maps=new JLabel("Map");
        maps.setFont(square);
        maps.setBounds(415,5,200,50);
        scene1.getContentPane().add(imageLabel1);
        scene1.pack();
        imageLabel1.add(maps);

        scene1.setResizable(false);
        scene1.setLocationRelativeTo(null);
        // scene1.setVisible(true);


        //arrival
        JFrame scene2 = new JFrame("Treasure Hunt");
        scene2.setIconImage(arrival.getImage());
        scene2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image originalImage2 = arrival.getImage();
        int originalWidth2 = arrival.getIconWidth();
        int originalHeight2 = arrival.getIconHeight();
        int newWidth2 = (int)(originalWidth2*1.5);    
        int newHeight2 = (int)(originalHeight2*1.5);  
        Image resizedImage2 = originalImage2.getScaledInstance(newWidth2, newHeight2, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
        JLabel imageLabel2 = new JLabel(resizedIcon2);

        scene2.getContentPane().add(imageLabel2);
        scene2.pack();
        scene2.setResizable(false);
        scene2.setLocationRelativeTo(null);
        JPanel scene2panel=new JPanel();
        scene2panel.setLayout(null);
        scene2panel.setBounds(150,80,300,335);
        scene2panel.setBackground(new Color(0,0,0,80));
        JLabel scene2Text1=new JLabel("In the heart of the Pacific");
        JLabel scene2Text2=new JLabel("Ocean lies Isla Aventura, ");
        JLabel scene2Text3=new JLabel("a mythical island holding ");
        JLabel scene2Text4=new JLabel("a legendary treasure. You, ");
        JLabel scene2Text5=new JLabel("a determined treasure hunter,");
        JLabel scene2Text6=new JLabel(" sets foot on the island");
        JLabel scene2Text7=new JLabel("and discovers a series of");
        JLabel scene2Text8=new JLabel("numerical codes.");
        scene2Text1.setFont(horror);
        scene2Text1.setBounds(0,15,300,30);
        scene2panel.add(scene2Text1);
        imageLabel2.add(scene2panel);

        scene2Text2.setFont(horror);
        scene2Text2.setBounds(0,55,300,30);
        scene2panel.add(scene2Text2);
        imageLabel2.add(scene2panel);

        scene2Text3.setFont(horror);
        scene2Text3.setBounds(0,95,300,30);
        scene2panel.add(scene2Text3);
        imageLabel2.add(scene2panel);

        scene2Text4.setFont(horror);
        scene2Text4.setBounds(0,135,300,30);
        scene2panel.add(scene2Text4);
        imageLabel2.add(scene2panel);

        scene2Text5.setFont(horror);
        scene2Text5.setBounds(0,175,300,30);
        scene2panel.add(scene2Text5);
        imageLabel2.add(scene2panel);

        scene2Text6.setFont(horror);
        scene2Text6.setBounds(0,215,300,30);
        scene2panel.add(scene2Text6);
        imageLabel2.add(scene2panel);

        scene2Text7.setFont(horror);
        scene2Text7.setBounds(0,255,300,30);
        scene2panel.add(scene2Text7);
        imageLabel2.add(scene2panel);

        scene2Text8.setFont(horror);
        scene2Text8.setBounds(0,295,300,30);
        scene2panel.add(scene2Text8);

        scene2Text1.setHorizontalAlignment(JLabel.CENTER);
        scene2Text2.setHorizontalAlignment(JLabel.CENTER);
        scene2Text3.setHorizontalAlignment(JLabel.CENTER);
        scene2Text4.setHorizontalAlignment(JLabel.CENTER);
        scene2Text5.setHorizontalAlignment(JLabel.CENTER);
        scene2Text6.setHorizontalAlignment(JLabel.CENTER);
        scene2Text7.setHorizontalAlignment(JLabel.CENTER);
        scene2Text8.setHorizontalAlignment(JLabel.CENTER);
        imageLabel2.add(scene2panel);
        //Chest look

        JFrame scene3 = new JFrame("Treasure Hunt");
        scene3.setIconImage(chestlook.getImage());
        scene3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image originalImage3 = chestlook.getImage();
        int originalWidth3 = chestlook.getIconWidth();
        int originalHeight3 = chestlook.getIconHeight();
        int newWidth3 = originalWidth3 / 2;    
        int newHeight3 = originalHeight3 /2;  
        Image resizedImage3 = originalImage3.getScaledInstance(newWidth3, newHeight3, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon3 = new ImageIcon(resizedImage3);
        JLabel imageLabel3 = new JLabel(resizedIcon3);

        JPanel pane=new JPanel();
        pane.setBounds(400,80,170,50);
        pane.setLayout(null);
        pane.setBackground(new Color(255,255,255,95));
        JLabel lock=new JLabel("Locked Chest");
        lock.setBounds(20,0,170,50);
        lock.setFont(square);
        scene3.getContentPane().add(imageLabel3);
        scene3.pack();
        pane.add(lock);
        imageLabel3.add(pane);
        scene3.setResizable(false);
        scene3.setLocationRelativeTo(null);

        //Chest main
        
        JFrame scene4 = new JFrame("Treasure Hunt");
        scene4.setIconImage(chestmain.getImage());
        scene4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image originalImage4 = chestmain.getImage();
        int originalWidth4 = chestmain.getIconWidth();
        int originalHeight4 = chestmain.getIconHeight();
        int newWidth4 = (int)(originalWidth4 *0.5);    
        int newHeight4 =(int) (originalHeight4 *0.5);  
        Image resizedImage4 = originalImage4.getScaledInstance(newWidth4, newHeight4, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon4 = new ImageIcon(resizedImage4);
        JLabel imageLabel4 = new JLabel(resizedIcon4);

        scene4.getContentPane().add(imageLabel4);
        scene4.pack();
        scene4.setResizable(false);

        JTextField enter =new JTextField();
        enter.setBounds(80,200,100,100);
        enter.setFont(new Font("Arial",Font.CENTER_BASELINE,80));
        enter.setBackground(new Color(124, 227, 253));
        enter.setBorder(border);
        
        imageLabel4.add(enter);
        scene4.setLocationRelativeTo(null);

        JPanel round=new JPanel();
        round.setBounds(370,50,210,50);
        round.setLayout(null);
        round.setBackground(new Color(4, 91, 112));
        RoundButton b1=new RoundButton("");
        b1.setBounds(5,10,25,25);
        b1.setBackground(Color.green);
        b1.setBorder(null);
        RoundButton b2=new RoundButton("");
        b2.setBounds(40,10,25,25);
        b2.setBackground(Color.green);
        b2.setBorder(null);

        RoundButton b3=new RoundButton("");
        b3.setBounds(75,10,25,25);
        b3.setBackground(Color.green);
        b3.setBorder(null);

        RoundButton b4=new RoundButton("");
        b4.setBounds(110,10,25,25);
        b4.setBackground(Color.green);
        b4.setBorder(null);

        RoundButton b5=new RoundButton("");
        b5.setBounds(145,10,25,25);
        b5.setBackground(Color.green);
        b5.setBorder(null);

        RoundButton b6=new RoundButton("");
        b6.setBounds(180,10,25,25);
        b6.setBackground(Color.green);
        b6.setBorder(null);

        round.add(b1);
        round.add(b2);
        round.add(b3);
        round.add(b4);
        round.add(b5);
        round.add(b6);


        Image originalImage7 = up.getImage();
        int originalWidth7 = up.getIconWidth();
        int originalHeight7 = up.getIconHeight();
        int newWidth7 = (int)(originalWidth7*0.6);    
        int newHeight7 = (int)(originalHeight7*0.6);  
        Image resizedImage7 = originalImage7.getScaledInstance(newWidth7, newHeight7, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon7 = new ImageIcon(resizedImage7);
        JLabel uparrow = new JLabel(resizedIcon7);
        uparrow.setBounds(700,170,resizedIcon7.getIconWidth(),resizedIcon7.getIconHeight());
        uparrow.setVisible(false);
        JLabel guessup=new JLabel("Guess Higher");
        guessup.setBounds(693,280,200,100);
        guessup.setFont(square);
        guessup.setForeground(Color.black);
        guessup.setVisible(false);

        Image originalImage8 = down.getImage();
        int originalWidth8 = down.getIconWidth();
        int originalHeight8 = down.getIconHeight();
        int newWidth8 = (int)(originalWidth8*0.6);    
        int newHeight8 = (int)(originalHeight8*0.6);  
        Image resizedImage8 = originalImage8.getScaledInstance(newWidth8, newHeight8, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon8 = new ImageIcon(resizedImage8);
        JLabel downarrow = new JLabel(resizedIcon8);
        downarrow.setBounds(700,170,resizedIcon8.getIconWidth(),resizedIcon8.getIconHeight());
        downarrow.setVisible(false);
        JLabel guessdown=new JLabel("Guess Lower");
        guessdown.setBounds(693,280,200,100);
        guessdown.setFont(square);
        guessdown.setForeground(Color.black);
        guessdown.setVisible(false);

        JLabel guess= new JLabel("Your Guess ");
        guess.setFont(square);
        guess.setForeground(Color.black);
        guess.setBounds(73,100,200,100);
        imageLabel4.add(guess);
        imageLabel4.add(round);
        imageLabel4.add(uparrow);
        imageLabel4.add(guessup);
        imageLabel4.add(downarrow);
        imageLabel4.add(guessdown);

        JPanel guessPanel =new JPanel();
        guessPanel.setBounds(150,400,600,100);
        guessPanel.setBackground(new Color(124, 227, 253,80));
        guessPanel.setLayout(null);
    
        JLabel guessText = new JLabel("You have to Enter a Numeric code between 0 to 99 ");
        JLabel guessText1 = new JLabel(" to open this treasure ");
        guessText.setBounds(0,0,600,60);
        guessText.setHorizontalAlignment(JLabel.CENTER);
        guessText.setFont(square);
        guessText.setForeground(Color.black);
        guessPanel.add(guessText);
        imageLabel4.add(guessPanel);
        guessText1.setBounds(0,30,600,60);
        guessText1.setHorizontalAlignment(JLabel.CENTER);
        guessText1.setFont(square);
        guessText1.setForeground(Color.black);
        guessPanel.add(guessText1);
        imageLabel4.add(guessPanel);

        JFrame scene5 = new JFrame("Treasure Hunt");
        scene5.setIconImage(chestmain.getImage());
        scene5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image originalImage5 = lucky.getImage();
        int originalWidth5 = lucky.getIconWidth();
        int originalHeight5 = lucky.getIconHeight();
        int newWidth5 = (int)(originalWidth5 *0.5);    
        int newHeight5 =(int) (originalHeight5 *0.5);  
        Image resizedImage5 = originalImage5.getScaledInstance(newWidth5, newHeight5, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon5 = new ImageIcon(resizedImage5);
        JLabel imageLabel5 = new JLabel(resizedIcon5);

        
        JLabel win =new JLabel("Congratulations,You Won!!!");
        win.setFont(relax);
        win.setBounds(350,50,400,50);
        win.setForeground(Color.black);

        scene5.getContentPane().add(imageLabel5);
        scene5.pack();
        scene5.setResizable(false);
        scene5.setLocationRelativeTo(null);

        imageLabel5.add(win);


        JFrame scene6 = new JFrame("Treasure Hunt");
        scene6.setIconImage(chestmain.getImage());
        scene6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image originalImage6 = unlucky.getImage();
        int originalWidth6 = unlucky.getIconWidth();
        int originalHeight6 = unlucky.getIconHeight();
        int newWidth6 = (int)(originalWidth6 *0.6);    
        int newHeight6 =(int) (originalHeight6 *0.6);  
        Image resizedImage6 = originalImage6.getScaledInstance(newWidth6, newHeight6, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon6 = new ImageIcon(resizedImage6);
        JLabel imageLabel6 = new JLabel(resizedIcon6);

        JLabel lost=new JLabel("Better Luck Next Time");
        lost.setFont(relax);
        lost.setBounds(100,470,400,50);
        lost.setForeground(Color.black);
        scene6.getContentPane().add(imageLabel6);
        imageLabel6.add(lost);
        scene6.pack();
        scene6.setResizable(false);
        scene6.setLocationRelativeTo(null);

       

        // scene6.setVisible(true);

        enter.addKeyListener(new KeyListener() {
            @Override
             public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                
                    tries++;
                    int num=Integer.parseInt(enter.getText());
                    enter.setText("");
                    if(num>secretNumber)
                    {
                        // System.out.println("guess lower");
                        uparrow.setVisible(false);
                        guessup.setVisible(false);
                        downarrow.setVisible(true);
                        guessdown.setVisible(true);
                        scene4.setVisible(false);
                        scene4.setVisible(true);

                        
                    }
                    else if(num<secretNumber)
                    {
                        // System.out.println("guess higher");
                        downarrow.setVisible(false);
                        guessdown.setVisible(false);
                        uparrow.setVisible(true);
                        guessup.setVisible(true);
                        scene4.setVisible(false);
                        scene4.setVisible(true);
                    }
                    else
                    {
                        // System.out.println("win");
                        scene4.setVisible(false);
                        scene5.setVisible(true);
                        return;
                    }
                    if(tries==1)
                    {
                        b1.setBackground(Color.red);
                    }
                    else if(tries==2)
                    {
                        b2.setBackground(Color.red);
                    }
                    else if(tries==3)
                    {
                        b3.setBackground(Color.red);
                    }
                    else if(tries==4)
                    {
                        b4.setBackground(Color.red);
                    }
                    else if(tries==5)
                    {
                        b5.setBackground(Color.red);
                    }
                    else if(tries==6)
                    {
                        b6.setBackground(Color.red);
                    }
                    
                    if(tries==6)
                    {
                        // System.out.println("Lost");
                        scene4.setVisible(false);
                        scene6.setVisible(true);
                    }
                }
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        

        playBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                play.setVisible(false);
                scene2.setVisible(true);
            }
        });
         
        scene1.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        scene1.setVisible(false);
        scene3.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        });
        
        scene2.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        scene2.setVisible(false);
        scene1.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        });
        
        scene3.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        scene3.setVisible(false);
        scene4.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        });
        imageLabel4.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        guessPanel.setVisible(false);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        });
        enter.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        guessPanel.setVisible(false);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        });
        guess.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        guessPanel.setVisible(false);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        });
    }  
}
