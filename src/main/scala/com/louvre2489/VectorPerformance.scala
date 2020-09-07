package com.louvre2489

import org.openjdk.jmh.annotations.Benchmark

import scala.annotation.tailrec
import scala.collection.immutable.List

class VectorPerformance {

  import VectorPerformance._

  @Benchmark
  def linearAccess_1000(): Unit = {
    linearAccess(list_1000)
  }

  @Benchmark
  def linearAccess_10000(): Unit = {
    linearAccess(list_10000)
  }

  @Benchmark
  def linearAccess_100000(): Unit = {
    linearAccess(list_100000)
  }

  @Benchmark
  def linearAccess_1000000(): Unit = {
    linearAccess(list_1000000)
  }

  @Benchmark
  def linearAccess_10000000(): Unit = {
    linearAccess(list_10000000)
  }

  def linearAccess(target: List[Int]): Long = {
    @tailrec
    def go(s: Long, l: List[Int]): Long = {
      l match {
        case Nil => s
        case head :: tail => go(head + s, tail)
      }
    }
    go(0L, target)
  }
}

object VectorPerformance {

  private val list_1000: List[Int] = (1 until 1000).toList
  private val list_10000: List[Int] = (1 until 10000).toList
  private val list_100000: List[Int] = (1 until 100000).toList
  private val list_1000000: List[Int] = (1 until 1000000).toList
  private val list_10000000: List[Int] = (1 until 10000000).toList

}