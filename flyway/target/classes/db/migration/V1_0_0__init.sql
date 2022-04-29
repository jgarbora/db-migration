CREATE SCHEMA IF NOT EXISTS public;

CREATE TABLE public.transaction (
                                         transaction_id uuid NOT NULL,
                                         correlation_id VARCHAR(255),
                                         created_at_utc TIMESTAMP NOT NULL,
                                         exception text,
                                         PRIMARY key (transaction_id)
                                );