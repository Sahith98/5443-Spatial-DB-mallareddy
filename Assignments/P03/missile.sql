
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


CREATE TABLE public.missile (
    id numeric NOT NULL,
    name text,
    "speedCat" numeric,
    "blastCat" numeric
);


ALTER TABLE public.missile OWNER TO postgres;


INSERT INTO public.missile (id, name, "speed", "blast") VALUES (1, 'Atlas', 1, 7);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (2, 'Harpoon', 2, 8);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (3, 'Hellfire', 3, 7);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (4, 'Javelin', 4, 7);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (5, 'Minuteman', 5, 9);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (6, 'Patriot', 6, 6);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (7, 'Peacekeeper', 7, 6);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (8, 'SeaSparrow', 8, 5);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (9, 'Titan', 8, 5);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (10, 'Tomahawk', 9, 6);
INSERT INTO public.missile (id, name, "speed", "blast") VALUES (11, 'Trident', 9, 9);



ALTER TABLE ONLY public.missile
    ADD CONSTRAINT missiles_pkey PRIMARY KEY (id);
