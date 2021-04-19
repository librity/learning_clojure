;; define a var
(def a 42)
;; => #'user/a

;; call a function named `+`
(+ a 8)
;; => 50

;; call a function named `even?`
(even? a)
;; => true

;; define a function that returns the remainder of `n` when divided by 10
(defn foo [n]
  (rem n 10))
;; => #'user/foo

;; call the function
(foo a)
;; => 2
