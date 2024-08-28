package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::ObservationClassList
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/ObservationClassList:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef sequence&ltcom.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass&gt ObservationClassList;
 * </pre>
 */
public final class ObservationClassListHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] read (final org.omg.CORBA.portable.InputStream _input) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] result;
    final int $length13 = _input.read_long();
    if($length13 != 0) {
    result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[$length13];
    for (int $counter14 = 0; $counter14 < $length13; $counter14++) {
    result[$counter14] = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassHelper.read(_input);
    }
    }
    else {
    result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.EMPTY_LIST;
    }
    return result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] _vis_value) {
    if(_vis_value == null){
      throw new org.omg.CORBA.BAD_PARAM("Null parameter");
    }
    _output.write_long(_vis_value.length);
    for (int $counter15 = 0;  $counter15 < _vis_value.length; $counter15++) {
    if (_vis_value[$counter15] == null) {
      throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
    }
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassHelper.write(_output, _vis_value[$counter15]);
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] _vis_value) {
    any.type(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.type());
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    } else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          org.omg.CORBA.TypeCode originalType = _orb().create_sequence_tc(0, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassHelper.type());
          _type = _orb().create_alias_tc(id(), "ObservationClassList", originalType);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/ObservationClassList:1.0";
  }
  public final static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] EMPTY_LIST = {};
}
