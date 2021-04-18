(+ 1 2 3)
(- 1 2 3)
(* 1 2 3)
(/ 1 2 3)

(def greetings1
  (fn [name]
    (str "Hello " name)))

(greetings1 "Lior")

(defn greetings2 [name]
  (str "Hello " name))

(greetings2 "Lior")

(filter odd?
        (map inc
             (range 5)))

(->> (range 5)
     (map inc)
     (filter odd?))

(->> (range 5)
     (map inc))

(defn myfactorial [number]
  (->>   (+ number 1)
         (range 1)
         (map inc)
         (reduce *)))

(myfactorial 1)
(myfactorial 2)
(myfactorial 3)
(myfactorial 4)
(myfactorial 5)
(myfactorial 6)
