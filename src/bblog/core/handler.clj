(ns bblog.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [bblog.controllers.posts :as posts-controller]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/posts" [] (posts-controller/index))
  (GET "/posts/:id" [id] (posts-controller/show id))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))