package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
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
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id());
  }

  public InvalidPerformanceMonitoringTypeException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException {");
    _ret.append("}");
    return _ret.toString();
  }

}
