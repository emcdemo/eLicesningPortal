package com.emc.licensekey.activation.request;

import java.util.HashMap;
import java.util.Map;

public class SelectedSystem {

private String name;

private String prodName;

private String macAddress;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}


public String getProdName() {
return prodName;
}


public void setProdName(String prodName) {
this.prodName = prodName;
}


public String getMacAddress() {
return macAddress;
}


public void setMacAddress(String macAddress) {
this.macAddress = macAddress;
}


public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}


public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
}
