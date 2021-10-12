(defproject clj4tezos "0.0.0"
  :description "Demo project to show use of ej4tezos with Clojure"
  :license {:name "MIT"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [org.clojure/clojure "1.10.1"]
                 [tezos/java-se.utils.assert "0.8.3"]
                 [tezos/java-se.utils.string "0.8.3"]
                 [tezos/java-se.utils.osgi "0.8.3"]
                 [tezos/camel.sample.twitter "0.8.3"]
                 [tezos/java-se.utils.io "0.8.3"]
                 [tezos/java-se.papi "0.8.3"]
                 [tezos/cgp.sample "0.8.3"]
                 [tezos/java-se.default-impl "0.8.3"]
                 [tezos/java-se.utils.bytes "0.8.3"]
                 [tezos/cgp.tdc.generator.micheline "0.8.3"]
                 [tezos/cgp-maven-plugin "0.8.3"]
                 [tezos/cgp.java.generator.velocity "0.8.3"]
                 [tezos/camel.sample.indexer "0.8.3"]
                 [tezos/camel.sample "0.8.3"]
                 [tezos/java-se.sample.fa12 "0.8.3"]
                 [tezos/java-se.api "0.8.3"]
                 [tezos/java-se.utils.micheline "0.8.3"]
                 [tezos/camel.component "0.8.3"]
                 [tezos/cgp.api "0.8.3"]
                 [tezos/java-se.crypto-default-impl "0.8.3"]
                 [tezos/java-se.model "0.8.3"]
                 [tezos/java-se.proxy "0.8.3"]
                 ;; Extra libs needed by above.
                 [org.apache.httpcomponents.core5/httpcore5 "5.1.2"]
                 [org.apache.httpcomponents.client5/httpclient5 "5.0.1"]
                 [org.bouncycastle/bcprov-jdk15on "1.69"]
                 [org.json/json "20210307"]
                 [org.slf4j/slf4j-api "1.7.32"] ]

  :main ^:skip-aot clj4tezos.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories {"local_repo" ~(str (.toURI (java.io.File. "maven_repo"))) }

  )
