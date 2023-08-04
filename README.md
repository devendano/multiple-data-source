# Read me first

Before running the application configure the environment:

### Create Databases

```roomsql
CREATE DATABASE db1 /*!40100 DEFAULT CHARACTER SET utf8 */;
```

```roomsql
CREATE DATABASE db2 /*!40100 DEFAULT CHARACTER SET utf8 */;
```

### Create Tables

In db1
```roomsql
DROP TABLE IF EXISTS public.user1;
CREATE TABLE  public.user1 (
  id SERIAL NOT NULL PRIMARY KEY,
  username VARCHAR(100) NOT NULL DEFAULT '',
  email VARCHAR(100) NOT NULL DEFAULT ''
);
ALTER SEQUENCE public.user1_id_seq
	INCREMENT BY 3;
```

In db2
```roomsql
DROP TABLE IF EXISTS public.user2;
CREATE TABLE  public.user2 (
  id SERIAL NOT NULL PRIMARY KEY,
  username VARCHAR(100) NOT NULL DEFAULT '',
  email VARCHAR(100) NOT NULL DEFAULT ''
);
ALTER SEQUENCE public.user2_id_seq
	INCREMENT BY 6;
```

### Insert Values

In db1
```roomsql
INSERT INTO public.user1 (username, email)
VALUES
('matt', 'matt@yahoo.com'),
('david', 'david@hotmail.com');
```

In db2
```roomsql
INSERT INTO public.user2 (username, email)
VALUES
('John', 'John@gmail.com'),
('Lewis', 'lewis@mail.com');
```