package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::ProcessingErrorException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/ProcessingErrorException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception ProcessingErrorException {
  ...
};
 * </pre>
 */
public final class ProcessingErrorException extends org.omg.CORBA.UserException {
  
  public java.lang.String reason;

  public ProcessingErrorException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id());
  }

  public ProcessingErrorException (java.lang.String reason) {
    this();
    this.reason = reason;
  }

  public ProcessingErrorException (java.lang.String _reason, java.lang.String reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id() + ' ' + _reason);
    this.reason = reason;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException {");
    _ret.append("\n");
    _ret.append("java.lang.String reason=");
    _ret.append(reason != null?'\"' + reason + '\"':null);
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException)o;
      boolean res = true;
      do {
        res = this.reason == obj.reason ||
         (this.reason != null && obj.reason != null && this.reason.equals(obj.reason));
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
