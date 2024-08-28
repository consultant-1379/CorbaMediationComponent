package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidObservationObjectListException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidObservationObjectListException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidObservationObjectListException {
  ...
};
 * </pre>
 */
public final class InvalidObservationObjectListException extends org.omg.CORBA.UserException {
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list;

  public InvalidObservationObjectListException () {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.id());
  }

  public InvalidObservationObjectListException (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list) {
    this();
    this.observation_object_list = observation_object_list;
  }

  public InvalidObservationObjectListException (java.lang.String _reason, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list) {
    super(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.id() + ' ' + _reason);
    this.observation_object_list = observation_object_list;
  }

  public java.lang.String toString () {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("exception com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException {");
    _ret.append("\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list=");
    _ret.append("{");
    if (observation_object_list == null) {
      _ret.append(observation_object_list);
    } else {
      for (int $counter6 = 0; $counter6 < observation_object_list.length; $counter6++) {
        _ret.append(observation_object_list[$counter6]);
        if ($counter6 < observation_object_list.length - 1) {
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
    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException)o;
      boolean res = true;
      do {
          if (res = (this.observation_object_list.length == obj.observation_object_list.length)) {
            for (int $counter7 = 0; res && $counter7 < this.observation_object_list.length; $counter7++) {
              res = this.observation_object_list[$counter7] == obj.observation_object_list[$counter7] ||
               (this.observation_object_list[$counter7] != null && obj.observation_object_list[$counter7] != null && this.observation_object_list[$counter7].equals(obj.observation_object_list[$counter7]));
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
