package com.example.mytasks.http

import cats.effect.Effect
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl

class Routes[F[_]: Effect] extends Http4sDsl[F]{
  val service: HttpService[F] = HttpService[F] {
    //espera una fn parcial
    case GET -> Root => Ok("Hola")
      //TODO Endpoints
  }
}
