package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::PerformanceMonitoringReport
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/PerformanceMonitoringReport:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct PerformanceMonitoringReport {
  ...
};
 * </pre>
 */
public final class PerformanceMonitoringReportHelper {
  private static boolean _inited = false;
  private static boolean _initing = false;
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport read (final org.omg.CORBA.portable.InputStream _input) {
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport();
    _result.performance_monitoring_id = _input.read_long();
    _result.sequence_number = _input.read_long();
    _result.scan_initiation_time = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcTHelper.read(_input);
    _result.granularity_period = _input.read_long();
    _result.instance_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.InstanceListHelper.read(_input);
    _result.attribute_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttributeListHelper.read(_input);
    final int $length20 = _input.read_long();
    _result.observed_values = new int[$length20];
    _input.read_long_array(_result.observed_values, 0, $length20);
    final int $length21 = _input.read_long();
    if($length21 != 0) {
    _result.time_stamp = new int[$length21];
    _input.read_long_array(_result.time_stamp, 0, $length21);
    }
    else {
    _result.time_stamp = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.RepeatedIntervalsHelper.EMPTY_LIST;
    }
    final int $length22 = _input.read_long();
    _result.suspect_flag = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlag[$length22];
    for (int $counter23 = 0; $counter23 < $length22; $counter23++) {
    _result.suspect_flag[$counter23] = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlagHelper.read(_input);
    }
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport _vis_value) {
    _output.write_long((int)_vis_value.performance_monitoring_id);
    _output.write_long((int)_vis_value.sequence_number);
    if (_vis_value.scan_initiation_time == null) {
      throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
    }
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.TimeBase.UtcTHelper.write(_output, _vis_value.scan_initiation_time);
    _output.write_long((int)_vis_value.granularity_period);
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.InstanceListHelper.write(_output, _vis_value.instance_list);
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttributeListHelper.write(_output, _vis_value.attribute_list);
    if(_vis_value.observed_values == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.observed_values.length);
    _output.write_long_array(_vis_value.observed_values, 0, _vis_value.observed_values.length);
    if(_vis_value.time_stamp == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.time_stamp.length);
    _output.write_long_array(_vis_value.time_stamp, 0, _vis_value.time_stamp.length);
    if(_vis_value.suspect_flag == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.suspect_flag.length);
    for (int $counter24 = 0;  $counter24 < _vis_value.suspect_flag.length; $counter24++) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlagHelper.write(_output, _vis_value.suspect_flag[$counter24]);
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReport _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHelper.read(any.create_input_stream());
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
          final org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[9];
          members[0] = new org.omg.CORBA.StructMember("performance_monitoring_id", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdHelper.type(), null);
          members[1] = new org.omg.CORBA.StructMember("sequence_number", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_long), null);
          members[2] = new org.omg.CORBA.StructMember("scan_initiation_time", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.IRPTimeHelper.type(), null);
          members[3] = new org.omg.CORBA.StructMember("granularity_period", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimePeriodInSecondsHelper.type(), null);
          members[4] = new org.omg.CORBA.StructMember("instance_list", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.InstanceListHelper.type(), null);
          members[5] = new org.omg.CORBA.StructMember("attribute_list", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.AttributeListHelper.type(), null);
          members[6] = new org.omg.CORBA.StructMember("observed_values", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_long)), null);
          members[7] = new org.omg.CORBA.StructMember("time_stamp", _orb().create_sequence_tc(0, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimePeriodInSecondsHelper.type()), null);
          members[8] = new org.omg.CORBA.StructMember("suspect_flag", _orb().create_sequence_tc(0, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.SuspectFlagHelper.type()), null);
          _type = _orb().create_struct_tc(id(), "PerformanceMonitoringReport", members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/PerformanceMonitoringReport:1.0";
  }
}
