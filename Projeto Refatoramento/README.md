# Projeto de Refatoramento do Sistema para gerenciamento de plataforma de Compra de Jogos


Padrões utilizados

    *Singleton*

    Centraliza a responsabilidade em uma única instância de uma classe.
    
    Classes: PromocaoSingleton, UsuarioSingleton.

    *Strategy*

    Encapsula um algoritmo fazendo com que as implementações sejam intercambiáveis.

    Classes: ClienteAlterarCpfConcret, ClienteAlterarEmailConcret, ClienteAlterarIdadeConcret, ClienteAlterarNomeConcret, ClienteAlterarSenhaConcret, UsuarioContexto e UsuarioStrategy.

    *Template Method*

    Template Method define um algoritmo em termos de operações abstratas que subclasses sobrepõem para oferecer comportamento concreto.

    Classes: Usuario, Cliente e Patrocinador.


