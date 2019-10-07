package com.jimmy.learning

import cats.effect.{Blocker, ExitCode, IO, IOApp, Resource}
import cats.implicits._
import fs2.{io, text, Stream}
import java.nio.file.Paths

object App {

  case class Popularity(repo: String, stars: Int)



  def main(args: Array[String]): Unit = {

      io.circe.

    val stringStream: Stream[Task, String] =
      io.file.readAll[Task](Paths.get("popularity.json"), 4096)
        .through(text.utf8Decode)

    val parsedStream: Stream[Task, Json] =
      stringStream.through(stringParser)


  }
}
