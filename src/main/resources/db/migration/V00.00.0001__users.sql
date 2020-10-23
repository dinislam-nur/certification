
CREATE TABLE users
(
    user_id BIGSERIAL,
    login TEXT NOT NULL,
    password TEXT NOT NULL,
    CONSTRAINT pk_users_user_id PRIMARY KEY (user_id),
    CONSTRAINT uq_users_login UNIQUE (login)
);