CREATE TABLE history_transaction(
    id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255) NOT NULL,
    accounts VARCHAR(20) NOT NULL,
    date_transaction DATE,
    amount INT NOT NULL,
    balance_history INT NOT NULL
);

CREATE SEQUENCE history_transaction_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER SEQUENCE history_transaction_id_seq OWNED BY history_transaction.id;

ALTER TABLE ONLY history_transaction ALTER COLUMN id SET DEFAULT nextval('history_transaction_id_seq'::regclass);

ALTER TABLE ONLY history_transaction
    ADD CONSTRAINT history_transaction_pkey PRIMARY KEY (id);