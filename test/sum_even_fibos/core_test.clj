(ns sum-even-fibos.core-test
  (:require [clojure.test :refer :all]
            [sum-even-fibos.core :refer :all]))

(deftest check-fibo-seq
  (testing "Fibonacci sequence"
       (is (= (fibo 20) (list 1 2 3 5 8 13)))))

(deftest check-sum-even-fibo-under-20
  (testing "Fibonacci even number sum"
       (is (= (sum-even-fibo (fibo 20)) 10))))
