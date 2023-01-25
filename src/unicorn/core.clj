(ns unicorn.core
  (:gen-class)
    (:require [ring.adapter.jetty :as jetty]
            [clojure.pprint]))

(defn handler [request]
  (clojure.pprint/pprint request)
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn start []
  (ring-jetty/run-jetty app {:port  3000
                             :join? false}))

(defn -main
  [& args]
  (start)
  )
