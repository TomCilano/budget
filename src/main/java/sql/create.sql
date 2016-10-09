CREATE SCHEMA budget

CREATE TABLE lineitem
(
    lin_description VARCHAR(155),
    lin_category VARCHAR(155),
    lin_budgetedamount NUMERIC,
    lin_actualamount NUMERIC,
    lin_id INTEGER PRIMARY KEY NOT NULL
);

