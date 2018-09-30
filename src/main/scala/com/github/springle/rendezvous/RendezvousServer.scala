package com.github.springle.rendezvous

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.google.common.util.concurrent.AbstractService

class RendezvousServer(port: Int, contentRoot: String)(implicit val system: ActorSystem, m: ActorMaterializer) extends AbstractService {
  override def doStart(): Unit = ???
  override def doStop(): Unit = ???
}
