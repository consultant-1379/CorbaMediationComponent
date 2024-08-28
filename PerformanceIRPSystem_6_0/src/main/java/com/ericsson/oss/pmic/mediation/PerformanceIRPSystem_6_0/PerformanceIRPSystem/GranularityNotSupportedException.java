package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::GranularityNotSupportedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/GranularityNotSupportedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception GranularityNotSupportedException {
  ...
};
 * </pre>
 */
public final class GranularityNotSupportedException extends org.omg.CORBA.UserException {

  public GranularityNotSupportedException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.id());
  }

  public GranularityNotSupportedException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException {");
    _ret.append("}");
    return _ret.toString();
  }

}
