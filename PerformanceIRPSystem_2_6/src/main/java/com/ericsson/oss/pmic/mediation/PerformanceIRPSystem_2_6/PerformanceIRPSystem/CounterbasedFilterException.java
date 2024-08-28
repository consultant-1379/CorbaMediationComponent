package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::CounterbasedFilterException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/CounterbasedFilterException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception CounterbasedFilterException {
  ...
};
 * </pre>
 */
public final class CounterbasedFilterException extends org.omg.CORBA.UserException {

  public CounterbasedFilterException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.id());
  }

  public CounterbasedFilterException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException {");
    _ret.append("}");
    return _ret.toString();
  }

}
