# Andamento do Curso Java Programming Masterclass for Software Developers



# Orientações de instalação Amazon Corretto 11 no Linux Debian-Based

Faça download do arquivo .deb do JDK no url abaixo:

    https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html


Entre com o comando abaixo.

    $ sudo apt-get update; sudo apt-get install -y java-11-amazon-corretto-jdk

Verifique a instalação 

    $ java -version

Confirme a versão utilizada 

    $ sudo update-alternatives --config java

Selecione na lista a opção que representa java-11-amazon-correto.

    ...
    1            /usr/lib/jvm/java-11-amazon-corretto/bin/java 
    ...

Faça o mesmo para o javac.

    $ sudo update-alternatives --config javac


Para instalar a IDE IntelliJ Idea Communite

    $ sudo snap install intellij-idea-community --classic


# Configurações para o VSCode

https://code.visualstudio.com/docs/java/java-tutorial



# Referências

https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/generic-linux-install.html