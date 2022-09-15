-- Gerado por Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   em:        2022-09-06 19:09:59 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY
drop SEQUENCE SQ_PR_RESTAURANTE ;
drop SEQUENCE SQ_PR_ENDERECO;
drop SEQUENCE SQ_PR_CLIENTE;
drop SEQUENCE SQ_PR_TELEFONE;
drop SEQUENCE SQ_PR_ESTADO;
drop SEQUENCE SQ_PR_CIDADE;
drop SEQUENCE SQ_PR_BAIRRO;
drop SEQUENCE SQ_PR_CARDAPIO;
drop SEQUENCE SQ_PR_PEDIDO;
drop SEQUENCE SQ_PR_TIPO_PAGTO;
drop sequence SQ_PR_CARRINHO;
--
DROP TABLE t_pr_bairro CASCADE CONSTRAINTS;

DROP TABLE t_pr_cardapio CASCADE CONSTRAINTS;

DROP TABLE t_pr_carrinho CASCADE CONSTRAINTS;

DROP TABLE t_pr_cidade CASCADE CONSTRAINTS;

DROP TABLE t_pr_cliente CASCADE CONSTRAINTS;

DROP TABLE t_pr_end_cliente CASCADE CONSTRAINTS;

DROP TABLE t_pr_end_rest CASCADE CONSTRAINTS;

DROP TABLE t_pr_endereco CASCADE CONSTRAINTS;

DROP TABLE t_pr_estado CASCADE CONSTRAINTS;

DROP TABLE t_pr_pedido CASCADE CONSTRAINTS;

DROP TABLE t_pr_pedido_item CASCADE CONSTRAINTS;

DROP TABLE t_pr_restaurante CASCADE CONSTRAINTS;

DROP TABLE t_pr_tel_cliente CASCADE CONSTRAINTS;

DROP TABLE t_pr_tel_rest CASCADE CONSTRAINTS;

DROP TABLE t_pr_telefone CASCADE CONSTRAINTS;

DROP TABLE t_pr_tipo_pagto CASCADE CONSTRAINTS;


-- predefined type, no DDL - XMLTYPE

CREATE TABLE t_pr_bairro (
    id_bairro NUMBER(10) NOT NULL,
    id_cidade NUMBER(10) NOT NULL,
    nm_bairro VARCHAR2(100) NOT NULL
);

ALTER TABLE t_pr_bairro ADD CONSTRAINT pk_bairro PRIMARY KEY ( id_bairro );

CREATE TABLE t_pr_cardapio (
    id_cardapio      NUMBER(10) NOT NULL,
    id_restaurante   NUMBER(10) NOT NULL,
    nm_item_cardapio VARCHAR2(30) NOT NULL,
    vl_item_cardapio NUMBER(20) NOT NULL,
    ds_item_cardapio VARCHAR2(60) NOT NULL,
    ft_foto          BLOB,
    dt_cadastro      DATE
);

ALTER TABLE t_pr_cardapio ADD CONSTRAINT pk_cardapio PRIMARY KEY ( id_cardapio );

CREATE TABLE t_pr_carrinho (
    id_pagamento NUMBER(10) NOT NULL,
    nr_pedido    NUMBER(20) NOT NULL,
    id_cliente   NUMBER(10) NOT NULL,
    id_endereco  NUMBER(10) NOT NULL,
    id_tp_pagto  NUMBER(10) NOT NULL
);

ALTER TABLE t_pr_carrinho ADD CONSTRAINT pk_carrinho PRIMARY KEY ( id_pagamento );

CREATE TABLE t_pr_cidade (
    id_cidade NUMBER(10) NOT NULL,
    id_estado NUMBER(10) NOT NULL,
    nm_cidade VARCHAR2(100) NOT NULL,
    CONSTRAINT uk_cidade_estado UNIQUE (id_estado,nm_cidade)
);

ALTER TABLE t_pr_cidade ADD CONSTRAINT pk_cidade PRIMARY KEY ( id_cidade );

CREATE TABLE t_pr_cliente (
    id_cliente  NUMBER(10) NOT NULL,
    nm_cliente  VARCHAR2(60) NOT NULL,
    nr_cpf      VARCHAR2(14) NOT NULL,
    ds_email    VARCHAR2(100) NOT NULL,
    dt_cadastro DATE,
    CONSTRAINT uk_cpf_cliente UNIQUE (nr_cpf)
);

ALTER TABLE t_pr_cliente ADD CONSTRAINT pk_cliente PRIMARY KEY ( id_cliente );

CREATE TABLE t_pr_end_cliente (
    id_cliente  NUMBER(10) NOT NULL,
    id_endereco NUMBER(10) NOT NULL
);

ALTER TABLE t_pr_end_cliente ADD CONSTRAINT pk_end_cliente PRIMARY KEY ( id_cliente,
                                                                         id_endereco );

CREATE TABLE t_pr_end_rest (
    id_endereco    NUMBER(10) NOT NULL,
    id_restaurante NUMBER(10) NOT NULL
);

ALTER TABLE t_pr_end_rest ADD CONSTRAINT pk_end_rest PRIMARY KEY ( id_endereco,
                                                                   id_restaurante );

CREATE TABLE t_pr_endereco (
    id_endereco   NUMBER(10) NOT NULL,
    id_bairro     NUMBER(10) NOT NULL,
    nr_cep        NUMBER(8) NOT NULL,
    ds_logradouro VARCHAR2(80) NOT NULL
);

ALTER TABLE t_pr_endereco ADD CONSTRAINT pk_end_endereco PRIMARY KEY ( id_endereco );

CREATE TABLE t_pr_estado (
    id_estado NUMBER(10) NOT NULL,
    nm_estado VARCHAR2(100) NOT NULL,
    sg_estado VARCHAR2(2) NOT NULL,
    CONSTRAINT uk_sg_estado UNIQUE (sg_estado)
);

ALTER TABLE t_pr_estado ADD CONSTRAINT pk_estado PRIMARY KEY ( id_estado );

CREATE TABLE t_pr_pedido (
    nr_pedido        NUMBER(20) NOT NULL,
    id_cliente       NUMBER(10) NOT NULL,
    id_endereco      NUMBER(10) NOT NULL,
    dt_pedido        DATE,
    vl_pedido        NUMBER(20) NOT NULL,
    ds_status_pedido VARCHAR2(15) NOT NULL
);

ALTER TABLE t_pr_pedido
    ADD CONSTRAINT pk_pedido PRIMARY KEY ( id_cliente,
                                           id_endereco,
                                           nr_pedido );

CREATE TABLE t_pr_pedido_item (
    id_cardapio NUMBER(10) NOT NULL,
    id_cliente  NUMBER(10) NOT NULL,
    id_endereco NUMBER(10) NOT NULL,
    nr_pedido   NUMBER(20) NOT NULL
);

ALTER TABLE t_pr_pedido_item
    ADD CONSTRAINT pk_pedido_item PRIMARY KEY ( id_cardapio,
                                                id_cliente,
                                                id_endereco,
                                                nr_pedido );

CREATE TABLE t_pr_restaurante (
    id_restaurante NUMBER(10) NOT NULL,
    nm_restaurante VARCHAR2(50) NOT NULL,
    nr_cnpj_rest   VARCHAR2(18) NOT NULL,
    ds_email       VARCHAR2(100) NOT NULL,
    dt_cadastro    DATE,
    CONSTRAINT uk_cnpj_restaurante UNIQUE (nr_cnpj_rest)
);

ALTER TABLE t_pr_restaurante ADD CONSTRAINT pk_restaurante PRIMARY KEY ( id_restaurante );

CREATE TABLE t_pr_tel_cliente (
    id_cliente  NUMBER(10) NOT NULL,
    id_telefone NUMBER(10) NOT NULL
);

ALTER TABLE t_pr_tel_cliente ADD CONSTRAINT pk_tel_cliente PRIMARY KEY ( id_cliente,
                                                                         id_telefone );

CREATE TABLE t_pr_tel_rest (
    id_telefone    NUMBER(10) NOT NULL,
    id_restaurante NUMBER(10) NOT NULL
);

ALTER TABLE t_pr_tel_rest ADD CONSTRAINT pk_tel_rest PRIMARY KEY ( id_telefone,
                                                                   id_restaurante );

CREATE TABLE t_pr_telefone (
    id_telefone NUMBER(10) NOT NULL,
    nr_telefone NUMBER(9) NOT NULL,
    nr_ddd      NUMBER(3) NOT NULL,
    nr_ddi      NUMBER(3),
    ds_telefone VARCHAR2(15) NOT NULL
);

ALTER TABLE t_pr_telefone ADD CONSTRAINT pk_telefone PRIMARY KEY ( id_telefone );

CREATE TABLE t_pr_tipo_pagto (
    id_tp_pagto NUMBER(10) NOT NULL,
    ds_tp_pagto VARCHAR2(30) NOT NULL
);

ALTER TABLE t_pr_tipo_pagto ADD CONSTRAINT pk_tipo_pagto PRIMARY KEY ( id_tp_pagto );

ALTER TABLE t_pr_bairro
    ADD CONSTRAINT fk_bairro_cidade FOREIGN KEY ( id_cidade )
        REFERENCES t_pr_cidade ( id_cidade );

ALTER TABLE t_pr_cardapio
    ADD CONSTRAINT fk_cardapio_restaurante FOREIGN KEY ( id_restaurante )
        REFERENCES t_pr_restaurante ( id_restaurante );

ALTER TABLE t_pr_carrinho
    ADD CONSTRAINT fk_carrinho_pedido FOREIGN KEY ( id_cliente,
                                                    id_endereco,
                                                    nr_pedido )
        REFERENCES t_pr_pedido ( id_cliente,
                                 id_endereco,
                                 nr_pedido );

ALTER TABLE t_pr_carrinho
    ADD CONSTRAINT fk_carrinho_tipo_pagto FOREIGN KEY ( id_tp_pagto )
        REFERENCES t_pr_tipo_pagto ( id_tp_pagto );

ALTER TABLE t_pr_cidade
    ADD CONSTRAINT fk_cidade__estado FOREIGN KEY ( id_estado )
        REFERENCES t_pr_estado ( id_estado );

ALTER TABLE t_pr_end_cliente
    ADD CONSTRAINT fk_end_cliente_cliente FOREIGN KEY ( id_cliente )
        REFERENCES t_pr_cliente ( id_cliente );

ALTER TABLE t_pr_end_cliente
    ADD CONSTRAINT fk_end_cliente_endereco FOREIGN KEY ( id_endereco )
        REFERENCES t_pr_endereco ( id_endereco );

ALTER TABLE t_pr_end_rest
    ADD CONSTRAINT fk_end_rest_endereco FOREIGN KEY ( id_endereco )
        REFERENCES t_pr_endereco ( id_endereco );

ALTER TABLE t_pr_end_rest
    ADD CONSTRAINT fk_end_rest_restaurante FOREIGN KEY ( id_restaurante )
        REFERENCES t_pr_restaurante ( id_restaurante );

ALTER TABLE t_pr_pedido
    ADD CONSTRAINT fk_pedido_end_cliente FOREIGN KEY ( id_cliente,
                                                       id_endereco )
        REFERENCES t_pr_end_cliente ( id_cliente,
                                      id_endereco );

ALTER TABLE t_pr_pedido_item
    ADD CONSTRAINT fk_pedido_item_cardapio FOREIGN KEY ( id_cardapio )
        REFERENCES t_pr_cardapio ( id_cardapio );

ALTER TABLE t_pr_pedido_item
    ADD CONSTRAINT fk_pedido_item_pedido FOREIGN KEY ( id_cliente,
                                                       id_endereco,
                                                       nr_pedido )
        REFERENCES t_pr_pedido ( id_cliente,
                                 id_endereco,
                                 nr_pedido );

ALTER TABLE t_pr_tel_cliente
    ADD CONSTRAINT fk_tel_cliente_cliente FOREIGN KEY ( id_cliente )
        REFERENCES t_pr_cliente ( id_cliente );

ALTER TABLE t_pr_tel_cliente
    ADD CONSTRAINT fk_tel_cliente_telefone FOREIGN KEY ( id_telefone )
        REFERENCES t_pr_telefone ( id_telefone );

ALTER TABLE t_pr_tel_rest
    ADD CONSTRAINT fk_tel_rest_restaurante FOREIGN KEY ( id_restaurante )
        REFERENCES t_pr_restaurante ( id_restaurante );

ALTER TABLE t_pr_tel_rest
    ADD CONSTRAINT fk_tel_rest_telefone FOREIGN KEY ( id_telefone )
        REFERENCES t_pr_telefone ( id_telefone );

ALTER TABLE t_pr_endereco
    ADD CONSTRAINT t_pr_endereco_t_pr_bairro_fk FOREIGN KEY ( id_bairro )
        REFERENCES t_pr_bairro ( id_bairro );

-- create sequences 
CREATE SEQUENCE SQ_PR_RESTAURANTE 
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_CLIENTE 
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_TELEFONE 
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_ESTADO
START WITH 1
INCREMENT BY 1
MAXVALUE 99
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_CIDADE
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_BAIRRO
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_ENDERECO
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_CARDAPIO 
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_PEDIDO
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_TIPO_PAGTO 
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
CREATE SEQUENCE SQ_PR_CARRINHO
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
--
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'ACRE'	              , 'AC');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'ALAGOAS'	          , 'AL');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'AMAPÁ'	              , 'AP');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'AMAZONAS'	          , 'AM');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'BAHIA'	              , 'BA');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'CEARÁ'	              , 'CE');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'DISTRITO FEDERAL'	  , 'DF');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'ESPÍRITO SANTO'	      , 'ES');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'GOIÁS'	              , 'GO');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'MARANHÃO'	          , 'MA');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'MATO GROSSO'	      , 'MT');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'MATO GROSSO DO SUL'	  , 'MS');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'MINAS GERAIS'	      , 'MG');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'PARÁ'	              , 'PA');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'PARAÍBA'	          , 'PB');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'PARANÁ'               , 'PR');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'PERNAMBUCO'	          , 'PE');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'PIAUÍ'	              , 'PI');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'RIO DE JANEIRO'	      , 'RJ');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'RIO GRANDE DO NORTE'  ,'RN');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'RIO GRANDE DO SUL'	  , 'RS');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'RONDÔNIA'	          , 'RO');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'RORAIMA'	          , 'RR');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'SANTA CATARINA'	      , 'SC');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'SÃO PAULO'	          , 'SP');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'SERGIPE'	          , 'SE');
INSERT INTO T_PR_ESTADO (ID_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_PR_ESTADO.NEXTVAL,'TOCANTINS'	          , 'TO');
commit;
--
