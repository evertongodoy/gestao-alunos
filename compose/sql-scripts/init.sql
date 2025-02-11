-- Cria a tabela `alunos` (se ainda não existir)
CREATE TABLE IF NOT EXISTS aluno (
    id VARCHAR(36) PRIMARY KEY DEFAULT (UUID()), -- Identificador único do aluno
    nome VARCHAR(50) NOT NULL, -- Nome do aluno
    matricula BIGINT NOT NULL UNIQUE DEFAULT 0, -- Matrícula do aluno
    data_ingresso DATE NOT NULL, -- Data de ingresso do aluno
    data_nascimento DATE NOT NULL, -- Data de nascimento do aluno
    email VARCHAR(100) NOT NULL, -- Email do aluno
    telefone VARCHAR(100) NOT NULL -- Telefone do aluno
--    observacoes VARCHAR(500) NOT NULL -- Observações sobre o aluno
);


-- Altera o delimitador para evitar conflitos com o ponto e vírgula dentro da trigger
DELIMITER $$
-- Exclui a trigger `before_insert_aluno` se ela já existir
DROP TRIGGER IF EXISTS before_insert_aluno$$
-- Retorna o delimitador ao padrão ;
DELIMITER ;



-- Criando estrutura de dados inicial
INSERT INTO aluno (matricula, nome, data_ingresso, data_nascimento, email, telefone) VALUES
(1661990400, 'John Smith', '2022-09-01', '2002-05-14', 'john.smith@example.com', '+1-555-234-5678'),
(1673308800, 'Emily Johnson', '2023-01-10', '2003-08-22', 'emily.johnson@example.com', '+1-555-678-1234'),
(1623715200, 'Michael Williams', '2021-06-15', '2001-11-30', 'michael.williams@example.com', '+1-555-789-4567'),
(1647043200, 'Jessica Brown', '2022-03-12', '2002-04-18', 'jessica.brown@example.com', '+1-555-321-6547'),
(1604534400, 'Matthew Davis', '2020-11-05', '2000-07-09', 'matthew.davis@example.com', '+1-555-456-7890'),
(1689811200, 'Sophia Miller', '2023-07-20', '2004-03-25', 'sophia.miller@example.com', '+1-555-987-1234'),
(1632960000, 'Daniel Wilson', '2021-09-30', '2001-09-12', 'daniel.wilson@example.com', '+1-555-654-3210'),
(1652486400, 'Olivia Moore', '2022-05-14', '2002-02-08', 'olivia.moore@example.com', '+1-555-741-8529'),
(1581984000, 'Christopher Taylor', '2020-02-18', '1999-06-21', 'chris.taylor@example.com', '+1-555-963-2587'),
(1638662400, 'Madison Anderson', '2021-12-05', '2001-12-15', 'madison.anderson@example.com', '+1-555-147-3698'),
(1566691200, 'Ethan Thomas', '2019-08-25', '1998-10-05', 'ethan.thomas@example.com', '+1-555-753-9514'),
(1680825600, 'Isabella Martinez', '2023-04-07', '2004-05-17', 'isabella.martinez@example.com', '+1-555-258-3691'),
(1666137600, 'Alexander White', '2022-10-19', '2003-07-30', 'alex.white@example.com', '+1-555-321-9876'),
(1625961600, 'Charlotte Harris', '2021-07-11', '2000-12-25', 'charlotte.harris@example.com', '+1-555-159-7534'),
(1687910400, 'William Clark', '2023-06-28', '2003-01-11', 'william.clark@example.com', '+1-555-789-8521'),
(1600041600, 'Ava Lewis', '2020-09-14', '1999-09-04', 'ava.lewis@example.com', '+1-555-456-1478'),
(1616371200, 'James Hall', '2021-03-22', '2001-03-14', 'james.hall@example.com', '+1-555-963-7415'),
(1670544000, 'Mia Young', '2022-12-09', '2002-08-29', 'mia.young@example.com', '+1-555-357-4682'),
(1575072000, 'Benjamin King', '2019-11-30', '1998-06-20', 'benjamin.king@example.com', '+1-555-258-1479'),
(1676678400, 'Abigail Wright', '2023-02-18', '2004-11-10', 'abigail.wright@example.com', '+1-555-852-3574'),
(1591488000, 'Henry Scott', '2020-06-07', '1999-04-22', 'henry.scott@example.com', '+1-555-147-2589'),
(1629331200, 'Elizabeth Green', '2021-08-19', '2001-09-05', 'elizabeth.green@example.com', '+1-555-369-7412'),
(1656806400, 'Daniel Baker', '2022-07-03', '2003-06-18', 'daniel.baker@example.com', '+1-555-987-6543'),
(1576368000, 'Grace Adams', '2019-12-15', '1998-10-31', 'grace.adams@example.com', '+1-555-753-1597'),
(1694131200, 'Logan Nelson', '2023-09-08', '2004-01-26', 'logan.nelson@example.com', '+1-555-963-7532'),
(1619136000, 'Natalie Carter', '2021-04-23', '2000-12-07', 'natalie.carter@example.com', '+1-555-147-8529'),
(1580256000, 'David Mitchell', '2020-01-29', '1999-05-14', 'david.mitchell@example.com', '+1-555-654-7891'),
(1660694400, 'Hannah Perez', '2022-08-17', '2002-09-30', 'hannah.perez@example.com', '+1-555-357-9516'),
(1564012800, 'Samuel Roberts', '2019-07-25', '1998-12-12', 'samuel.roberts@example.com', '+1-555-852-1473'),
(1684022400, 'Victoria Turner', '2023-05-14', '2004-06-15', 'victoria.turner@example.com', '+1-555-159-3578');
