package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::GranularityAndAttributeActivationException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/GranularityAndAttributeActivationException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception GranularityAndAttributeActivationException {
  ...
};
 * </pre>
 */
public final class GranularityAndAttributeActivationException extends org.omg.CORBA.UserException {
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass[] observation_class_list;

  public GranularityAndAttributeActivationException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.id());
  }

  public GranularityAndAttributeActivationException (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass[] observation_class_list) {
    this();
    this.observation_class_list = observation_class_list;
  }

  public GranularityAndAttributeActivationException (java.lang.String _reason, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass[] observation_class_list) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.id() + ' ' + _reason);
    this.observation_class_list = observation_class_list;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException {");
    _ret.append("\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass[] observation_class_list=");
    _ret.append("{");
    if (observation_class_list == null) {
      _ret.append(observation_class_list);
    } else {
      for (int $counter0 = 0; $counter0 < observation_class_list.length; $counter0++) {
        _ret.append(observation_class_list[$counter0]);
        if ($counter0 < observation_class_list.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException)o;
      boolean res = true;
      do {
          if (res = (this.observation_class_list.length == obj.observation_class_list.length)) {
            for (int $counter1 = 0; res && $counter1 < this.observation_class_list.length; $counter1++) {
              res = this.observation_class_list[$counter1] == obj.observation_class_list[$counter1] ||
               (this.observation_class_list[$counter1] != null && obj.observation_class_list[$counter1] != null && this.observation_class_list[$counter1].equals(obj.observation_class_list[$counter1]));
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
