
    import javax.swing.*;            // it inherits java.awt.Frameclass 
    import java.awt.event.*;
    import java.awt.*;
    import java.io.File;
    import javax.swing.filechooser.FileNameExtensionFilter;
    import java.util.*;

     class LoginFrame extends JFrame
     {
         JButton b1 , b2;
         JLabel l1;
         Vector v;
    
         public LoginFrame(Vector v)
         {
             super("LOGIN PAGE");
             setSize(800 , 550);
             setResizable(false);             //the frame size wont be set again
             setLocation(200 , 50); 
             setLayout(null);                 //we are sizing the frame      
             setDefaultCloseOperation(EXIT_ON_CLOSE);   
               
               this.v = v;                    //v is instance not local
             b1 = new JButton("COLLEGE LOGIN");    
             b1.setBounds(200, 400 , 190 , 50);
             add(b1);                            

             b2 = new JButton("STUDENT LOGIN");
             b2.setBounds(410, 400 , 190 , 50);
             add(b2);                            

             l1 = new JLabel();
             l1.setBounds(200, 30 , 700 , 300);    
             l1.setIcon(new ImageIcon("9.jpeg"));  
             add(l1);            

             b1.addActionListener( new ActionListener()                 //java.awt.event package
             {
                   public void actionPerformed(ActionEvent e)           //invoked on clicking
                   {      
                              LoginFrame.this.setVisible(false);        //The setVisible() method in Java makes the GUI component visible to the user depending on the Boolean parameter you pass in the function. For instance, if it is set as false then it will hide that component else if true ,it will be shown to the user.
                               new Frame2(LoginFrame.this.v , LoginFrame.this);            
                   }
             });
 
             b2.addActionListener( new ActionListener()
             {
                   public void actionPerformed(ActionEvent e)
                   {      
                                  LoginFrame.this.setVisible(false);
                                  new Frame3(LoginFrame.this.v, LoginFrame.this);            
                   }
             });

              setVisible(true); 
         }
   }

   class Student
   {
         String fname, lname, ename , edate;
         ImageIcon image;                           //in javax.swing      
         int eid;

         public Student()
         {} 
         public Student(String fname , String lname , String ename , String edate , ImageIcon image, int eid)
         {
                this.fname = fname;
                this.lname = lname;
                this.image = image;
                this.eid = eid;
                this.ename = ename;
                this.edate = edate;   
         }

         public boolean equals(Object o)               //The equals() method is used to determine logical equivalence between object instances.
         {
                 if(o instanceof Student)  //The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
                 {
                      Student obj = (Student)o;

                       if(eid == obj.eid)
                       {
                             return  true;
                       }
                       else
                       {
                              return false;
                       }
                 }  
                 else
                 {
                      return false;
                 }   
        }          
 
        public int hashCode()      //Equal objects must produce the same hash code as long as they are equal, however unequal objects need not produce distinct hash codes.
        {
              return eid;
        }              

         public String toString()          
         {
              return fname+" "+lname+" "+eid;
         }
   }

   class Frame2 extends JFrame                   //JFrame is the pre-defined super class
   {
         Vector v;
          LoginFrame lf;  
         JLabel l1,l2,l3,l4,l5,l6,l7;
         JTextField t1,t2,t3,t4;
         ButtonGroup bg1;                     //bg1 is the object of ButtonGroup class
         JRadioButton rb1 , rb2;
         JButton b1, b2, b3;
   
         public Frame2(Vector v , LoginFrame lf)
         {
             super("COLLEGE");
             setSize(700 , 500);
             setResizable(false);
             setLocation(200 , 50); 
             setLayout(null);
             setDefaultCloseOperation(EXIT_ON_CLOSE);

                   this.v = v;
                   this.lf = lf;

         v.add(new Student("AAA" ,"AAA","Event1", "25 Oct 2017",new ImageIcon("2.jpeg"),1234));
         v.add(new Student("BBB","BBB","Event2","26 Oct 2017",new ImageIcon("2.jpeg") ,2456));
         v.add(new Student("CCC","CCC","Event3","27 Oct 2017",new ImageIcon("2.jpeg"),3423));

              l1 = new JLabel("Enter First Name : ");                      //JLabel is used to display a short string or an image icon. JLabel can display text, image or both . 
              l1.setBounds(80 , 50 , 150 , 30);
              add(l1);                                    //add into the vector

              t1 = new JTextField();
              t1.setBounds(230 , 50 , 200 , 30);
              add(t1); 

              l2 = new JLabel("Enter Last Name : ");
              l2.setBounds(80 , 100 , 150 , 30);
              add(l2); 

              t2 = new JTextField();
              t2.setBounds(230 , 100 , 200 , 30);
              add(t2); 

             rb1 = new JRadioButton("MALE",true); //The JRadioButton class is used to create a radio button. It is used to choose one option from multiple options
             rb2 = new JRadioButton("FEMALE");

             bg1 = new ButtonGroup();             //create a Java ButtonGroup, then add the desired buttons to the group
             bg1.add(rb1);
             bg1.add(rb2);
              
             l3 = new JLabel("Select Gender : ");
             l3.setBounds(80,150,150,30);
             add(l3); 

             rb1.setBounds(230 , 150 , 80 , 30);
             rb2.setBounds(330 , 150 , 80 , 30);

             add(rb1);
             add(rb2);

              l4 = new JLabel("Event Name : ");
              l4.setBounds(80 , 190 , 150 , 30);
              add(l4); 

              t3 = new JTextField();                 //class JTextField is a component that allows editing of a single line of tex
              t3.setBounds(230 , 190 , 200 , 30);
              add(t3); 

              l5 = new JLabel("Event Date : ");
              l5.setBounds(80 , 230 , 150 , 30);
              add(l5); 

              l7 = new JLabel("Unique Participant No :  ");
              l7.setBounds(80 , 280 , 250 , 30);
              add(l7); 

              b2 = new JButton("SUBMIT DETAILS");
              b2.setBounds(100 , 330 , 150, 30);
              add(b2);

              b3 = new JButton("BACK");
              b3.setBounds(270 , 330 , 150, 30);
              add(b3);

              t4 = new JTextField();
              t4.setBounds(230 , 230 , 200 , 30);
              add(t4); 

              l6 = new JLabel(); 
              l6.setBounds(450 , 30 , 180, 180);
              add(l6); 

            /*  b1 = new JButton("UPLOAD PHOTO");
              b1.setBounds(470 , 230 , 150, 30);
              add(b1);*/
                
       b3.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                    Frame2.this.setVisible(false);         // setVisible() method in Java makes the GUI component visible to the user depending on the Boolean parameter you pass in the function. For instance, if it is set as false then it will hide that component else if true ,it will be shown to the user.
                    Frame2.this.lf.setVisible(true);
             }
     });

       b2.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                     if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals(""))  //to see whether all the boxes are filled
                     {
        JOptionPane.showMessageDialog(Frame2.this,"Please Enter Details","MESSAGE",JOptionPane.PLAIN_MESSAGE); //The JOptionPane class is used to provide standard dialog boxes such as message dialog box, confirm dialog box and input dialog box. These dialog boxes are used to display information or get input from the user. The JOptionPane class inherits JComponent cla
                             return;               //as the boxes are empty so joptpane give s this message                             
                     } 

                          boolean flag;
                    do
                    {
                             flag = false;
                             Random r = new Random();  //to generate ranndom nos
                             int n = r.nextInt(9999);  //The nextInt(int n) method is used to get a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.

                                Student s;
 s=new Student(t1.getText(),t2.getText(),t3.getText(),t4.getText(),((ImageIcon)l6.getIcon()),n);                                
                              if(Frame2.this.v.contains(s))   //java.lang.String.contains() method searches the sequence of characters in the given string. It returns true if sequence of char values are found in this string otherwise returns false.
                              {                                                             //just to check if the n is not repeated
                                   flag = true;
                              }
                              else
                              {
                                             Frame2.this.v.add(s);
                                    l7.setText(" Unique Participant No :  "+n);
                             }
                   }while(flag);   
             }
       });  

     b1.addActionListener(new ActionListener()             //for adding image
     {
        public void actionPerformed(ActionEvent e)
        {
          JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
         
     FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png","jpeg");
    
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
    
      if(result == JFileChooser.APPROVE_OPTION)
      {
              File selectedFile = file.getSelectedFile();
              String path = selectedFile.getAbsolutePath();
              l6.setIcon(ResizeImage(path));
      }
      else if(result == JFileChooser.CANCEL_OPTION)
      {
              System.out.println("No File Select");
      }
        }
    });
                setVisible(true);
         } 

    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(l6.getWidth(), l6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
   }

   class Frame3 extends JFrame 
   {
           LoginFrame lf; 
          JLabel l1 , l2, l3;
          JTextField t1;
          JButton b1 , b2;
          Vector v;     
         public Frame3(Vector v, LoginFrame lf)
         {
             super("STUDENT");
             setSize(600 , 500);
             setResizable(false);
             setLocation(200 , 70); 
             setLayout(null);
             setDefaultCloseOperation(EXIT_ON_CLOSE);

                  this.v = v;
                  this.lf = lf;
            l1 = new JLabel("Enter Unique Participant ID : ");
            l1.setBounds(30 , 20 , 180 , 30);
             add(l1);

            t1 = new JTextField();
            t1.setBounds(230 , 20 , 150 , 30);
             add(t1);

             b1 = new JButton("CHECK");
             b1.setBounds(150 , 350 , 100, 30);
             add(b1);
 
             b2 = new JButton("BACK");
             b2.setBounds(270 , 350 , 100, 30);
             add(b2);

            l2 = new JLabel();
            l2.setBounds(130 , 30 , 300 , 300);
            add(l2);

            l3 = new JLabel();
            l3.setBounds(110, 300 , 200 , 30);
            add(l3);  

       b2.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                     Frame3.this.setVisible(false);  
                     Frame3.this.lf.setVisible(true);
             }
      });
             
       b1.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                     if(t1.getText().equals(""))   
                     {
        JOptionPane.showMessageDialog(Frame3.this,"Please Enter ID","MESSAGE",JOptionPane.PLAIN_MESSAGE); 
                             return;
                     } 
                 
                      int n = Integer.parseInt(t1.getText());
                      Student s = new Student(null, null ,null, null, null , n);          
        
                       if(Frame3.this.v.contains(s))
                       {
                           Enumeration e = Frame3.this.v.elements();

                              while(e.hasMoreElements())
                              {
                                     Object o = e.nextElement();
                                      Student s2 = (Student)o;
                                     if(o.equals(s))
                                     {
                                            l2.setIcon(s2.image);
                                            l3.setText(o.toString());                                           
                                     }
                              }            
                       }
                      else
                      {
        JOptionPane.showMessageDialog(Frame3.this,"RECORD NOT FOUND","MESSAGE",JOptionPane.PLAIN_MESSAGE);
                      } 
             }
     });  
                     setVisible(true); 
         }
   }
     
   public class JavaProject
   {
       public static void main(String [] args)
       {
             Vector v = new Vector();
              new LoginFrame(v);
       }
   }  

