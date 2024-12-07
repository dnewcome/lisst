createdb:
	psql -a -f create.sql

dropdb:
	psql -c 'drop database lisst'

recreate: dropdb createdb

run:
	clj -Sdeps "{:deps {com.github.igrishaev/pg2-core {:mvn/version \"0.1.21\"}}}" -M main.clj
