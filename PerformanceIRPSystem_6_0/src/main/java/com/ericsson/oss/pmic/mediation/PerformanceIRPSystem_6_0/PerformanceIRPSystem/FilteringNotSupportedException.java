package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::FilteringNotSupportedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/FilteringNotSupportedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception FilteringNotSupportedException {
  ...
};
 * </pre>
 */
public final class FilteringNotSupportedException extends org.omg.CORBA.UserException {

  public FilteringNotSupportedException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.FilteringNotSupportedExceptionHelper.id());
  }

  public FilteringNotSupportedException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.FilteringNotSupportedExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.FilteringNotSupportedException {");
    _ret.append("}");
    return _ret.toString();
  }

}
