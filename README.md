# Simulador de Fábrica - Validador de Senhas em Java

Aplicação desenvolvida em Java como parte de uma simulação de demanda de fábrica, focada em boas práticas de programação, separação de responsabilidades e aplicação de requisitos funcionais de segurança para senhas.

---

## 🚀 Funcionalidades e Requisitos Implementados

O sistema valida a senha digitada pelo usuário com base nos seguintes critérios:
* **RF02 (Comprimento Mínimo):** A senha deve conter pelo menos 8 caracteres.
* **RF03 (Inclusão de Números):** A senha deve possuir ao menos um caractere numérico (0-9).
* **RF04 (Blacklist / Senhas Obvias):** A senha não pode ser igual a termos comuns ("12345678", "senha123", "admin123").
* **RF05 (Letras Maiúsculas):** A senha deve conter pelo menos uma letra maiúscula (A-Z).

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK)
* **Conceitos aplicados:** Modularização de métodos (`main` e `avaliarSenha`), estruturas condicionais (`if/else`), laços de repetição (`for`), vetores/arrays e manipulação de `String` com a classe `Character`.

---

## 💻 Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado na sua máquina.
2. Clone este repositório ou baixe os ficheiros do projeto.
3. Compile o ficheiro principal:
   ```bash
   javac ATTM/Senha.java