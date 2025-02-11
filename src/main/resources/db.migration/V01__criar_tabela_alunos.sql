-- Observar o arquivo applicarion.yml para a configuração do Flyway
-- se está habilitado para rodar as migrações de banco de dados
CREATE TABLE IF NOT EXISTS aluno (
    id VARCHAR(36) PRIMARY KEY DEFAULT (UUID()), -- Identificador único do aluno
    nome VARCHAR(50) NOT NULL, -- Nome do aluno
    matricula BIGINT NOT NULL, -- Matrícula do aluno
    data_ingresso DATE NOT NULL, -- Data de ingresso do aluno
    data_nascimento DATE NOT NULL, -- Data de nascimento do aluno
    email VARCHAR(100) NOT NULL, -- Email do aluno
    telefone VARCHAR(100) NOT NULL, -- Telefone do aluno
    observacoes VARCHAR(500) NOT NULL -- Observações sobre o aluno
);