(ns clj-cassa-thrift-to-cql.core
  (:require [clojurewerkz.cassaforte.client :as cc])
  (:import (cathy App))
  (:gen-class))

(defn -main [& args]
  (println "Hello, from the outside World of Clojure!")

  (def cluster (cc/build-cluster {:contact-points ["localhost"] :port 9042}) )
	(def session (cc/connect cluster "cathy_client_credentials"))

  (let [app (new App session)]
    (.hello app))
  
  (.shutdown cluster)
  
)
