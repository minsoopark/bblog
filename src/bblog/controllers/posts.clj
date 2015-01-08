(ns bblog.controllers.posts
  (:require
    [bblog.controllers.base :as base]))

(def model-name
  (str "posts"))

(defn index []
  (base/render-template model-name "index" {:name "BBarm"}))

(defn show [id]
  (base/render-template model-name "post" {:id id}))