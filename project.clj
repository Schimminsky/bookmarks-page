(defproject bookmarks-page "0.1.0-SNAPSHOT"
  :description "Persönliche Website für Lesezeichen"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.7"]
                 [ring/ring-jetty-adapter "1.15.6"]]
  :main ^:skip-aot bookmarks-page.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
