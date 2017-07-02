(ns sum-even-fibos.core
  (:gen-class))

(defn fibo
  [max]
  (loop [prev 1 next 2 list [prev next]]
    (def newNext (+ prev next))
    (if (> newNext max)
         list
         (recur next newNext (conj list newNext)))))

 (defn sum-even-fibo
  [fibo-seq]
  (def even-fibos (filter even? fibo-seq))
  (loop [total 0 index (dec (count even-fibos))]
       (if (< index 0)
          total
           (do
              (def nextnum (nth even-fibos index))
              (recur (+ total nextnum) (dec index))))))

(defn -main
     "4,623,732"
     [& args]
     (println "The answer is" (sum-even-fibo (fibo 4000000))))
