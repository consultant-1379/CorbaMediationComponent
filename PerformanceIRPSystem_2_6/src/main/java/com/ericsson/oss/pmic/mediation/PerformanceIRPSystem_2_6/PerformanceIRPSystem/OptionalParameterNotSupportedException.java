package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::OptionalParameterNotSupportedException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception OptionalParameterNotSupportedException {
  ...
};
 * </pre>
 */
public final class OptionalParameterNotSupportedException extends org.omg.CORBA.UserException {
  
  public java.lang.String[] notSupportedParameters;

  public OptionalParameterNotSupportedException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id());
  }

  public OptionalParameterNotSupportedException (java.lang.String[] notSupportedParameters) {
    this();
    this.notSupportedParameters = notSupportedParameters;
  }

  public OptionalParameterNotSupportedException (java.lang.String _reason, java.lang.String[] notSupportedParameters) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id() + ' ' + _reason);
    this.notSupportedParameters = notSupportedParameters;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {");
    _ret.append("\n");
    _ret.append("java.lang.String[] notSupportedParameters=");
    _ret.append("{");
    if (notSupportedParameters == null) {
      _ret.append(notSupportedParameters);
    } else {
      for (int $counter0 = 0; $counter0 < notSupportedParameters.length; $counter0++) {
        _ret.append(notSupportedParameters[$counter0] != null?'\"' + notSupportedParameters[$counter0] + '\"':null);
        if ($counter0 < notSupportedParameters.length - 1) {
          _ret.append(",");
        }
      }
    }
    _ret.append("}");
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException)o;
      boolean res = true;
      do {
          if (res = (this.notSupportedParameters.length == obj.notSupportedParameters.length)) {
            for (int $counter1 = 0; res && $counter1 < this.notSupportedParameters.length; $counter1++) {
              res = this.notSupportedParameters[$counter1] == obj.notSupportedParameters[$counter1] ||
               (this.notSupportedParameters[$counter1] != null && obj.notSupportedParameters[$counter1] != null && this.notSupportedParameters[$counter1].equals(obj.notSupportedParameters[$counter1]));
            }
          }
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
