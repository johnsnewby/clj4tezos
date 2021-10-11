(defproject clj4tezos "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
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
                 [tezos/java-se.proxy "0.8.3"] ]

  :main ^:skip-aot clj4tezos.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories {"local" ~(str (.toURI (java.io.File. "maven_repo"))) }

  )
