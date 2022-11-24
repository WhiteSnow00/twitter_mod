// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Collection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationSettingsApiResult extends eih<bgw>
{
    @JsonField(name = { "_smsSettings" })
    public Map<String, String> a;
    @JsonField(name = { "_smsSettingsTemplate" })
    public Map<String, JsonNotificationSettingsTemplate> b;
    @JsonField(name = { "_result" })
    public List<ResultInfo> c;
    @JsonField(name = { "_code" })
    public int d;
    
    public final z4j t() {
        final HashMap a = this.a;
        int intValue = -1;
        int intValue2;
        if (a == null) {
            intValue2 = 0;
            intValue = 0;
        }
        else {
            intValue2 = -1;
        }
        boolean a2;
        String a3;
        if (!kr4.t((Collection)this.c)) {
            final ResultInfo resultInfo = (ResultInfo)kr4.q((List)this.c);
            final Boolean b = resultInfo.b;
            a2 = (b != null && b);
            final Integer c = resultInfo.c;
            if (c != null) {
                intValue = c;
            }
            final Integer d = resultInfo.d;
            if (d != null) {
                intValue2 = d;
            }
            a3 = resultInfo.a;
        }
        else {
            a3 = null;
            a2 = false;
        }
        final HashMap b2 = this.b;
        bgw$a bgw$a2;
        if (b2 != null && b2.get("settings_template") != null) {
            final JsonNotificationSettingsTemplate jsonNotificationSettingsTemplate = this.b.get("settings_template");
            final HashMap a4 = this.a;
            Objects.requireNonNull(jsonNotificationSettingsTemplate);
            final bgw$a bgw$a = new bgw$a();
            final ojf h = ojf.H();
            bgw$a2 = bgw$a;
            if (jsonNotificationSettingsTemplate.b != null) {
                final ArrayList c2 = jsonNotificationSettingsTemplate.c;
                bgw$a2 = bgw$a;
                if (c2 != null) {
                    for (final JsonNotificationSettingsTemplate.JsonNotificationSetting jsonNotificationSetting : c2) {
                        final JsonNotificationSettingsTemplate.JsonControlType jsonControlType = jsonNotificationSettingsTemplate.b.get(jsonNotificationSetting.a);
                        if (jsonControlType != null) {
                            final ArrayList b3 = jsonControlType.b;
                            if (b3 == null) {
                                continue;
                            }
                            final int size = b3.size();
                            final String[] c3 = new String[size];
                            final String[] d2 = new String[size];
                            final String[] e = new String[size];
                            for (int i = 0; i < jsonControlType.b.size(); ++i) {
                                c3[i] = (String)kr4.p((Iterable)((Map)jsonControlType.b.get(i)).keySet());
                                d2[i] = ((Map<K, String>)jsonControlType.b.get(i)).get(c3[i]);
                                e[i] = (String)jsonNotificationSetting.d.get(c3[i]);
                            }
                            final yui$a yui$a = new yui$a();
                            final String b4 = jsonNotificationSetting.b;
                            yui$a.a = b4;
                            yui$a.b = jsonNotificationSetting.c;
                            yui$a.c = c3;
                            yui$a.d = d2;
                            yui$a.e = e;
                            if (a4 != null && a4.get(b4) != null) {
                                yui$a.f = a4.get(jsonNotificationSetting.b);
                            }
                            else {
                                yui$a.g = true;
                            }
                            h.p((Object)((z4j)yui$a).j());
                        }
                    }
                    final List d3 = (List)((z4j)h).e();
                    bgw$a2 = bgw$a;
                    if (d3.size() == jsonNotificationSettingsTemplate.c.size()) {
                        bgw$a.d = d3;
                        bgw$a2 = bgw$a;
                    }
                }
            }
        }
        else {
            bgw$a2 = new bgw$a();
        }
        bgw$a2.f = this.d;
        bgw$a2.a = a2;
        bgw$a2.b = intValue;
        bgw$a2.c = intValue2;
        bgw$a2.e = a3;
        return (z4j)bgw$a2;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class ResultInfo extends nge
    {
        @JsonField
        public String a;
        @JsonField
        public Boolean b;
        @JsonField
        public Integer c;
        @JsonField
        public Integer d;
    }
}
