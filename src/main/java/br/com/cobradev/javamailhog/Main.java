package br.com.cobradev.javamailhog;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.enviar(
            "Parabéns pela aquisição do seu novo curso!",
            "<h1>Olá, prezado aluno!</h1><h3>Bem-vindo ao seu novo curso de Spring do CobraDev!</h3><h4><span style=color:red;>CobraDev Cursos Tecnológicos</span></h4>",
            "tadeupalermoti@gmail.com,tadeu@bol.com.br"
        );

    }
}