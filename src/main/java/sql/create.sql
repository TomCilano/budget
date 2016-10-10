CREATE SCHEMA budget;

CREATE TABLE lineitem
(
    lin_description VARCHAR(155),
    lin_category VARCHAR(155),
    lin_budgetedamount NUMERIC,
    lin_actualamount NUMERIC,
    lin_id INTEGER PRIMARY KEY NOT NULL
);

CREATE SEQUENCE budget.lineitem_seq
  MINVALUE 1
  MAXVALUE 90000
  START WITH 9
  INCREMENT BY 1
  CACHE 20;
\