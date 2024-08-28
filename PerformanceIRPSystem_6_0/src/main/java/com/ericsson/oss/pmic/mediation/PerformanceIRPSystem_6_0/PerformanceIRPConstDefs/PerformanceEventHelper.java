package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::PerformanceEvent
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/PerformanceEvent:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct PerformanceEvent {
  ...
};
 * </pre>
 */
public final class PerformanceEventHelper {
  private static boolean _inited = false;
  private static boolean _initing = false;
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent read (final org.omg.CORBA.portable.InputStream _input) {
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent();
    _result.managed_object_class = _input.read_string();
    _result.observed_object_instance = _input.read_string();
    _result.event_category = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategoryHelper.read(_input);
    _result.event_group_id = _input.read_string();
    final int $length35 = _input.read_long();
    if($length35 != 0) {
    _result.attribute_name = new java.lang.String[$length35];
    for (int $counter36 = 0; $counter36 < $length35; $counter36++) {
    _result.attribute_name[$counter36] = _input.read_string();
    }
    }
    else {
    _result.attribute_name = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    final int $length37 = _input.read_long();
    if($length37 != 0) {
    _result.attribute_value = new java.lang.String[$length37];
    for (int $counter38 = 0; $counter38 < $length37; $counter38++) {
    _result.attribute_value[$counter38] = _input.read_string();
    }
    }
    else {
    _result.attribute_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    final int $length39 = _input.read_long();
    _result.suspect_flag = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlag[$length39];
    for (int $counter40 = 0; $counter40 < $length39; $counter40++) {
    _result.suspect_flag[$counter40] = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlagHelper.read(_input);
    }
    _result.event_time = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.TimeBase.UtcTHelper.read(_input);
    final int $length41 = _input.read_long();
    if($length41 != 0) {
    _result.additional_info_name = new java.lang.String[$length41];
    for (int $counter42 = 0; $counter42 < $length41; $counter42++) {
    _result.additional_info_name[$counter42] = _input.read_string();
    }
    }
    else {
    _result.additional_info_name = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    final int $length43 = _input.read_long();
    if($length43 != 0) {
    _result.additional_info_value = new java.lang.String[$length43];
    for (int $counter44 = 0; $counter44 < $length43; $counter44++) {
    _result.additional_info_value[$counter44] = _input.read_string();
    }
    }
    else {
    _result.additional_info_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent _vis_value) {
    _output.write_string((java.lang.String)_vis_value.managed_object_class);
    _output.write_string((java.lang.String)_vis_value.observed_object_instance);
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategoryHelper.write(_output, _vis_value.event_category);
    _output.write_string((java.lang.String)_vis_value.event_group_id);
    if(_vis_value.attribute_name == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.attribute_name.length);
    for (int $counter45 = 0;  $counter45 < _vis_value.attribute_name.length; $counter45++) {
    _output.write_string((java.lang.String)_vis_value.attribute_name[$counter45]);
    }
    if(_vis_value.attribute_value == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.attribute_value.length);
    for (int $counter46 = 0;  $counter46 < _vis_value.attribute_value.length; $counter46++) {
    _output.write_string((java.lang.String)_vis_value.attribute_value[$counter46]);
    }
    if(_vis_value.suspect_flag == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.suspect_flag.length);
    for (int $counter47 = 0;  $counter47 < _vis_value.suspect_flag.length; $counter47++) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlagHelper.write(_output, _vis_value.suspect_flag[$counter47]);
    }
    if (_vis_value.event_time == null) {
      throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
    }
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.TimeBase.UtcTHelper.write(_output, _vis_value.event_time);
    if(_vis_value.additional_info_name == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.additional_info_name.length);
    for (int $counter48 = 0;  $counter48 < _vis_value.additional_info_name.length; $counter48++) {
    _output.write_string((java.lang.String)_vis_value.additional_info_name[$counter48]);
    }
    if(_vis_value.additional_info_value == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.additional_info_value.length);
    for (int $counter49 = 0;  $counter49 < _vis_value.additional_info_value.length; $counter49++) {
    _output.write_string((java.lang.String)_vis_value.additional_info_value[$counter49]);
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEventHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEvent _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEventHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEventHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceEventHelper.read(any.create_input_stream());
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
          final org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[10];
          members[0] = new org.omg.CORBA.StructMember("managed_object_class", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[1] = new org.omg.CORBA.StructMember("observed_object_instance", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[2] = new org.omg.CORBA.StructMember("event_category", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.EventCategoryHelper.type(), null);
          members[3] = new org.omg.CORBA.StructMember("event_group_id", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[4] = new org.omg.CORBA.StructMember("attribute_name", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string)), null);
          members[5] = new org.omg.CORBA.StructMember("attribute_value", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string)), null);
          members[6] = new org.omg.CORBA.StructMember("suspect_flag", _orb().create_sequence_tc(0, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SuspectFlagHelper.type()), null);
          members[7] = new org.omg.CORBA.StructMember("event_time", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.IRPTimeHelper.type(), null);
          members[8] = new org.omg.CORBA.StructMember("additional_info_name", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string)), null);
          members[9] = new org.omg.CORBA.StructMember("additional_info_value", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string)), null);
          _type = _orb().create_struct_tc(id(), "PerformanceEvent", members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/PerformanceEvent:1.0";
  }
}
