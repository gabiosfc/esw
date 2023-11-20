CREATE DATABASE sistema_pedidos;
USE sistema_pedidos;

CREATE TABLE cardapio (
	id_produto INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nome VARCHAR(255) NOT NULL,
	valor DOUBLE NOT NULL,
    disponibilidade BOOL,
    INDEX(nome),
    INDEX(valor)
);

INSERT INTO cardapio (nome, valor, disponibilidade)
VALUES ("Pão de queijo", 4.90, true),
		("Café coado", 3.00, true ),
        ("Capuccino", 11.90, true),
        ("Pão na chapa", 6.90, true),
        ("Chai", 10.90, false);


CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mesa VARCHAR(255) NOT NULL,
    valor_total DOUBLE NOT NULL,
    status_pedido VARCHAR(255) NOT NULL
);

CREATE TABLE pedido_produtos (
    id_pedido INT NOT NULL,
    id_produto INT NOT NULL, 
    quantidade INT NOT NULL,
    FOREIGN KEY fk_id_pedido(id_pedido) REFERENCES pedidos (id),
    FOREIGN KEY fk_id_produto(id_produto) REFERENCES cardapio (id_produto)
);

select * from pedido_produtos;

select * from pedidos;


SELECT
    p.id AS id_pedido,
    p.mesa,
    p.valor_total,
    GROUP_CONCAT(c.nome ORDER BY pp.id_produto SEPARATOR ', ') AS produtos,
    p.status_pedido
FROM
    pedidos p
JOIN
    pedido_produtos pp ON p.id = pp.id_pedido
JOIN
    cardapio c ON pp.id_produto = c.id_produto
GROUP BY
    p.id;

