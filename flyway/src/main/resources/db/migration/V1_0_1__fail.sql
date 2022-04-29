CREATE TABLE public.i_dont_want_you_table (
 id uuid NOT NULL,
 PRIMARY key (id)
);

insert into public.i_dont_want_you_table (id) values (1); -- this will fail because of the typo