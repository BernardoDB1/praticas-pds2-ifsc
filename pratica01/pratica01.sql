DROP DATABASE pratica01;
CREATE database pratica01;
USE pratica01;
CREATE TABLE Pessoa (
  cpf BIGINT NOT NULL,
  nome VARCHAR(100) NOT NULL,
  senha VARCHAR(100) NOT NULL,
  PRIMARY KEY (cpf))