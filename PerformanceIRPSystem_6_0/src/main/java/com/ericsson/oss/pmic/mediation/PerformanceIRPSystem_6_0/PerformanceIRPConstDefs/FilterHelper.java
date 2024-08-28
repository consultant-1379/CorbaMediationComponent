package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::Filter
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/Filter:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct Filter {
  ...
};
 * </pre>
 */
public final class FilterHelper {
  private static boolean _inited = false;
  private static boolean _initing = false;
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter read (final org.omg.CORBA.portable.InputStream _input) {
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter();
    final int $length60 = _input.read_long();
    if($length60 != 0) {
    _result.attribute_name = new java.lang.String[$length60];
    for (int $counter61 = 0; $counter61 < $length60; $counter61++) {
    _result.attribute_name[$counter61] = _input.read_string();
    }
    }
    else {
    _result.attribute_name = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    final int $length62 = _input.read_long();
    if($length62 != 0) {
    _result.attribute_value = new java.lang.String[$length62];
    for (int $counter63 = 0; $counter63 < $length62; $counter63++) {
    _result.attribute_value[$counter63] = _input.read_string();
    }
    }
    else {
    _result.attribute_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter _vis_value) {
    if(_vis_value.attribute_name == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.attribute_name.length);
    for (int $counter64 = 0;  $counter64 < _vis_value.attribute_name.length; $counter64++) {
    _output.write_string((java.lang.String)_vis_value.attribute_name[$counter64]);
    }
    if(_vis_value.attribute_value == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.attribute_value.length);
    for (int $counter65 = 0;  $counter65 < _vis_value.attribute_value.length; $counter65++) {
    _output.write_string((java.lang.String)_vis_value.attribute_value[$counter65]);
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.read(any.create_input_stream());
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
          final org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[2];
          members[0] = new org.omg.CORBA.StructMember("attribute_name", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string)), null);
          members[1] = new org.omg.CORBA.StructMember("attribute_value", _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string)), null);
          _type = _orb().create_struct_tc(id(), "Filter", members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/Filter:1.0";
  }
}
