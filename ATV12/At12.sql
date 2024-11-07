DROP DATABASE IF EXISTS db_loja;

CREATE DATABASE IF NOT EXISTS db_loja;

USE db_loja;

    CREATE TABLE IF NOT EXISTS tb_vendas (
    id_nf INT,
    id_item INT,
    cod_prod INT,
    valor_unit decimal(2,2),
    quantidade INT,
    desconto INT
    );
    
    INSERT INTO tb_vendas ( id_nf, id_item, cod_prod, valor_unit, qunatidade, desconto) VALUES
    (1,1,1,25.00,10,5),
    (1, 2, 2, 13.50, 3, NULL),
    (1, 3, 3, 15.00, 2, NULL),
    (1, 4,4,10.00,1,NULL),
    (1,5,5,30.00,1,NULL),
    (2,1,3,15.00,4,NULL),
    (2,2,4,10.00,5,NULL),
    (2,3,5,30.00,7,NULL),
    (3,1,1,25.00,5,NULL),
    (3,2,4,10.00,4,NULL),
    (3,3,5,30.00,5,NULL),
    (3,4,2,13.50,7,NULL),
    (4,1,5,30.00,10,15),
    (4,2,4,10.00,12,5),
    (4,3,1,25.00,13,5),
    (5,1,3,15.00,3,NULL),
    (5,2,5,30.00,6),
    (6,1,1,25.00,22,15),
    (6,2,3,15.00,25,20),
    (7,1,1,25.00,10,3),
    (7,3,3,15.00,10,4),
    (7,4,5,30.0,10,1)
    
    
    
    
    