(ns lisst
  (:require [pg.core :as pg]))

(def config
  {:host "localhost" :database "lisst" :user "dannewcome"})

(def conn
  (pg/connect config))

(print (pg/query conn "select 1 as one"))

;; (pg/query conn "create table demo (id serial primary key)")

(pg/execute conn
            "insert into category (name) values ('test')")
(pg/execute conn
            "insert into list (name) values ('test')")
(pg/execute conn
            "insert into list (name) values ('test2')")