(ns ninja-app.core
	(:use ring.adapter.jetty))

(defn handler [request]
  (Thread/sleep 100)
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello Ninjas"})

(defn run [] (run-jetty handler {:port 8080}))