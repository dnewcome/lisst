createdb:
	psql -a -f create.sql

dropdb:
	psql -c 'drop database lisst'

recreate: dropdb createdb

# run:
# 	clj \
# 		-Sdeps "{:deps {com.github.igrishaev/pg2-core {:mvn/version \"0.1.21\"}}} \
# 		{:deps {compojure/compojure {:mvn/version \"1.7.1\"}}}" \
# 		-M main.clj

runserver:
	clj -Sdeps "{:deps {compojure/compojure {:mvn/version \"1.7.1\"}}}" \
		-M server.clj

runbasic:
	clj -Sdeps "{:deps {ring/ring-core {:mvn/version \"1.13.0\"}}}" -M basic.clj

test:
	clj -M test.clj
