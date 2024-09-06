import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InscriptionEcole {

    public static void main(String[] args) {
        // Créer la fenêtre principale
        JFrame frame = new JFrame("Formulaire d'Inscription - Khalid School");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());

        // Définir le panneau principal avec une bordure et un layout en grille
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Couleur de fond et polices modernes
        panel.setBackground(new Color(245, 245, 245));
        Font font = new Font("Arial", Font.PLAIN, 14);

        // Composants du formulaire
        JLabel labelNom = new JLabel("Nom:");
        labelNom.setFont(font);
        JTextField textNom = new JTextField(15);

        JLabel labelPrenom = new JLabel("Prénom:");
        labelPrenom.setFont(font);
        JTextField textPrenom = new JTextField(15);

        JLabel labelAge = new JLabel("Âge:");
        labelAge.setFont(font);
        JTextField textAge = new JTextField(15);

        JLabel labelGenre = new JLabel("Genre:");
        labelGenre.setFont(font);
        String[] genres = {"Masculin", "Féminin", "Autre"};
        JComboBox<String> comboGenre = new JComboBox<>(genres);

        JLabel labelEmail = new JLabel("Adresse e-mail:");
        labelEmail.setFont(font);
        JTextField textEmail = new JTextField(15);

        JLabel labelPhone = new JLabel("Numéro de téléphone:");
        labelPhone.setFont(font);
        JTextField textPhone = new JTextField(15);

        JLabel labelCours = new JLabel("Cours:");
        labelCours.setFont(font);
        String[] cours = {"Mathématiques", "Science", "Histoire", "Informatique"};
        JComboBox<String> comboCours = new JComboBox<>(cours);

        JButton submitButton = new JButton("Soumettre");
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        submitButton.setBackground(new Color(66, 135, 245));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);

        // Ajouter les composants au panneau avec des positions définies
        gbc.gridx = 0; gbc.gridy = 0; panel.add(new JLabel("Formulaire d'Inscription - Khalid School", JLabel.CENTER), gbc);
        gbc.gridx = 0; gbc.gridy = 1; panel.add(labelNom, gbc);
        gbc.gridx = 1; gbc.gridy = 1; panel.add(textNom, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2; panel.add(labelPrenom, gbc);
        gbc.gridx = 1; gbc.gridy = 2; panel.add(textPrenom, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3; panel.add(labelAge, gbc);
        gbc.gridx = 1; gbc.gridy = 3; panel.add(textAge, gbc);
        
        gbc.gridx = 0; gbc.gridy = 4; panel.add(labelGenre, gbc);
        gbc.gridx = 1; gbc.gridy = 4; panel.add(comboGenre, gbc);
        
        gbc.gridx = 0; gbc.gridy = 5; panel.add(labelEmail, gbc);
        gbc.gridx = 1; gbc.gridy = 5; panel.add(textEmail, gbc);
        
        gbc.gridx = 0; gbc.gridy = 6; panel.add(labelPhone, gbc);
        gbc.gridx = 1; gbc.gridy = 6; panel.add(textPhone, gbc);
        
        gbc.gridx = 0; gbc.gridy = 7; panel.add(labelCours, gbc);
        gbc.gridx = 1; gbc.gridy = 7; panel.add(comboCours, gbc);
        
        gbc.gridx = 1; gbc.gridy = 8; panel.add(submitButton, gbc);

        // Ajouter le panneau principal à la fenêtre
        frame.add(panel, BorderLayout.CENTER);

        // Ajouter un écouteur d'événements pour le bouton de soumission
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textNom.getText();
                String prenom = textPrenom.getText();
                String age = textAge.getText();
                String genre = (String) comboGenre.getSelectedItem();
                String email = textEmail.getText();
                String phone = textPhone.getText();
                String cours = (String) comboCours.getSelectedItem();

                // Afficher les informations dans une boîte de dialogue
                JOptionPane.showMessageDialog(frame, 
                        "Nom: " + nom + "\nPrénom: " + prenom + "\nÂge: " + age + 
                        "\nGenre: " + genre + "\nEmail: " + email + "\nTéléphone: " + phone + 
                        "\nCours: " + cours, 
                        "Informations d'inscription", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Afficher la fenêtre
        frame.setVisible(true);
    }
}
