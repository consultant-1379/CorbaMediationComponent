package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::PerformanceMonitoring
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/PerformanceMonitoring:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct PerformanceMonitoring {
  ...
};
 * </pre>
 */
public final class PerformanceMonitoring implements org.omg.CORBA.portable.IDLEntity {
  
  public int performance_monitoring_id;
  
  public java.lang.String measurement_name;
  
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringState state;

  public PerformanceMonitoring () {
    measurement_name = "";
  }

  public PerformanceMonitoring (final int performance_monitoring_id, 
                                final java.lang.String measurement_name, 
                                final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringState state) {
    this.performance_monitoring_id = performance_monitoring_id;
    this.measurement_name = measurement_name;
    this.state = state;
  }

  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring {");
    _ret.append("\n");
    _ret.append("int performance_monitoring_id=");
    _ret.append(performance_monitoring_id);
    _ret.append(",\n");
    _ret.append("java.lang.String measurement_name=");
    _ret.append(measurement_name != null?'\"' + measurement_name + '\"':null);
    _ret.append(",\n");
    _ret.append("com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringState state=");
    _ret.append(state);
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;

    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring)o;
      boolean res = true;
      do {
          res = this.performance_monitoring_id == obj.performance_monitoring_id;
        if (!res) break;
          res = this.measurement_name == obj.measurement_name ||
           (this.measurement_name != null && obj.measurement_name != null && this.measurement_name.equals(obj.measurement_name));
        if (!res) break;
        res = this.state == obj.state ||
         (this.state != null && obj.state != null && this.state.equals(obj.state));
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
