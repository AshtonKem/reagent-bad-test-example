(ns bad-tests.prod
  (:require [bad-tests.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
