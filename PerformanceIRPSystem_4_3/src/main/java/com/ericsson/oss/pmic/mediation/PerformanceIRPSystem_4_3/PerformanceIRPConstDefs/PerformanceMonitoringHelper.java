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
public final class PerformanceMonitoringHelper {
  private static boolean _inited = false;
  private static boolean _initing = false;
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring read (final org.omg.CORBA.portable.InputStream _input) {
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring();
    _result.performance_monitoring_id = _input.read_long();
    _result.measurement_name = _input.read_string();
    _result.state = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring _vis_value) {
    _output.write_long((int)_vis_value.performance_monitoring_id);
    _output.write_string((java.lang.String)_vis_value.measurement_name);
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.write(_output, _vis_value.state);
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoring _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          if (_initializing) {
            return _orb().create_recursive_tc(id());
          }
          _initializing = true;
          final org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[3];
          members[0] = new org.omg.CORBA.StructMember("performance_monitoring_id", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdHelper.type(), null);
          members[1] = new org.omg.CORBA.StructMember("measurement_name", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.MeasurementNameHelper.type(), null);
          members[2] = new org.omg.CORBA.StructMember("state", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.type(), null);
          _type = _orb().create_struct_tc(id(), "PerformanceMonitoring", members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/PerformanceMonitoring:1.0";
  }
}
