package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::TimePeriodInSeconds
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/TimePeriodInSeconds:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * typedef long TimePeriodInSeconds;
 * </pre>
 */
public final class TimePeriodInSecondsHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static int read (final org.omg.CORBA.portable.InputStream _input) {
    int result;
    result = _input.read_long();
    return result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final int _vis_value) {
    _output.write_long((int)_vis_value);
  }

  public static void insert (final org.omg.CORBA.Any any, final int _vis_value) {
    any.type(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimePeriodInSecondsHelper.type());
    any.insert_long((int)_vis_value);
  }

  public static int extract (final org.omg.CORBA.Any any) {
    int _vis_value;
    _vis_value = any.extract_long();

    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          org.omg.CORBA.TypeCode originalType = _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
          _type = _orb().create_alias_tc(id(), "TimePeriodInSeconds", originalType);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/TimePeriodInSeconds:1.0";
  }
}
