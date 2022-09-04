(defproject clj_cassa_thrift_to_cql "0.1.0-SNAPSHOT"
  :description "Sample clojure project using cassandra for persistence & cassaforte client for DB access" 
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clojurewerkz/cassaforte "1.3.0"]
                 ]
  :java-source-paths ["src/main/java"]
  :main ^:skip-aot clj-cassa-thrift-to-cql.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
