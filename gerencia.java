
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {

        JLabel label = new JLabel("Olá, seja bem vindo!", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD,42));

        JFrame janela = new JFrame();
        janela.setSize(720, 720);
        janela.getContentPane().setBackground(new Color(0, 139, 139));
        janela.add(label);
        janela.setVisible(true);

        // Funcionario funcionario = new Funcionario();
        // Gerente gerente = new Gerente();

        // funcionario.setNome("Zé");
        // gerente.setNome("Carlos");
        // gerente.setSenha(1234);

        // System.out.println("Dados do funcionario: ");
        // System.out.println(funcionario.getNome());
        // System.out.println("Dadps dp gerente: ");
        // System.out.println(gerente.getNome());
        // System.out.println(gerente.getSenha());
        // System.out.println(gerente.autenticar(1234));
    }
}

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {

        JLabel label = new JLabel("Olá, seja bem vindo!", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD,42));

        JFrame janela = new JFrame();
        janela.setSize(720, 720);
        janela.getContentPane().setBackground(new Color(0, 139, 139));
        janela.add(label);
        janela.setVisible(true);

        // Funcionario funcionario = new Funcionario();
        // Gerente gerente = new Gerente();

        // funcionario.setNome("Zé");
        // gerente.setNome("Carlos");
        // gerente.setSenha(1234);

        // System.out.println("Dados do funcionario: ");
        // System.out.println(funcionario.getNome());
        // System.out.println("Dadps dp gerente: ");
        // System.out.println(gerente.getNome());
        // System.out.println(gerente.getSenha());
        // System.out.println(gerente.autenticar(1234));
    }

    public class Funcionario {
        private String nome;
        private String cpf;
        private double salario;
    
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
    
    }

    public class Gerente extends Funcionario {
        private int senha;
        private int numeroDeFuncionarios;
    
        public boolean autenticar(int senha){
            if(this.senha == senha){
                System.out.println("Acesso permitido!");
                return true;
            } else {
                System.out.println("Acesso negado!");
                return false;
            }
        }
    
        public int getSenha() {
            return senha;
        }
        public void setSenha(int senha) {
            this.senha = senha;
        }
        public int getNumeroDeFuncionarios() {
            return numeroDeFuncionarios;
        }
        public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
            this.numeroDeFuncionarios = numeroDeFuncionarios;
        }
    
    
    }

    import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {

        JLabel label = new JLabel("Olá, seja bem vindo!", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD,42));

        JFrame janela = new JFrame();
        janela.setSize(720, 720);
        janela.getContentPane().setBackground(new Color(0, 139, 139));
        janela.add(label);
        janela.setVisible(true);

        // Funcionario funcionario = new Funcionario();
        // Gerente gerente = new Gerente();

        // funcionario.setNome("Zé");
        // gerente.setNome("Carlos");
        // gerente.setSenha(1234);

        // System.out.println("Dados do funcionario: ");
        // System.out.println(funcionario.getNome());
        // System.out.println("Dadps dp gerente: ");
        // System.out.println(gerente.getNome());
        // System.out.println(gerente.getSenha());
        // System.out.println(gerente.autenticar(1234));
    }
}

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionarios;

    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }
    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }


}

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionarios;

    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }
    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }


}