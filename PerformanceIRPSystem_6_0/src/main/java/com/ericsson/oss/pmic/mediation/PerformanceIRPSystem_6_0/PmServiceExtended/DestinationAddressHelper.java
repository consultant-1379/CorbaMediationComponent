package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringServiceExtended.idl"
 * <li> <b>IDL Name</b>      ::PmServiceExtended::DestinationAddress
 * <li> <b>Repository Id</b> IDL:PmServiceExtended/DestinationAddress:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct DestinationAddress {
  ...
};
 * </pre>
 */
public final class DestinationAddressHelper {
  private static boolean _inited = false;
  private static boolean _initing = false;
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress read (final org.omg.CORBA.portable.InputStream _input) {
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress();
    _result.ip_address = _input.read_string();
    _result.port = _input.read_long();
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress _vis_value) {
    _output.write_string((java.lang.String)_vis_value.ip_address);
    _output.write_long((int)_vis_value.port);
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHelper.read(any.create_input_stream());
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
          members[0] = new org.omg.CORBA.StructMember("ip_address", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[1] = new org.omg.CORBA.StructMember("port", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_long), null);
          _type = _orb().create_struct_tc(id(), "DestinationAddress", members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PmServiceExtended/DestinationAddress:1.0";
  }
}
