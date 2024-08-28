package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::InstanceList
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/InstanceList:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef sequence&ltstring&gt InstanceList;
 * </pre>
 */
public final class InstanceListHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static java.lang.String[] read (final org.omg.CORBA.portable.InputStream _input) {
    java.lang.String[] result;
    final int $length16 = _input.read_long();
    if($length16 != 0) {
    result = new java.lang.String[$length16];
    for (int $counter17 = 0; $counter17 < $length16; $counter17++) {
    result[$counter17] = _input.read_string();
    }
    }
    else {
    result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.EMPTY_LIST;
    }
    return result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final java.lang.String[] _vis_value) {
    if(_vis_value == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.length);
    for (int $counter18 = 0;  $counter18 < _vis_value.length; $counter18++) {
    _output.write_string((java.lang.String)_vis_value[$counter18]);
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final java.lang.String[] _vis_value) {
    any.type(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.type());
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHolder(_vis_value));
  }

  public static java.lang.String[] extract (final org.omg.CORBA.Any any) {
    java.lang.String[] _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    } else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.InstanceListHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          org.omg.CORBA.TypeCode originalType = _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
          _type = _orb().create_alias_tc(id(), "InstanceList", originalType);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/InstanceList:1.0";
  }
  public final static java.lang.String[] EMPTY_LIST = {};
}
