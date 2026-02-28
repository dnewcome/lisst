(ns basic
  (:require ring.adapter.jetty)
  (:import run-jetty))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(run-jetty handler {:port 8080})