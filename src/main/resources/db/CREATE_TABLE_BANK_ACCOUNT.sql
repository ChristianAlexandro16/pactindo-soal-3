CREATE TABLE bank_account(
    id INT AUTO_INCREMENT PRIMARY KEY,
    balance INT
);

CREATE SEQUENCE bank_account_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER SEQUENCE bank_account_id_seq OWNED BY bank_account.id;

ALTER TABLE ONLY bank_account ALTER COLUMN id SET DEFAULT nextval('bank_account_id_seq'::regclass);

ALTER TABLE ONLY bank_account
    ADD CONSTRAINT bank_account_pkey PRIMARY KEY (id);