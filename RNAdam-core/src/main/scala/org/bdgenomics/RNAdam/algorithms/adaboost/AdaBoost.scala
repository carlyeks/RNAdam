package org.bdgenomics.RNAdam.algorithms.adaboost

import org.apache.spark.mllib.classification.ClassificationModel
import org.apache.spark.mllib.tree.model.DecisionTreeModel
import org.apache.spark.rdd.RDD
import org.apache.spark.mllib.linalg.{Vector => MLVector}

class AdaBoost {

}

object AdaBoost {
  def train(a: RDD[MLVector], b: Seq[DecisionTreeModel]): AdaBoost = {
    
  }
}