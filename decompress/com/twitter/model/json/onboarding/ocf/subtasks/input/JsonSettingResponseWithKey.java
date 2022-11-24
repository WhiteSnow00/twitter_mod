// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingResponseWithKey extends nge
{
    @JsonField
    public String a;
    @JsonField
    public JsonSettingResponseData b;
    
    public static List<JsonSettingResponseWithKey> s(final Map<String, fpp> map) {
        final ojf h = ojf.H();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final JsonSettingResponseWithKey jsonSettingResponseWithKey = new JsonSettingResponseWithKey();
            jsonSettingResponseWithKey.a = entry.getKey();
            final fpp fpp = (fpp)entry.getValue();
            final JsonSettingResponseData b = new JsonSettingResponseData();
            if (fpp instanceof r72) {
                final int a = o5j.a;
                final r72 r72 = (r72)fpp;
                final JsonBooleanSettingsInputData a2 = new JsonBooleanSettingsInputData();
                a2.a = r72.b;
                b.a = a2;
            }
            else if (fpp instanceof rmf) {
                final int a3 = o5j.a;
                final rmf rmf = (rmf)fpp;
                final JsonListSettingsInputData b2 = new JsonListSettingsInputData();
                b2.a = rmf.b;
                b.b = b2;
            }
            jsonSettingResponseWithKey.b = b;
            h.p((Object)jsonSettingResponseWithKey);
        }
        return (List)((z4j)h).e();
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonSettingResponseData extends nge
    {
        @JsonField
        public JsonBooleanSettingsInputData a;
        @JsonField
        public JsonListSettingsInputData b;
    }
}
