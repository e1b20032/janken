CREATE TABLE users (
    id IDENTITY,
    userName VARCHAR NOT NULL,
);

CREATE TABLE matches(
  id IDENTITY,
  user1 INTEGER,
  user2 INTEGER,
  user1hand VARCHAR NOT NULL,
  user2hand VARCHAR NOT NULL
);
