package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::InvalidObservationObjectException
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/InvalidObservationObjectException:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * exception InvalidObservationObjectException {
  ...
};
 * </pre>
 */
public final class InvalidObservationObjectExceptionHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException read (final org.omg.CORBA.portable.InputStream _input) {
    if (!_input.read_string().equals(id())) {
      throw new org.omg.CORBA.MARSHAL("Mismatched repository id");
    }
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException();
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException _vis_value) {
    _output.write_string(id());
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          final org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[0];
          
          _type = _orb().create_exception_tc(id(), "InvalidObservationObjectException", members);
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPSystem/InvalidObservationObjectException:1.0";
  }
}
