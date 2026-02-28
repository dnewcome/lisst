(require '[clojure.test :as t])

(t/is (true? true) "true is true")
;; => true

(t/is (= false false) "true equals false")
;; => false

;; REPL output
;;
;; FAIL in () (NO_SOURCE_FILE:4)
;; true equals false
;; expected: (= true false)
;;  actual: (not (= true false))

