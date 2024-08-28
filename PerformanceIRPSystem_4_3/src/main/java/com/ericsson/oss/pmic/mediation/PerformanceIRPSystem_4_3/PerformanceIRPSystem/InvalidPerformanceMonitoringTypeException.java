package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidPerformanceMonitoringTypeException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidPerformanceMonitoringTypeException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidPerformanceMonitoringTypeException {
  ...
};
 * </pre>
 */
public final class InvalidPerformanceMonitoringTypeException extends org.omg.CORBA.UserException {

  public InvalidPerformanceMonitoringTypeException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id());
  }

  public InvalidPerformanceMonitoringTypeException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException {");
    _ret.append("}");
    return _ret.toString();
  }

}
