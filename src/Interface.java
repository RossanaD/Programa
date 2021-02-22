import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Interface {

	private JFrame frame;
	private JTextField NomeSala;
	private JTextField LotacaoSala;
	private JTextField NomeCafe;
	private JTextField LotacaoCafe;
	private JTextField NomePessoa;
	private JTextField SobrenomePessoa;
	private JComboBox<Sala> comboBox;
	private JComboBox<EspacoCafe> comboBox_1;
	private HashMap<String, Sala> salas = new HashMap<>();
	private HashMap<String, Pessoas> pessoas = new HashMap<>();
	private HashMap<String, EspacoCafe> cafe = new HashMap<>();
	private JTextField NomeAPesquisar;
	private JTextField SobrneomeApesquisar;
	private JTextArea textArea;
	private JComboBox<Sala> comboBox_2;
	private JComboBox<EspacoCafe> comboBox_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(tabbedPane);
		
		Panel panel = new Panel();
		tabbedPane.addTab("Cadastrar Sala e Café", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome da Sala:");
		lblNewLabel.setBounds(10, 11, 94, 14);
		panel.add(lblNewLabel);
		
		NomeSala = new JTextField();
		NomeSala.setBounds(94, 8, 132, 20);
		panel.add(NomeSala);
		NomeSala.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Lota\u00E7\u00E3o:");
		lblNewLabel_1.setBounds(10, 36, 62, 14);
		panel.add(lblNewLabel_1);
		
		LotacaoSala = new JTextField();
		LotacaoSala.setBounds(65, 33, 73, 20);
		panel.add(LotacaoSala);
		LotacaoSala.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Sala s = new Sala(NomeSala.getText(), Integer.parseInt(LotacaoSala.getText()));
					comboBox.addItem(s);
					comboBox_2.addItem(s);
					JOptionPane.showMessageDialog(frame, "Sala cadastrada com sucesso");
				} catch (IllegalArgumentException iae) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(frame, iae.getMessage());
				}
			}
		});
		btnNewButton.setBounds(10, 61, 110, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("==========================================================");
		lblNewLabel_2.setBounds(10, 87, 409, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome do espa\u00E7o de caf\u00E9:");
		lblNewLabel_3.setBounds(10, 106, 166, 14);
		panel.add(lblNewLabel_3);
		
		NomeCafe = new JTextField();
		NomeCafe.setBounds(155, 103, 151, 20);
		panel.add(NomeCafe);
		NomeCafe.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Lota\u00E7\u00E3o:");
		lblNewLabel_4.setBounds(10, 128, 62, 14);
		panel.add(lblNewLabel_4);
		
		LotacaoCafe = new JTextField();
		LotacaoCafe.setBounds(65, 125, 73, 20);
		panel.add(LotacaoCafe);
		LotacaoCafe.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EspacoCafe c = new EspacoCafe(NomeCafe.getText(), Integer.parseInt(LotacaoCafe.getText()));
					comboBox_1.addItem(c);
					comboBox_3.addItem(c);
					JOptionPane.showMessageDialog(frame, "Espaço café cadastrado com sucesso");
				} catch (IllegalArgumentException iae) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(frame, iae.getMessage());
				}
			}
		});
		btnNewButton_1.setBounds(10, 162, 110, 23);
		panel.add(btnNewButton_1);
		
		Panel panel_2 = new Panel();
		tabbedPane.addTab("Cadastrar Pessoa", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Nome:");
		lblNewLabel_5.setBounds(10, 11, 48, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sobrenome:");
		lblNewLabel_6.setBounds(10, 36, 82, 14);
		panel_2.add(lblNewLabel_6);
		
		NomePessoa = new JTextField();
		NomePessoa.setBounds(55, 8, 112, 20);
		panel_2.add(NomePessoa);
		NomePessoa.setColumns(10);
		
		SobrenomePessoa = new JTextField();
		SobrenomePessoa.setBounds(84, 33, 201, 20);
		panel_2.add(SobrenomePessoa);
		SobrenomePessoa.setColumns(10);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(43, 64, 124, 22);
		panel_2.add(comboBox);
		
		comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(109, 93, 132, 22);
		panel_2.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("Sala:");
		lblNewLabel_7.setBounds(10, 68, 48, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Espa\u00E7o de Caf\u00E9:");
		lblNewLabel_8.setBounds(10, 97, 101, 14);
		panel_2.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Cadastrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome = NomePessoa.getText();
					String sobre = SobrenomePessoa.getText();
					String NomeCompleto = nome+sobre;
					Sala salaselecionado = (Sala) comboBox.getSelectedItem();
					EspacoCafe cafeSelecionado = (EspacoCafe) comboBox_1.getSelectedItem();
					Pessoas p = new Pessoas(nome, sobre);
					salaselecionado.addPessoa(p);
					cafeSelecionado.addPessoa(p);	
					p.setSala(salaselecionado);
					p.setCafe(cafeSelecionado);
					pessoas.put(NomeCompleto, p);			
					salas.put(salaselecionado.getNomeSala(), salaselecionado);
					cafe.put(cafeSelecionado.getNomeCafe(), cafeSelecionado);					
					JOptionPane.showMessageDialog(frame, "Pessoa cadastrada com sucesso");
				} catch (IllegalArgumentException iae) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(frame, iae.getMessage());
				}
			}
		});
		btnNewButton_2.setBounds(22, 143, 103, 23);
		panel_2.add(btnNewButton_2);
		
		Panel panel_1 = new Panel();
		tabbedPane.addTab("Consultar", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Nome:");
		lblNewLabel_9.setBounds(10, 11, 48, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sobrenome:");
		lblNewLabel_10.setBounds(177, 11, 80, 14);
		panel_1.add(lblNewLabel_10);
		
		NomeAPesquisar = new JTextField();
		NomeAPesquisar.setBounds(54, 8, 106, 20);
		panel_1.add(NomeAPesquisar);
		NomeAPesquisar.setColumns(10);
		
		SobrneomeApesquisar = new JTextField();
		SobrneomeApesquisar.setBounds(251, 8, 123, 20);
		panel_1.add(SobrneomeApesquisar);
		SobrneomeApesquisar.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Pesquisar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeCompleto = NomeAPesquisar.getText()+SobrneomeApesquisar.getText();
				for(Pessoas p : pessoas.values()) {
					String nomeCompl = p.getNome()+p.getSobrenome();
					if(nomeCompleto.equals(nomeCompl)) {
						textArea.append(p.exibir());
					}
				}
			}
		});
		btnNewButton_3.setBounds(10, 36, 106, 23);
		panel_1.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 409, 77);
		panel_1.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_11 = new JLabel("==========================================================");
		lblNewLabel_11.setBounds(10, 70, 409, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("==========================================================");
		lblNewLabel_11_1.setBounds(10, 143, 409, 14);
		panel_1.add(lblNewLabel_11_1);
		
		comboBox_2 = new JComboBox<Sala>();
		comboBox_2.setBounds(43, 85, 108, 22);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("Sala:");
		lblNewLabel_7_1.setBounds(10, 89, 48, 14);
		panel_1.add(lblNewLabel_7_1);
		
		comboBox_3 = new JComboBox<EspacoCafe>();
		comboBox_3.setBounds(307, 85, 96, 22);
		panel_1.add(comboBox_3);
		
		JLabel lblNewLabel_8_1 = new JLabel("Espa\u00E7o de Caf\u00E9:");
		lblNewLabel_8_1.setBounds(208, 89, 101, 14);
		panel_1.add(lblNewLabel_8_1);
		
		JButton btnNewButton_4 = new JButton("Pesquisar Sala");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sala sala = (Sala) comboBox_2.getSelectedItem();				
				for(Sala s : salas.values()) {
					if(sala.equals(s)) {
						textArea.append("Nome da sala: "+s.getNomeSala()+"\n"+s.exibir()+"\n");
					}
				}
			}
		});
		btnNewButton_4.setBounds(20, 118, 131, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Pesquisar Caf\u00E9");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EspacoCafe ca = (EspacoCafe) comboBox_3.getSelectedItem();
				for(EspacoCafe c : cafe.values()) {
					if(ca.equals(c)) {
						textArea.append("Espaço café: "+c.getNomeCafe()+"\n"+c.exibir()+"\n");
					}
				}
			}
		});
		btnNewButton_5.setBounds(277, 118, 126, 23);
		panel_1.add(btnNewButton_5);
	}
}
