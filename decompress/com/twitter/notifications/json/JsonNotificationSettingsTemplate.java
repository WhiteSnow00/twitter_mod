// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationSettingsTemplate extends nge
{
    @JsonField
    public Map<String, String> a;
    @JsonField
    public Map<String, JsonControlType> b;
    @JsonField
    public List<JsonNotificationSetting> c;
    
    @JsonObject
    public static class JsonControlType extends nge
    {
        @JsonField(name = { "default" })
        public String a;
        @JsonField
        public List<Map<String, String>> b;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonNotificationSetting extends nge
    {
        @JsonField
        public String a;
        @JsonField
        public String b;
        @JsonField
        public String c;
        @JsonField(name = { "description" })
        public Map<String, String> d;
    }
}
