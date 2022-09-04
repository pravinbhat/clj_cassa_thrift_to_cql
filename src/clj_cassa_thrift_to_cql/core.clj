(ns clj-cassa-thrift-to-cql.core 
  (:import (cathy App))
  (:gen-class))

(defn -main[& args]
  (println "Hello, from the outside World of Clojure!")
  (let [app (new App)]
    (.hello app))
)
