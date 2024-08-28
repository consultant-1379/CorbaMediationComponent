package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::EventCategory
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/EventCategory:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * enum EventCategory {ACTIVITY_OCCURED, THRESHOLD_PASSED, PERIODIC_EVENT};
 * </pre>
 */
public final class EventCategoryHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory read (final org.omg.CORBA.portable.InputStream _input) {
    return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory.from_int(_input.read_long());
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory _vis_value) {
    if (_vis_value == null) {
      throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
    }
    _output.write_long(_vis_value.value());
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory _vis_value) {
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      ((com.inprise.vbroker.CORBA.Any)any).insert_enum(_vis_value.value(), com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.type());
    }
    else {
      org.omg.CORBA.portable.OutputStream output = any.create_output_stream();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.write(output, _vis_value);
      any.read_value(output.create_input_stream(), com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.type());
    }

  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategory.from_int(((com.inprise.vbroker.CORBA.Any)any).extract_enum(type()));
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.EventCategoryHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          final java.lang.String members[] = new java.lang.String[] {"ACTIVITY_OCCURED",
                                                                     "THRESHOLD_PASSED",
                                                                     "PERIODIC_EVENT"};
          _type = _orb().create_enum_tc(id(), "EventCategory", members);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/EventCategory:1.0";
  }
}
