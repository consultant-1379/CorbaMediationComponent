package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::IdSeq
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/IdSeq:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef sequence&ltstring&gt IdSeq;
 * </pre>
 */
public final class IdSeqHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static java.lang.String[] read (final org.omg.CORBA.portable.InputStream _input) {
    java.lang.String[] result;
    final int $length4 = _input.read_long();
    if($length4 != 0) {
    result = new java.lang.String[$length4];
    for (int $counter5 = 0; $counter5 < $length4; $counter5++) {
    result[$counter5] = _input.read_string();
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
    for (int $counter6 = 0;  $counter6 < _vis_value.length; $counter6++) {
    _output.write_string((java.lang.String)_vis_value[$counter6]);
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final java.lang.String[] _vis_value) {
    any.type(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.IdSeqHelper.type());
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.IdSeqHolder(_vis_value));
  }

  public static java.lang.String[] extract (final org.omg.CORBA.Any any) {
    java.lang.String[] _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.IdSeqHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.IdSeqHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    } else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.IdSeqHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          org.omg.CORBA.TypeCode originalType = _orb().create_sequence_tc(0, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
          _type = _orb().create_alias_tc(id(), "IdSeq", originalType);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/IdSeq:1.0";
  }
  public final static java.lang.String[] EMPTY_LIST = {};
}
