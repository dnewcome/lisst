;; read some strings

;; note that there are symbols and keywords ... symbol is any atom, keyword is a :atom
;; prefixed with colon. 


(def list-record1 '(
	{:name "item1"}
	{:name "item2"}
	{:name "item3"}
))

(def list-record2 '(
	{:name "item4" :checked true}
	{:name "item5" :checked false}
))

(println list-record1)
(println list-record2)
(println (type (get (first list-record2) :checked)))

(def struc
	(clojure.edn/read-string "{:eggs 2 :butter 1 :flour 5}")
)

(def struc2
	(clojure.edn/read-string "(eggs 2 butter 1 flour 5)")
)

(def struc3 (cons 1 '(3)))

(def struc4 (conj [2 3] 4))

(def struc5 (conj '(3) 3))

(def struc6 (concat '(3 4) '(5 6)))

(println struc)
(println (type struc))
(println (type struc2))
(println (type struc3))
(println (type struc4))
(println (type struc5))
(println (type struc6))

