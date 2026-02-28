(load-file "./data.clj")

(println "********")

;; imported from data.clj
(println 
	(map 
		(fn [x] (get x :name)) 
		list-record2
))

(defn getx [x] (get x :name)) 

(println 
	(map
		getx
		list-record1
))

;; immediate function execution
((fn [m] (println m)) "foo")

(println ((fn [pix] (get pix :x)) {:x 2 :y 3}))

(println
	(map 
		(fn [i] i)
		(map 
			(fn [k] k)
			'(1 2 3 4))))
