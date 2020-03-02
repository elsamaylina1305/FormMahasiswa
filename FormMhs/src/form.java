
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class form extends JFrame
{
    JLabel data, nama, nim, jk, agama, alamat;
    JTextField isinama,isinim;
    JTextArea isialamat;
    JRadioButton p, l;
    JComboBox isiagama;
    JButton ok;
    public void form()
    {
        setTitle("Data Diri Mahasiswa");
        data = new JLabel("Data Diri Mahasiswa");
        nama = new JLabel("Nama");
        nim = new JLabel("Nim");
        jk = new JLabel("Jenis Kelamin");
        agama = new JLabel("Agama");
        String[] nama_agama = {"Islam","Kristen","Katolik","Hindu","Budha"};
        isiagama = new JComboBox(nama_agama);
        alamat = new JLabel("Alamat");
        isinama = new JTextField();
        isinim = new JTextField();
        isialamat = new JTextArea();
        p = new JRadioButton("P");
        l = new JRadioButton("L");
        ok = new JButton("OK");
        ButtonGroup group = new ButtonGroup();
        group.add(p);
        group.add(l);
        
        setLayout(null);
        add(data);
        add(nama);
        add(nim);
        add(jk);
        add(agama);
        add(alamat);
        add(isinama);
        add(isinim);
        add(isialamat);
        add(p);
        add(l);
        add(isiagama);
        add(ok);
        
        data.setBounds(170, 20, 200, 20);
        nama.setBounds(20, 50, 100, 20);
        isinama.setBounds(140, 50, 200, 20);
        nim.setBounds(20,100,90,20);
        isinim.setBounds(140, 90, 200, 20);
        jk.setBounds(20, 130, 100, 20);
        p.setBounds(140, 130, 100, 20);
        l.setBounds (240, 130, 100,20);
        agama.setBounds(20, 170, 100, 20);
        isiagama.setBounds(140, 170, 100, 20);
        alamat.setBounds(20, 210, 100, 20);
        isialamat.setBounds(140, 210, 250, 150);
        ok.setBounds(330, 365, 60, 20);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
