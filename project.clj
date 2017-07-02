(defproject sum-even-fibos "0.1.0-SNAPSHOT"
  :description "Solves the second problem of project euler [https://projecteuler.net/problem=2]"
  :url "http://nowhere.non"
  :license {:name "GNU General Public License v3.0"
            :url "https://choosealicense.com/licenses/gpl-3.0/#"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot sum-even-fibos.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
