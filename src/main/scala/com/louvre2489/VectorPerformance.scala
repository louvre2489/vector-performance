package com.louvre2489

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

import scala.collection.immutable.List

@BenchmarkMode(Array(Mode.SingleShotTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
class VectorPerformance {

  import VectorPerformance._

  /**
   * 線形アクセス
   */

  @Benchmark
  def listLinearAccess_100(): Unit = {
    linearAccess(list_100)
  }

  @Benchmark
  def listLinearAccess_1000(): Unit = {
    linearAccess(list_1000)
  }

  @Benchmark
  def listLinearAccess_10000(): Unit = {
    linearAccess(list_10000)
  }

  @Benchmark
  def listLinearAccess_100000(): Unit = {
    linearAccess(list_100000)
  }

  @Benchmark
  def listLinearAccess_1000000(): Unit = {
    linearAccess(list_1000000)
  }

  def linearAccess(target: List[Int]): Unit = {
    var sum = 0L
    target.foreach(elm => sum = sum + elm)
  }

  @Benchmark
  def vectorLinearAccess_100(): Unit = {
    vectorLinearAccess(vector_100)
  }

  @Benchmark
  def vectorLinearAccess_1000(): Unit = {
    vectorLinearAccess(vector_1000)
  }

  @Benchmark
  def vectorLinearAccess_10000(): Unit = {
    vectorLinearAccess(vector_10000)
  }

  @Benchmark
  def vectorLinearAccess_100000(): Unit = {
    vectorLinearAccess(vector_1000000)
  }

  @Benchmark
  def vectorLinearAccess_1000000(): Unit = {
    vectorLinearAccess(vector_1000000)
  }

  def vectorLinearAccess(target: Vector[Int]): Unit = {
    var sum = 0L
    target.foreach(elm => sum = sum + elm)
  }

  @Benchmark
  def arrayLinearAccess_100(): Unit = {
    arrayLinearAccess(array_100)
  }

  @Benchmark
  def arrayLinearAccess_1000(): Unit = {
    arrayLinearAccess(array_1000)
  }

  @Benchmark
  def arrayLinearAccess_10000(): Unit = {
    arrayLinearAccess(array_10000)
  }

  @Benchmark
  def arrayLinearAccess_100000(): Unit = {
    arrayLinearAccess(array_100000)
  }

  @Benchmark
  def arrayLinearAccess_1000000(): Unit = {
    arrayLinearAccess(array_1000000)
  }

  def arrayLinearAccess(target: Array[Int]): Unit = {
    var sum = 0L
    target.foreach(elm => sum = sum + elm)
  }

  /**
   * ランダムアクセス
   */

  @Benchmark
  def listRandomAccess_100(): Long = {
    randomAccess(list_1000)
  }

  @Benchmark
  def listRandomAccess_1000(): Long = {
    randomAccess(list_1000)
  }

  @Benchmark
  def listRandomAccess_10000(): Long = {
    randomAccess(list_10000)
  }

  @Benchmark
  def listRandomAccess_100000(): Long = {
    randomAccess(list_100000)
  }

//  too slow
//  @Benchmark
//  def listRandomAccess_1000000(): Long = {
//    randomAccess(list_1000000, indexes_1000000)
//  }

  @Benchmark
  def vectorRandomAccess_100(): Long = {
    randomAccess(vector_100)
  }

  @Benchmark
  def vectorRandomAccess_1000(): Long = {
    randomAccess(vector_1000)
  }

  @Benchmark
  def vectorRandomAccess_10000(): Long = {
    randomAccess(vector_100000)
  }

  @Benchmark
  def vectorRandomAccess_100000(): Long = {
    randomAccess(vector_1000000)
  }

  @Benchmark
  def vectorRandomAccess_1000000(): Long = {
    randomAccess(vector_1000000)
  }

  def randomAccess(target: Seq[Int]): Long = {
    var sum = 0L
    target.foreach { i =>
      // インデックス用のArrayには1〜Nが格納されているので、インデックスようにマイナス１する
      sum += target(i - 1)
    }
    sum
  }

 @Benchmark
  def arrayRandomAccess_100(): Long = {
    arrayRandomAccess(array_100)
  }

  @Benchmark
  def arrayRandomAccess_1000(): Long = {
    arrayRandomAccess(array_1000)
  }

  @Benchmark
  def arrayRandomAccess_10000(): Long = {
    arrayRandomAccess(array_10000)
  }

  @Benchmark
  def arrayRandomAccess_100000(): Long = {
    arrayRandomAccess(array_100000)
  }

  @Benchmark
  def arrayRandomAccess_1000000(): Long = {
    arrayRandomAccess(array_1000000)
  }

  def arrayRandomAccess(target: Array[Int]): Long = {
    var sum = 0L
    target.foreach { i =>
      // インデックス用のArrayには1〜Nが格納されているので、インデックス用にマイナス１する
      sum += target(i - 1)
    }
    sum
  }

  /**
   * 先頭要素追加
   */

  @Benchmark
  def listPrepend_100(): List[Int] = {
    list_100.prepended(0)
  }

  @Benchmark
  def listPrepend_1000(): List[Int] = {
    list_1000.prepended(0)
  }

  @Benchmark
  def listPrepend_10000(): List[Int] = {
    list_10000.prepended(0)
  }

  @Benchmark
  def listPrepend_100000(): List[Int] = {
    list_100000.prepended(0)
  }

  @Benchmark
  def listPrepend_1000000(): List[Int] = {
    list_1000000.prepended(0)
  }

  @Benchmark
  def vectorPrepend_100(): Vector[Int] = {
    vector_100.prepended(0)
  }

  @Benchmark
  def vectorPrepend_1000(): Vector[Int] = {
    vector_1000.prepended(0)
  }

  @Benchmark
  def vectorPrepend_10000(): Vector[Int] = {
    vector_10000.prepended(0)
  }

  @Benchmark
  def vectorPrepend_100000(): Vector[Int] = {
    vector_100000.prepended(0)
  }

  @Benchmark
  def vectorPrepend_1000000(): Vector[Int] = {
    vector_1000000.prepended(0)
  }

  @Benchmark
  def arrayPrepend_100(): Array[Int] = {
    array_100.prepended(0)
  }

  @Benchmark
  def arrayPrepend_1000(): Array[Int] = {
    array_1000.prepended(0)
  }

  @Benchmark
  def arrayPrepend_10000(): Array[Int] = {
    array_10000.prepended(0)
  }

  @Benchmark
  def arrayPrepend_100000(): Array[Int] = {
    array_100000.prepended(0)
  }

  @Benchmark
  def arrayPrepend_1000000(): Array[Int] = {
    array_1000000.prepended(0)
  }

  /**
   * 末尾要素追加
   */

  @Benchmark
  def listAppend_100(): List[Int] = {
    list_100.appended(0)
  }

  @Benchmark
  def listAppend_1000(): List[Int] = {
    list_1000.appended(0)
  }

  @Benchmark
  def listAppend_10000(): List[Int] = {
    list_10000.appended(0)
  }

  @Benchmark
  def listAppend_100000(): List[Int] = {
    list_100000.appended(0)
  }

  @Benchmark
  def listAppend_1000000(): List[Int] = {
    list_1000000.appended(0)
  }

  @Benchmark
  def vectorAppend_100(): Vector[Int] = {
    vector_100.appended(0)
  }

  @Benchmark
  def vectorAppend_1000(): Vector[Int] = {
    vector_1000.appended(0)
  }

  @Benchmark
  def vectorAppend_10000(): Vector[Int] = {
    vector_10000.appended(0)
  }

  @Benchmark
  def vectorAppend_100000(): Vector[Int] = {
    vector_100000.appended(0)
  }

  @Benchmark
  def vectorAppend_1000000(): Vector[Int] = {
    vector_1000000.appended(0)
  }

  @Benchmark
  def arrayAppend_100(): Array[Int] = {
    array_100.appended(0)
  }

  @Benchmark
  def arrayAppend_1000(): Array[Int] = {
    array_1000.appended(0)
  }

  @Benchmark
  def arrayAppend_10000(): Array[Int] = {
    array_10000.appended(0)
  }

  @Benchmark
  def arrayAppend_100000(): Array[Int] = {
    array_100000.appended(0)
  }

  @Benchmark
  def arrayAppend_1000000(): Array[Int] = {
    array_1000000.appended(0)
  }

  /**
   * 先頭要素更新
   */

  @Benchmark
  def listInitUpdate_100(): List[Int] = {
    list_100.updated(0,0)
  }

  @Benchmark
  def listInitUpdate_1000(): List[Int] = {
    list_1000.updated(0,0)
  }

  @Benchmark
  def listInitUpdate_10000(): List[Int] = {
    list_10000.updated(0,0)
  }

  @Benchmark
  def listInitUpdate_100000(): List[Int] = {
    list_100000.updated(0,0)
  }

  @Benchmark
  def listInitUpdate_1000000(): List[Int] = {
    list_1000000.updated(0,0)
  }

  @Benchmark
  def vectorInitUpdate_100(): Vector[Int] = {
    vector_100.updated(0,0)
  }

  @Benchmark
  def vectorInitUpdate_1000(): Vector[Int] = {
    vector_1000.updated(0,0)
  }

  @Benchmark
  def vectorInitUpdate_10000(): Vector[Int] = {
    vector_10000.updated(0,0)
  }

  @Benchmark
  def vectorInitUpdate_100000(): Vector[Int] = {
    vector_100000.updated(0,0)
  }

  @Benchmark
  def vectorInitUpdate_1000000(): Vector[Int] = {
    vector_1000000.updated(0,0)
  }

  @Benchmark
  def arrayInitUpdate_100(): Unit = {
    array_100(0) = 0
  }

  @Benchmark
  def arrayInitUpdate_1000(): Unit = {
    array_1000(0) = 0
  }

  @Benchmark
  def arrayInitUpdate_10000(): Unit = {
    array_10000(0) = 0
  }

  @Benchmark
  def arrayInitUpdate_100000(): Unit = {
    array_100000(0) = 0
  }

  @Benchmark
  def arrayInitUpdate_1000000(): Unit = {
    array_1000000(0) = 0
  }

  /**
   * 末尾要素更新
   */

  @Benchmark
  def listLastUpdate_100(): List[Int] = {
    list_100.updated(99,0)
  }

  @Benchmark
  def listLastUpdate_1000(): List[Int] = {
    list_1000.updated(999,0)
  }

  @Benchmark
  def listLastUpdate_10000(): List[Int] = {
    list_10000.updated(9999,0)
  }

  @Benchmark
  def listLastUpdate_100000(): List[Int] = {
    list_100000.updated(99999,0)
  }

  @Benchmark
  def listLastUpdate_1000000(): List[Int] = {
    list_1000000.updated(999999,0)
  }

  @Benchmark
  def vectorLastUpdate_100(): Vector[Int] = {
    vector_100.updated(99,0)
  }

  @Benchmark
  def vectorLastUpdate_1000(): Vector[Int] = {
    vector_1000.updated(999,0)
  }

  @Benchmark
  def vectorLastUpdate_10000(): Vector[Int] = {
    vector_10000.updated(9999,0)
  }

  @Benchmark
  def vectorLastUpdate_100000(): Vector[Int] = {
    vector_100000.updated(99999,0)
  }

  @Benchmark
  def vectorLastUpdate_1000000(): Vector[Int] = {
    vector_1000000.updated(999999,0)
  }

  @Benchmark
  def arrayLastUpdate_100(): Unit = {
    array_100(99) = 0
  }

  @Benchmark
  def arrayLastUpdate_1000(): Unit = {
    array_1000(999) = 0
  }

  @Benchmark
  def arrayLastUpdate_10000(): Unit = {
    array_10000(9999) = 0
  }

  @Benchmark
  def arrayLastUpdate_100000(): Unit = {
    array_100000(99999) = 0
  }

  @Benchmark
  def arrayLastUpdate_1000000(): Unit = {
    array_1000000(999999) = 0
  }

  /**
   * 関数適用
   */

 @Benchmark
  def listMap_100(): List[Int] = {
    list_100.map(_ - 1)
  }

  @Benchmark
  def listMap_1000(): List[Int] = {
    list_1000.map(_ - 1)
  }

  @Benchmark
  def listMap_10000(): List[Int] = {
    list_10000.map(_ - 1)
  }

  @Benchmark
  def listMap_100000(): List[Int] = {
    list_100000.map(_ - 1)
  }

  @Benchmark
  def listMap_1000000(): List[Int] = {
    list_1000000.map(_ - 1)
  }

  @Benchmark
  def vectorMap_100(): Vector[Int] = {
    vector_100.map(_ - 1)
  }

  @Benchmark
  def vectorMap_1000(): Vector[Int] = {
    vector_1000.map(_ - 1)
  }

  @Benchmark
  def vectorMap_10000(): Vector[Int] = {
    vector_10000.map(_ - 1)
  }

  @Benchmark
  def vectorMap_100000(): Vector[Int] = {
    vector_100000.map(_ - 1)
  }

  @Benchmark
  def vectorMap_1000000(): Vector[Int] = {
    vector_1000000.map(_ - 1)
  }

  @Benchmark
  def arrayMap_100(): Array[Int] = {
    array_100.map(_ - 1)
  }

  @Benchmark
  def arrayMap_1000(): Array[Int] = {
    array_1000.map(_ - 1)
  }

  @Benchmark
  def arrayMap_10000(): Array[Int] = {
    array_10000.map(_ - 1)
  }

  @Benchmark
  def arrayMap_100000(): Array[Int] = {
    array_100000.map(_ - 1)
  }

  @Benchmark
  def arrayMap_1000000(): Array[Int] = {
    array_1000000.map(_ - 1)
  }

}

object VectorPerformance {

  final private val range_100 = 1 to 100
  final private val range_1000 = 1 to 1000
  final private val range_10000 = 1 to 10000
  final private val range_100000 = 1 to 100000
  final private val range_1000000 = 1 to 1000000

  final private val list_100: List[Int] = range_100.toList
  final private val list_1000: List[Int] = range_1000.toList
  final private val list_10000: List[Int] = range_10000.toList
  final private val list_100000: List[Int] = range_100000.toList
  final private val list_1000000: List[Int] = range_1000000.toList

  final private val vector_100: Vector[Int] = range_100.toVector
  final private val vector_1000: Vector[Int] = range_1000.toVector
  final private val vector_10000: Vector[Int] = range_10000.toVector
  final private val vector_100000: Vector[Int] = range_100000.toVector
  final private val vector_1000000: Vector[Int] = range_1000000.toVector

  final private val array_100: Array[Int] = range_100.toArray
  final private val array_1000: Array[Int] = range_1000.toArray
  final private val array_10000: Array[Int] = range_10000.toArray
  final private val array_100000: Array[Int] = range_100000.toArray
  final private val array_1000000: Array[Int] = range_1000000.toArray

}