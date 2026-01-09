package cal_measles1;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Abdelrhman Hamdy
 */
public class Cal_Measles1 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            MeaslesVaccineCalculatorGUI frame = new MeaslesVaccineCalculatorGUI();
            frame.setVisible(true);
        });
    }
}

class MeaslesVaccineCalculatorGUI extends JFrame {

    static class OPVCampaign {
        int year;
        String intervention;
        String activity;
        String date;
        String areas;
        String ageGroup;
        
        OPVCampaign(int year, String intervention, String activity, String date, String areas, String ageGroup) {
            this.year = year;
            this.intervention = intervention;
            this.activity = activity;
            this.date = date;
            this.areas = areas;
            this.ageGroup = ageGroup;
        }
    }
    
    private static List<OPVCampaign> opvCampaigns = new ArrayList<>();
    
    static {
        // إضافة بيانات حملات OPV
        opvCampaigns.add(new OPVCampaign(2000, "OPV", "Mop-up", "05-Feb-00", "14 gov.", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2000, "OPV", "NIDs", "07-Mar-2000", "all", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2000, "OPV", "NIDs", "08-Apr-2000", "all", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2000, "OPV", "SNID", "18-Jul-2000", "9 gov in upp & 7 in lower", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2000, "OPV", "SNID", "05-Sep-2000", "9 gov in upp & 7 in lower", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2000, "OPV", "NIDs", "21-Nov-2000", "all", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2001, "OPV", "NIDs", "02-Jan-2001", "all", "1-48 m"));
        opvCampaigns.add(new OPVCampaign(2001, "OPV", "NIDs", "8-Nov-2001", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2001, "OPV", "NIDs", "22-Dec-2001", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2002, "OPV", "NIDs", "28-Sept2002", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2002, "OPV", "NIDs", "29-Oct2002", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2002, "OPV", "NIDs", "14-Dec-2002", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2003, "OPV", "NIDs", "28-Mar-2003", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2003, "OPV", "NIDs", "02-May-2003", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2003, "OPV", "SNIDs", "16-Sep-2003", "Greater Cairo, Sharkia - Alex., Qena, Minia & Assuit", "<5y"));
        opvCampaigns.add(new OPVCampaign(2003, "OPV", "NID's", "18-Oct-2003", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2003, "OPV", "NID's", "02-Dec-2003", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2004, "OPV", "SNIDs", "23-Feb-2004", "Greater Cairo, Sharkia - Gharbia-Minia", "<5y"));
        opvCampaigns.add(new OPVCampaign(2004, "OPV", "NID's", "27-Mar-2004", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2004, "OPV", "NID's", "27-Apr-2004", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2004, "OPV", "NID's", "05-Sep2004", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2004, "OPV", "NID's", "10-Oct-2004", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2004, "OPV", "NID's", "2-Dec-2004", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2005, "OPV", "NID's", "14-Feb-2005", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2005, "OPV", "NID's", "29-Mar-2005", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2005, "OPV1", "NID's", "14-May-2005", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2005, "OPV1", "NID's", "10-Jul-2005", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2005, "OPV1", "NID's", "25-Sep-2005", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2005, "OPV", "NID's", "28-Nov-2005", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2006, "OPV", "NID's", "02-Apr-2006", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2006, "OPV", "NID's", "07-May-2006", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2007, "OPV", "NID's", "13-May-2007", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2007, "OPV", "NID's", "02-Sep-2007", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2008, "OPV", "NID's", "30Mar2008", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2008, "OPV", "SNID's", "16-20 Nov2008.", "Giza & 6 Oct.", "<5y"));
        opvCampaigns.add(new OPVCampaign(2009, "OPV", "SNID's", "25-29 Jan.2009", "Greater Cairo (Cairo, Giza 6 Oct & Helwan)", "<5y"));
        opvCampaigns.add(new OPVCampaign(2009, "OPV", "SNID's", "15-19 March2009", "Greater Cairo (Cairo, Giza 6 Oct & Helwan)", "<5y"));
        opvCampaigns.add(new OPVCampaign(2009, "OPV", "NID's", "12-15 April2009", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2010, "OPV", "NID's", "8-12 March2010", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2010, "OPV", "NID's", "11-15 April2010", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2011, "OPV", "NID's", "2-5 Oct.2011", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2012, "OPV", "NID's", "21-24 April 2012", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2013, "OPV", "SNID's", "10-14 Mar.2013", "Cairo - Giza - Qaloubba", "<5y"));
        opvCampaigns.add(new OPVCampaign(2013, "OPV", "SNID's", "14-18 Apr.2013", "Cairo Giza Qaloubba", "<5y"));
        opvCampaigns.add(new OPVCampaign(2013, "OPV", "NID's", "17-20Nov.2013", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2013, "OPV", "NID's", "29 Dec-1Jan 2013", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2014, "OPV", "NID's", "4-6 April 2014", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2014, "OPV", "NID's", "26-29 Oct.2014", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2015, "OPV", "NID's", "19-22 April 2015", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2015, "OPV", "SNID's", "27-30 Dec 2015", "Cairo (M.Kadima, Helwan, May-Tebn, Madi) Giza (Saff, Atfih)", "<5y"));
        opvCampaigns.add(new OPVCampaign(2016, "t-OPV", "NID's", "21-24 Feb.2016", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2016, "t-OPV", "SNID's", "21-24 March.2016", "Cairo (M.Kadima, Dar Salam, Basahn, Helwan, May, Tebin, Madi) Giza (Saff, Atfih)", "<5y"));
        opvCampaigns.add(new OPVCampaign(2017, "b-OPV", "SNID's", "2-6 April.2017", "Cairo, Giza, Qual, Aswan, Matrouh, N Valley, H. Sinai, S. Sinai, Red Sea", "<5y"));
        opvCampaigns.add(new OPVCampaign(2018, "b-OPV", "NID's", "11-14 Feb.2018", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2019, "b-OPV", "NID's", "24-28 Feb.2019", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2020, "b-OPV", "NID's", "16-20 Feb.2020", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2021, "m-OPV2", "NID's", "28Feb. - 3March.2021", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2021, "m-OPV2", "NID's", "28March-1April.2021", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2021, "n-OPV2", "NID's", "19-23 Dec.2021", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2022, "b-OPV1,3", "NID's", "27-31 March.2022", "all", "<5y"));
        opvCampaigns.add(new OPVCampaign(2022, "n-OPV2", "SNID's", "9-13 Oct.2022", "Cairo & Giza", "<5y"));
        opvCampaigns.add(new OPVCampaign(2022, "n-OPV2", "NID's", "11-14 Dec.2022", "all", "<5y"));
    }

    private JTextField yearField;
    private JTextArea resultArea;
    private JButton calculateButton;
    private JButton clearButton;

    public MeaslesVaccineCalculatorGUI() {
        setTitle("CAL_POLIO_MEASLES");
        setSize(900, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // تعيين الخط العربي
        Font arabicFont = new Font("Arial", Font.PLAIN, 14);
        Font titleFont = new Font("Arial", Font.BOLD, 18);
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        
        // Panel رئيسي
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(240, 248, 255));
        
        // Panel العنوان
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(70, 130, 180));
        JLabel titleLabel = new JLabel("CAL_POLIO_MEASLES");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);
        
        // Panel الإدخال
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 10));
        inputPanel.setBackground(new Color(240, 248, 255));
        inputPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
            "إدخال البيانات",
            TitledBorder.RIGHT,
            TitledBorder.TOP,
            headerFont
        ));
        
        JLabel yearLabel = new JLabel("Year Of Birth :");
        yearLabel.setFont(arabicFont);
        yearField = new JTextField(10);
        yearField.setFont(arabicFont);
        yearField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        calculateButton = new JButton("CAL_POLIO_MEASLES");
        calculateButton.setFont(arabicFont);
        calculateButton.setBackground(new Color(60, 179, 113));
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFocusPainted(false);
        calculateButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        clearButton = new JButton("Clear");
        clearButton.setFont(arabicFont);
        clearButton.setBackground(new Color(220, 20, 60));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        inputPanel.add(yearLabel);
        inputPanel.add(yearField);
        inputPanel.add(calculateButton);
        inputPanel.add(clearButton);
        
        // دمج العنوان والإدخال في panel واحد
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(titlePanel, BorderLayout.NORTH);
        topPanel.add(inputPanel, BorderLayout.CENTER);
        
        // Panel النتائج
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
            "Results",
            TitledBorder.RIGHT,
            TitledBorder.TOP,
            headerFont
        ));
        
        resultArea = new JTextArea();
        resultArea.setFont(arabicFont);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        resultArea.setBackground(Color.WHITE);
        
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        resultPanel.add(scrollPane, BorderLayout.CENTER);
        
        // إضافة المكونات للـ Main Panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(resultPanel, BorderLayout.CENTER);
        
        add(mainPanel);
        
        // إضافة الأحداث
        calculateButton.addActionListener(e -> calculateVaccines());
        clearButton.addActionListener(e -> clearFields());
        
        // السماح بالحساب عند الضغط على Enter
        yearField.addActionListener(e -> calculateVaccines());
    }
    
    private void calculateVaccines() {
        try {
            int birthYear = Integer.parseInt(yearField.getText().trim());
            
            if (birthYear < 1900 || birthYear > 2025) {
                JOptionPane.showMessageDialog(this, 
                    "الرجاء إدخال سنة ميلاد صحيحة", 
                    "خطأ", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            StringBuilder result = new StringBuilder();
            result.append("═══════════════════════════════════════════════════\n");
            result.append("         نتائج التطعيمات لمواليد سنة ").append(birthYear).append("\n");
            result.append("═══════════════════════════════════════════════════\n\n");
            
            // تطعيمات الحصبة
            result.append("🔴 تطعيمات الحصبة\n");
            result.append("═══════════════════════════════════════════════════\n");
            result.append(getRoutineVaccines(birthYear));
            result.append(getMeaslesCampaigns(birthYear));
            
            // تطعيمات شلل الأطفال
            result.append("\n💉 تطعيمات شلل الأطفال (OPV)\n");
            result.append("═══════════════════════════════════════════════════\n");
            result.append(getOPVCampaigns(birthYear));
            
            resultArea.setText(result.toString());
            resultArea.setCaretPosition(0);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "الرجاء إدخال رقم صحيح لسنة الميلاد", 
                "خطأ في الإدخال", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String getRoutineVaccines(int birthYear) {
        StringBuilder sb = new StringBuilder();
        sb.append("📋 التطعيمات الروتينية:\n");
        sb.append("────────────────────────────────────────────────\n");
        
        if (birthYear >= 1977 && birthYear <= 1998) {
            sb.append("✓ تطعيم حصبة منفرد عند عمر 9 شهور\n");
        } else if (birthYear >= 1999 && birthYear <= 2007) {
            sb.append("✓ تطعيم حصبة منفرد عند عمر 9 شهور\n");
            sb.append("✓ تطعيم MMR عند عمر 18 شهر\n");
        } else if (birthYear >= 2008) {
            sb.append("✓ تطعيم MMR عند عمر 9 شهور\n");
            sb.append("✓ تطعيم MMR عند عمر 18 شهر\n");
        } else {
            sb.append("✗ لا توجد معلومات متاحة للمواليد قبل 1977\n");
        }
        
        sb.append("\n");
        return sb.toString();
    }
    
    private String getMeaslesCampaigns(int birthYear) {
        StringBuilder sb = new StringBuilder();
        sb.append("🎯 الحملات التكميلية:\n");
        sb.append("────────────────────────────────────────────────\n");
        
        List<String> campaigns = new ArrayList<>();
        
        if (birthYear >= 1993 && birthYear <= 1995) {
            campaigns.add("✓ حملة 1998 (عمر 3-5 سنوات)(الجرعة =MR)");
        }
        if (birthYear >= 1985 && birthYear <= 1994) {
            campaigns.add("✓ حملة مدرسية 2000/2001 (عمر 6-15 سنة)(الجرعة =MR)");
        }
        if (birthYear >= 1988 && birthYear <= 1998) {
            campaigns.add("✓ حملة 2008 (عمر 10-20 سنة)(الجرعة =MR)");
        }
        if (birthYear >= 1998 && birthYear <= 2007) {
            campaigns.add("✓ حملة 2009 (عمر 2-11 سنة)(الجرعة =MR)");
        }
        
        if (campaigns.isEmpty()) {
            sb.append("✗ لم يشملهم أي حملات تكميلية\n");
        } else {
            for (String campaign : campaigns) {
                sb.append(campaign).append("\n");
            }
        }
        
        int totalDoses = calculateMeaslesTotalDoses(birthYear);
        sb.append("\n📊 إجمالي جرعات الحصبة: ").append(totalDoses).append("\n");
        
        return sb.toString();
    }
    
    private String getOPVCampaigns(int birthYear) {
        StringBuilder sb = new StringBuilder();
        List<String> eligibleCampaigns = new ArrayList<>();
        
        for (OPVCampaign campaign : opvCampaigns) {
            int ageAtCampaign = campaign.year - birthYear;
            boolean eligible = false;
            
            if (campaign.ageGroup.contains("1-48 m")) {
                eligible = (ageAtCampaign >= 0 && ageAtCampaign <= 4);
            } else if (campaign.ageGroup.contains("<5y")) {
                eligible = (ageAtCampaign >= 0 && ageAtCampaign < 5);
            }
            
            if (eligible) {
                String details = String.format("✓ %s - %s (%s) - %s", 
                    campaign.date, 
                    campaign.activity, 
                    campaign.intervention,
                    campaign.areas.equals("all") ? "جميع المحافظات" : campaign.areas
                );
                eligibleCampaigns.add(details);
            }
        }
        
        sb.append("الحملات المؤهل لها:\n");
        sb.append("────────────────────────────────────────────────\n");
        
        if (eligibleCampaigns.isEmpty()) {
            sb.append("✗ لم يشملهم أي حملات OPV في السجل\n");
        } else {
            for (String campaign : eligibleCampaigns) {
                sb.append(campaign).append("\n");
            }
        }
        
        sb.append("\n📊 إجمالي حملات OPV: ").append(eligibleCampaigns.size()).append("\n");
        
        return sb.toString();
    }
    
    private int calculateMeaslesTotalDoses(int birthYear) {
        int total = 0;
        
        if (birthYear >= 1977 && birthYear <= 1998) {
            total += 1;
        } else if (birthYear >= 1999) {
            total += 2;
        }
        
        if (birthYear >= 1993 && birthYear <= 1995) total++;
        if (birthYear >= 1985 && birthYear <= 1994) total++;
        if (birthYear >= 1988 && birthYear <= 1998) total++;
        if (birthYear >= 1998 && birthYear <= 2007) total++;
        
        return total;
    }
    
    private void clearFields() {
        yearField.setText("");
        resultArea.setText("");
        yearField.requestFocus();
    }
}