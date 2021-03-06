package com.softpos.crm;

import report.softpos.crm.Report_Amountbranch;
import report.softpos.crm.Report_Amountbydate;
import report.softpos.crm.Report_Amountp1;
import report.softpos.crm.Report_Dept;
import report.softpos.crm.Report_Eventamount;
import report.softpos.crm.Report_Historyb;
import report.softpos.crm.Report_Jtrophy;
import report.softpos.crm.Report_Member;
import report.softpos.crm.Report_Pointuser;
import report.softpos.crm.Report_Servicetype;
import report.softpos.crm.Report_Totalamount;
import report.softpos.crm.Report_Ttrophy;
import report.softpos.crm.Report_byplu;
import report.softpos.crm.Report_diff;
import report.softpos.crm.Report_hispointgu;
import report.softpos.crm.Report_logfile;
import report.softpos.crm.Report_memScore;
import report.softpos.crm.Report_memTran;
import report.softpos.crm.Report_memcardpro;
import report.softpos.crm.Report_memd;
import report.softpos.crm.Report_memevent;
import report.softpos.crm.Report_mempoint;
import report.softpos.crm.Report_pointbranch;
import report.softpos.crm.Report_totaltrophy;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem39 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem52 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem54 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบสมาชิก (CRM Branch)");

        jMenu1.setText("แฟ้มข้อมูลหลัก (Master File)");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("แฟ้มข้อมูลสมาชิก (Member File)");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenu6.setText("องค์ประกอบของแฟ้มข้อมูลสมาชิก");
        jMenu6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem15.setText("แฟ้มข้อมูลประเภทสมาชิก (Member Type File)");
        jMenu6.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem16.setText("แฟ้มข้อมูลคำนำหน้าชื่อ (Title Name File)");
        jMenu6.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem17.setText("แฟ้มข้อมูลสถานะภาพ (Status File)");
        jMenu6.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem18.setText("แฟ้มข้อมูลอาชีพ (Occupation File)");
        jMenu6.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem19.setText("แฟ้มข้อมูลรายได้ (Income File)");
        jMenu6.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem20.setText("แฟ้มข้อมูลสัญชาติ");
        jMenu6.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem21.setText("แฟ้มข้อมูลระดับการศึกษา (Education File)");
        jMenu6.add(jMenuItem21);

        jMenuItem22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem22.setText("แฟ้มข้อมูลงานอดิเรก (Hobby File)");
        jMenu6.add(jMenuItem22);

        jMenu1.add(jMenu6);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("แฟ้มข้อมูลกิจกรรม (Activities File)");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setText("แฟ้มข้อมูลประเภทกลุ่มสาขา (Branch Group File)");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("แฟ้มข้อมูลสาขา (Branch File)");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setText("แฟ้มข้อมูลแผนกสินค้า (Department File)");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("แฟ้มข้อมูลรายละเอียดบริษัท (Company File)");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator3);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setText("แฟ้มข้อมูลอัตราแต้มท้ายบิล (Bill Point Type File)");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setText("แฟ้มข้อมูลโปรโมชันบัตรให้กับสมาชิก (Card Promotion Setting)");
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator4);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setText("แฟ้มข้อมูลของรางวัล (Gift File)");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem10.setText("รายการนำของรางวัลเข้าสู่ระบบ");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem11.setText("บันทึกการจองของรางวัล");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem12.setText("บันทึกการส่งของรางวัล");
        jMenu1.add(jMenuItem12);
        jMenu1.add(jSeparator5);

        jMenuItem13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem13.setText("กำหนดกลุ่มผู้ใช้งาน (User Group Setting)");
        jMenu1.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem14.setText("กำหนดรหัสผู้ใช้งาน (User Setting)");
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("การดำเนินงานรายวัน (Daily Process)");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem23.setText("บันทึกรายการยอดซื้อของสมาชิกจากเอกสาร ตามรหัสสินค้า (PLU)");
        jMenu2.add(jMenuItem23);
        jMenu2.add(jSeparator6);

        jMenuItem24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem24.setText("ล้างข้อมูลการซื้อตามช่วงวันที่ (Clear Sales Transaction)");
        jMenu2.add(jMenuItem24);

        jMenuItem25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem25.setText("ล้างยอดซื้อสะสมของสมาชิก (ทั้งหมด)");
        jMenu2.add(jMenuItem25);

        jMenuItem26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem26.setText("ลบข้อมูลสมาชิกตามเงื่อนไขที่กำหนด (Delete Member)");
        jMenu2.add(jMenuItem26);
        jMenu2.add(jSeparator7);

        jMenuItem27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem27.setText("การปรับปรุงยอดซื้อ และแต้มสะสม (Balance)");
        jMenu2.add(jMenuItem27);

        jMenuItem28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem28.setText("การปรับปรุงข้อมูลจาก Rich POS (Group, Product etc.)");
        jMenu2.add(jMenuItem28);
        jMenu2.add(jSeparator8);

        jMenuItem29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem29.setText("ยกยอดสต็อกของขวัญ (สิ้นปี)");
        jMenu2.add(jMenuItem29);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("รายงานต่าง ๆ (Report)");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem30.setText("รายงานยอดการซื้อประจำวัน (สรุปต่อวัน)");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem30);

        jMenuItem31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem31.setText("รายงานยอดการซื้อสะสม และเฉลี่ยต่อครั้ง (สรุปเป็นช่วง)");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem31);

        jMenuItem32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem32.setText("รายงานประวัติการซื้อ และแต้มที่ได้ของสมาชิก (การซื้อ/ครั้ง)");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem32);

        jMenuItem33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem33.setText("รายงานยอดการซื้อช่วงจัดกิจกรรม");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem33);

        jMenuItem34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem34.setText("รายงานประวัติการซื้อ PLU");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem34);
        jMenu3.add(jSeparator9);

        jMenuItem35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem35.setText("รายงานอันดับการซื้อของสมาชิก (By Total Amount)");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem35);

        jMenuItem36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem36.setText("รายงานอันดับการซื้อของสมาชิก (By Service Type)");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem36);

        jMenuItem37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem37.setText("รายงานอันดับการซื้อของสมาชิก (By Dept.)");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem37);

        jMenuItem38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem38.setText("รายงานอันดับการซื้อของสมาชิก (By PLU)");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem38);
        jMenu3.add(jSeparator10);

        jMenuItem39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem39.setText("รายงานสรุปยอดซื้อของสมาชิก (ของแต่ละสาขา)");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem39);
        jMenu3.add(jSeparator11);

        jMenuItem40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem40.setText("รายงานการจองของรางวัล");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem40);

        jMenuItem41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem41.setText("รายงานการส่งของรางวัล");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem41);

        jMenuItem42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem42.setText("รายงานของรางวัลคงเหลือ");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem42);

        jMenuItem43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem43.setText("รายงานประเภทอัตราแต้ม ตามสาขา");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem43);
        jMenu3.add(jSeparator12);

        jMenuItem44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem44.setText("รายงานรายละเอียดข้อมูลสมาชิก");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem44);

        jMenuItem45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem45.setText("รายงานรายละเอียดข้อมูลสมาชิก ตามช่วงการซื้อ");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem45);

        jMenuItem46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem46.setText("รายงานแต้มคงเหลือปัจจุบัน ของสมาชิก");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem46);

        jMenuItem47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem47.setText("รายงานข้อมูลสมาชิกที่เข้าร่วมกิจกรรม");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem47);

        jMenuItem48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem48.setText("รายงานสมาชิกที่ใช้โปรโมชันบัตร");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem48);

        jMenuItem49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem49.setText("รายงานการต่ออายุบัตรของสมาชิก (รายวัน)");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem49);

        jMenuItem50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem50.setText("รายงานประวัติแต้มพิเศษรายสมาชิก");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem50);

        jMenuItem51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem51.setText("รายงานรวมประวัติแต้ม รับเข้า/ใช้ไป ของสมาชิก");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem51);
        jMenu3.add(jSeparator13);

        jMenuItem52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem52.setText("รายงานตรวจสอบยอดซื้อ และแต้มสะสม (Diff. Report)");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem52);
        jMenu3.add(jSeparator14);

        jMenuItem53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem53.setText("รายงานบันทึกเหตุการณ์ (Log File)");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem53);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("ออกจากระบบ (Exit)");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem54.setText("จบการทำงาน (Exit 555)");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem54);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        Report_Amountbydate frm = new Report_Amountbydate(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        Report_Amountp1 frm = new Report_Amountp1(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        Report_Pointuser frm = new Report_Pointuser(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        Report_Eventamount frm = new Report_Eventamount(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        Report_Historyb frm = new Report_Historyb(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        Report_Totalamount frm = new Report_Totalamount(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        Report_Servicetype frm = new Report_Servicetype(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        Report_Dept frm = new Report_Dept(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        Report_byplu frm = new Report_byplu(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        Report_Amountbranch frm = new Report_Amountbranch(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        Report_Jtrophy frm = new Report_Jtrophy(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        Report_Ttrophy frm = new Report_Ttrophy(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        Report_totaltrophy frm = new Report_totaltrophy(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        Report_pointbranch frm = new Report_pointbranch(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        Report_Member frm = new Report_Member(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        Report_memTran frm = new Report_memTran(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        Report_memScore frm = new Report_memScore(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        Report_memevent frm = new Report_memevent(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        Report_memcardpro frm = new Report_memcardpro(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        Report_memd frm = new Report_memd(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        Report_mempoint frm = new Report_mempoint(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
        Report_hispointgu frm = new Report_hispointgu(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        Report_diff frm = new Report_diff(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        Report_logfile frm = new Report_logfile(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
