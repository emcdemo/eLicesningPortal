package com.emc.licensekey.activation.request;

import java.util.HashMap;
import java.util.Map;

public class SelectedProd {

private String name;

private String qty;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}


public String getQty() {
return qty;
}


public void setQty(String qty) {
this.qty = qty;
}


public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}


public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
