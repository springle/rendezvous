package com.github.springle.rendezvous

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory

object ServerMain extends App {
  implicit val system: ActorSystem = ActorSystem("rendezvous")
  implicit val materializer: ActorMaterializer = ActorMaterializer()
  val conf = ConfigFactory.load()
  val port = conf.getInt("rendezvous.server.port")
  val contentRoot = conf.getString("rendezvous.server.content-root")
  val server = new RendezvousServer(port, contentRoot)
  server.startAsync().awaitRunning()
}
