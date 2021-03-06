package com.example

import akka.actor.{Actor, ActorLogging, Props}

class PingActor extends Actor with ActorLogging {
  import PingActor._
  
  var counter = 0
  val pongActor = context.actorOf(PongActor.props, "pongActor")
  val counterIteration = 1000000000  //Increase or decrease its value to adjust load on the actors.

  def receive = {
  	case Initialize => 
	    log.info("In PingActor - starting ping-pong")
  	  pongActor ! PingMessage("ping")	
  	case PongActor.PongMessage(text) =>
  	  log.info("In PingActor - received message: {}", text)
  	  counter += 1
  	  if (counter == counterIteration) context.system.terminate()
  	  else sender() ! PingMessage("ping")
  }	
}

object PingActor {
  val props = Props[PingActor]
  case object Initialize
  case class PingMessage(text: String)
}