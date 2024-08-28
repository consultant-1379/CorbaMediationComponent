package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::NumberOfCountersExceededException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/NumberOfCountersExceededException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception NumberOfCountersExceededException {
  ...
};
 * </pre>
 */
public final class NumberOfCountersExceededException extends org.omg.CORBA.UserException {

  public NumberOfCountersExceededException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.id());
  }

  public NumberOfCountersExceededException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededException {");
    _ret.append("}");
    return _ret.toString();
  }

}
