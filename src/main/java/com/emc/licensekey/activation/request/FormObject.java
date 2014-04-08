package com.emc.licensekey.activation.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormObject
{

private String id;
private Integer qty;
private Integer selected;
private List<SelectedProd> selectedProds = new ArrayList<SelectedProd>();
private List<SelectedSystem> selectedSystems = new ArrayList<SelectedSystem>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();


public String getId() {
return id;
}


public void setId(String id) {
this.id = id;
}


public Integer getQty() {
return qty;
}


public void setQty(Integer qty) {
this.qty = qty;
}


public Integer getSelected() {
return selected;
}


public void setSelected(Integer selected) {
this.selected = selected;
}


public List<SelectedProd> getSelectedProds() {
return selectedProds;
}


public void setSelectedProds(List<SelectedProd> selectedProds) {
this.selectedProds = selectedProds;
}


public List<SelectedSystem> getSelectedSystems() {
return selectedSystems;
}


public void setSelectedSystems(List<SelectedSystem> selectedSystems) {
this.selectedSystems = selectedSystems;
}


public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}


public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}


}