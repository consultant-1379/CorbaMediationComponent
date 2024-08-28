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
public final class DestinationAddress implements org.omg.CORBA.portable.IDLEntity {
  
  public java.lang.String ip_address;
  
  public int port;

  public DestinationAddress () {
    ip_address = "";
  }

  public DestinationAddress (final java.lang.String ip_address, 
                             final int port) {
    this.ip_address = ip_address;
    this.port = port;
  }

  public java.lang.String toString() {
    final java.lang.StringBuffer _ret = new java.lang.StringBuffer("struct com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress {");
    _ret.append("\n");
    _ret.append("java.lang.String ip_address=");
    _ret.append(ip_address != null?'\"' + ip_address + '\"':null);
    _ret.append(",\n");
    _ret.append("int port=");
    _ret.append(port);
    _ret.append("\n");
    _ret.append("}");
    return _ret.toString();
  }

  public boolean equals (java.lang.Object o) {
    if (this == o) return true;
    if (o == null) return false;

    if (o instanceof com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress) {
      final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress obj = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress)o;
      boolean res = true;
      do {
        res = this.ip_address == obj.ip_address ||
         (this.ip_address != null && obj.ip_address != null && this.ip_address.equals(obj.ip_address));
        if (!res) break;
        res = this.port == obj.port;
      } while (false);
      return res;
    }
    else {
      return false;
    }
  }
}
