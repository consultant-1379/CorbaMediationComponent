package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/CommonIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::CommonIRPConstDefs::IRPTime
 * <li> <b>Repository Id</b> IDL:CommonIRPConstDefs/IRPTime:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT IRPTime;
 * </pre>
 */
public final class IRPTimeHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT read (final org.omg.CORBA.portable.InputStream _input) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT result;
    result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHelper.read(_input);
    return result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT _vis_value) {
    if (_vis_value == null) {
      throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
    }
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHelper.write(_output, _vis_value);
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT _vis_value) {
    any.type(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.IRPTimeHelper.type());
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcT _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          org.omg.CORBA.TypeCode originalType = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.TimeBase.UtcTHelper.type();
          _type = _orb().create_alias_tc(id(), "IRPTime", originalType);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:CommonIRPConstDefs/IRPTime:1.0";
  }
}
