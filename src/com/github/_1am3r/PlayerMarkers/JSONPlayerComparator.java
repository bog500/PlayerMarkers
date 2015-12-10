package com.github._1am3r.PlayerMarkers;

import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONPlayerComparator implements Comparator<JSONObject>{
    public int compare(JSONObject a, JSONObject b)
    {
        //valA and valB could be any simple type, such as number, string, whatever
        String valA = (String) a.get("msg");
        String valB = (String) b.get("msg");

        return valA.compareTo(valB);

    }
}
