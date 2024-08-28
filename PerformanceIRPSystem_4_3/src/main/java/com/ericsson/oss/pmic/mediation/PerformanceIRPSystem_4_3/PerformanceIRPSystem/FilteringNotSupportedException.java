package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
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
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.FilteringNotSupportedExceptionHelper.id());
  }

  public FilteringNotSupportedException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.FilteringNotSupportedExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.FilteringNotSupportedException {");
    _ret.append("}");
    return _ret.toString();
  }

}
