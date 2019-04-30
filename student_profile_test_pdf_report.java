import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 class JDBC_Project implements ActionListener,ItemListener,FocusListener
 {
 	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
 	JLabel l1,l2,l3,l4,l5,l6,l6_1,l6_2,l6_3,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l18_1,l18_2,l18_3,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l41_1,l41_2,l41_3,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54,l54_1,l54_2,l54_3,l52_1,l52_2,l55,l56,l57,l58,l58_1,l58_2,l59,l59_1,l59_2,l60,l61_1,l61_2,l61_3,l61_4,l62,l63,l64,tl1,tl2,tl3,tl4;
 	JTextArea ta1,ta2;
	JTextField t1,t3,t5_1,t5_2,t5_3,t6,t7,t8,t9,t10,t11,t12,t13,t14,t17_1,t17_2,t17_3,t18,t19,t20,t21,t22,t23,t24,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t41_1,t41_2,t41_3,t42,t43,t44,t45,t46,t47,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,tcheck;
 	JPasswordField t2,t4,t15,t16,t25,t26,t40,t48,t49;
 	Font fnt;
 	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
 	JFrame f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11;
 	Checkbox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;
 	CheckboxGroup cg1,cg2,cg3,cg4;
	int g,g1,g2,index,testflag=0,tcount=0;
	Choice ch,ch_1,c2,c2_1,c2_2,c2_3,c3,c4,c4_1,c4_2,c4_3,c5,c6,c7;
	String bch="",bch1="",bch2="",bch3="",bch4="",bch5="",bch6="",bch7="",bch8="",bch9="",bch10="",bch11="",bch12="",bch13="",yr="",temp5="",temp6="",ques="",opa="",opb="",opc="",opd="",ans="",tname="",tprn="",tbranch="",tsem="",tyear="";

	int count=0,mchcnt=0,cvcnt=0,cpcnt=0,ecnt=0,itcnt=0,inscnt=0,elcnt=0,pcnt=0,mcnt=0,gcnt=0;
	int fmchcnt=0,smchcnt=0,tmchcnt=0,bmchcnt=0;
	int fcvcnt=0,scvcnt=0,tcvcnt=0,bcvcnt=0;
	int fcpcnt=0,scpcnt=0,tcpcnt=0,bcpcnt=0;
	int fecnt=0,secnt=0,tecnt=0,becnt=0;
	int fitcnt=0,sitcnt=0,titcnt=0,bitcnt=0;
	int felcnt=0,selcnt=0,telcnt=0,belcnt=0;
	int fpcnt=0,spcnt=0,tpcnt=0,bpcnt=0;
	int finscnt=0,sinscnt=0,tinscnt=0,binscnt=0;
	int fmcnt=0,smcnt=0,tmcnt=0,bmcnt=0;
	int fgcnt=0,sgcnt=0,tgcnt=0,bgcnt=0;

 	JDBC_Project()
 	{
 		f=new JFrame("Portal");
 		f.setBounds(50,50,1000,800);
 		p1=(JPanel) f.getContentPane();
 		p1.setLayout(null);

 		l1=new JLabel("Welcome To Portal");
 		fnt=new Font("Arial",Font.BOLD,20);

 		l1.setBounds(375,225,400,50);
 		fnt=new Font("Arial",Font.BOLD,30);
 		l1.setFont(fnt);

 		fnt=new Font("Arial",Font.BOLD,25);
 		tl1=new JLabel("Student Portal");
 		tl1.setBounds(225,175,250,50);
 		tl1.setFont(fnt);

 		fnt=new Font("Arial",Font.BOLD,25);
 		tl2=new JLabel("Admin Portal");
 		tl2.setBounds(235,175,250,50);
 		tl2.setFont(fnt);

		fnt=new Font("Arial",Font.BOLD,25);
 		tl4=new JLabel("Teachers Portal");
 		tl4.setBounds(235,175,250,50);
 		tl4.setFont(fnt);

		f1=new JFrame("Student Login");
 		f1.setBounds(50,50,1000,1000);
 		p2=(JPanel) f1.getContentPane();
 		p2.setLayout(null);

 		f2=new JFrame("Admin Login");
 		f2.setBounds(50,50,1000,800);
 		p3=(JPanel) f2.getContentPane();
 		p3.setLayout(null);

 		f3=new JFrame("Student Sign-Up");
 		f3.setBounds(50,50,1000,800);
 		p4=(JPanel) f3.getContentPane();
 		p4.setLayout(null);

 		f4=new JFrame("Admin Sign-Up");
 		f4.setBounds(50,50,1000,800);
 		p5=(JPanel) f4.getContentPane();
 		p5.setLayout(null);

		f5=new JFrame("Student Details");
 		f5.setBounds(50,50,1000,800);
 		p6=(JPanel) f5.getContentPane();
 		p6.setLayout(null);

		f6=new JFrame("Admin");
 		f6.setBounds(50,50,1000,800);
 		p7=(JPanel) f6.getContentPane();
 		p7.setLayout(null);

		f7=new JFrame("Teachers Login");
 		f7.setBounds(50,50,1000,1000);
 		p8=(JPanel) f7.getContentPane();
 		p8.setLayout(null);

		f8=new JFrame("Teachers Login");
 		f8.setBounds(50,50,1000,1000);
 		p9=(JPanel) f8.getContentPane();
 		p9.setLayout(null);

		f9=new JFrame("Teachers Login");
 		f9.setBounds(50,50,1000,1000);
 		p10=(JPanel) f9.getContentPane();
 		p10.setLayout(null);

		f10=new JFrame("Question");
 		f10.setBounds(50,50,1000,1000);
 		p11=(JPanel) f10.getContentPane();
 		p11.setLayout(null);

		f11=new JFrame("Question Bank");
 		f11.setBounds(50,50,1000,1000);
 		p12=(JPanel) f11.getContentPane();
 		p12.setLayout(null);

		tcheck=new JTextField(20);
 		tcheck.setBounds(700,500,50,25);

 		t1=new JTextField(20);
 		t1.setBounds(350,260,150,25);

 		t2=new JPasswordField(20);
 		t2.setBounds(350,360,150,25);

 		t3=new JTextField(20);
 		t3.setBounds(350,260,150,25);

 		t4=new JPasswordField(20);
 		t4.setBounds(350,360,150,25);

 		t5_1=new JTextField(20);
 		t5_1.setBounds(200,50,200,25);

 		t5_2=new JTextField(20);
 		t5_2.setBounds(460,50,200,25);

 		t5_3=new JTextField(20);
 		t5_3.setBounds(730,50,200,25);

 		t7=new JTextField(20);
 		t7.setBounds(200,150,100,25);

 		t8=new JTextField(20);
 		t8.setBounds(200,200,100,25);

 		t9=new JTextField(20);
 		t9.setBounds(200,250,500,25);

 		t10=new JTextField(20);
 		t10.setBounds(200,300,100,25);

 		t11=new JTextField(20);
 		t11.setBounds(200,350,150,25);

 		t14=new JTextField(20);
 		t14.setBounds(625,100,150,25);

 		t15=new JPasswordField(20);
 		t15.setBounds(625,150,150,25);

 		t16=new JPasswordField(20);
 		t16.setBounds(625,200,150,25);

 		t17_1=new JTextField(20);
 		t17_1.setBounds(200,50,200,25);

 		t17_2=new JTextField(20);
 		t17_2.setBounds(460,50,200,25);

 		t17_3=new JTextField(20);
 		t17_3.setBounds(730,50,200,25);

 		t19=new JTextField(20);
 		t19.setBounds(200,150,100,25);

 		t20=new JTextField(20);
 		t20.setBounds(200,200,100,25);

 		t21=new JTextField(20);
 		t21.setBounds(200,250,500,25);

 		t22=new JTextField(20);
 		t22.setBounds(200,300,100,25);

 		t23=new JTextField(20);
 		t23.setBounds(200,350,150,25);

 		t24=new JTextField(20);
 		t24.setBounds(625,100,150,25);

 		t25=new JPasswordField(20);
 		t25.setBounds(625,150,150,25);

 		t26=new JPasswordField(20);
 		t26.setBounds(625,200,150,25);

		t27=new JTextField(20);
 		t27.setBounds(150,50,350,25);
		t27.setEditable(false);

 		t28=new JTextField(20);
		t28.setBounds(150,105,100,25);
		t28.setEditable(false);

		t29=new JTextField(20);
 		t29.setBounds(150,150,100,25);
		t29.setEditable(false);

 		t30=new JTextField(20);
 		t30.setBounds(150,200,100,25);
		t30.setEditable(false);

 		t31=new JTextField(20);
 		t31.setBounds(150,250,500,25);
		t31.setEditable(false);

 		t32=new JTextField(20);
 		t32.setBounds(150,300,100,25);
		t32.setEditable(false);

 		t33=new JTextField(20);
 		t33.setBounds(150,350,150,25);
		t33.setEditable(false);

 		t34=new JTextField(20);
 		t34.setBounds(150,400,100,25);
		t34.setEditable(false);

 		t35=new JTextField(20);
 		t35.setBounds(150,450,100,25);
		t35.setEditable(false);

 		t36=new JTextField(20);
 		t36.setBounds(600,100,150,25);
		t36.setEditable(false);

 		t37=new JTextField(20);
 		t37.setBounds(600,150,150,25);
		t37.setEditable(false);

		t38=new JTextField(20);
		t38.setBounds(500,40,300,25);
		t38.setEditable(false);

		t39=new JTextField(20);
 		t39.setBounds(350,260,150,25);

 		t40=new JPasswordField(20);
 		t40.setBounds(350,360,150,25);

		t41_1=new JTextField(20);
 		t41_1.setBounds(200,50,200,25);

 		t41_2=new JTextField(20);
 		t41_2.setBounds(460,50,200,25);

 		t41_3=new JTextField(20);
 		t41_3.setBounds(730,50,200,25);

 		t42=new JTextField(20);
 		t42.setBounds(200,150,100,25);

 		t43=new JTextField(20);
 		t43.setBounds(200,200,100,25);

 		t44=new JTextField(20);
 		t44.setBounds(200,250,500,25);

 		t45=new JTextField(20);
 		t45.setBounds(200,300,100,25);

 		t46=new JTextField(20);
 		t46.setBounds(200,350,150,25);

 		t47=new JTextField(20);
 		t47.setBounds(625,100,150,25);

 		t48=new JPasswordField(20);
 		t48.setBounds(625,150,150,25);

 		t49=new JPasswordField(20);
 		t49.setBounds(625,200,150,25);

		t50=new JTextField(20);
 		t50.setBounds(185,120,150,25);

		t51=new JTextField(20);
 		t51.setBounds(400,120,100,25);

		t52=new JTextField(20);
 		t52.setBounds(185,400,150,25);

		t53=new JTextField(20);
 		t53.setBounds(410,400,100,25);

		t54=new JTextField(20);
 		t54.setBounds(210,250,150,25);

		t55=new JTextField(20);
 		t55.setBounds(370,250,100,25);

		t56=new JTextField(20);
 		t56.setBounds(300,450,100,25);

		t57=new JTextField(20);
 		t57.setBounds(530,450,90,25);

		t58=new JTextField(20);
 		t58.setBounds(820,400,100,25);

		t59=new JTextField(20);
 		t59.setBounds(150,500,165,50);

		t60=new JTextField(20);
 		t60.setBounds(325,500,165,50);

		t61=new JTextField(20);
 		t61.setBounds(500,500,165,50);

		t62=new JTextField(20);
 		t62.setBounds(675,500,165,50);

		t63=new JTextField(20);
		t63.setBounds(200,50,50,25);

		ta1=new JTextArea();
		ta1.setBounds(100,100,650,350);

		ta2=new JTextArea();
		ta2.setBounds(100,100,650,350);
		ta2.setEditable(false);

 		b1=new JButton("Student");
 		b1.setBounds(100,400,200,50);
 		b1.addActionListener(this);
 		b1.setMnemonic('S');
 		b1.setToolTipText("student section");
 		Cursor c1=new Cursor(Cursor.HAND_CURSOR);
 		b1.setCursor(c1);

 		b2=new JButton("Admin");
 		b2.setBounds(400,400,200,50);
 		b2.addActionListener(this);
 		b2.setMnemonic('A');
 		b2.setToolTipText("admin section");
 		b2.setCursor(c1);

		b1.setFont(fnt);
 		b2.setFont(fnt);

 		b3=new JButton("Sign Up");
 		b3.setBounds(250,450,100,50);
 		b3.addActionListener(this);
 		b3.setMnemonic('S');
 		b3.setToolTipText("register");
 		b3.setCursor(c1);
 		/*b3.setBackground(Color.green);
 		b3.setForeground(Color.black);*/

 		b4=new JButton("Login");
 		b4.setBounds(375,450,100,50);
 		b4.addActionListener(this);
 		b4.setMnemonic('L');
 		b4.setToolTipText("login");
 		b4.setCursor(c1);
 		/*b4.setBackground(Color.green);
 		b4.setForeground(Color.black);*/

 		b7=new JButton("<-");
 		b7.setBounds(50,50,50,50);
 		b7.addActionListener(this);
 		b7.setToolTipText("back");
 		b7.setCursor(c1);
 		/*b7.setBackground(Color.red);
 		b7.setForeground(Color.black);*/

 		b5=new JButton("Sign Up");
 		b5.addActionListener(this);
 		b5.setMnemonic('S');
 		b5.setToolTipText("register");
 		b5.setCursor(c1);
 		b5.setBounds(250,450,100,50);
 		/*b5.setBackground(Color.green);
 		b5.setForeground(Color.black);*/

 		b6=new JButton("Login");
 		b6.setBounds(375,450,100,50);
 		b6.addActionListener(this);
 		b6.setMnemonic('L');
 		b6.setToolTipText("login");
 		b6.setCursor(c1);
 		/*b6.setBackground(Color.green);
 		b6.setForeground(Color.black);*/

 		b8=new JButton("<-");
 		b8.setBounds(50,50,50,50);
 		b8.addActionListener(this);
 		b8.setToolTipText("back");
 		b8.setCursor(c1);
 		/*b8.setBackground(Color.red);
 		b8.setForeground(Color.black);*/

 		b9=new JButton("Submit");
 		b9.setBounds(350,600,100,25);
 		b9.addActionListener(this);
 		b9.setToolTipText("submit");
 		b9.setCursor(c1);
 		/*b9.setBackground(Color.red);
 		b9.setForeground(Color.black);*/

 		b10=new JButton("Cancel");
 		b10.setBounds(550,600,100,25);
 		b10.addActionListener(this);
 		b10.setToolTipText("cancel");
 		b10.setCursor(c1);
 		/*b10.setBackground(Color.red);
 		b10.setForeground(Color.black);*/

 		b11=new JButton("Submit");
 		b11.setBounds(350,600,100,25);
 		b11.addActionListener(this);
 		b11.setToolTipText("submit");
 		b11.setCursor(c1);
 		/*b11.setBackground(Color.red);
 		b11.setForeground(Color.black);*/

 		b12=new JButton("Cancel");
 		b12.setBounds(550,600,100,25);
 		b12.addActionListener(this);
 		b12.setToolTipText("cancel");
 		b12.setCursor(c1);
 		/*b12.setBackground(Color.red);
 		b12.setForeground(Color.black);*/

		b13=new JButton("Log Out");
 		b13.setBounds(890,25,85,15);
 		b13.addActionListener(this);
 		b13.setToolTipText("logout");
 		b13.setCursor(c1);

		b14=new JButton("Teacher");
 		b14.setBounds(700,400,200,50);
 		b14.addActionListener(this);
 		b14.setMnemonic('T');
 		b14.setToolTipText("teacher's section");
 		b14.setCursor(c1);
		b14.setFont(fnt);

		b15=new JButton("<-");
 		b15.setBounds(50,50,50,50);
 		b15.addActionListener(this);
 		b15.setToolTipText("back");
 		b15.setCursor(c1);
 		/*b15.setBackground(Color.red);
 		b15.setForeground(Color.black);*/

		b16=new JButton("Sign Up");
 		b16.setBounds(250,450,100,50);
 		b16.addActionListener(this);
 		b16.setMnemonic('S');
 		b16.setToolTipText("register");
 		b16.setCursor(c1);
 		/*b16.setBackground(Color.green);
 		b16.setForeground(Color.black);*/

 		b17=new JButton("Login");
 		b17.setBounds(375,450,100,50);
 		b17.addActionListener(this);
 		b17.setMnemonic('L');
 		b17.setToolTipText("login");
 		b17.setCursor(c1);
 		/*b17.setBackground(Color.green);
 		b17.setForeground(Color.black);*/

		b18=new JButton("Submit");
 		b18.setBounds(350,600,100,25);
 		b18.addActionListener(this);
 		b18.setToolTipText("submit");
 		b18.setCursor(c1);
 		/*b18.setBackground(Color.red);
 		b18.setForeground(Color.black);*/

 		b19=new JButton("Cancel");
 		b19.setBounds(550,600,100,25);
 		b19.addActionListener(this);
 		b19.setToolTipText("cancel");
 		b19.setCursor(c1);
 		/*b19.setBackground(Color.red);
 		b19.setForeground(Color.black);*/

		b20=new JButton("Mark Attendance");
		b20.setBounds(130,175,150,25);
 		b20.addActionListener(this);
		b20.setToolTipText("mark");
 		b20.setCursor(c1);
 		/*b20.setBackground(Color.red);
 		b20.setForeground(Color.black);*/

		b21=new JButton("Delete");
		b21.setBounds(130,175,150,25);
 		b21.addActionListener(this);
		b21.setToolTipText("delete");
 		b21.setCursor(c1);
 		/*b21.setBackground(Color.red);
 		b21.setForeground(Color.black);*/

		b22=new JButton("Modify");
		b22.setBounds(300,175,150,25);
 		b22.addActionListener(this);
		b22.setToolTipText("modify");
 		b22.setCursor(c1);
 		/*b22.setBackground(Color.red);
 		b22.setForeground(Color.black);*/

		b23=new JButton("Sem End");
		b23.setBounds(190,250,150,25);
 		b23.addActionListener(this);
		b23.setToolTipText("semchange");
 		b23.setCursor(c1);
 		/*b23.setBackground(Color.red);
 		b23.setForeground(Color.black);*/

		b24=new JButton("Delete");
		b24.setBounds(130,455,150,25);
 		b24.addActionListener(this);
		b24.setToolTipText("delete");
 		b24.setCursor(c1);
 		/*b24.setBackground(Color.red);
 		b24.setForeground(Color.black);*/

		b25=new JButton("Modify");
		b25.setBounds(300,455,150,25);
 		b25.addActionListener(this);
		b25.setToolTipText("modify");
 		b25.setCursor(c1);
 		/*b25.setBackground(Color.red);
 		b25.setForeground(Color.black);*/

		b26=new JButton("Show");
		b26.setBounds(480,250,85,25);
 		b26.addActionListener(this);
		b26.setToolTipText("modify");
 		b26.setCursor(c1);
 		/*b26.setBackground(Color.red);
 		b26.setForeground(Color.black);*/

		b27=new JButton("Log Out");
		b27.setBounds(890,25,85,15);
 		b27.addActionListener(this);
		b27.setToolTipText("logout");
 		b27.setCursor(c1);
 		/*b27.setBackground(Color.red);
 		b27.setForeground(Color.black);*/

		b28=new JButton("Log Out");
		b28.setBounds(890,25,85,15);
 		b28.addActionListener(this);
		b28.setToolTipText("logout");
 		b28.setCursor(c1);
 		/*b28.setBackground(Color.red);
 		b28.setForeground(Color.black);*/

		b29=new JButton("Add");
		b29.setBounds(700,505,100,50);
 		b29.addActionListener(this);
		b29.setToolTipText("add");
 		b29.setCursor(c1);
 		/*b29.setBackground(Color.red);
 		b29.setForeground(Color.black);*/

		b30=new JButton("Remove");
		b30.setBounds(825,505,100,50);
 		b30.addActionListener(this);
		b30.setToolTipText("remove");
 		b30.setCursor(c1);
 		/*b30.setBackground(Color.red);
 		b30.setForeground(Color.black);*/

		b31=new JButton("Add Test");
		b31.setBounds(220,510,100,25);
 		b31.addActionListener(this);
		b31.setToolTipText("add test");
 		b31.setCursor(c1);
 		/*b31.setBackground(Color.red);
 		b31.setForeground(Color.black);*/

		b32=new JButton("Add Previous");
		b32.setBounds(450,510,150,25);
 		b32.addActionListener(this);
		b32.setToolTipText("previous questions");
 		b32.setCursor(c1);
 		/*b32.setBackground(Color.red);
 		b32.setForeground(Color.black);*/

		b33=new JButton("Submit And Exit");
		b33.setBounds(325,620,150,50);
 		b33.addActionListener(this);
		b33.setToolTipText("add test");
 		b33.setCursor(c1);
 		/*b33.setBackground(Color.red);
 		b33.setForeground(Color.black);*/

		b34=new JButton("Submit And Add");
		b34.setBounds(525,620,150,50);
 		b34.addActionListener(this);
		b34.setToolTipText("previous questions");
 		b34.setCursor(c1);
 		/*b34.setBackground(Color.red);
 		b34.setForeground(Color.black);*/

		b35=new JButton("Solve");
		b35.setBounds(600,200,100,25);
 		b35.addActionListener(this);
		b35.setToolTipText("solve questions");
 		b35.setCursor(c1);
 		/*b35.setBackground(Color.red);
 		b35.setForeground(Color.black);*/

		b36=new JButton("Submit");
		b36.setBounds(475,620,150,50);
 		b36.addActionListener(this);
		b36.setToolTipText("solve questions");
 		b36.setCursor(c1);
 		/*b36.setBackground(Color.red);
 		b36.setForeground(Color.black);*/

 		fnt=new Font("Arial",Font.BOLD,20);

 		l2=new JLabel("Username : ");
 		l2.setBounds(200,250,150,50);

 		l3=new JLabel("Password : ");
 		l3.setBounds(200,350,150,50);

 		l2.setFont(fnt);
 		l3.setFont(fnt);

 		fnt=new Font("Arial",Font.BOLD,20);

 		l4=new JLabel("Username : ");
 		l4.setBounds(200,250,150,50);

 		l5=new JLabel("Password : ");
 		l5.setBounds(200,350,150,50);

 		l6=new JLabel("Name");
 		l6.setBounds(50,40,100,50);

 		l6_1=new JLabel("Last");
 		l6_1.setBounds(270,20,50,30);

 		l6_2=new JLabel("Middle");
 		l6_2.setBounds(470,20,50,30);

 		l6_3=new JLabel("First");
 		l6_3.setBounds(800,20,50,30);

 		l7=new JLabel("Gender");
 		l7.setBounds(50,90,150,50);

 		l8=new JLabel("Birth Date");
 		l8.setBounds(50,140,150,50);

 		l9=new JLabel("Country");
 		l9.setBounds(50,190,150,50);

 		l10=new JLabel("Address");
 		l10.setBounds(50,240,150,50);

 		l11=new JLabel("Mob No");
 		l11.setBounds(50,290,100,50);

 		l12=new JLabel("Email Id");
 		l12.setBounds(50,340,150,50);

 		l13=new JLabel("Branch");
 		l13.setBounds(50,390,100,50);

 		l14=new JLabel("Year");
 		l14.setBounds(50,440,100,50);

 		l15=new JLabel("Username");
 		l15.setBounds(500,90,150,50);

 		l16=new JLabel("Password");
 		l16.setBounds(500,140,150,50);

 		l17=new JLabel("Confirm");
 		l17.setBounds(500,190,150,50);

 		l18=new JLabel("Name");
 		l18.setBounds(50,40,100,50);

 		l18_1=new JLabel("Last");
 		l18_1.setBounds(270,20,50,30);

 		l18_2=new JLabel("Middle");
 		l18_2.setBounds(470,20,50,30);

 		l18_3=new JLabel("First");
 		l18_3.setBounds(800,20,50,30);

 		l19=new JLabel("Gender");
 		l19.setBounds(50,90,150,50);

 		l20=new JLabel("Birth Date");
 		l20.setBounds(50,140,150,50);

 		l21=new JLabel("Country");
 		l21.setBounds(50,190,150,50);

 		l22=new JLabel("Address");
 		l22.setBounds(50,240,150,50);

 		l23=new JLabel("Mob No");
 		l23.setBounds(50,290,100,50);

 		l24=new JLabel("Email Id");
 		l24.setBounds(50,340,150,50);

 		l25=new JLabel("Username");
 		l25.setBounds(500,90,150,50);

 		l26=new JLabel("Password");
 		l26.setBounds(500,140,150,50);

 		l27=new JLabel("Confirm");
 		l27.setBounds(500,190,150,50);

		l28=new JLabel("Name");
 		l28.setBounds(50,40,100,50);

 		l29=new JLabel("Gender");
 		l29.setBounds(50,90,150,50);

 		l30=new JLabel("Birth Date");
 		l30.setBounds(50,140,150,50);

 		l31=new JLabel("Country");
 		l31.setBounds(50,190,150,50);

 		l32=new JLabel("Address");
 		l32.setBounds(50,240,150,50);

 		l33=new JLabel("Mob No");
 		l33.setBounds(50,290,100,50);

 		l34=new JLabel("Email Id");
 		l34.setBounds(50,340,150,50);

 		l35=new JLabel("Branch");
 		l35.setBounds(50,390,100,50);

 		l36=new JLabel("Year");
 		l36.setBounds(50,440,100,50);

 		l37=new JLabel("PRN No");
 		l37.setBounds(500,90,150,50);

 		l38=new JLabel("Seat No");
 		l38.setBounds(500,140,150,50);

		l39=new JLabel("Username : ");
 		l39.setBounds(200,250,150,50);

 		l40=new JLabel("Password : ");
 		l40.setBounds(200,350,150,50);

 		l39.setFont(fnt);
 		l40.setFont(fnt);

		l41=new JLabel("Name");
 		l41.setBounds(50,40,100,50);

 		l41_1=new JLabel("Last");
 		l41_1.setBounds(270,20,50,30);

 		l41_2=new JLabel("Middle");
 		l41_2.setBounds(470,20,50,30);

 		l41_3=new JLabel("First");
 		l41_3.setBounds(820,20,100,25);

 		l42=new JLabel("Gender");
 		l42.setBounds(50,90,150,50);

 		l43=new JLabel("Birth Date");
 		l43.setBounds(50,140,150,50);

 		l44=new JLabel("Country");
 		l44.setBounds(50,190,150,50);

 		l45=new JLabel("Address");
 		l45.setBounds(50,240,150,50);

 		l46=new JLabel("Mob No");
 		l46.setBounds(50,290,100,50);

 		l47=new JLabel("Email Id");
 		l47.setBounds(50,340,150,50);

 		l48=new JLabel("Branch");
 		l48.setBounds(50,390,100,50);

 		l49=new JLabel("Username");
 		l49.setBounds(500,90,150,50);

 		l50=new JLabel("Password");
 		l50.setBounds(500,140,150,50);

 		l51=new JLabel("Confirm");
 		l51.setBounds(500,190,150,50);

		l52=new JLabel("Edit Student :");
 		l52.setBounds(50,128,150,25);

		l52_1=new JLabel("Name");
 		l52_1.setBounds(225,100,50,25);

		l52_2=new JLabel("PRN");
 		l52_2.setBounds(415,100,50,25);

		l53=new JLabel("Semister Change :");
		l53.setBounds(50,250,150,25);

		l54=new JLabel("Edit Teacher :");
		l54.setBounds(50,400,150,25);

		l54_1=new JLabel("Name");
 		l54_1.setBounds(225,372,50,25);

		l54_2=new JLabel("Ph. No.");
 		l54_2.setBounds(415,372,50,25);

		l54_3=new JLabel("Subject Name");
 		l54_3.setBounds(820,372,100,25);

		l53=new JLabel("Semister Change :");
		l53.setBounds(50,250,150,25);

		l54=new JLabel("Edit Teacher :");
		l54.setBounds(50,400,150,25);

		l55=new JLabel("Display :");
 		l55.setBounds(580,128,150,25);

		l56=new JLabel("Change Subject :");
		l56.setBounds(580,400,100,25);

		l57=new JLabel("Student Attendance :");
 		l57.setBounds(50,100,150,25);

		l58=new JLabel("Student Details :");
		l58.setBounds(50,250,150,25);

		l58_1=new JLabel("Name");
		l58_1.setBounds(225,220,50,25);

		l58_2=new JLabel("PRN");
		l58_2.setBounds(408,220,50,25);

		l59=new JLabel("Test Series :");
		l59.setBounds(50,400,150,25);

		l59_1=new JLabel("Test Num :");
		l59_1.setBounds(200,450,100,25);

		l59_2=new JLabel("Test Num :");
		l59_2.setBounds(440,450,90,25);

		l60=new JLabel("Question");
		l60.setBounds(50,50,100,50);

		l61_1=new JLabel("Option A");
		l61_1.setBounds(150,575,165,25);

		l61_2=new JLabel("Option B");
		l61_2.setBounds(325,575,165,25);

		l61_3=new JLabel("Option C");
		l61_3.setBounds(500,575,100,25);

		l61_4=new JLabel("Option D");
		l61_4.setBounds(675,575,100,25);

		l62=new JLabel("Test Series :");
		l62.setBounds(500,180,100,50);

		l63=new JLabel("Question");
		l63.setBounds(50,50,100,50);

		l64=new JLabel("Question");
		l64.setBounds(50,50,100,50);

		tl3=new JLabel("WELCOME");
		tl3.setBounds(360,30,130,50);
		tl3.setFont(fnt);

		cg1=new CheckboxGroup();
 		ch1=new Checkbox("Male",cg1,false);
 		ch1.setBounds(200,90,75,50);
 		ch1.addItemListener(this);
 		ch2=new Checkbox("Female",cg1,false);
 		ch2.setBounds(275,90,100,50);
 		ch2.addItemListener(this);

 		cg2=new CheckboxGroup();
 		ch3=new Checkbox("Male",cg2,false);
		ch3.addItemListener(this);
 		ch3.setBounds(200,90,75,50);
 		ch4=new Checkbox("Female",cg2,false);
 		ch4.setBounds(275,90,100,50);
		ch4.addItemListener(this);

		cg3=new CheckboxGroup();
 		ch5=new Checkbox("Male",cg3,false);
		ch5.addItemListener(this);
 		ch5.setBounds(200,90,75,50);
 		ch6=new Checkbox("Female",cg3,false);
 		ch6.setBounds(275,90,100,50);
		ch6.addItemListener(this);


		ch=new Choice();
 		ch.setBounds(200,400,100,25);
		ch.addItemListener(this);
		ch.add("Select Branch");
		ch.add("Mechanical");
		ch.add("Civil");
		ch.add("Computer");
		ch.add("ENTC");
		ch.add("IT");
		ch.add("Instrumentation");
		ch.add("Electrical");
		ch.add("Petrolium");
		ch.add("Metallurgy");
		ch.add("Geology");

		ch_1=new Choice();
 		ch_1.setBounds(200,400,100,25);
		ch_1.addItemListener(this);
		ch_1.add("Select Branch");
		ch_1.add("Mechanical");
		ch_1.add("Civil");
		ch_1.add("Computer");
		ch_1.add("ENTC");
		ch_1.add("IT");
		ch_1.add("Instrumentation");
		ch_1.add("Electrical");
		ch_1.add("Petrolium");
		ch_1.add("Metallurgy");
		ch_1.add("Geology");

		c2=new Choice();
		c2.setBounds(210,100,85,25);
		c2.addItemListener(this);
		c2.add("Select Year");
		c2.add("FE");
		c2.add("SE");
		c2.add("TE");
		c2.add("BE");

		c2_1=new Choice();
 		c2_1.setBounds(300,100,100,25);
		c2_1.addItemListener(this);
		c2_1.add("Select Branch");
		c2_1.add("Mechanical");
		c2_1.add("Civil");
		c2_1.add("Computer");
		c2_1.add("ENTC");
		c2_1.add("IT");
		c2_1.add("Instrumentation");
		c2_1.add("Electrical");
		c2_1.add("Petrolium");
		c2_1.add("Metallurgy");
		c2_1.add("Geology");

		c2_2=new Choice();
		c2_2.setBounds(410,100,90,25);
		c2_2.addItemListener(this);
		c2_2.add("Select Sem");
		c2_2.add("I");
		c2_2.add("II");

		c2_3=new Choice();
		c2_3.setBounds(510,100,90,25);
		c2_3.addItemListener(this);
		c2_3.addFocusListener(this);
		c2_3.add("Select Subject");

		c3=new Choice();
		c3.setBounds(200,450,100,25);
		c3.addItemListener(this);
		c3.add("Select Year");
		c3.add("FE");
		c3.add("SE");
		c3.add("TE");
		c3.add("BE");

		c4=new Choice();
		c4.setBounds(210,400,85,25);
		c4.addItemListener(this);
		c4.add("Select Year");
		c4.add("FE");
		c4.add("SE");
		c4.add("TE");
		c4.add("BE");

		c4_1=new Choice();
 		c4_1.setBounds(300,400,100,25);
		c4_1.addItemListener(this);
		c4_1.add("Select Branch");
		c4_1.add("Mechanical");
		c4_1.add("Civil");
		c4_1.add("Computer");
		c4_1.add("ENTC");
		c4_1.add("IT");
		c4_1.add("Instrumentation");
		c4_1.add("Electrical");
		c4_1.add("Petrolium");
		c4_1.add("Metallurgy");
		c4_1.add("Geology");

		c4_2=new Choice();
		c4_2.setBounds(410,400,90,25);
		c4_2.addItemListener(this);
		c4_2.add("Select Sem");
		c4_2.add("I");
		c4_2.add("II");

		c4_3=new Choice();
		c4_3.setBounds(510,400,90,25);
		c4_3.addItemListener(this);
		c4_3.addFocusListener(this);
		c4_3.add("Select Subject");

		c5=new Choice();
 		c5.setBounds(700,400,110,25);
		c5.addItemListener(this);
		c5.add("Select Branch");
		c5.add("Mechanical");
		c5.add("Civil");
		c5.add("Computer");
		c5.add("ENTC");
		c5.add("IT");
		c5.add("Instrumentation");
		c5.add("Electrical");
		c5.add("Petrolium");
		c5.add("Metallurgy");
		c5.add("Geology");

		c6=new Choice();
		c6.setBounds(700,455,100,25);
		c6.addItemListener(this);
		c6.add("Select Year");
		c6.add("FE");
		c6.add("SE");
		c6.add("TE");
		c6.add("BE");

		c7=new Choice();
		c7.setBounds(825,455,100,25);
		c7.addItemListener(this);
		c7.add("Select Sem");
		c7.add("I");
		c7.add("II");

 		l4.setFont(fnt);
 		l5.setFont(fnt);
 		l6.setFont(fnt);
 		l7.setFont(fnt);
 		l8.setFont(fnt);
 		l9.setFont(fnt);
 		l10.setFont(fnt);
 		l11.setFont(fnt);
 		l12.setFont(fnt);
 		l13.setFont(fnt);
 		l14.setFont(fnt);
 		l15.setFont(fnt);
 		l16.setFont(fnt);
 		l17.setFont(fnt);
 		l18.setFont(fnt);
 		l19.setFont(fnt);
 		l20.setFont(fnt);
 		l21.setFont(fnt);
 		l22.setFont(fnt);
 		l23.setFont(fnt);
 		l24.setFont(fnt);
 		l25.setFont(fnt);
 		l26.setFont(fnt);
 		l27.setFont(fnt);
		l60.setFont(fnt);

		l41.setFont(fnt);
 		l42.setFont(fnt);
 		l43.setFont(fnt);
 		l44.setFont(fnt);
 		l45.setFont(fnt);
 		l46.setFont(fnt);
 		l47.setFont(fnt);
 		l48.setFont(fnt);
 		l49.setFont(fnt);
 		l50.setFont(fnt);
 		l51.setFont(fnt);

 		p1.add(l1);
 		p1.add(b1);
 		p1.add(b2);
		p1.add(b14);

 		p2.add(l2);
 		p2.add(l3);
 		p2.add(t1);
 		p2.add(t2);
 		p2.add(b3);
 		p2.add(b4);
 		p2.add(b7);
 		p2.add(tl1);

 		p3.add(l4);
 		p3.add(l5);
 		p3.add(t3);
 		p3.add(t4);
 		p3.add(b5);
 		p3.add(b6);
 		p3.add(b8);
 		p3.add(tl2);

 		p5.add(l18);
 		p5.add(l18_1);
 		p5.add(l18_2);
 		p5.add(l18_3);
 		p5.add(l19);
 		p5.add(l20);
 		p5.add(l21);
 		p5.add(l22);
 		p5.add(l23);
 		p5.add(l24);
 		p5.add(l25);
 		p5.add(l26);
 		p5.add(l27);
 		p5.add(b11);
 		p5.add(b12);
 		p5.add(t17_1);
 		p5.add(t17_2);
 		p5.add(t17_3);
 		p5.add(t19);
 		p5.add(t20);
 		p5.add(t21);
 		p5.add(t22);
 		p5.add(t23);
 		p5.add(t24);
 		p5.add(t25);
 		p5.add(t26);
 		p5.add(ch1);
 		p5.add(ch2);
 		p5.add(ch3);
 		p5.add(ch4);

 		p4.add(l6);
 		p4.add(l6_1);
 		p4.add(l6_2);
 		p4.add(l6_3);
 		p4.add(l7);
 		p4.add(l8);
 		p4.add(l9);
 		p4.add(l10);
 		p4.add(l11);
 		p4.add(l12);
 		p4.add(l13);
 		p4.add(l14);
 		p4.add(l15);
 		p4.add(l16);
 		p4.add(l17);
 		p4.add(b9);
 		p4.add(b10);
 		p4.add(t5_1);
 		p4.add(t5_2);
 		p4.add(t5_3);
 		p4.add(t7);
 		p4.add(t8);
 		p4.add(t9);
 		p4.add(t10);
 		p4.add(t11);
 		p4.add(ch);
 		p4.add(c3);
 		p4.add(t14);
 		p4.add(t15);
 		p4.add(t16);
 		p4.add(ch1);
 		p4.add(ch2);

		p6.add(l28);
 		p6.add(l29);
 		p6.add(l30);
 		p6.add(l31);
 		p6.add(l32);
 		p6.add(l33);
 		p6.add(l34);
 		p6.add(l35);
 		p6.add(l36);
 		p6.add(l37);
 		p6.add(l38);
 		p6.add(b13);
		p6.add(t27);
 		p6.add(t28);
 		p6.add(t29);
 		p6.add(t30);
 		p6.add(t31);
 		p6.add(t32);
 		p6.add(t33);
 		p6.add(t34);
 		p6.add(t35);
 		p6.add(t36);
		p6.add(t37);

		p7.add(tl3);
		p7.add(t38);
		p7.add(l52);
		p7.add(l52_1);
		p7.add(l52_2);
		p7.add(b21);
		p7.add(b22);
		p7.add(b23);
		p7.add(b24);
		p7.add(b25);
		p7.add(b27);
		p7.add(b29);
		p7.add(b30);
		p7.add(t50);
		p7.add(t51);
		p7.add(t52);
		p7.add(t53);
		p7.add(t58);
		p7.add(l53);
		p7.add(l54);
		p7.add(l54_1);
		p7.add(l54_2);
		p7.add(l54_3);
		p7.add(l55);
		p7.add(l56);
		p7.add(c5);
		p7.add(c6);
		p7.add(c7);
		p7.add(t56);

		p8.add(l39);
 		p8.add(l40);
 		p8.add(t39);
 		p8.add(t40);
 		p8.add(b16);
 		p8.add(b15);
 		p8.add(b17);
 		p8.add(tl4);

		p9.add(l41);
 		p9.add(l41_1);
 		p9.add(l41_2);
 		p9.add(l41_3);
 		p9.add(l42);
 		p9.add(l43);
 		p9.add(l44);
 		p9.add(l45);
 		p9.add(l46);
 		p9.add(l47);
 		p9.add(l48);
 		p9.add(l49);
 		p9.add(l50);
 		p9.add(l51);
 		p9.add(b18);
 		p9.add(b19);
 		p9.add(t41_1);
 		p9.add(t41_2);
 		p9.add(t41_3);
 		p9.add(t42);
 		p9.add(t43);
 		p9.add(t44);
 		p9.add(t45);
 		p9.add(t46);
 		p9.add(ch_1);
 		p9.add(t47);
 		p9.add(t48);
 		p9.add(t49);
 		p9.add(ch5);
 		p9.add(ch6);

		p10.add(b20);
		p10.add(l57);
		p10.add(l58);
		p10.add(l58_1);
		p10.add(l58_2);
		p10.add(l59_1);
		p10.add(l59_2);
		p10.add(l59);
		p10.add(t54);
		p10.add(t55);
		p10.add(t56);
		p10.add(t57);
		p10.add(c2);
		p10.add(c2_1);
 		p10.add(c2_2);
		p10.add(c2_3);
		p10.add(b28);
		p10.add(b26);
		p10.add(b31);
		p10.add(b32);
		p10.add(c4);
		p10.add(c4_1);
 		p10.add(c4_2);
		p10.add(c4_3);

		p11.add(ta1);
		p11.add(l60);
		p11.add(t59);
		p11.add(t60);
		p11.add(t61);
		p11.add(t62);
		p11.add(t63);
		p11.add(b33);
		p11.add(b34);
		p11.add(l61_1);
		p11.add(l61_2);
		p11.add(l61_3);
		p11.add(l61_4);

		p12.add(l64);
		p12.add(ta2);
		p12.add(b36);

		Calendar now=Calendar.getInstance();
		yr=Integer.toString(now.get(Calendar.YEAR));

 		f.setVisible(true);
 	}

 	public void actionPerformed(ActionEvent ae)
 	{
		String Name,n1,n2,n3,Gender,Address,Birth,Country,Phno,Email,Branch,PRN,SeatNo,Sem,Year,User,Pass,Cpass,temp1,temp2,tnm,Student,Attendance,Subject,Date,TestNo,Question,A,B,C,D,Tbranch,Tyear,Tsem,Tsubject,QuesNo,Answer;

		Email=" ";
		Gender=" ";
		tnm="";
		Branch="";
		PRN="";
		Sem="";
		Year="";
		SeatNo="";
		Phno="";
		Student="";
		Attendance="";
		User="";
		Pass="";
		Subject="";
		Date="";
		TestNo="";
		Question="";
		A="";
		B="";
		C="";
		D="";
		Tbranch="";
		Tyear="";
		Tsem="";
		Tsubject="";
		QuesNo="";
		Answer="";

 		if(ae.getSource()==b1)
 		{
 			f.setVisible(false);
 			f1.setVisible(true);
 			JOptionPane.showMessageDialog(f1,"Welcome To Student Portal","Student Portal",JOptionPane.INFORMATION_MESSAGE);
 		}

 		else if(ae.getSource()==b2)
 		{
 			f.setVisible(false);
 			f2.setVisible(true);
 			JOptionPane.showMessageDialog(f1,"Welcome To Admin Portal","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
 		}

		else if(ae.getSource()==b3)
 		{
 			f1.setVisible(false);
 			f3.setVisible(true);
			JOptionPane.showMessageDialog(f3,"Student Sign-Up","Student Portal",JOptionPane.INFORMATION_MESSAGE);
 		}

		else if(ae.getSource()==b4)
 		{
			temp1=t1.getText();
			temp2=new String(t2.getPassword());
			if(temp1.equals("") || temp2.equals(""))
			{
				JOptionPane.showMessageDialog(f1,"Enter The Username and password!","Student Portal",JOptionPane.INFORMATION_MESSAGE);
				t1.setText("");
				t2.setText("");
			}
			else
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="select * from sportalc";
					ResultSet rs=st.executeQuery(s);
					int flag=5;
					while(rs.next())
					{
						if(rs.getString(13).equals(temp1) && rs.getString(14).equals(temp2))
						{
							flag=1;
							break;
						}
						else
							flag=0;
					}
					if(flag==1)
					{
						t1.setText("");
						t2.setText("");
						f1.setVisible(false);
						f5.setVisible(true);
 						JOptionPane.showMessageDialog(f5,"Login Successful!","Student Details",JOptionPane.INFORMATION_MESSAGE);

						if(testflag>0)
						{
							p6.add(l62);
							p6.add(b35);
						}

						t27.setText(rs.getString(1));
						t28.setText(rs.getString(2));
						t29.setText(rs.getString(3));
						t30.setText(rs.getString(4));
						t31.setText(rs.getString(5));
						t32.setText(rs.getString(6));
						t33.setText(rs.getString(7));
						t34.setText(rs.getString(8));
						t36.setText(rs.getString(9));
						t37.setText(rs.getString(10));
						t35.setText(rs.getString(12));
						tname=t27.getText();
						tprn=t36.getText();
						tbranch=t34.getText();
						tyear=t35.getText();
					}
					else
					{
						JOptionPane.showMessageDialog(f1,"Login Unsuccessful!","Student Portal",JOptionPane.INFORMATION_MESSAGE);
						t1.setText("");
						t2.setText("");
					}
					rs.close();
					con.close();
				}
				catch(Exception e)
				{

				}

			}
 		}

		else if(ae.getSource()==b5)
 		{
 			f2.setVisible(false);
 			f4.setVisible(true);
			JOptionPane.showMessageDialog(f4,"Admin Sign-Up","Student Portal",JOptionPane.INFORMATION_MESSAGE);
 		}

		else if(ae.getSource()==b6)
 		{
			temp1=t3.getText();
			temp2=new String(t4.getPassword());
			if(temp1.equals("") || temp2.equals(""))
			{
				JOptionPane.showMessageDialog(f2,"Enter The Username and password!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
				t1.setText("");
				t2.setText("");
			}
			else
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="select * from aportalc";
					ResultSet rs=st.executeQuery(s);
					int flag=5;
					while(rs.next())
					{
						if(rs.getString(8).equals(temp1) && rs.getString(9).equals(temp2))
						{
							flag=1;
							break;
						}
						else
							flag=0;
					}
					if(flag==1)
					{
						t3.setText("");
						t4.setText("");
						f2.setVisible(false);
						f6.setVisible(true);
 						JOptionPane.showMessageDialog(f6,"Login Successful!","Admin Details",JOptionPane.INFORMATION_MESSAGE);

						t38.setText(rs.getString(1));
						fnt=new Font("Arial",Font.BOLD,20);
						t38.setFont(fnt);
					}
					else
					{
						JOptionPane.showMessageDialog(f2,"Login Unsuccessful!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
						t1.setText("");
						t2.setText("");
					}
					rs.close();
					con.close();
				}
				catch(Exception e)
				{

				}

			}
 		}

 		else if(ae.getSource()==b7)
 		{
 			int x=JOptionPane.showConfirmDialog(f1,"Are you sure you want to leave the Student Portal?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
					t2.setText("");
					t1.setText("");
 					f1.setVisible(false);
 					f.setVisible(true);
 					break;
 			}
 		}

 		else if(ae.getSource()==b8)
 		{
 			int x=JOptionPane.showConfirmDialog(f2,"Are you sure you want to leave the Admin Portal?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
					t3.setText("");
					t4.setText("");
 					f2.setVisible(false);
 					f.setVisible(true);
 					break;
 			}
 		}

		else if(ae.getSource()==b9)
 		{
			int c1=5;
			n1=t5_1.getText();
			n2=t5_2.getText();
			n3=t5_3.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement();
				String s;
				s="select * from sportalc";
				ResultSet rs=st.executeQuery(s);
				int flag=5;
				while(rs.next())
				{
					if(rs.getString(8).equals("Mechanical"))
						mchcnt++;
					else if(rs.getString(8).equals("Civil"))
						cvcnt++;
					else if(rs.getString(8).equals("Computer"))
						cpcnt++;
					else if(rs.getString(8).equals("ENTC"))
						ecnt++;
					else if(rs.getString(8).equals("IT"))
						itcnt++;
					else if(rs.getString(8).equals("Instrumentation"))
						inscnt++;
					else if(rs.getString(8).equals("Electrical"))
						elcnt++;
					else if(rs.getString(8).equals("Petroleum"))
						pcnt++;
					else if(rs.getString(8).equals("Metallurgy"))
						mcnt++;
					else if(rs.getString(8).equals("Geology"))
						gcnt++;
					count++;
				}
				rs.close();
				con.close();
			}
			catch(Exception e)
			{

			}

			Name=n1+" "+n2+" "+n3;
			if(g==1)
				Gender="Male";
			else if(g==0)
				Gender="Female";
			Birth=t7.getText();
			Country=t8.getText();
			Address=t9.getText();
			Phno=t10.getText();
			Email=t11.getText();
			Year=bch5;
			Sem="I";
			if(bch.equals("Mechanical") && bch5.equals("FE"))
			{
				mchcnt++;
				fmcnt++;
				count++;
				PRN="MC"+yr+(Integer.toString(mchcnt));
				SeatNo=bch5+yr+(Integer.toString(fmchcnt));
			}
			else if(bch.equals("Mechanical") && bch5.equals("SE"))
			{
				mchcnt++;
				smchcnt++;
				count++;
				PRN="MC"+yr+(Integer.toString(mchcnt));
				SeatNo=bch5+yr+(Integer.toString(smchcnt));
			}
			else if(bch.equals("Mechanical") && bch5.equals("TE"))
			{
				mchcnt++;
				tmchcnt++;
				count++;
				PRN="MC"+yr+(Integer.toString(mchcnt));
				SeatNo=bch5+yr+(Integer.toString(tmchcnt));
			}
			else if(bch.equals("Mechanical") && bch5.equals("BE"))
			{
				mchcnt++;
				bmchcnt++;
				count++;
				PRN="MC"+yr+(Integer.toString(mchcnt));
				SeatNo=bch5+yr+(Integer.toString(bmchcnt));
			}
			else if(bch.equals("Civil") && bch5.equals("FE"))
			{
				cvcnt++;
				fcvcnt++;
				count++;
				PRN="CV"+yr+(Integer.toString(cvcnt));
				SeatNo=bch5+yr+(Integer.toString(fcvcnt));
			}
			else if(bch.equals("Civil") && bch5.equals("SE"))
			{
				cvcnt++;
				scvcnt++;
				count++;
				PRN="CV"+yr+(Integer.toString(cvcnt));
				SeatNo=bch5+yr+(Integer.toString(scvcnt));
			}
			else if(bch.equals("Civil") && bch5.equals("TE"))
			{
				cvcnt++;
				tcvcnt++;
				count++;
				PRN="CV"+yr+(Integer.toString(cvcnt));
				SeatNo=bch5+yr+(Integer.toString(tcvcnt));
			}
			else if(bch.equals("Civil") && bch5.equals("BE"))
			{
				cvcnt++;
				bcvcnt++;
				count++;
				PRN="CV"+yr+(Integer.toString(cvcnt));
				SeatNo=bch5+yr+(Integer.toString(bcvcnt));
			}
			else if(bch.equals("Computer") && bch5.equals("FE"))
			{
				cpcnt++;
				fcpcnt++;
				count++;
				PRN="CP"+yr+(Integer.toString(cpcnt));
				SeatNo=bch5+yr+(Integer.toString(fcpcnt));
			}
			else if(bch.equals("Computer") && bch5.equals("SE"))
			{
				cpcnt++;
				scpcnt++;
				count++;
				PRN="CP"+yr+(Integer.toString(cpcnt));
				SeatNo=bch5+yr+(Integer.toString(scpcnt));
			}
			else if(bch.equals("Computer") && bch5.equals("TE"))
			{
				cpcnt++;
				tcpcnt++;
				count++;
				PRN="CP"+yr+(Integer.toString(cpcnt));
				SeatNo=bch5+yr+(Integer.toString(tcpcnt));
			}
			else if(bch.equals("Computer") && bch5.equals("BE"))
			{
				cpcnt++;
				bcpcnt++;
				count++;
				PRN="CP"+yr+(Integer.toString(cpcnt));
				SeatNo=bch5+yr+(Integer.toString(bcpcnt));
			}
			else if(bch.equals("ENTC") && bch5.equals("FE"))
			{
				ecnt++;
				fecnt++;
				count++;
				PRN="EN"+yr+(Integer.toString(ecnt));
				SeatNo=bch5+yr+(Integer.toString(fecnt));
			}
			else if(bch.equals("ENTC") && bch5.equals("SE"))
			{
				ecnt++;
				secnt++;
				count++;
				PRN="EN"+yr+(Integer.toString(ecnt));
				SeatNo=bch5+yr+(Integer.toString(secnt));
			}
			else if(bch.equals("ENTC") && bch5.equals("TE"))
			{
				ecnt++;
				tecnt++;
				count++;
				PRN="EN"+yr+(Integer.toString(ecnt));
				SeatNo=bch5+yr+(Integer.toString(tecnt));
			}
			else if(bch.equals("ENTC") && bch5.equals("BE"))
			{
				ecnt++;
				becnt++;
				count++;
				PRN="EN"+yr+(Integer.toString(ecnt));
				SeatNo=bch5+yr+(Integer.toString(becnt));
			}
			else if(bch.equals("IT") && bch5.equals("FE"))
			{
				itcnt++;
				fitcnt++;
				count++;
				PRN="IT"+yr+(Integer.toString(itcnt));
				SeatNo=bch5+yr+(Integer.toString(fitcnt));
			}
			else if(bch.equals("IT") && bch5.equals("SE"))
			{
				itcnt++;
				sitcnt++;
				count++;
				PRN="IT"+yr+(Integer.toString(itcnt));
				SeatNo=bch5+yr+(Integer.toString(sitcnt));
			}
			else if(bch.equals("IT") && bch5.equals("TE"))
			{
				itcnt++;
				titcnt++;
				count++;
				PRN="IT"+yr+(Integer.toString(itcnt));
				SeatNo=bch5+yr+(Integer.toString(titcnt));
			}
			else if(bch.equals("IT") && bch5.equals("BE"))
			{
				itcnt++;
				bitcnt++;
				count++;
				PRN="IT"+yr+(Integer.toString(itcnt));
				SeatNo=bch5+yr+(Integer.toString(bitcnt));
			}
			else if(bch.equals("Instrumentation") && bch5.equals("FE"))
			{
				inscnt++;
				finscnt++;
				count++;
				PRN="IS"+yr+(Integer.toString(inscnt));
				SeatNo=bch5+yr+(Integer.toString(finscnt));
			}
			else if(bch.equals("Instrumentation") && bch5.equals("SE"))
			{
				inscnt++;
				sinscnt++;
				count++;
				PRN="IS"+yr+(Integer.toString(inscnt));
				SeatNo=bch5+yr+(Integer.toString(sinscnt));
			}
			else if(bch.equals("Instrumentation") && bch5.equals("TE"))
			{
				inscnt++;
				tinscnt++;
				count++;
				PRN="IS"+yr+(Integer.toString(inscnt));
				SeatNo=bch5+yr+(Integer.toString(tinscnt));
			}
			else if(bch.equals("Instrumentation") && bch5.equals("BE"))
			{
				inscnt++;
				binscnt++;
				count++;
				PRN="IS"+yr+(Integer.toString(inscnt));
				SeatNo=bch5+yr+(Integer.toString(binscnt));
			}
			else if(bch.equals("Electrical") && bch5.equals("FE"))
			{
				elcnt++;
				felcnt++;
				count++;
				PRN="EL"+yr+(Integer.toString(elcnt));
				SeatNo=bch5+yr+(Integer.toString(felcnt));
			}
			else if(bch.equals("Electrical") && bch5.equals("SE"))
			{
				elcnt++;
				selcnt++;
				count++;
				PRN="EL"+yr+(Integer.toString(elcnt));
				SeatNo=bch5+yr+(Integer.toString(selcnt));
			}
			else if(bch.equals("Electrical") && bch5.equals("TE"))
			{
				elcnt++;
				telcnt++;
				count++;
				PRN="EL"+yr+(Integer.toString(elcnt));
				SeatNo=bch5+yr+(Integer.toString(telcnt));
			}
			else if(bch.equals("Electrical") && bch5.equals("BE"))
			{
				elcnt++;
				belcnt++;
				count++;
				PRN="EL"+yr+(Integer.toString(elcnt));
				SeatNo=bch5+yr+(Integer.toString(belcnt));
			}
			else if(bch.equals("Petroleum") && bch5.equals("FE"))
			{
				pcnt++;
				fpcnt++;
				count++;
				PRN="PT"+yr+(Integer.toString(pcnt));
				SeatNo=bch5+yr+(Integer.toString(fpcnt));
			}
			else if(bch.equals("Petroleum") && bch5.equals("SE"))
			{
				pcnt++;
				spcnt++;
				count++;
				PRN="PT"+yr+(Integer.toString(pcnt));
				SeatNo=bch5+yr+(Integer.toString(spcnt));
			}
			else if(bch.equals("Petroleum") && bch5.equals("TE"))
			{
				pcnt++;
				tpcnt++;
				count++;
				PRN="PT"+yr+(Integer.toString(pcnt));
				SeatNo=bch5+yr+(Integer.toString(tpcnt));
			}
			else if(bch.equals("Petroleum") && bch5.equals("BE"))
			{
				pcnt++;
				bpcnt++;
				count++;
				PRN="PT"+yr+(Integer.toString(pcnt));
				SeatNo=bch5+yr+(Integer.toString(bpcnt));
			}
			else if(bch.equals("Metallurgy") && bch5.equals("FE"))
			{
				mcnt++;
				fmcnt++;
				count++;
				PRN="MT"+yr+(Integer.toString(mcnt));
				SeatNo=bch5+yr+(Integer.toString(fmcnt));
			}
			else if(bch.equals("Metallurgy") && bch5.equals("SE"))
			{
				mcnt++;
				smcnt++;
				count++;
				PRN="MT"+yr+(Integer.toString(mcnt));
				SeatNo=bch5+yr+(Integer.toString(smcnt));
			}
			else if(bch.equals("Metallurgy") && bch5.equals("TE"))
			{
				mcnt++;
				tmcnt++;
				count++;
				PRN="MT"+yr+(Integer.toString(mcnt));
				SeatNo=bch5+yr+(Integer.toString(tmcnt));
			}
			else if(bch.equals("Metallurgy") && bch5.equals("BE"))
			{
				mcnt++;
				bmcnt++;
				count++;
				PRN="MT"+yr+(Integer.toString(mcnt));
				SeatNo=bch5+yr+(Integer.toString(bmcnt));
			}
			else if(bch.equals("Geology") && bch5.equals("FE"))
			{
				gcnt++;
				fgcnt++;
				count++;
				PRN="GE"+yr+(Integer.toString(gcnt));
				SeatNo=bch5+yr+(Integer.toString(fgcnt));
			}
			else if(bch.equals("Geology") && bch5.equals("SE"))
			{
				gcnt++;
				sgcnt++;
				count++;
				PRN="GE"+yr+(Integer.toString(gcnt));
				SeatNo=bch5+yr+(Integer.toString(sgcnt));
			}
			else if(bch.equals("Geology") && bch5.equals("TE"))
			{
				gcnt++;
				tgcnt++;
				count++;
				PRN="GE"+yr+(Integer.toString(gcnt));
				SeatNo=bch5+yr+(Integer.toString(tgcnt));
			}
			else if(bch.equals("Geology") && bch5.equals("BE"))
			{
				gcnt++;
				bgcnt++;
				count++;
				PRN="GE"+yr+(Integer.toString(gcnt));
				SeatNo=bch5+yr+(Integer.toString(bgcnt));
			}
			User=t14.getText();
			Pass=new String(t15.getPassword());
			Cpass=new String(t16.getPassword());
			Branch=bch;

			if(Pass.equals(Cpass))
				c1=1;
			else
			{
				JOptionPane.showMessageDialog(f3,"Passwords do not match! Retype","Mismatch",JOptionPane.WARNING_MESSAGE);
				t15.setText("");
				t16.setText("");
				c1=2;
			}

			if(Phno.length()!=10)
			{
				JOptionPane.showMessageDialog(f3,"Invalid mobile number!","Student Portal",JOptionPane.WARNING_MESSAGE);
				t10.setText("");
				c1=2;
			}

			if(User.length()<5)
			{
				JOptionPane.showMessageDialog(f3,"Please enter longer Username!","Student Portal",JOptionPane.WARNING_MESSAGE);
				t14.setText("");
				c1=2;
			}

			if(Pass.length()<5)
			{
				JOptionPane.showMessageDialog(f3,"Please enter longer Password!","Student Portal",JOptionPane.WARNING_MESSAGE);
				t15.setText("");
				t16.setText("");
				c1=2;
			}


			if(Name.equals("") || Gender.equals("") || Address.equals("") || Birth.equals("") || Country.equals("") || Phno.equals("") || Email.equals("") || Branch.equals("") || Year.equals("") || User.equals("") || Pass.equals("") || Cpass.equals(""))
				c1=0;
			if(c1==1)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="insert into sportalc values('"+Name+"','"+Gender+"','"+Birth+"','"+Country+"','"+Address+"','"+Phno+"','"+Email+"','"+Branch+"','"+PRN+"','"+SeatNo+"','"+Sem+"','"+Year+"','"+User+"','"+Pass+"')";
					st.executeUpdate(s);
					t5_1.setText("");
					t5_2.setText("");
					t5_3.setText("");
					t8.setText("");
					t9.setText("");
					t10.setText("");
					t11.setText("");
					ch.select(0);
					c3.select(0);
					t14.setText("");
					t15.setText("");
					st.close();
					con.close();
					f3.setVisible(false);
					f1.setVisible(true);
					JOptionPane.showMessageDialog(f1,"Student Sign-Up successful!","Student Portal",JOptionPane.INFORMATION_MESSAGE);
				}
				catch(Exception e)
				{

				}
			}
			else if(c1==0)
				JOptionPane.showMessageDialog(f3,"Mandatory fields left blank!","Student Portal",JOptionPane.WARNING_MESSAGE);
			else if(c1==2)
				JOptionPane.showMessageDialog(f3,"Please fill the details!","Student Portal",JOptionPane.WARNING_MESSAGE);
 		}

 		else if(ae.getSource()==b10)
 		{
 			int x=JOptionPane.showConfirmDialog(f2,"Are you sure you don't want to signup?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
					t5_1.setText("");
					t5_2.setText("");
					t5_3.setText("");
					t7.setText("");
					t8.setText("");
					t9.setText("");
					t10.setText("");
					t11.setText("");
					ch.select(0);
					c3.select(0);
					t14.setText("");
					t15.setText("");
					t16.setText("");
 					f3.setVisible(false);
 					f1.setVisible(true);
 			}
 		}


		else if(ae.getSource()==b11)
 		{
			int c1=5;
			n1=t17_1.getText();
			n2=t17_2.getText();
			n3=t17_3.getText();
			Name=n1+" "+n2+" "+n3;
			if(g1==1)
				Gender="Male";
			else if(g1==0)
				Gender="Female";
			Birth=t19.getText();
			Country=t20.getText();
			Address=t21.getText();
			Phno=t22.getText();
			Email=t23.getText();
			User=t24.getText();
			Pass=new String(t25.getPassword());
			Cpass=new String(t26.getPassword());

			if(Pass.equals(Cpass))
				c1=1;
			else
			{
				JOptionPane.showMessageDialog(f4,"Passwords do not match! Retype","Mismatch",JOptionPane.WARNING_MESSAGE);
				t25.setText("");
				t26.setText("");
				c1=2;
			}

			if(Phno.length()!=10)
			{
				JOptionPane.showMessageDialog(f4,"Invalid mobile number!","Admin Portal",JOptionPane.WARNING_MESSAGE);
				t22.setText("");
				c1=2;
			}

			if(User.length()<5)
			{
				JOptionPane.showMessageDialog(f4,"Please enter longer Username!","Admin Portal",JOptionPane.WARNING_MESSAGE);
				t24.setText("");
				c1=2;
			}

			if(Pass.length()<5)
			{
				JOptionPane.showMessageDialog(f4,"Please enter longer Password!","Admin Portal",JOptionPane.WARNING_MESSAGE);
				t25.setText("");
				t26.setText("");
				c1=2;
			}


			if(Name.equals("") || Gender.equals("") || Address.equals("") || Birth.equals("") || Country.equals("") || Phno.equals("") || Email.equals("") || User.equals("") || Pass.equals("") || Cpass.equals(""))
				c1=0;
			if(c1==1)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="insert into aportalc values('"+Name+"','"+Gender+"','"+Birth+"','"+Country+"','"+Address+"','"+Phno+"','"+Email+"','"+User+"','"+Pass+"')";
					st.executeUpdate(s);
					t17_1.setText("");
					t17_2.setText("");
					t17_3.setText("");
					t19.setText("");
					t20.setText("");
					t21.setText("");
					t22.setText("");
					t23.setText("");
					t24.setText("");
					t25.setText("");
					t26.setText("");
					st.close();
					con.close();
				}
				catch(Exception e)
				{

				}
				f4.setVisible(false);
				f2.setVisible(true);
				JOptionPane.showMessageDialog(f2,"Admin Sign-Up successful!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(c1==0)
				JOptionPane.showMessageDialog(f4,"Mandatory fields left blank!","Admin Portal",JOptionPane.WARNING_MESSAGE);
			else if(c1==2)
				JOptionPane.showMessageDialog(f4,"Please fill the details!","Admin Portal",JOptionPane.WARNING_MESSAGE);
		}

 		else if(ae.getSource()==b12)
 		{
 			int x=JOptionPane.showConfirmDialog(f2,"Are you sure you don't want to signup?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
					t17_1.setText("");
					t17_2.setText("");
					t17_3.setText("");
					t19.setText("");
					t20.setText("");
					t21.setText("");
					t22.setText("");
					t23.setText("");
					t24.setText("");
					t25.setText("");
					t26.setText("");
 					f4.setVisible(false);
 					f2.setVisible(true);
 			}
 		}

		else if(ae.getSource()==b13)
 		{
 			int x=JOptionPane.showConfirmDialog(f1,"Are you sure you want to log out?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
 					f5.setVisible(false);
 					f1.setVisible(true);
 			}
 		}

		else if(ae.getSource()==b14)
 		{
 			f.setVisible(false);
 			f7.setVisible(true);
 			JOptionPane.showMessageDialog(f7,"Welcome To Teachers Portal","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);
 		}

		else if(ae.getSource()==b15)
 		{
 			int x=JOptionPane.showConfirmDialog(f,"Are you sure you want to leave the Teacher's Portal?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
					t39.setText("");
					t40.setText("");
 					f8.setVisible(false);
 					f.setVisible(true);
 					break;
 			}
 		}


		else if(ae.getSource()==b16)
 		{
 			f7.setVisible(false);
 			f8.setVisible(true);
			JOptionPane.showMessageDialog(f8,"Teachers Sign-Up","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);
 		}

		else if(ae.getSource()==b17)
 		{
			temp1=t39.getText();
			temp2=new String(t40.getPassword());
			if(temp1.equals("") || temp2.equals(""))
			{
				JOptionPane.showMessageDialog(f7,"Enter The Username and password!","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);
				t39.setText("");
				t40.setText("");
			}
			else
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="select * from tportalc";
					ResultSet rs=st.executeQuery(s);
					int flag=5;
					while(rs.next())
					{
						if(rs.getString(9).equals(temp1) && rs.getString(10).equals(temp2))
						{
							flag=1;
							break;
						}
						else
							flag=0;
					}
					if(flag==1)
					{
						t39.setText("");
						t40.setText("");
						f7.setVisible(false);
						f9.setVisible(true);
 						JOptionPane.showMessageDialog(f9,"Login Successful!","Teachers Details",JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(f7,"Login Unsuccessful!","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);
						t39.setText("");
						t40.setText("");
					}
					rs.close();
					con.close();
				}
				catch(Exception e)
				{

				}

			}
		}

		else if(ae.getSource()==b18)
		{
			int c1=5;
			n1=t41_1.getText();
			n2=t41_2.getText();
			n3=t41_3.getText();
			Name=n1+" "+n2+" "+n3;
			if(g2==1)
				Gender="Male";
			else if(g2==0)
				Gender="Female";
			Birth=t42.getText();
			Country=t43.getText();
			Address=t44.getText();
			Phno=t45.getText();
			Email=t46.getText();
			User=t47.getText();
			Pass=new String(t48.getPassword());
			Cpass=new String(t49.getPassword());
			Branch=bch1;

			if(Pass.equals(Cpass))
				c1=1;
			else
			{
				JOptionPane.showMessageDialog(f8,"Passwords do not match! Retype","Mismatch",JOptionPane.WARNING_MESSAGE);
				t48.setText("");
				t49.setText("");
				c1=2;
			}

			if(Phno.length()!=10)
			{
				JOptionPane.showMessageDialog(f8,"Invalid mobile number!","Teacher's Portal",JOptionPane.WARNING_MESSAGE);
				t45.setText("");
				c1=2;
			}

			if(User.length()<5)
			{
				JOptionPane.showMessageDialog(f8,"Please enter longer Username!","Teacher's Portal",JOptionPane.WARNING_MESSAGE);
				t47.setText("");
				c1=2;
			}

			if(Pass.length()<5)
			{
				JOptionPane.showMessageDialog(f8,"Please enter longer Password!","Teacher's Portal",JOptionPane.WARNING_MESSAGE);
				t48.setText("");
				t49.setText("");
				c1=2;
			}


			if(Name.equals("") || Gender.equals("") || Address.equals("") || Birth.equals("") || Country.equals("") || Phno.equals("") || Email.equals("") || User.equals("") || Pass.equals("") || Cpass.equals(""))
				c1=0;
			if(c1==1)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="insert into tportalc values('"+Name+"','"+Gender+"','"+Birth+"','"+Country+"','"+Address+"','"+Phno+"','"+Email+"','"+Branch+"','"+User+"','"+Pass+"')";
					st.executeUpdate(s);
					t41_1.setText("");
					t41_2.setText("");
					t41_3.setText("");
					t42.setText("");
					t43.setText("");
					t44.setText("");
					t45.setText("");
					ch_1.select(0);
					t46.setText("");
					t47.setText("");
					t48.setText("");
					t49.setText("");
					st.close();
					con.close();

				}
				catch(Exception e)
				{

				}
				f8.setVisible(false);
				f7.setVisible(true);
				JOptionPane.showMessageDialog(f7,"Teacher Sign-Up successful!","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(c1==0)
				JOptionPane.showMessageDialog(f8,"Mandatory fields left blank!","Teacher's Portal",JOptionPane.WARNING_MESSAGE);
			else if(c1==2)
				JOptionPane.showMessageDialog(f8,"Please fill the details!","Teacher's Portal",JOptionPane.WARNING_MESSAGE);
		}

		else if(ae.getSource()==b19)
		{
			int x=JOptionPane.showConfirmDialog(f8,"Are you sure you don't want to signup?");
			switch(x)
			{
				case JOptionPane.YES_OPTION:
					t41_1.setText("");
					t41_2.setText("");
					t41_3.setText("");
					t42.setText("");
					t43.setText("");
					t44.setText("");
					t45.setText("");
					ch_1.select(0);
					t46.setText("");
					t47.setText("");
					t48.setText("");
					t49.setText("");
					f8.setVisible(false);
					f7.setVisible(true);
					break;
			}
		}

		else if(ae.getSource()==b20)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement();
				String s;
				s="select s.Name,s.PRN,t.Name,s.SeatNo from sportalc s,tportalc t where s.Year=bch2 and s.Sem=bch4 and s.Branch=bch3";
				ResultSet rs=st.executeQuery(s);
				Student=rs.getString(1);
				Name=rs.getString(3);
				SeatNo=rs.getString(4);
				PRN=rs.getString(2);
				//Date

				s="insert into atportalc values('"+Name+"','"+Student+"','"+PRN+"','"+SeatNo+"','"+Attendance+"'/*,'"+Date+"'*/,'"+Subject+"')";
				st.executeUpdate(s);
			}
			catch(Exception e)
			{

			}
		}

		else if(ae.getSource()==b21)
		{
			String tp="",tsd="";
			int flag=0;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				String s;
				s="select * from sportalc";
				ResultSet rs=st.executeQuery(s);
				tp=t51.getText();
				tsd=t50.getText();
				while(rs.next())
				{
					if((rs.getString(1)).equals(tsd) && (rs.getString(9)).equals(tp))
					{
						rs.deleteRow();
						flag=1;
						JOptionPane.showMessageDialog(f6,"Deleted the data entry successfully!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
						break;
					}
				}
				if(flag==0)
					JOptionPane.showMessageDialog(f6,"Entry not found!","Admin Portal",JOptionPane.WARNING_MESSAGE);
				st.close();
				con.close();
			}
			catch(Exception e)
			{

			}
		}

		else if(ae.getSource()==b23)
		{
			String ts="",tyr="";
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				String s;
				s="select * from sportalc";
				String sql = "alter table sportalc add primary key (PRN)";
				st.executeUpdate(sql);
				ResultSet rs=st.executeQuery(s);
				while(rs.next())
				{
					ts=rs.getString(11);
					tyr=rs.getString(12);
					if(ts.equals("I"))
						rs.updateString(11,"II");
					else if(ts.equals("II") && tyr.equals("BE"))
						rs.updateString(12,"Passed");
					else if(ts.equals("II") && tyr.equals("TE"))
					{
						rs.updateString(12,"BE");
						rs.updateString(11,"I");
					}
					else if(ts.equals("II") && tyr.equals("SE"))
					{
						rs.updateString(12,"TE");
						rs.updateString(11,"I");
					}
					else if(ts.equals("II") && tyr.equals("FE"))
					{
						rs.updateString(12,"SE");
						rs.updateString(11,"I");
					}
					rs.updateRow();
					continue;
				}
				rs.close();
				con.close();
			}
			catch(Exception e)
			{

			}
			JOptionPane.showMessageDialog(f6,"Altered the data entries successfully!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
		}

		else if(ae.getSource()==b24)
		{
			String tp="",tsd="";
			int flag=0;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				String s;
				s="select * from tportalc";
				ResultSet rs=st.executeQuery(s);
				tp=t53.getText();
				tsd=t52.getText();
				while(rs.next())
				{
					if((rs.getString(1)).equals(tsd) && (rs.getString(6)).equals(tp))
					{
						rs.deleteRow();
						flag=1;
						JOptionPane.showMessageDialog(f6,"Deleted the data entry successfully!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
						break;
					}
				}
				if(flag==0)
					JOptionPane.showMessageDialog(f6,"Entry not found!","Admin Portal",JOptionPane.WARNING_MESSAGE);
				st.close();
				con.close();
			}
			catch(Exception e)
			{

			}
		}


		else if(ae.getSource()==b27)
 		{
 			int x=JOptionPane.showConfirmDialog(f6,"Are you sure you want to log out?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
 					f6.setVisible(false);
 					f2.setVisible(true);
 			}
 		}

		else if(ae.getSource()==b28)
 		{
 			int x=JOptionPane.showConfirmDialog(f9,"Are you sure you want to log out?");
 			switch(x)
 			{
 				case JOptionPane.YES_OPTION:
 					f9.setVisible(false);
 					f7.setVisible(true);
 			}
 		}

		else if(ae.getSource()==b29)
 		{
			Subject=t58.getText();
 			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement();
				String s;
				Branch=bch6;
				Year=bch7;
				Sem=bch8;
				if(Subject.equals("") || bch6.equals("Select Branch") || bch7.equals("Select Year") || bch8.equals("Select Sem"))
					JOptionPane.showMessageDialog(f6,"Please enter the fields!","Admin Portal",JOptionPane.WARNING_MESSAGE);
				else
				{
					s="insert into subjectc values('"+Branch+"','"+Subject+"','"+Year+"','"+Sem+"')";
					st.executeUpdate(s);
					JOptionPane.showMessageDialog(f6,"Subject Added Successfully!","Admin Portal",JOptionPane.INFORMATION_MESSAGE);
				}
				st.close();
				con.close();
			}
			catch(Exception e)
			{

			}
 		}

		else if(ae.getSource()==b31)
 		{
			temp5=t56.getText();
			if(temp5.equals("") || bch10.equals("") || bch11.equals("Select Branch") || bch12.equals("Select Sem") || bch13.equals("Select Subject"))
				JOptionPane.showMessageDialog(f9,"Please enter the fields!","Admin Portal",JOptionPane.WARNING_MESSAGE);
			else
			{
 				c4.select(0);
				c4_1.select(0);
				c4_2.select(0);
				c4_3.select(0);
				t56.setText("");
				testflag++;
				f9.setVisible(false);
				f10.setVisible(true);
			}
 		}

		else if(ae.getSource()==b32)
 		{
			int flag1=0;
			temp6=t57.getText();
			if(temp6.equals("") || bch10.equals("Select Year") || bch11.equals("Select Branch") || bch12.equals("Select Sem") || bch13.equals("Select Subject"))
				JOptionPane.showMessageDialog(f9,"Please enter the fields!","Admin Portal",JOptionPane.WARNING_MESSAGE);
			else
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;
					s="select * from testc";
					ResultSet rs=st.executeQuery(s);
					while(rs.next())
					{
						if(rs.getString(1).equals(temp6))
						{
							testflag++;
							JOptionPane.showMessageDialog(f10,"Question Added Successfully!","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);
							flag1=1;
							break;
						}
					}
					if(flag1==0)
						JOptionPane.showMessageDialog(f9,"Test Series number doesnt match!","Admin Portal",JOptionPane.WARNING_MESSAGE);
					c4.select(0);
					c4_1.select(0);
					c4_2.select(0);
					c4_3.select(0);
					t57.setText("");
					st.close();
					con.close();
				}
				catch(Exception e)
				{

				}
			}
 		}

		else if(ae.getSource()==b33)
 		{
			int flag=0;
			String tempq=t63.getText();
			Question=ta1.getText();
			QuesNo=t63.getText();
			A=t59.getText();
			B=t60.getText();
			C=t61.getText();
			D=t62.getText();
			Tbranch=bch11;
			Tyear=bch10;
			Tsem=bch12;
			Tsubject=bch13;
			TestNo=temp5;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement();
				String s,str;
				if(Question.equals("") || A.equals("") || B.equals("") || C.equals("") || D.equals("") || QuesNo.equals(""))
					JOptionPane.showMessageDialog(f10,"Please enter the fields!","Teachers Portal",JOptionPane.WARNING_MESSAGE);
				else
				{
					str="select * from testc";
					ResultSet rs=st.executeQuery(str);
					while(rs.next())
					{
						if(tempq.equals(rs.getString(2)))
						{
							JOptionPane.showMessageDialog(f10,"Please enter the Differnt QuesNo","Teachers Portal",JOptionPane.WARNING_MESSAGE);
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						s="insert into testc values('"+TestNo+"','"+QuesNo+"','"+Question+"','"+A+"','"+B+"','"+C+"','"+D+"','"+Tbranch+"','"+Tyear+"','"+Tsem+"','"+Tsubject+"')";
						st.executeUpdate(s);
						JOptionPane.showMessageDialog(f9,"Question Added Successfully!","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);

						ta1.setText("");
						t59.setText("");
						t60.setText("");
						t61.setText("");
						t62.setText("");
						c4.select(0);
						c4_1.select(0);
						c4_2.select(0);
						c4_3.select(0);
						t56.setText("");
						f10.setVisible(false);
						f9.setVisible(true);
					}
				}
				st.close();
				con.close();
			}
			catch(Exception e)
			{

			}
 		}

		else if(ae.getSource()==b34)
 		{
			Question=ta1.getText();
			A=t59.getText();
			B=t60.getText();
			C=t61.getText();
			D=t62.getText();
			Tyear=bch10;
			Tbranch=bch11;
			Tsem=bch12;
			Tsubject=bch13;
			TestNo=temp5;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement();
				String s;
				Branch=bch6;
				Year=bch7;
				Sem=bch8;
				if(Question.equals("") || A.equals("") || B.equals("") || C.equals("") || D.equals(""))
					JOptionPane.showMessageDialog(f10,"Please enter the fields!","Teachers Portal",JOptionPane.WARNING_MESSAGE);
				else
				{
					s="insert into testc values('"+TestNo+"','"+Question+"','"+A+"','"+B+"','"+C+"','"+D+"','"+Tbranch+"','"+Tyear+"','"+Tsem+"','"+Tsubject+"')";
					st.executeUpdate(s);
					JOptionPane.showMessageDialog(f10,"Question Added Successfully!","Teachers Portal",JOptionPane.INFORMATION_MESSAGE);

					ta1.setText("");
					t59.setText("");
					t60.setText("");
					t61.setText("");
					t62.setText("");
				}
				st.close();
				con.close();
			}
			catch(Exception e)
			{

			}
 		}

		else if(ae.getSource()==b35)
 		{
			tcount=4;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
				Statement st=con.createStatement();
				String s;
				s="select * from testc";
				ResultSet rs=st.executeQuery(s);
				while(rs.next())
				{
					if((int)(5*Math.random())==Integer.parseInt(rs.getString(2)))
					{
						ques=rs.getString(3);
						opa=rs.getString(4);
						opb=rs.getString(5);
						opc=rs.getString(6);
						opd=rs.getString(7);

						ta2.setText(ques);
						cg4=new CheckboxGroup();
 						ch7=new Checkbox(opa,cg4,false);
 						ch7.addItemListener(this);
 						ch7.setBounds(150,500,165,50);
 						ch8=new Checkbox(opb,cg4,false);
 						ch8.setBounds(325,500,165,50);
 						ch8.addItemListener(this);
 						ch9=new Checkbox(opc,cg4,false);
 						ch9.addItemListener(this);
 						ch9.setBounds(500,500,165,50);
 						ch10=new Checkbox(opd,cg4,false);
 						ch10.setBounds(675,500,165,50);
 						ch10.addItemListener(this);

						p12.add(ch7);
						p12.add(ch8);
						p12.add(ch9);
						p12.add(ch10);
						break;
					}
				}
				f5.setVisible(false);
				f11.setVisible(true);
				st.close();
				con.close();
			}
			catch(Exception e)
			{

			}
 		}

		else if(ae.getSource()==b36)
		{
			if(tcount>0)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
					Statement st=con.createStatement();
					String s;

					Name=tname;
					PRN=tprn;
					Answer=ans;
					Question=ques;
					Tbranch=tbranch;
					Tyear=tyear;

					while(count>0)
					{
						s="select * from testc";
						ResultSet rs=st.executeQuery(s);
						while(rs.next())
						{
							if((int)(5*Math.random())==Integer.parseInt(rs.getString(2)))
							{
								ques=rs.getString(3);
								opa=rs.getString(4);
								opb=rs.getString(5);
								opc=rs.getString(6);
								opd=rs.getString(7);

								ta2.setText(ques);
								cg4=new CheckboxGroup();
 								ch7=new Checkbox(opa,cg4,false);
 								ch7.addItemListener(this);
 								ch7.setBounds(150,500,165,50);
 								ch8=new Checkbox(opb,cg4,false);
 								ch8.setBounds(325,500,165,50);
 								ch8.addItemListener(this);
 								ch9=new Checkbox(opc,cg4,false);
 								ch9.addItemListener(this);
 								ch9.setBounds(500,500,165,50);
 								ch10=new Checkbox(opd,cg4,false);
 								ch10.setBounds(675,500,165,50);
 								ch10.addItemListener(this);

								p12.add(ch7);
								p12.add(ch8);
								p12.add(ch9);
								p12.add(ch10);
								tcount--;
								break;
							}
						}
					}
					st.close();
					con.close();
				}
				catch(Exception e)
				{

				}
			}
			else
			{
				JOptionPane.showMessageDialog(f11,"End of Test Series!","Student's Portal",JOptionPane.INFORMATION_MESSAGE);
				ta2.setText("");
				testflag--;
				f11.setVisible(false);
				f5.setVisible(true);
			}
		}
	}


 	public void itemStateChanged(ItemEvent ie)
 	{
		g=100;
		g1=100;
		g2=100;
 		if(ch1.getState()==true)
			g=1;
		else if(ch2.getState()==true)
			g=0;
		if(ch3.getState()==true)
			g1=1;
		else if(ch4.getState()==true)
			g1=0;
		if(ch5.getState()==true)
			g2=1;
		else if(ch6.getState()==true)
			g2=0;
		bch=new String(ch.getSelectedItem());
		bch1=new String(ch_1.getSelectedItem());
		bch2=new String(c2.getSelectedItem());
		bch3=new String(c2_1.getSelectedItem());
		bch4=new String(c2_2.getSelectedItem());
		bch9=new String(c2_3.getSelectedItem());
		bch5=new String(c3.getSelectedItem());
		bch6=new String(c5.getSelectedItem());
		bch7=new String(c6.getSelectedItem());
		bch8=new String(c7.getSelectedItem());
		bch10=new String(c4.getSelectedItem());
		bch11=new String(c4_1.getSelectedItem());
		bch12=new String(c4_2.getSelectedItem());
		bch13=new String(c4_3.getSelectedItem());

		if(ch7.getState()==true)
			ans="A";
		if(ch7.getState()==true)
			ans="B";
		if(ch7.getState()==true)
			ans="C";
		if(ch7.getState()==true)
			ans="D";

 	}

	public void focusGained(FocusEvent fe)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Portalc","root","root");
			Statement st=con.createStatement();
			String sr;
			sr="select * from subjectc";
			ResultSet rs=st.executeQuery(sr);
			while(rs.next() && rs.getString(1).equals(bch3) && rs.getString(3).equals(bch2) && rs.getString(4).equals(bch4))
				c2_3.add(rs.getString(2));
			sr="select * from subjectc";
			rs=st.executeQuery(sr);
			while(rs.next() && rs.getString(1).equals(bch11) && rs.getString(3).equals(bch10) && rs.getString(4).equals(bch12))
				c4_3.add(rs.getString(2));
			rs.close();
			con.close();
		}
		catch(Exception e)
		{

		}
	}

	public void focusLost(FocusEvent fe)
	{

	}

 	public static void main(String args[])
	{
 		new JDBC_Project();
 	}
 }
