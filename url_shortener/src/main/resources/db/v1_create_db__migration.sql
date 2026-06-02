CREATE DATABASE shortner_db;

\connect shortner_db;

CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE users(
	id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
	name VARCHAR(60) NOT NULL,
	email VARCHAR(60) NOT NULL,
	creation_date TIMESTAMP DEFAULT NOW(),
	last_login TIMESTAMP DEFAULT NOW()
);

CREATE TABLE shortners(
	id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
	original_url VARCHAR(60) NOT NULL,
	custom_alias VARCHAR(60),
	hash CHAR(8),
	creation_date TIMESTAMP DEFAULT NOW(),
	expiration_date TIMESTAMP,
	user_id UUID NOT NULL,
	CONSTRAINT fk_shortner_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);
