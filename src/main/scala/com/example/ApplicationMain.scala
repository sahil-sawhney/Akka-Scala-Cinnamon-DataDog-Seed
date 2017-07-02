package com.example

import akka.actor.ActorSystem

import scala.concurrent.Await
import scala.concurrent.duration._

object ApplicationMain extends App {
  val system = ActorSystem("MyActorSystem")
  val pingActor = system.actorOf(PingActor.props, "pingActor")
  pingActor ! PingActor.Initialize

  Await.ready(system.whenTerminated, 1.seconds)
}