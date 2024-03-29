package view;

import java.awt.*;

import javax.swing.*;

import model.heroes.*;

public class HeroPanel extends JPanel{
	
	private JLabel heroImage;
	private JButton heroPower;
	private JLabel deckCards;
	private ManaBar manaBar;
	private HealthBar health;
	
	private Hero hero;
	
	private int width;
	private int height;
	
	private JLabel backGround;
	
	public HeroPanel(int twidth,int theight) {
		super();
		this.width=twidth/5;
		this.height=theight*21/44;
		setPreferredSize(new Dimension(width,height));
		//setLayout(new GridBagLayout());
		setBackground(Color.black);
		
		
		setLayout(null);
		
		JLayeredPane pane = new JLayeredPane();
		pane.setLocation(0, 0);
		pane.setSize(width, height);
		add(pane);
		
		
		backGround=new JLabel();
		backGround.setSize(new Dimension(width,height));
		backGround.setLayout(new GridBagLayout());
		backGround.setLocation(0, 0);
		pane.add(backGround,1,0);
		
		GridBagConstraints c = new GridBagConstraints();
		//ImageIcon i=new ImageIcon("images/Fire_Mage_Jaina.png");
		heroImage = new JLabel();
		
//		heroImage.setIcon(new ImageIcon(new javax.swing.ImageIcon(
//				getClass().getResource("images/Fire_Mage_Jaina.png"))
//				.getImage()
//				.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		heroImage.setPreferredSize(new Dimension (width*4/5,height/2));
		
		deckCards = new JLabel();
		Font f=new Font("Traditional serif", Font.BOLD, 45) ;
		Font f2=new Font("Traditional serif", Font.BOLD, 30) ;
		deckCards.setFont(f2);
		deckCards.setHorizontalAlignment(JLabel.CENTER);
		deckCards.setPreferredSize(new Dimension (width*4/5,height/12));
		heroPower = new JButton();
		heroPower.setActionCommand("Hero Power");
		heroPower.setHorizontalAlignment(JButton.CENTER);
		heroPower.setFont(new Font("Traditional serif", Font.BOLD, 20) );
		heroPower.setSize(new Dimension (height/4,height/4));
		heroPower.setLocation(width*3/5,height*2/5);
		manaBar=new ManaBar(width*4/5,height/11);
		//manaBar.setPreferredSize(new Dimension(width/2,height/12));
		//manaBar.setValue(0);
		//manaBar.setString("");
		manaBar.setFont(f);
		//manaBar.setStringPainted(true);
		health=new HealthBar(width*4/5,height/12);
		health.setPreferredSize(new Dimension(width*4/5,height/12));
//		health.setValue(0);
//		health.setString("");
		health.setFont(f);
		//health.setStringPainted(true);
		c.gridx=0;
		c.gridy=0;
		backGround.add(heroImage,c);
		c.gridy=1;
		backGround.add(deckCards,c);
		c.gridy=2;
//		backGround.add(heroPower,c);
//		c.gridy=3;
		backGround.add(health,c);
		c.gridy=3;
		backGround.add(manaBar,c);
		pane.add(heroPower,2,0);
		heroPower.setContentAreaFilled(false);
		heroPower.setBorderPainted(false);
		heroPower.setFocusPainted(false);
		
	}
	
	
	
	

	public HealthBar getHealth() {
		return health;
	}

	public void setHealth(HealthBar health) {
		this.health = health;
	}


	public JLabel getHeroImage() {
		return heroImage;
	}
	public void setHeroImage(JLabel heroImage) {
		this.heroImage = heroImage;
	}
	public JButton getHeroPower() {
		return heroPower;
	}
	public void setHeroPower(JButton heroPower) {
		this.heroPower = heroPower;
	}
	public JLabel getHeroType() {
		return deckCards;
	}
	public void setDeckCards(JLabel dc) {
		this.deckCards = dc;
	}
	
	public JLabel getDeckCards() {
		return deckCards;
	}





	public JLabel getBackGround() {
		return backGround;
	}





	public void setBackGround(JLabel backGround) {
		this.backGround = backGround;
	}





	public ManaBar getManaBar() {
		return manaBar;
	}
	public void setManaBar(ManaBar mana) {
		this.manaBar = mana;
	}





	public int getWidth() {
		return width;
	}





	public void setWidth(int width) {
		this.width = width;
	}





	public int getHeight() {
		return height;
	}





	public void setHeight(int height) {
		this.height = height;
	}





	public Hero getHero() {
		return hero;
	}





	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
	
}
