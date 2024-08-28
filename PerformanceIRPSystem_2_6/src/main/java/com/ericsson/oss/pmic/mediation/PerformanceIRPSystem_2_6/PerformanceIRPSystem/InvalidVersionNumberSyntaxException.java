package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidVersionNumberSyntaxException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidVersionNumberSyntaxException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidVersionNumberSyntaxException {
  ...
};
 * </pre>
 */
public final class InvalidVersionNumberSyntaxException extends org.omg.CORBA.UserException {

  public InvalidVersionNumberSyntaxException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidVersionNumberSyntaxExceptionHelper.id());
  }

  public InvalidVersionNumberSyntaxException (java.lang.String _reason) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidVersionNumberSyntaxExceptionHelper.id() + ' ' + _reason);
    
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidVersionNumberSyntaxException {");
    _ret.append("}");
    return _ret.toString();
  }

}
