-- USERS
INSERT INTO tb_user (name) VALUES ('Tony Stark');
INSERT INTO tb_user (name) VALUES ('Bruce Wayne');
INSERT INTO tb_user (name) VALUES ('Diana Prince');
INSERT INTO tb_user (name) VALUES ('Clark Kent');
INSERT INTO tb_user (name) VALUES ('Sherlock Holmes');
INSERT INTO tb_user (name) VALUES ('Walter White');
INSERT INTO tb_user (name) VALUES ('Arya Stark');
INSERT INTO tb_user (name) VALUES ('Frodo Baggins');
INSERT INTO tb_user (name) VALUES ('Katniss Everdeen');
INSERT INTO tb_user (name) VALUES ('Rick Grimes');

-- ACCOUNTS
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('12345678', '0001', 15000.00, 5000.00, 1);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('23456789', '0001', 20000.00, 6000.00, 2);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('34567890', '0002', 12000.00, 3000.00, 3);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('45678901', '0002', 8000.00, 2000.00, 4);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('56789012', '0003', 7000.00, 1500.00, 5);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('67890123', '0003', 9500.00, 2500.00, 6);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('78901234', '0004', 11000.00, 4000.00, 7);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('89012345', '0004', 13400.00, 4500.00, 8);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('90123456', '0005', 14500.00, 3500.00, 9);
INSERT INTO tb_account (number, agency, balance, acc_limit, user_id) VALUES ('01234567', '0005', 16000.00, 5000.00, 10);

-- CARDS
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('1111222233334444', 5000.00, 1);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('2222333344445555', 6000.00, 2);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('3333444455556666', 3000.00, 3);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('4444555566667777', 2000.00, 4);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('5555666677778888', 1500.00, 5);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('6666777788889999', 2500.00, 6);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('7777888899990000', 4000.00, 7);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('8888999900001111', 4500.00, 8);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('9999000011112222', 3500.00, 9);
INSERT INTO tb_card (number, card_limit, card_id) VALUES ('0000111122223333', 5000.00, 10);

-- FEATURES (ícones simulados como links)
INSERT INTO tb_feature (icon, description, user_id) VALUES ('/icons/pix.png', 'Transferência via Pix', 1);
INSERT INTO tb_feature (icon, description, user_id) VALUES ('/icons/investments.png', 'Área de Investimentos', 1);
INSERT INTO tb_feature (icon, description, user_id) VALUES ('/icons/credit-card.png', 'Cartão Virtual', 2);
INSERT INTO tb_feature (icon, description, user_id) VALUES ('/icons/bill.png', 'Pagamento de boletos', 3);
INSERT INTO tb_feature (icon, description, user_id) VALUES ('/icons/loan.png', 'Empréstimos pessoais', 4);

-- NEWS (ícones simulados como links)
INSERT INTO tb_news (icon, description, user_id) VALUES ('/icons/news1.png', 'Nova funcionalidade: cartão virtual ativado', 1);
INSERT INTO tb_news (icon, description, user_id) VALUES ('/icons/news2.png', 'Investimentos com rendimento maior que 100% CDI!', 1);
INSERT INTO tb_news (icon, description, user_id) VALUES ('/icons/news3.png', 'Atenção para o vencimento da fatura', 2);
INSERT INTO tb_news (icon, description, user_id) VALUES ('/icons/news4.png', 'Oferta especial de empréstimo até 20k', 4);
INSERT INTO tb_news (icon, description, user_id) VALUES ('/icons/news5.png', 'Seu score aumentou: conheça as vantagens', 5);
