package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::AttrValue
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/AttrValue:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * union AttrValue switch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType) {
  ...
};
 * </pre>
 */
public final class AttrValueHelper {
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue read (final org.omg.CORBA.portable.InputStream _input) {
    final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue _result = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue();
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType disc;
    disc = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrTypeHelper.read(_input);
    switch (disc.value()) {
      case com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType._INTEGER_ATTR: {
        int _tmp;
        _tmp = _input.read_long();
        _result.i_attribute(_tmp);
        break;
      }
      case com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType._REAL_ATTR: {
        double _tmp;
        _tmp = _input.read_double();
        _result.r_attribute(_tmp);
        break;
      }
      default: {
        throw new org.omg.CORBA.MARSHAL();
      }
    }
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue _vis_value) {
    if (_vis_value == null) {
      throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
    }
    if(!_vis_value._initialized){
      throw new org.omg.CORBA.BAD_OPERATION("union not initialized");
    }
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrTypeHelper.write(_output, _vis_value.discriminator());
    switch (_vis_value.discriminator().value()) {
      case com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType._INTEGER_ATTR: {
        int i_attribute = _vis_value.i_attribute();
        _output.write_long((int)i_attribute);
        break;
      }
      case com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType._REAL_ATTR: {
        double r_attribute = _vis_value.r_attribute();
        _output.write_double((double)r_attribute);
        break;
      }
    }
  }

  public static void insert (final org.omg.CORBA.Any any, final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue _vis_value) {
    any.insert_Streamable(new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValueHolder(_vis_value));
  }

  public static com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue extract (final org.omg.CORBA.Any any) {
    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValue _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValueHolder _vis_holder = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValueHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrValueHelper.read(any.create_input_stream());
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
          org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[2];
          {
            org.omg.CORBA.Any label = _orb().create_any();
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrTypeHelper.insert(label, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType.INTEGER_ATTR);
            members[0] = new org.omg.CORBA.UnionMember("i_attribute", label, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_long), null);
          }
          {
            org.omg.CORBA.Any label = _orb().create_any();
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrTypeHelper.insert(label, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrType.REAL_ATTR);
            members[1] = new org.omg.CORBA.UnionMember("r_attribute", label, _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_double), null);
          }
          _type = _orb().create_union_tc(id(), "AttrValue", com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.AttrTypeHelper.type(), members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:PerformanceIRPConstDefs/AttrValue:1.0";
  }
}
