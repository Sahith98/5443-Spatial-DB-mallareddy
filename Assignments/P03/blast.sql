SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

CREATE TABLE public.missile_blast (
    cat numeric NOT NULL,
    blast_rad numeric
);


ALTER TABLE public.missile_blast OWNER TO postgres;


INSERT INTO public.missile_blast (cat, blast_rad) VALUES (1, 100.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (2, 120.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (3, 140.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (4, 160.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (5, 180.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (6, 200.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (7, 220.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (8, 240.0000000000000000);
INSERT INTO public.missile_blast (cat, blast_rad) VALUES (9, 260.0000000000000000);



ALTER TABLE ONLY public.missile_blast
    ADD CONSTRAINT missile_blast_pkey PRIMARY KEY (cat);
