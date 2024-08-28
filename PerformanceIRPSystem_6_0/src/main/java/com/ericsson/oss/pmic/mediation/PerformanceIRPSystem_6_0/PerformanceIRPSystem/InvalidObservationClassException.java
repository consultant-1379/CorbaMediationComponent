package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidObservationClassException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidObservationClassException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidObservationClassException {
  ...
};
 * </pre>
 */
public final class InvalidObservationClassException extends org.omg.CORBA.UserException {
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list;

  public InvalidObservationClassException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.id());
  }

  public InvalidObservationClassException (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list) {
    this();
    this.observation_class_list = observation_class_list;
  }

  public InvalidObservationClassException (java.lang.String _reason, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.id() + ' ' + _reason);
    this.observation_class_list = observation_class_list;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException {");
    _ret.append("\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list=");
    _ret.append("{");
    if (observation_class_list == null) {
      _ret.append(observation_class_list);
    } else {
      for (int $counter4 = 0; $counter4 < observation_class_list.length; $counter4++) {
        _ret.append(observation_class_list[$counter4]);
        if ($counter4 < observation_class_list.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException)o;
      boolean res = true;
      do {
          if (res = (this.observation_class_list.length == obj.observation_class_list.length)) {
            for (int $counter5 = 0; res && $counter5 < this.observation_class_list.length; $counter5++) {
              res = this.observation_class_list[$counter5] == obj.observation_class_list[$counter5] ||
               (this.observation_class_list[$counter5] != null && obj.observation_class_list[$counter5] != null && this.observation_class_list[$counter5].equals(obj.observation_class_list[$counter5]));
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
