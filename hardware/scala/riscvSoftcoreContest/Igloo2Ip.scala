package riscvSoftcoreContest

import spinal.core._
import spinal.lib._
import vexriscv.demo.{SimpleBus, SimpleBusCmd, SimpleBusConfig}




case class osc1() extends BlackBox{
  val RCOSC_25_50MHZ_CCC = out Bool()
}


case class ccc1() extends BlackBox{
  val RCOSC_25_50MHZ = in Bool()
  val GL0 = out Bool()
  val LOCK = out Bool()
}

case class SYSRESET() extends BlackBox{
  val DEVRST_N = in Bool()
  val POWER_ON_RESET_N = out Bool()
}

case class SYSCTRL_RESET_STATUS() extends BlackBox{
  val RESET_STATUS = out Bool()
}


