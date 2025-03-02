import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.HashMap;

public class CoffeeMenu {
    private static HashMap<String, Integer> orderMap = new HashMap<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("قهوه خونه رباط کریم اوشاخلاری");
        frame.setSize(1550, 820);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon = new ImageIcon("src/Robatkarim.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1550, 720);
        frame.setContentPane(label);
        label.setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1550, 720);
        mainPanel.setOpaque(false);
        label.add(mainPanel);
        mainPanel.setLayout(null);

        showHomeScreen(mainPanel);

        frame.setVisible(true);
    }

    private static void showHomeScreen(JPanel mainPanel) {
        mainPanel.removeAll();

        JLabel titleLabel = new JLabel("بشکند دستی که بلرزد                   بمیرد دلی که بترسد");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setForeground(Color.white);
        titleLabel.setBounds(390, 10, 1000, 100);
        mainPanel.add(titleLabel);

        JLabel nameLabel = new JLabel("قهوه خونه رباط کریم اوشاخلاری", SwingConstants.CENTER);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
        nameLabel.setForeground(Color.white);
        nameLabel.setBounds(270, 200, 1000, 100);
        mainPanel.add(nameLabel);

        JButton menuButton = new JButton("منو");
        menuButton.setFont(new Font("Arial", Font.BOLD, 50));
        menuButton.setForeground(Color.WHITE);
        menuButton.setBounds(600, 500, 300, 100);
        menuButton.setContentAreaFilled(false);
        menuButton.setBorderPainted(false);
        mainPanel.add(menuButton);

        JButton orderRegistrationButton = new JButton("ثبت سفارش");
        orderRegistrationButton.setFont(new Font("Arial", Font.BOLD, 50));
        orderRegistrationButton.setForeground(Color.WHITE);
        orderRegistrationButton.setBounds(200, 500, 300, 100);
        orderRegistrationButton.setContentAreaFilled(false);
        orderRegistrationButton.setBorderPainted(false);
        mainPanel.add(orderRegistrationButton);

        JButton aboutUsButton = new JButton("درباره ما");
        aboutUsButton.setFont(new Font("Arial", Font.BOLD, 50));
        aboutUsButton.setForeground(Color.WHITE);
        aboutUsButton.setBounds(1000, 500, 300, 100);
        aboutUsButton.setContentAreaFilled(false);
        aboutUsButton.setBorderPainted(false);
        mainPanel.add(aboutUsButton);

        menuButton.addActionListener(e -> showMenu(mainPanel));

        orderRegistrationButton.addActionListener(e -> showOrderRegistration(mainPanel));

        aboutUsButton.addActionListener(e -> aboutUs(mainPanel));

    }

    private static void aboutUs(JPanel mainPanel) {
        mainPanel.removeAll();

        JPanel aboutPanel = new JPanel();
        aboutPanel.setLayout(null);
        aboutPanel.setBounds(100, 100, 1300, 500);
        aboutPanel.setBackground(Color.WHITE);
        mainPanel.add(aboutPanel);

        ImageIcon biographyImage = new ImageIcon("src/biography.jpg");
        Image scaledBiography = biographyImage.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        JLabel biographyLabel = new JLabel(new ImageIcon(scaledBiography));
        biographyLabel.setBounds(1220, 0, 80, 70);
        aboutPanel.add(biographyLabel);

        JLabel aboutTitleLabel = new JLabel("درباره توسعه دهنده برنامه:                                                                                                         ");
        aboutTitleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        aboutTitleLabel.setBounds(10, 10, 1280, 50);
        aboutPanel.add(aboutTitleLabel);

        JLabel aboutIntroLabel = new JLabel("این برنامه توسط هاشم نیک روان توسعه یافته است. هدف اصلی از ایجاد این برنامه برقراری ارتباطات بیشتر در این حوزه می‌باشد.                                                                             ");
        aboutIntroLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        aboutIntroLabel.setBounds(10, 70, 1280, 50);
        aboutPanel.add(aboutIntroLabel);

        JLabel contactInfoLabel = new JLabel("راه‌های ارتباطی با هاشم نیک روان:                                                                                                                                                           ");
        contactInfoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        contactInfoLabel.setBounds(10, 140, 1280, 50);
        aboutPanel.add(contactInfoLabel);

        ImageIcon linkedinImage = new ImageIcon("src/linkedin.jpg");
        Image scaledLinkedin = linkedinImage.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        JLabel linkedinImageLabel = new JLabel(new ImageIcon(scaledLinkedin));
        linkedinImageLabel.setBounds(1200, 195, 80, 70);
        aboutPanel.add(linkedinImageLabel);

        JLabel linkedinLabel = new JLabel("                                                                                                                                                                             HashemNickravan2001");
        linkedinLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        linkedinLabel.setBounds(10, 200, 1280, 50);
        aboutPanel.add(linkedinLabel);

        ImageIcon githubImage = new ImageIcon("src/github.jpg");
        Image scaledGithub = githubImage.getImage().getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        JLabel githubImageLabel = new JLabel(new ImageIcon(scaledGithub));
        githubImageLabel.setBounds(1180, 282, 120, 50);
        aboutPanel.add(githubImageLabel);

        JLabel githubLabel = new JLabel("                                                                                                                                                     https://github.com/HashemNickravan");
        githubLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        githubLabel.setBounds(10, 280, 1280, 50);
        aboutPanel.add(githubLabel);

        ImageIcon telegramImage = new ImageIcon("src/telegram.jpg");
        Image scaledTelegram = telegramImage.getImage().getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        JLabel telegramImageLabel = new JLabel(new ImageIcon(scaledTelegram));
        telegramImageLabel.setBounds(1200, 350, 120, 50);
        aboutPanel.add(telegramImageLabel);

        JLabel telegramLabel = new JLabel("                                                                                                                                                                                                 @Nickravan");
        telegramLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        telegramLabel.setBounds(10, 350, 1280, 50);
        aboutPanel.add(telegramLabel);

        JLabel thankYouLabel = new JLabel("از حمایت و اعتماد شما بسیار سپاسگزاریم. در صورت داشتن هر گونه سوال یا نیاز به پشتیبانی، لطفاً از طریق راه‌های ارتباطی فوق با ما در تماس باشید.                                                  ");
        thankYouLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        thankYouLabel.setBounds(10, 420, 1280, 50);
        aboutPanel.add(thankYouLabel);

        JButton returnHome = new JButton("بازگشت");
        returnHome.setFont(new Font("Arial", Font.BOLD, 50));
        returnHome.setForeground(Color.WHITE);
        returnHome.setBounds(600, 620, 300, 100);
        returnHome.setContentAreaFilled(false);
        returnHome.setBorderPainted(false);
        mainPanel.add(returnHome);

        returnHome.addActionListener(e -> {
            mainPanel.removeAll();
            showHomeScreen(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void showMenu(JPanel mainPanel) {
        mainPanel.removeAll();

        ImageIcon drinksImage = new ImageIcon("src/drinks.jpg");
        Image scaledDrinks = drinksImage.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        JLabel drinksLabel = new JLabel(new ImageIcon(scaledDrinks));
        drinksLabel.setBounds(100, 100, 300, 300);
        mainPanel.add(drinksLabel);


        JButton drinksMenu = new JButton("نوشیدنی ها");
        drinksMenu.setFont(new Font("Arial", Font.BOLD, 40));
        drinksMenu.setForeground(Color.WHITE);
        drinksMenu.setBounds(100, 400, 300, 100);
        drinksMenu.setContentAreaFilled(false);
        drinksMenu.setBorderPainted(false);
        mainPanel.add(drinksMenu);

        ImageIcon tabaccoImage = new ImageIcon("src/tobacco.jpg");
        Image scaledTabacco = tabaccoImage.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        JLabel tabaccoLabel = new JLabel(new ImageIcon(scaledTabacco));
        tabaccoLabel.setBounds(600, 100, 300, 300);
        mainPanel.add(tabaccoLabel);

        JButton tabaccoMenu = new JButton("دخانیات");
        tabaccoMenu.setFont(new Font("Arial", Font.BOLD, 50));
        tabaccoMenu.setForeground(Color.WHITE);
        tabaccoMenu.setBounds(600, 400, 300, 100);
        tabaccoMenu.setContentAreaFilled(false);
        tabaccoMenu.setBorderPainted(false);
        mainPanel.add(tabaccoMenu);

        ImageIcon foodImage = new ImageIcon("src/foods.jpg");
        Image scaledFood = foodImage.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        JLabel foodLabel = new JLabel(new ImageIcon(scaledFood));
        foodLabel.setBounds(1100, 100, 300, 300);
        mainPanel.add(foodLabel);

        JButton foodsMenu = new JButton("غذا ها");
        foodsMenu.setFont(new Font("Arial", Font.BOLD, 50));
        foodsMenu.setForeground(Color.WHITE);
        foodsMenu.setBounds(1100, 400, 300, 100);
        foodsMenu.setContentAreaFilled(false);
        foodsMenu.setBorderPainted(false);
        mainPanel.add(foodsMenu);

        JButton returnHome = new JButton("بازگشت");
        returnHome.setFont(new Font("Arial", Font.BOLD, 50));
        returnHome.setForeground(Color.WHITE);
        returnHome.setBounds(600, 620, 300, 100);
        returnHome.setContentAreaFilled(false);
        returnHome.setBorderPainted(false);
        mainPanel.add(returnHome);

        returnHome.addActionListener(e -> {
            mainPanel.removeAll();
            showHomeScreen(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        tabaccoMenu.addActionListener(e -> {
            mainPanel.removeAll();
            tabaccoList(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        drinksMenu.addActionListener(e -> {
            mainPanel.removeAll();
            drinksList(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        foodsMenu.addActionListener(e -> {
            mainPanel.removeAll();
            foodsList(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public static void tabaccoList(JPanel mainPanel) {
        mainPanel.removeAll();

        ImageIcon lemonTobaccoImage = new ImageIcon("src/lemonTobacco.jpg");
        Image scaledLemonTobacco = lemonTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel lemonTobaccoLabel = new JLabel(new ImageIcon(scaledLemonTobacco));
        lemonTobaccoLabel.setBounds(80, 80, 150, 150);
        mainPanel.add(lemonTobaccoLabel);

        JButton lemonTobaccoButton = new JButton("قلیون لیمو و انگور");
        lemonTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        lemonTobaccoButton.setBackground(new Color(70, 130, 180));
        lemonTobaccoButton.setForeground(Color.white);
        lemonTobaccoButton.setBounds(80, 230, 150, 40);
        mainPanel.add(lemonTobaccoButton);

        JLabel lemonPriceLabel = new JLabel("     98.000 Toman");
        lemonPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        lemonPriceLabel.setBounds(80, 270, 150, 40);
        lemonPriceLabel.setForeground(Color.WHITE);
        lemonPriceLabel.setOpaque(true);
        lemonPriceLabel.setBackground(Color.BLACK);
        lemonPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(lemonPriceLabel);

        ImageIcon peachTobaccoImage = new ImageIcon("src/peachTobacco.jpg");
        Image scaledPeachTobacco = peachTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel peachTobaccoLabel = new JLabel(new ImageIcon(scaledPeachTobacco));
        peachTobaccoLabel.setBounds(280, 80, 150, 150);
        mainPanel.add(peachTobaccoLabel);

        JButton peachTobaccoButton = new JButton("قلیون هلو و طالبی");
        peachTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        peachTobaccoButton.setBackground(new Color(70, 130, 180));
        peachTobaccoButton.setForeground(Color.WHITE);
        peachTobaccoButton.setBounds(280, 230, 150, 40);
        mainPanel.add(peachTobaccoButton);

        JLabel peachPriceLabel = new JLabel("     98.000 Toman");
        peachPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        peachPriceLabel.setBounds(280, 270, 150, 40);
        peachPriceLabel.setForeground(Color.WHITE);
        peachPriceLabel.setOpaque(true);
        peachPriceLabel.setBackground(Color.BLACK);
        peachPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(peachPriceLabel);

        ImageIcon orangeTobaccoImage = new ImageIcon("src/orangeTobacco.jpg");
        Image scaledOrangeTobacco = orangeTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel orangeTobaccoLabel = new JLabel(new ImageIcon(scaledOrangeTobacco));
        orangeTobaccoLabel.setBounds(480, 80, 150, 150);
        mainPanel.add(orangeTobaccoLabel);

        JButton orangeTobaccoButton = new JButton("قلیون پرتقال خامه");
        orangeTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        orangeTobaccoButton.setBackground(new Color(70, 130, 180));
        orangeTobaccoButton.setForeground(Color.WHITE);
        orangeTobaccoButton.setBounds(480, 230, 150, 40);
        mainPanel.add(orangeTobaccoButton);

        JLabel orangePriceLabel = new JLabel("     98.000 Toman");
        orangePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        orangePriceLabel.setBounds(480, 270, 150, 40);
        orangePriceLabel.setForeground(Color.WHITE);
        orangePriceLabel.setOpaque(true);
        orangePriceLabel.setBackground(Color.BLACK);
        orangePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(orangePriceLabel);

        ImageIcon watermelonTobaccoImage = new ImageIcon("src/watermelonTobacco.jpg");
        Image scaledWatermelonTobacco = watermelonTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel watermelonTobaccoLabel = new JLabel(new ImageIcon(scaledWatermelonTobacco));
        watermelonTobaccoLabel.setBounds(680, 80, 150, 150);
        mainPanel.add(watermelonTobaccoLabel);

        JButton watermelonTobaccoButton = new JButton("قلیون هندوانه یخ");
        watermelonTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        watermelonTobaccoButton.setBackground(new Color(70, 130, 180));
        watermelonTobaccoButton.setForeground(Color.WHITE);
        watermelonTobaccoButton.setBounds(680, 230, 150, 40);
        mainPanel.add(watermelonTobaccoButton);

        JLabel watermelonPriceLabel = new JLabel("     98.000 Toman");
        watermelonPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        watermelonPriceLabel.setBounds(680, 270, 150, 40);
        watermelonPriceLabel.setForeground(Color.WHITE);
        watermelonPriceLabel.setOpaque(true);
        watermelonPriceLabel.setBackground(Color.BLACK);
        watermelonPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(watermelonPriceLabel);

        ImageIcon appleTobaccoImage = new ImageIcon("src/appleTobacco.jpg");
        Image scaledAppleTobacco = appleTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel appleTobaccoLabel = new JLabel(new ImageIcon(scaledAppleTobacco));
        appleTobaccoLabel.setBounds(880, 80, 150, 150);
        mainPanel.add(appleTobaccoLabel);

        JButton appleTobaccoButton = new JButton("قلیون دو سیب");
        appleTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        appleTobaccoButton.setBackground(new Color(70, 130, 180));
        appleTobaccoButton.setForeground(Color.WHITE);
        appleTobaccoButton.setBounds(880, 230, 150, 40);
        mainPanel.add(appleTobaccoButton);

        JLabel applePriceLabel = new JLabel("     98.000 Toman");
        applePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        applePriceLabel.setBounds(880, 270, 150, 40);
        applePriceLabel.setForeground(Color.WHITE);
        applePriceLabel.setOpaque(true);
        applePriceLabel.setBackground(Color.BLACK);
        applePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(applePriceLabel);

        ImageIcon gumTobaccoImage = new ImageIcon("src/gumTobacco.jpg");
        Image scaledGumTobacco = gumTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel gumTobaccoLabel = new JLabel(new ImageIcon(scaledGumTobacco));
        gumTobaccoLabel.setBounds(1080, 80, 150, 150);
        mainPanel.add(gumTobaccoLabel);

        JButton gumTobaccoButton = new JButton("قلیون آدامس دارچین");
        gumTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        gumTobaccoButton.setBackground(new Color(70, 130, 180));
        gumTobaccoButton.setForeground(Color.WHITE);
        gumTobaccoButton.setBounds(1080, 230, 150, 40);
        mainPanel.add(gumTobaccoButton);

        JLabel gumPriceLabel = new JLabel("     98.000 Toman");
        gumPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        gumPriceLabel.setBounds(1080, 270, 150, 40);
        gumPriceLabel.setForeground(Color.WHITE);
        gumPriceLabel.setOpaque(true);
        gumPriceLabel.setBackground(Color.BLACK);
        gumPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(gumPriceLabel);

        ImageIcon cherryTobaccoImage = new ImageIcon("src/cherryTobacco.jpg");
        Image scaledCherryTobacco = cherryTobaccoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel cherryTobaccoLabel = new JLabel(new ImageIcon(scaledCherryTobacco));
        cherryTobaccoLabel.setBounds(1280, 80, 150, 150);
        mainPanel.add(cherryTobaccoLabel);

        JButton cherryTobaccoButton = new JButton("قلیون دوسیب آلبالو");
        cherryTobaccoButton.setFont(new Font("Arial", Font.BOLD, 15));
        cherryTobaccoButton.setBackground(new Color(70, 130, 180));
        cherryTobaccoButton.setForeground(Color.WHITE);
        cherryTobaccoButton.setBounds(1280, 230, 150, 40);
        mainPanel.add(cherryTobaccoButton);

        JLabel cherryPriceLabel = new JLabel("     98.000 Toman");
        cherryPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        cherryPriceLabel.setBounds(1280, 270, 150, 40);
        cherryPriceLabel.setForeground(Color.WHITE);
        cherryPriceLabel.setOpaque(true);
        cherryPriceLabel.setBackground(Color.BLACK);
        cherryPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(cherryPriceLabel);

        ImageIcon robatImage = new ImageIcon("src/robatkarimTobacco.jpg");
        Image scaledRobat = robatImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel robatLabel = new JLabel(new ImageIcon(scaledRobat));
        robatLabel.setBounds(80, 380, 150, 150);
        mainPanel.add(robatLabel);

        JButton robatButton = new JButton("قلیون غروب های رباط کریم");
        robatButton.setFont(new Font("Arial", Font.BOLD, 12));
        robatButton.setBackground(new Color(70, 130, 180));
        robatButton.setForeground(Color.white);
        robatButton.setBounds(80, 530, 150, 40);
        mainPanel.add(robatButton);

        JLabel robatPriceLabel = new JLabel("     198.000 Toman");
        robatPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        robatPriceLabel.setBounds(80, 570, 150, 40);
        robatPriceLabel.setForeground(Color.WHITE);
        robatPriceLabel.setOpaque(true);
        robatPriceLabel.setBackground(Color.BLACK);
        robatPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(robatPriceLabel);

        ImageIcon moscowImage = new ImageIcon("src/moscow.jpg");
        Image scaledMoscow = moscowImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel moscowLabel = new JLabel(new ImageIcon(scaledMoscow));
        moscowLabel.setBounds(280, 380, 150, 150);
        mainPanel.add(moscowLabel);

        JButton moscowButton = new JButton("قلیون شب های مسکو");
        moscowButton.setFont(new Font("Arial", Font.BOLD, 12));
        moscowButton.setBackground(new Color(70, 130, 180));
        moscowButton.setForeground(Color.WHITE);
        moscowButton.setBounds(280, 530, 150, 40);
        mainPanel.add(moscowButton);

        JLabel moscowPriceLabel = new JLabel("     98.000 Toman");
        moscowPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        moscowPriceLabel.setBounds(280, 570, 150, 40);
        moscowPriceLabel.setForeground(Color.WHITE);
        moscowPriceLabel.setOpaque(true);
        moscowPriceLabel.setBackground(Color.BLACK);
        moscowPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(moscowPriceLabel);

        ImageIcon cappuccinoImage = new ImageIcon("src/cappuccino.jpg");
        Image scaledCappuccino = cappuccinoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel cappuccinoLabel = new JLabel(new ImageIcon(scaledCappuccino));
        cappuccinoLabel.setBounds(480, 380, 150, 150);
        mainPanel.add(cappuccinoLabel);

        JButton cappuccinoButton = new JButton("قلیون کاپوچینو");
        cappuccinoButton.setFont(new Font("Arial", Font.BOLD, 15));
        cappuccinoButton.setBackground(new Color(70, 130, 180));
        cappuccinoButton.setForeground(Color.WHITE);
        cappuccinoButton.setBounds(480, 530, 150, 40);
        mainPanel.add(cappuccinoButton);

        JLabel cappuccinoPriceLabel = new JLabel("     98.000 Toman");
        cappuccinoPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        cappuccinoPriceLabel.setBounds(480, 570, 150, 40);
        cappuccinoPriceLabel.setForeground(Color.WHITE);
        cappuccinoPriceLabel.setOpaque(true);
        cappuccinoPriceLabel.setBackground(Color.BLACK);
        cappuccinoPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(cappuccinoPriceLabel);

        ImageIcon grapeImage = new ImageIcon("src/grape.jpg");
        Image scaledGrape = grapeImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel grapeLabel = new JLabel(new ImageIcon(scaledGrape));
        grapeLabel.setBounds(680, 380, 150, 150);
        mainPanel.add(grapeLabel);

        JButton grapeButton = new JButton("قلیون انگور");
        grapeButton.setFont(new Font("Arial", Font.BOLD, 15));
        grapeButton.setBackground(new Color(70, 130, 180));
        grapeButton.setForeground(Color.WHITE);
        grapeButton.setBounds(680, 530, 150, 40);
        mainPanel.add(grapeButton);

        JLabel grapePriceLabel = new JLabel("     98.000 Toman");
        grapePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        grapePriceLabel.setBounds(680, 570, 150, 40);
        grapePriceLabel.setForeground(Color.WHITE);
        grapePriceLabel.setOpaque(true);
        grapePriceLabel.setBackground(Color.BLACK);
        grapePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(grapePriceLabel);

        ImageIcon pomegranateImage = new ImageIcon("src/pomegranate.jpg");
        Image scaledPomegranate =pomegranateImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel pomegranateLabel = new JLabel(new ImageIcon(scaledPomegranate));
        pomegranateLabel.setBounds(880, 380, 150, 150);
        mainPanel.add(pomegranateLabel);

        JButton pomegranateButton = new JButton("قلیون انار");
        pomegranateButton.setFont(new Font("Arial", Font.BOLD, 15));
        pomegranateButton.setBackground(new Color(70, 130, 180));
        pomegranateButton.setForeground(Color.WHITE);
        pomegranateButton.setBounds(880, 530, 150, 40);
        mainPanel.add(pomegranateButton);

        JLabel pomegranatePriceLabel = new JLabel("     98.000 Toman");
        pomegranatePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        pomegranatePriceLabel.setBounds(880, 570, 150, 40);
        pomegranatePriceLabel.setForeground(Color.WHITE);
        pomegranatePriceLabel.setOpaque(true);
        pomegranatePriceLabel.setBackground(Color.BLACK);
        pomegranatePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(pomegranatePriceLabel);

        ImageIcon blueberryImage = new ImageIcon("src/blueberry.jpg");
        Image scaledBlueberry = blueberryImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel blueberryLabel = new JLabel(new ImageIcon(scaledBlueberry));
        blueberryLabel.setBounds(1080, 380, 150, 150);
        mainPanel.add(blueberryLabel);

        JButton blueberryButton = new JButton("قلیون بلوبری");
        blueberryButton.setFont(new Font("Arial", Font.BOLD, 15));
        blueberryButton.setBackground(new Color(70, 130, 180));
        blueberryButton.setForeground(Color.WHITE);
        blueberryButton.setBounds(1080, 530, 150, 40);
        mainPanel.add(blueberryButton);

        JLabel blueberryPriceLabel = new JLabel("     98.000 Toman");
        blueberryPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        blueberryPriceLabel.setBounds(1080, 570, 150, 40);
        blueberryPriceLabel.setForeground(Color.WHITE);
        blueberryPriceLabel.setOpaque(true);
        blueberryPriceLabel.setBackground(Color.BLACK);
        blueberryPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(blueberryPriceLabel);

        ImageIcon mangoImage = new ImageIcon("src/mango.jpg");
        Image scaledMango = mangoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel mangoLabel = new JLabel(new ImageIcon(scaledMango));
        mangoLabel.setBounds(1280, 380, 150, 150);
        mainPanel.add(mangoLabel);

        JButton mangoButton = new JButton("قلیون انبه");
        mangoButton.setFont(new Font("Arial", Font.BOLD, 15));
        mangoButton.setBackground(new Color(70, 130, 180));
        mangoButton.setForeground(Color.WHITE);
        mangoButton.setBounds(1280, 530, 150, 40);
        mainPanel.add(mangoButton);

        JLabel mangoPriceLabel = new JLabel("     98.000 Toman");
        mangoPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        mangoPriceLabel.setBounds(1280, 570, 150, 40);
        mangoPriceLabel.setForeground(Color.WHITE);
        mangoPriceLabel.setOpaque(true);
        mangoPriceLabel.setBackground(Color.BLACK);
        mangoPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(mangoPriceLabel);

        JButton returnHome = new JButton("بازگشت");
        returnHome.setFont(new Font("Arial", Font.BOLD, 50));
        returnHome.setForeground(Color.WHITE);
        returnHome.setBounds(600, 620, 300, 100);
        returnHome.setContentAreaFilled(false);
        returnHome.setBorderPainted(false);
        mainPanel.add(returnHome);

        returnHome.addActionListener(e -> {
            mainPanel.removeAll();
            showMenu(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });


        lemonTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون لیمو و انگور", orderMap.getOrDefault("قلیون لیمو و انگور", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون لیمو و انگور به سفارش‌ها اضافه شد!");
        });

        peachTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون هلو و طالبی", orderMap.getOrDefault("قلیون هلو و طالبی", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون هلو و طالبی به سفارش‌ها اضافه شد!");
        });

        orangeTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون پرتقال خامه", orderMap.getOrDefault("قلیون پرتقال خامه", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون پرتقال خامه به سفارش‌ها اضافه شد!");
        });

        watermelonTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون هندوانه یخ", orderMap.getOrDefault("قلیون هندوانه یخ", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون هندوانه یخ به سفارش‌ها اضافه شد!");
        });

        appleTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون دو سیب", orderMap.getOrDefault("قلیون دو سیب", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون دو سیب به سفارش‌ها اضافه شد!");
        });

        gumTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون آدامس دارچین", orderMap.getOrDefault("قلیون آدامس دارچین", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون آدامس دارچین به سفارش‌ها اضافه شد!");
        });

        cherryTobaccoButton.addActionListener(e -> {
            orderMap.put("قلیون دوسیب آلبالو", orderMap.getOrDefault("قلیون دوسیب آلبالو", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون دوسیب آلبالو به سفارش‌ها اضافه شد!");
        });

        robatButton.addActionListener(e -> {
            orderMap.put("قلیون غروب های رباط کریم", orderMap.getOrDefault("قلیون غروب های رباط کریم", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون غروب های رباط کریم به سفارش‌ها اضافه شد!");
        });

        moscowButton.addActionListener(e -> {
            orderMap.put("قلیون شب های مسکو", orderMap.getOrDefault("قلیون شب های مسکو", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون شب های مسکو به سفارش‌ها اضافه شد!");
        });

        cappuccinoButton.addActionListener(e -> {
            orderMap.put("قلیون کاپوچینو", orderMap.getOrDefault("قلیون کاپوچینو", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون کاپوچینو خامه به سفارش‌ها اضافه شد!");
        });

        grapeButton.addActionListener(e -> {
            orderMap.put("قلیون انگور", orderMap.getOrDefault("قلیون انگور", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون انگور به سفارش‌ها اضافه شد!");
        });

        pomegranateButton.addActionListener(e -> {
            orderMap.put("قلیون انار", orderMap.getOrDefault("قلیون انار", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون انار به سفارش‌ها اضافه شد!");
        });

        blueberryButton.addActionListener(e -> {
            orderMap.put("قلیون بلوبری", orderMap.getOrDefault("قلیون بلوبری", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون بلوبری به سفارش‌ها اضافه شد!");
        });

        mangoButton.addActionListener(e -> {
            orderMap.put("قلیون انبه", orderMap.getOrDefault("قلیون انبه", 0) + 1);
            JOptionPane.showMessageDialog(null, "قلیون انبه به سفارش‌ها اضافه شد!");
        });

    }

    public static void drinksList(JPanel mainPanel) {
        mainPanel.removeAll();

        ImageIcon nabatTeaImage = new ImageIcon("src/nabatTea.jpg");
        Image scaledNabatTea = nabatTeaImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel nabatTeaLabel = new JLabel(new ImageIcon(scaledNabatTea));
        nabatTeaLabel.setBounds(80, 80, 150, 150);
        mainPanel.add(nabatTeaLabel);

        JButton nabatTeaButton = new JButton("چای نبات");
        nabatTeaButton.setFont(new Font("Arial", Font.BOLD, 15));
        nabatTeaButton.setBackground(new Color(70, 130, 180));
        nabatTeaButton.setForeground(Color.white);
        nabatTeaButton.setBounds(80, 230, 150, 40);
        mainPanel.add(nabatTeaButton);

        JLabel nabatTeaPriceLabel = new JLabel("     16.000 Toman");
        nabatTeaPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nabatTeaPriceLabel.setBounds(80, 270, 150, 40);
        nabatTeaPriceLabel.setForeground(Color.WHITE);
        nabatTeaPriceLabel.setOpaque(true);
        nabatTeaPriceLabel.setBackground(Color.BLACK);
        nabatTeaPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(nabatTeaPriceLabel);

        ImageIcon teapotImage = new ImageIcon("src/teapot.jpg");
        Image scaledTeapot = teapotImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel teapotLabel = new JLabel(new ImageIcon(scaledTeapot));
        teapotLabel.setBounds(280, 80, 150, 150);
        mainPanel.add(teapotLabel);

        JButton teapotButton = new JButton("قوری چای");
        teapotButton.setFont(new Font("Arial", Font.BOLD, 15));
        teapotButton.setBackground(new Color(70, 130, 180));
        teapotButton.setForeground(Color.WHITE);
        teapotButton.setBounds(280, 230, 150, 40);
        mainPanel.add(teapotButton);

        JLabel teapotPriceLabel = new JLabel("     39.000 Toman");
        teapotPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        teapotPriceLabel.setBounds(280, 270, 150, 40);
        teapotPriceLabel.setForeground(Color.WHITE);
        teapotPriceLabel.setOpaque(true);
        teapotPriceLabel.setBackground(Color.BLACK);
        teapotPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(teapotPriceLabel);

        ImageIcon delesterImage = new ImageIcon("src/delester.jpg");
        Image scaledDelester = delesterImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel delesterLabel = new JLabel(new ImageIcon(scaledDelester));
        delesterLabel.setBounds(480, 80, 150, 150);
        mainPanel.add(delesterLabel);

        JButton delesterButton = new JButton("دلستر");
        delesterButton.setFont(new Font("Arial", Font.BOLD, 15));
        delesterButton.setBackground(new Color(70, 130, 180));
        delesterButton.setForeground(Color.WHITE);
        delesterButton.setBounds(480, 230, 150, 40);
        mainPanel.add(delesterButton);

        JLabel delesterPriceLabel = new JLabel("     20.000 Toman");
        delesterPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        delesterPriceLabel.setBounds(480, 270, 150, 40);
        delesterPriceLabel.setForeground(Color.WHITE);
        delesterPriceLabel.setOpaque(true);
        delesterPriceLabel.setBackground(Color.BLACK);
        delesterPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(delesterPriceLabel);

        ImageIcon cocacolaImage = new ImageIcon("src/cocacola.jpg");
        Image scaledCocacola = cocacolaImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel cocacolaLabel = new JLabel(new ImageIcon(scaledCocacola));
        cocacolaLabel.setBounds(680, 80, 150, 150);
        mainPanel.add(cocacolaLabel);

        JButton cocacolaButton = new JButton("نوشابه");
        cocacolaButton.setFont(new Font("Arial", Font.BOLD, 15));
        cocacolaButton.setBackground(new Color(70, 130, 180));
        cocacolaButton.setForeground(Color.WHITE);
        cocacolaButton.setBounds(680, 230, 150, 40);
        mainPanel.add(cocacolaButton);

        JLabel cocacolaPriceLabel = new JLabel("     20.000 Toman");
        cocacolaPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        cocacolaPriceLabel.setBounds(680, 270, 150, 40);
        cocacolaPriceLabel.setForeground(Color.WHITE);
        cocacolaPriceLabel.setOpaque(true);
        cocacolaPriceLabel.setBackground(Color.BLACK);
        cocacolaPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(cocacolaPriceLabel);

        ImageIcon majoonImage = new ImageIcon("src/majoon.jpg");
        Image scaledMajoon = majoonImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel majoonLabel = new JLabel(new ImageIcon(scaledMajoon));
        majoonLabel.setBounds(880, 80, 150, 150);
        mainPanel.add(majoonLabel);

        JButton majoonButton = new JButton("معجون جاده ساوه");
        majoonButton.setFont(new Font("Arial", Font.BOLD, 15));
        majoonButton.setBackground(new Color(70, 130, 180));
        majoonButton.setForeground(Color.WHITE);
        majoonButton.setBounds(880, 230, 150, 40);
        mainPanel.add(majoonButton);

        JLabel majoonPriceLabel = new JLabel("     99.000 Toman");
        majoonPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        majoonPriceLabel.setBounds(880, 270, 150, 40);
        majoonPriceLabel.setForeground(Color.WHITE);
        majoonPriceLabel.setOpaque(true);
        majoonPriceLabel.setBackground(Color.BLACK);
        majoonPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(majoonPriceLabel);

        ImageIcon turkCoffeeImage = new ImageIcon("src/turkCoffee.jpg");
        Image scaledTurkCoffee = turkCoffeeImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel turkCoffeeLabel = new JLabel(new ImageIcon(scaledTurkCoffee));
        turkCoffeeLabel.setBounds(1080, 80, 150, 150);
        mainPanel.add(turkCoffeeLabel);

        JButton turkCoffeeButton = new JButton("قهوه ترک");
        turkCoffeeButton.setFont(new Font("Arial", Font.BOLD, 15));
        turkCoffeeButton.setBackground(new Color(70, 130, 180));
        turkCoffeeButton.setForeground(Color.WHITE);
        turkCoffeeButton.setBounds(1080, 230, 150, 40);
        mainPanel.add(turkCoffeeButton);

        JLabel turkCoffeePriceLabel = new JLabel("     27.000 Toman");
        turkCoffeePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        turkCoffeePriceLabel.setBounds(1080, 270, 150, 40);
        turkCoffeePriceLabel.setForeground(Color.WHITE);
        turkCoffeePriceLabel.setOpaque(true);
        turkCoffeePriceLabel.setBackground(Color.BLACK);
        turkCoffeePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(turkCoffeePriceLabel);

        ImageIcon nescafeImage = new ImageIcon("src/nescafe.jpg");
        Image scaledNescafe = nescafeImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel nescafeLabel = new JLabel(new ImageIcon(scaledNescafe));
        nescafeLabel.setBounds(1280, 80, 150, 150);
        mainPanel.add(nescafeLabel);

        JButton nescafeButton = new JButton("نسکافه");
        nescafeButton.setFont(new Font("Arial", Font.BOLD, 15));
        nescafeButton.setBackground(new Color(70, 130, 180));
        nescafeButton.setForeground(Color.WHITE);
        nescafeButton.setBounds(1280, 230, 150, 40);
        mainPanel.add(nescafeButton);

        JLabel nescafePriceLabel = new JLabel("     15.000 Toman");
        nescafePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nescafePriceLabel.setBounds(1280, 270, 150, 40);
        nescafePriceLabel.setForeground(Color.WHITE);
        nescafePriceLabel.setOpaque(true);
        nescafePriceLabel.setBackground(Color.BLACK);
        nescafePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(nescafePriceLabel);

        ImageIcon cinnamonImage = new ImageIcon("src/cinnamon.jpg");
        Image scaledCinnamon = cinnamonImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel cinnamonLabel = new JLabel(new ImageIcon(scaledCinnamon));
        cinnamonLabel.setBounds(80, 380, 150, 150);
        mainPanel.add(cinnamonLabel);

        JButton cinnamonButton = new JButton("چای دارچین");
        cinnamonButton.setFont(new Font("Arial", Font.BOLD, 15));
        cinnamonButton.setBackground(new Color(70, 130, 180));
        cinnamonButton.setForeground(Color.white);
        cinnamonButton.setBounds(80, 530, 150, 40);
        mainPanel.add(cinnamonButton);

        JLabel cinnamonPriceLabel = new JLabel("     15.000 Toman");
        cinnamonPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        cinnamonPriceLabel.setBounds(80, 570, 150, 40);
        cinnamonPriceLabel.setForeground(Color.WHITE);
        cinnamonPriceLabel.setOpaque(true);
        cinnamonPriceLabel.setBackground(Color.BLACK);
        cinnamonPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(cinnamonPriceLabel);

        ImageIcon gingerImage = new ImageIcon("src/ginger.jpg");
        Image scaledGinger = gingerImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel gingerLabel = new JLabel(new ImageIcon(scaledGinger));
        gingerLabel.setBounds(280, 380, 150, 150);
        mainPanel.add(gingerLabel);

        JButton gingerButton = new JButton("چای زنجبیل");
        gingerButton.setFont(new Font("Arial", Font.BOLD, 15));
        gingerButton.setBackground(new Color(70, 130, 180));
        gingerButton.setForeground(Color.WHITE);
        gingerButton.setBounds(280, 530, 150, 40);
        mainPanel.add(gingerButton);

        JLabel gingerPriceLabel = new JLabel("     15.000 Toman");
        gingerPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        gingerPriceLabel.setBounds(280, 570, 150, 40);
        gingerPriceLabel.setForeground(Color.WHITE);
        gingerPriceLabel.setOpaque(true);
        gingerPriceLabel.setBackground(Color.BLACK);
        gingerPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(gingerPriceLabel);

        ImageIcon flowerImage = new ImageIcon("src/flower.jpg");
        Image scaledFlower = flowerImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel flowerLabel = new JLabel(new ImageIcon(scaledFlower));
        flowerLabel.setBounds(480, 380, 150, 150);
        mainPanel.add(flowerLabel);

        JButton flowerButton = new JButton("گل گاوزبان");
        flowerButton.setFont(new Font("Arial", Font.BOLD, 15));
        flowerButton.setBackground(new Color(70, 130, 180));
        flowerButton.setForeground(Color.WHITE);
        flowerButton.setBounds(480, 530, 150, 40);
        mainPanel.add(flowerButton);

        JLabel flowerPriceLabel = new JLabel("     30.000 Toman");
        flowerPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        flowerPriceLabel.setBounds(480, 570, 150, 40);
        flowerPriceLabel.setForeground(Color.WHITE);
        flowerPriceLabel.setOpaque(true);
        flowerPriceLabel.setBackground(Color.BLACK);
        flowerPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(flowerPriceLabel);

        ImageIcon waterImage = new ImageIcon("src/water.jpg");
        Image scaledWater = waterImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel waterLabel = new JLabel(new ImageIcon(scaledWater));
        waterLabel.setBounds(680, 380, 150, 150);
        mainPanel.add(waterLabel);

        JButton waterButton = new JButton("بطری آب");
        waterButton.setFont(new Font("Arial", Font.BOLD, 15));
        waterButton.setBackground(new Color(70, 130, 180));
        waterButton.setForeground(Color.WHITE);
        waterButton.setBounds(680, 530, 150, 40);
        mainPanel.add(waterButton);

        JLabel waterPriceLabel = new JLabel("     5.000 Toman");
        waterPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        waterPriceLabel.setBounds(680, 570, 150, 40);
        waterPriceLabel.setForeground(Color.WHITE);
        waterPriceLabel.setOpaque(true);
        waterPriceLabel.setBackground(Color.BLACK);
        waterPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(waterPriceLabel);

        ImageIcon dooghImage = new ImageIcon("src/doogh.jpg");
        Image scaledDoogh = dooghImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel dooghLabel = new JLabel(new ImageIcon(scaledDoogh));
        dooghLabel.setBounds(880, 380, 150, 150);
        mainPanel.add(dooghLabel);

        JButton dooghButton = new JButton("دوغ آبعلی");
        dooghButton.setFont(new Font("Arial", Font.BOLD, 15));
        dooghButton.setBackground(new Color(70, 130, 180));
        dooghButton.setForeground(Color.WHITE);
        dooghButton.setBounds(880, 530, 150, 40);
        mainPanel.add(dooghButton);

        JLabel dooghPriceLabel = new JLabel("     20.000 Toman");
        dooghPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        dooghPriceLabel.setBounds(880, 570, 150, 40);
        dooghPriceLabel.setForeground(Color.WHITE);
        dooghPriceLabel.setOpaque(true);
        dooghPriceLabel.setBackground(Color.BLACK);
        dooghPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(dooghPriceLabel);

        ImageIcon masalaImage = new ImageIcon("src/masala.jpg");
        Image scaledMasala = masalaImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel masalaLabel = new JLabel(new ImageIcon(scaledMasala));
        masalaLabel.setBounds(1080, 380, 150, 150);
        mainPanel.add(masalaLabel);

        JButton masalaButton = new JButton("چای ماسالا");
        masalaButton.setFont(new Font("Arial", Font.BOLD, 15));
        masalaButton.setBackground(new Color(70, 130, 180));
        masalaButton.setForeground(Color.WHITE);
        masalaButton.setBounds(1080, 530, 150, 40);
        mainPanel.add(masalaButton);

        JLabel masalaPriceLabel = new JLabel("     50.000 Toman");
        masalaPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        masalaPriceLabel.setBounds(1080, 570, 150, 40);
        masalaPriceLabel.setForeground(Color.WHITE);
        masalaPriceLabel.setOpaque(true);
        masalaPriceLabel.setBackground(Color.BLACK);
        masalaPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(masalaPriceLabel);

        ImageIcon espressoImage = new ImageIcon("src/espresso.jpg");
        Image scaledEspresso = espressoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel espressoLabel = new JLabel(new ImageIcon(scaledEspresso));
        espressoLabel.setBounds(1280, 380, 150, 150);
        mainPanel.add(espressoLabel);

        JButton esperssoButton = new JButton("اسپرسو");
        esperssoButton.setFont(new Font("Arial", Font.BOLD, 15));
        esperssoButton.setBackground(new Color(70, 130, 180));
        esperssoButton.setForeground(Color.WHITE);
        esperssoButton.setBounds(1280, 530, 150, 40);
        mainPanel.add(esperssoButton);

        JLabel espressoPriceLabel = new JLabel("     20.000 Toman");
        espressoPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        espressoPriceLabel.setBounds(1280, 570, 150, 40);
        espressoPriceLabel.setForeground(Color.WHITE);
        espressoPriceLabel.setOpaque(true);
        espressoPriceLabel.setBackground(Color.BLACK);
        espressoPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(espressoPriceLabel);

        JButton returnHome = new JButton("بازگشت");
        returnHome.setFont(new Font("Arial", Font.BOLD, 50));
        returnHome.setForeground(Color.WHITE);
        returnHome.setBounds(600, 620, 300, 100);
        returnHome.setContentAreaFilled(false);
        returnHome.setBorderPainted(false);
        mainPanel.add(returnHome);

        returnHome.addActionListener(e -> {
            mainPanel.removeAll();
            showMenu(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        nabatTeaButton.addActionListener(e -> {
            orderMap.put("چای نبات", orderMap.getOrDefault("چای نبات", 0) + 1);
            JOptionPane.showMessageDialog(null, "چای نبات به سفارش‌ها اضافه شد!");
        });

        teapotButton.addActionListener(e -> {
            orderMap.put("قوری چای", orderMap.getOrDefault("قوری چای", 0) + 1);
            JOptionPane.showMessageDialog(null, "قوری چای به سفارش‌ها اضافه شد!");
        });

        delesterButton.addActionListener(e -> {
            orderMap.put("دلستر", orderMap.getOrDefault("دلستر", 0) + 1);
            JOptionPane.showMessageDialog(null, "دلستر به سفارش‌ها اضافه شد!");
        });

        cocacolaButton.addActionListener(e -> {
            orderMap.put("نوشابه", orderMap.getOrDefault("نوشابه", 0) + 1);
            JOptionPane.showMessageDialog(null, "نوشابه به سفارش‌ها اضافه شد!");
        });

        majoonButton.addActionListener(e -> {
            orderMap.put("معجون", orderMap.getOrDefault("معجون", 0) + 1);
            JOptionPane.showMessageDialog(null, "معجون به سفارش‌ها اضافه شد!");
        });

        turkCoffeeButton.addActionListener(e -> {
            orderMap.put("قهوه ترک", orderMap.getOrDefault("قهوه ترک", 0) + 1);
            JOptionPane.showMessageDialog(null, "قهوه ترک به سفارش‌ها اضافه شد!");
        });

        nescafeButton.addActionListener(e -> {
            orderMap.put("نسکافه", orderMap.getOrDefault("نسکافه", 0) + 1);
            JOptionPane.showMessageDialog(null, "نسکافه به سفارش‌ها اضافه شد!");
        });

        cinnamonButton.addActionListener(e -> {
            orderMap.put("چای دارچین", orderMap.getOrDefault("چای دارچین", 0) + 1);
            JOptionPane.showMessageDialog(null, "چای دارچین به سفارش‌ها اضافه شد!");
        });

        gingerButton.addActionListener(e -> {
            orderMap.put("چای زنجبیل", orderMap.getOrDefault("چای زنجبیل", 0) + 1);
            JOptionPane.showMessageDialog(null, "چای زنجبیل به سفارش‌ها اضافه شد!");
        });

        flowerButton.addActionListener(e -> {
            orderMap.put("گل گاوزبان", orderMap.getOrDefault("گل گاوزبان", 0) + 1);
            JOptionPane.showMessageDialog(null, "گل گاوزبان به سفارش‌ها اضافه شد!");
        });

        waterButton.addActionListener(e -> {
            orderMap.put("بطری آب", orderMap.getOrDefault("بطری آب", 0) + 1);
            JOptionPane.showMessageDialog(null, "بطری آب به سفارش‌ها اضافه شد!");
        });

        dooghButton.addActionListener(e -> {
            orderMap.put("دوغ آبعلی", orderMap.getOrDefault("دوغ آبعلی", 0) + 1);
            JOptionPane.showMessageDialog(null, "دوغ آبعلی به سفارش‌ها اضافه شد!");
        });

        masalaButton.addActionListener(e -> {
            orderMap.put("چای ماسالا", orderMap.getOrDefault("چای ماسالا", 0) + 1);
            JOptionPane.showMessageDialog(null, "چای ماسالا به سفارش‌ها اضافه شد!");
        });

        esperssoButton.addActionListener(e -> {
            orderMap.put("اسپرسو", orderMap.getOrDefault("اسپرسو", 0) + 1);
            JOptionPane.showMessageDialog(null, "اسپرسو به سفارش‌ها اضافه شد!");
        });
    }

    public static void foodsList(JPanel mainPanel) {
        mainPanel.removeAll();

        ImageIcon omletImage = new ImageIcon("src/omlet.jpg");
        Image scaledOmlet = omletImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel omletLabel = new JLabel(new ImageIcon(scaledOmlet));
        omletLabel.setBounds(80, 80, 150, 150);
        mainPanel.add(omletLabel);

        JButton omletButton = new JButton("املت گوجه فرنگی");
        omletButton.setFont(new Font("Arial", Font.BOLD, 15));
        omletButton.setBackground(new Color(70, 130, 180));
        omletButton.setForeground(Color.white);
        omletButton.setBounds(80, 230, 150, 40);
        mainPanel.add(omletButton);

        JLabel omletPriceLabel = new JLabel("     45.000 Toman");
        omletPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        omletPriceLabel.setBounds(80, 270, 150, 40);
        omletPriceLabel.setForeground(Color.WHITE);
        omletPriceLabel.setOpaque(true);
        omletPriceLabel.setBackground(Color.BLACK);
        omletPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(omletPriceLabel);

        ImageIcon eggSausageImage = new ImageIcon("src/EggSausage.jpg");
        Image scaledEggSausage = eggSausageImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel eggSausageLabel = new JLabel(new ImageIcon(scaledEggSausage));
        eggSausageLabel.setBounds(280, 80, 150, 150);
        mainPanel.add(eggSausageLabel);

        JButton eggSausageButton = new JButton("سوسیس تخم مرغ");
        eggSausageButton.setFont(new Font("Arial", Font.BOLD, 15));
        eggSausageButton.setBackground(new Color(70, 130, 180));
        eggSausageButton.setForeground(Color.WHITE);
        eggSausageButton.setBounds(280, 230, 150, 40);
        mainPanel.add(eggSausageButton);

        JLabel eggSausagePriceLabel = new JLabel("     55.000 Toman");
        eggSausagePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        eggSausagePriceLabel.setBounds(280, 270, 150, 40);
        eggSausagePriceLabel.setForeground(Color.WHITE);
        eggSausagePriceLabel.setOpaque(true);
        eggSausagePriceLabel.setBackground(Color.BLACK);
        eggSausagePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(eggSausagePriceLabel);

        ImageIcon eggImage = new ImageIcon("src/egg.jpg");
        Image scaledEgg = eggImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel eggLabel = new JLabel(new ImageIcon(scaledEgg));
        eggLabel.setBounds(480, 80, 150, 150);
        mainPanel.add(eggLabel);

        JButton eggButton = new JButton("تخم مرغ آب پز");
        eggButton.setFont(new Font("Arial", Font.BOLD, 15));
        eggButton.setBackground(new Color(70, 130, 180));
        eggButton.setForeground(Color.WHITE);
        eggButton.setBounds(480, 230, 150, 40);
        mainPanel.add(eggButton);

        JLabel eggPriceLabel = new JLabel("     25.000 Toman");
        eggPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        eggPriceLabel.setBounds(480, 270, 150, 40);
        eggPriceLabel.setForeground(Color.WHITE);
        eggPriceLabel.setOpaque(true);
        eggPriceLabel.setBackground(Color.BLACK);
        eggPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(eggPriceLabel);

        ImageIcon beansImage = new ImageIcon("src/beans.jpg");
        Image scaledBeans = beansImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel beansLabel = new JLabel(new ImageIcon(scaledBeans));
        beansLabel.setBounds(680, 80, 150, 150);
        mainPanel.add(beansLabel);

        JButton beansButton = new JButton("لوبیا");
        beansButton.setFont(new Font("Arial", Font.BOLD, 15));
        beansButton.setBackground(new Color(70, 130, 180));
        beansButton.setForeground(Color.WHITE);
        beansButton.setBounds(680, 230, 150, 40);
        mainPanel.add(beansButton);

        JLabel beansPriceLabel = new JLabel("     55.000 Toman");
        beansPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        beansPriceLabel.setBounds(680, 270, 150, 40);
        beansPriceLabel.setForeground(Color.WHITE);
        beansPriceLabel.setOpaque(true);
        beansPriceLabel.setBackground(Color.BLACK);
        beansPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(beansPriceLabel);

        ImageIcon nimrooImage = new ImageIcon("src/nimroo.jpg");
        Image scaledNimroo = nimrooImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel nimrooLabel = new JLabel(new ImageIcon(scaledNimroo));
        nimrooLabel.setBounds(880, 80, 150, 150);
        mainPanel.add(nimrooLabel);

        JButton nimrooButton = new JButton("نیمرو");
        nimrooButton.setFont(new Font("Arial", Font.BOLD, 15));
        nimrooButton.setBackground(new Color(70, 130, 180));
        nimrooButton.setForeground(Color.WHITE);
        nimrooButton.setBounds(880, 230, 150, 40);
        mainPanel.add(nimrooButton);

        JLabel nimrooPriceLabel = new JLabel("     35.000 Toman");
        nimrooPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nimrooPriceLabel.setBounds(880, 270, 150, 40);
        nimrooPriceLabel.setForeground(Color.WHITE);
        nimrooPriceLabel.setOpaque(true);
        nimrooPriceLabel.setBackground(Color.BLACK);
        nimrooPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(nimrooPriceLabel);

        ImageIcon abgooshtImage = new ImageIcon("src/abgoosht.jpg");
        Image scaledAbgoosht = abgooshtImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel abgooshtLabel = new JLabel(new ImageIcon(scaledAbgoosht));
        abgooshtLabel.setBounds(1080, 80, 150, 150);
        mainPanel.add(abgooshtLabel);

        JButton abgooshtButton = new JButton("آبگوشت");
        abgooshtButton.setFont(new Font("Arial", Font.BOLD, 15));
        abgooshtButton.setBackground(new Color(70, 130, 180));
        abgooshtButton.setForeground(Color.WHITE);
        abgooshtButton.setBounds(1080, 230, 150, 40);
        mainPanel.add(abgooshtButton);

        JLabel abgooshtPriceLabel = new JLabel("     199.000 Toman");
        abgooshtPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        abgooshtPriceLabel.setBounds(1080, 270, 150, 40);
        abgooshtPriceLabel.setForeground(Color.WHITE);
        abgooshtPriceLabel.setOpaque(true);
        abgooshtPriceLabel.setBackground(Color.BLACK);
        abgooshtPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(abgooshtPriceLabel);

        ImageIcon adasiImage = new ImageIcon("src/adasi.jpg");
        Image scaledAdasi = adasiImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel adasiLabel = new JLabel(new ImageIcon(scaledAdasi));
        adasiLabel.setBounds(1280, 80, 150, 150);
        mainPanel.add(adasiLabel);

        JButton adasiButton = new JButton("عدسی");
        adasiButton.setFont(new Font("Arial", Font.BOLD, 15));
        adasiButton.setBackground(new Color(70, 130, 180));
        adasiButton.setForeground(Color.WHITE);
        adasiButton.setBounds(1280, 230, 150, 40);
        mainPanel.add(adasiButton);

        JLabel adasiPriceLabel = new JLabel("     45.000 Toman");
        adasiPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        adasiPriceLabel.setBounds(1280, 270, 150, 40);
        adasiPriceLabel.setForeground(Color.WHITE);
        adasiPriceLabel.setOpaque(true);
        adasiPriceLabel.setBackground(Color.BLACK);
        adasiPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(adasiPriceLabel);

        ImageIcon tonImage = new ImageIcon("src/ton.jpg");
        Image scaledTon = tonImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel tonLabel = new JLabel(new ImageIcon(scaledTon));
        tonLabel.setBounds(80, 380, 150, 150);
        mainPanel.add(tonLabel);

        JButton tonButton = new JButton("تن ماهی تخم مرغ");
        tonButton.setFont(new Font("Arial", Font.BOLD, 15));
        tonButton.setBackground(new Color(70, 130, 180));
        tonButton.setForeground(Color.white);
        tonButton.setBounds(80, 530, 150, 40);
        mainPanel.add(tonButton);

        JLabel tonPriceLabel = new JLabel("     120.000 Toman");
        tonPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        tonPriceLabel.setBounds(80, 570, 150, 40);
        tonPriceLabel.setForeground(Color.WHITE);
        tonPriceLabel.setOpaque(true);
        tonPriceLabel.setBackground(Color.BLACK);
        tonPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(tonPriceLabel);

        ImageIcon mexicanImage = new ImageIcon("src/mexican.jpg");
        Image scaledMexican = mexicanImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel mexicanLabel = new JLabel(new ImageIcon(scaledMexican));
        mexicanLabel.setBounds(280, 380, 150, 150);
        mainPanel.add(mexicanLabel);

        JButton mexicanButton = new JButton("املت مکزیکی");
        mexicanButton.setFont(new Font("Arial", Font.BOLD, 15));
        mexicanButton.setBackground(new Color(70, 130, 180));
        mexicanButton.setForeground(Color.WHITE);
        mexicanButton.setBounds(280, 530, 150, 40);
        mainPanel.add(mexicanButton);

        JLabel mexicanPriceLabel = new JLabel("     50.000 Toman");
        mexicanPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        mexicanPriceLabel.setBounds(280, 570, 150, 40);
        mexicanPriceLabel.setForeground(Color.WHITE);
        mexicanPriceLabel.setOpaque(true);
        mexicanPriceLabel.setBackground(Color.BLACK);
        mexicanPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(mexicanPriceLabel);

        ImageIcon bandariImage = new ImageIcon("src/bandari.jpg");
        Image scaledBandari = bandariImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel bandariLabel = new JLabel(new ImageIcon(scaledBandari));
        bandariLabel.setBounds(480, 380, 150, 150);
        mainPanel.add(bandariLabel);

        JButton bandariButton = new JButton("بندری");
        bandariButton.setFont(new Font("Arial", Font.BOLD, 15));
        bandariButton.setBackground(new Color(70, 130, 180));
        bandariButton.setForeground(Color.WHITE);
        bandariButton.setBounds(480, 530, 150, 40);
        mainPanel.add(bandariButton);

        JLabel bandariPriceLabel = new JLabel("     55.000 Toman");
        bandariPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bandariPriceLabel.setBounds(480, 570, 150, 40);
        bandariPriceLabel.setForeground(Color.WHITE);
        bandariPriceLabel.setOpaque(true);
        bandariPriceLabel.setBackground(Color.BLACK);
        bandariPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(bandariPriceLabel);

        ImageIcon olviyeImage = new ImageIcon("src/olviye.jpg");
        Image scaledOlviye = olviyeImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel olviyeLabel = new JLabel(new ImageIcon(scaledOlviye));
        olviyeLabel.setBounds(680, 380, 150, 150);
        mainPanel.add(olviyeLabel);

        JButton olviyeButton = new JButton("الویه");
        olviyeButton.setFont(new Font("Arial", Font.BOLD, 15));
        olviyeButton.setBackground(new Color(70, 130, 180));
        olviyeButton.setForeground(Color.WHITE);
        olviyeButton.setBounds(680, 530, 150, 40);
        mainPanel.add(olviyeButton);

        JLabel olviyePriceLabel = new JLabel("     50.000 Toman");
        olviyePriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        olviyePriceLabel.setBounds(680, 570, 150, 40);
        olviyePriceLabel.setForeground(Color.WHITE);
        olviyePriceLabel.setOpaque(true);
        olviyePriceLabel.setBackground(Color.BLACK);
        olviyePriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(olviyePriceLabel);

        ImageIcon nargesiImage = new ImageIcon("src/nargesi.jpg");
        Image scaledNargesi = nargesiImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel nargesiLabel = new JLabel(new ImageIcon(scaledNargesi));
        nargesiLabel.setBounds(880, 380, 150, 150);
        mainPanel.add(nargesiLabel);

        JButton nargesiButton = new JButton("نرگسی");
        nargesiButton.setFont(new Font("Arial", Font.BOLD, 15));
        nargesiButton.setBackground(new Color(70, 130, 180));
        nargesiButton.setForeground(Color.WHITE);
        nargesiButton.setBounds(880, 530, 150, 40);
        mainPanel.add(nargesiButton);

        JLabel nargesiPriceLabel = new JLabel("     40.000 Toman");
        nargesiPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nargesiPriceLabel.setBounds(880, 570, 150, 40);
        nargesiPriceLabel.setForeground(Color.WHITE);
        nargesiPriceLabel.setOpaque(true);
        nargesiPriceLabel.setBackground(Color.BLACK);
        nargesiPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(nargesiPriceLabel);

        ImageIcon mirzaImage = new ImageIcon("src/mirza.jpg");
        Image scaledMirza = mirzaImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel mirzaLabel = new JLabel(new ImageIcon(scaledMirza));
        mirzaLabel.setBounds(1080, 380, 150, 150);
        mainPanel.add(mirzaLabel);

        JButton mirzaButton = new JButton("میرزا قاسمی");
        mirzaButton.setFont(new Font("Arial", Font.BOLD, 15));
        mirzaButton.setBackground(new Color(70, 130, 180));
        mirzaButton.setForeground(Color.WHITE);
        mirzaButton.setBounds(1080, 530, 150, 40);
        mainPanel.add(mirzaButton);

        JLabel mirzaPriceLabel = new JLabel("     40.000 Toman");
        mirzaPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        mirzaPriceLabel.setBounds(1080, 570, 150, 40);
        mirzaPriceLabel.setForeground(Color.WHITE);
        mirzaPriceLabel.setOpaque(true);
        mirzaPriceLabel.setBackground(Color.BLACK);
        mirzaPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(mirzaPriceLabel);

        ImageIcon mushroomImage = new ImageIcon("src/mushroom.jpg");
        Image scaledMushroom = mushroomImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel mushroomLabel = new JLabel(new ImageIcon(scaledMushroom));
        mushroomLabel.setBounds(1280, 380, 150, 150);
        mainPanel.add(mushroomLabel);

        JButton mushroomButton = new JButton("املت قارچ");
        mushroomButton.setFont(new Font("Arial", Font.BOLD, 15));
        mushroomButton.setBackground(new Color(70, 130, 180));
        mushroomButton.setForeground(Color.WHITE);
        mushroomButton.setBounds(1280, 530, 150, 40);
        mainPanel.add(mushroomButton);

        JLabel mushroomPriceLabel = new JLabel("     40.000 Toman");
        mushroomPriceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        mushroomPriceLabel.setBounds(1280, 570, 150, 40);
        mushroomPriceLabel.setForeground(Color.WHITE);
        mushroomPriceLabel.setOpaque(true);
        mushroomPriceLabel.setBackground(Color.BLACK);
        mushroomPriceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(mushroomPriceLabel);

        JButton returnHome = new JButton("بازگشت");
        returnHome.setFont(new Font("Arial", Font.BOLD, 50));
        returnHome.setForeground(Color.WHITE);
        returnHome.setBounds(600, 620, 300, 100);
        returnHome.setContentAreaFilled(false);
        returnHome.setBorderPainted(false);
        mainPanel.add(returnHome);

        returnHome.addActionListener(e -> {
            mainPanel.removeAll();
            showMenu(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        omletButton.addActionListener(e -> {
            orderMap.put("املت گوجه فرنگی", orderMap.getOrDefault("املت گوجه فرنگی", 0) + 1);
            JOptionPane.showMessageDialog(null, "املت گوجه فرنگی به سفارش‌ها اضافه شد!");
        });

        eggSausageButton.addActionListener(e -> {
            orderMap.put("سوسیس تخم مرغ", orderMap.getOrDefault("سوسیس تخم مرغ", 0) + 1);
            JOptionPane.showMessageDialog(null, "سوسیس تخم مرغ به سفارش‌ها اضافه شد!");
        });

        eggButton.addActionListener(e -> {
            orderMap.put("تخم مرغ آبپز", orderMap.getOrDefault("تخم مرغ آبپز", 0) + 1);
            JOptionPane.showMessageDialog(null, "تخم مرغ آبپز به سفارش‌ها اضافه شد!");
        });

        beansButton.addActionListener(e -> {
            orderMap.put("لوبیا", orderMap.getOrDefault("لوبیا", 0) + 1);
            JOptionPane.showMessageDialog(null, "لوبیا به سفارش‌ها اضافه شد!");
        });

        nimrooButton.addActionListener(e -> {
            orderMap.put("نیمرو", orderMap.getOrDefault("نیمرو", 0) + 1);
            JOptionPane.showMessageDialog(null, "نیمرو به سفارش‌ها اضافه شد!");
        });

        abgooshtButton.addActionListener(e -> {
            orderMap.put("آبگوشت", orderMap.getOrDefault("آبگوشت", 0) + 1);
            JOptionPane.showMessageDialog(null, "آبگوشت به سفارش‌ها اضافه شد!");
        });

        adasiButton.addActionListener(e -> {
            orderMap.put("عدسی", orderMap.getOrDefault("عدسی", 0) + 1);
            JOptionPane.showMessageDialog(null, "عدسی به سفارش‌ها اضافه شد!");
        });

        tonButton.addActionListener(e -> {
            orderMap.put("تن ماهی تخم مرغ", orderMap.getOrDefault("تن ماهی تخم مرغ", 0) + 1);
            JOptionPane.showMessageDialog(null, "تن ماهی تخم مرغ به سفارش‌ها اضافه شد!");
        });

        mexicanButton.addActionListener(e -> {
            orderMap.put("املت مکزیکی", orderMap.getOrDefault("املت مکزیکی", 0) + 1);
            JOptionPane.showMessageDialog(null, "املت مکزیکی به سفارش‌ها اضافه شد!");
        });

        bandariButton.addActionListener(e -> {
            orderMap.put("بندری", orderMap.getOrDefault("بندری", 0) + 1);
            JOptionPane.showMessageDialog(null, "بندری به سفارش‌ها اضافه شد!");
        });

        olviyeButton.addActionListener(e -> {
            orderMap.put("الویه", orderMap.getOrDefault("الویه", 0) + 1);
            JOptionPane.showMessageDialog(null, "الویه به سفارش‌ها اضافه شد!");
        });

        nargesiButton.addActionListener(e -> {
            orderMap.put("نرگسی", orderMap.getOrDefault("نرگسی", 0) + 1);
            JOptionPane.showMessageDialog(null, "نرگسی به سفارش‌ها اضافه شد!");
        });

        mirzaButton.addActionListener(e -> {
            orderMap.put("میرزا قاسمی", orderMap.getOrDefault("میرزا قاسمی", 0) + 1);
            JOptionPane.showMessageDialog(null, "میرزا قاسمی به سفارش‌ها اضافه شد!");
        });

        mushroomButton.addActionListener(e -> {
            orderMap.put("املت قارچ", orderMap.getOrDefault("املت قارچ", 0) + 1);
            JOptionPane.showMessageDialog(null, "املت قارچ به سفارش‌ها اضافه شد!");
        });
    }

    private static void showOrderRegistration(JPanel mainPanel) {
        mainPanel.removeAll();

        JLabel titleLabel = new JLabel("سفارش‌های شما:", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(600, 10, 300, 50);
        mainPanel.add(titleLabel);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3;
            }
        };
        model.addColumn("نام");
        model.addColumn("تعداد");
        model.addColumn("قیمت نهایی");
        model.addColumn("حذف");

        JTable orderTable = new JTable(model);
        orderTable.setRowHeight(50);
        orderTable.setFont(new Font("Arial", Font.PLAIN, 16));
        orderTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));

        JLabel totalPriceLabel = new JLabel("مجموع قیمت: 0 تومان", SwingConstants.CENTER);
        totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        totalPriceLabel.setForeground(Color.WHITE);

        JPanel totalPricePanel = new JPanel();
        totalPricePanel.setBackground(new Color(0, 128, 0));
        totalPricePanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        totalPricePanel.setBounds(500, 520, 500, 50);
        totalPricePanel.add(totalPriceLabel);

        mainPanel.add(totalPricePanel);

        orderTable.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());
        orderTable.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JCheckBox(), model, totalPriceLabel));

        JScrollPane scrollPane = new JScrollPane(orderTable);
        scrollPane.setBounds(200, 100, 1100, 400);
        mainPanel.add(scrollPane);

        JButton finalizeButton = new JButton("نهایی کردن سفارش");
        finalizeButton.setFont(new Font("Arial", Font.BOLD, 30));
        finalizeButton.setBackground(new Color(0, 128, 0));
        finalizeButton.setForeground(Color.WHITE);
        finalizeButton.setBounds(600, 580, 300, 50);
        mainPanel.add(finalizeButton);

        JButton returnHome = new JButton("بازگشت");
        returnHome.setFont(new Font("Arial", Font.BOLD, 30));
        returnHome.setBackground(new Color(70, 130, 180));
        returnHome.setForeground(Color.WHITE);
        returnHome.setBounds(600, 640, 300, 50);
        mainPanel.add(returnHome);

        returnHome.addActionListener(e -> {
            mainPanel.removeAll();
            showHomeScreen(mainPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        finalizeButton.addActionListener(e -> {
            orderMap.clear();
            showOrderRegistration(mainPanel);
            JOptionPane.showMessageDialog(null, "سفارش شما ثبت شد!");
        });

        updateOrderTable(model, totalPriceLabel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void updateOrderTable(DefaultTableModel model, JLabel totalPriceLabel) {
        model.setRowCount(0);
        int totalPrice = 0;

        for (String itemName : orderMap.keySet()) {
            int count = orderMap.get(itemName);
            int price = getPrice(itemName);
            int totalItemPrice = count * price;

            model.addRow(new Object[]{itemName, count, totalItemPrice + " تومان", "حذف"});
            totalPrice += totalItemPrice;
        }

        totalPriceLabel.setText("مجموع قیمت: " + totalPrice + " تومان");
    }

    static class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    static class ButtonEditor extends DefaultCellEditor {
        private JButton button;
        private int selectedRow;
        private DefaultTableModel model;
        private JLabel totalPriceLabel;

        public ButtonEditor(JCheckBox checkBox, DefaultTableModel model, JLabel totalPriceLabel) {
            super(checkBox);
            this.model = model;
            this.totalPriceLabel = totalPriceLabel;

            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> {
                fireEditingStopped();

                String itemName = (String) model.getValueAt(selectedRow, 0);

                if (orderMap.containsKey(itemName)) {
                    if (orderMap.get(itemName) > 1) {
                        orderMap.put(itemName, orderMap.get(itemName) - 1);
                    } else {
                        orderMap.remove(itemName);
                    }
                }

                updateOrderTable(model, totalPriceLabel);
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setText((value == null) ? "" : value.toString());
            selectedRow = row;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return button.getText();
        }
    }

    private static int getPrice(String itemName) {
        switch (itemName) {
            case "دلستر": return 20000;
            case "نوشابه": return 20000;
            case "قوری چای": return 39000;
            case "قهوه ترک": return 27000;
            case "نسکافه": return 15000;
            case "املت گوجه فرنگی": return 45000;
            case "نیمرو": return 35000;
            case "آبگوشت": return 199000;
            case "چای نبات": return 16000;
            case "معجون جاده ساوه": return 99000;
            case "سوسیس تخم مرغ": return 55000;
            case "تخم مرغ آب پز": return 25000;
            case "لوبیا": return 55000;
            case "عدسی": return 45000;
            case "معجون": return 99000;
            case "بطری آب": return 5000;
            case "چای ماسالا": return 50000;
            case "چای زنجبیل": return 15000;
            case "چای دارچین": return 15000;
            case "دوغ آبعلی": return 20000;
            case "گل گاوزبان": return 30000;
            case "تن ماهی تخم مرغ": return 120000;
            case "املت مکزیکی": return 50000;
            case "بندری": return 55000;
            case "الویه": return 50000;
            case "نرگسی": return 40000;
            case "میرزا قاسمی": return 40000;
            case "املت قارچ": return 40000;
            case "قلیون غروب های رباط کریم": return 198000;
            default: return 98000;
        }
    }
}