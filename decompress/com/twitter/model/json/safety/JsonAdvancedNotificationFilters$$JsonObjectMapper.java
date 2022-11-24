// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAdvancedNotificationFilters$$JsonObjectMapper extends JsonMapper<JsonAdvancedNotificationFilters>
{
    public static JsonAdvancedNotificationFilters _parse(final qhe qhe) throws IOException {
        final JsonAdvancedNotificationFilters jsonAdvancedNotificationFilters = new JsonAdvancedNotificationFilters();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonAdvancedNotificationFilters, d, qhe);
            qhe.m0();
        }
        return jsonAdvancedNotificationFilters;
    }
    
    public static void _serialize(final JsonAdvancedNotificationFilters jsonAdvancedNotificationFilters, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("filter_default_profile_image", jsonAdvancedNotificationFilters.d);
        yfe.e("filter_new_users", jsonAdvancedNotificationFilters.c);
        yfe.e("filter_no_confirmed_email", jsonAdvancedNotificationFilters.e);
        yfe.e("filter_no_confirmed_phone", jsonAdvancedNotificationFilters.f);
        yfe.e("filter_not_following", jsonAdvancedNotificationFilters.a);
        yfe.e("filter_not_followed_by", jsonAdvancedNotificationFilters.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAdvancedNotificationFilters jsonAdvancedNotificationFilters, final String s, final qhe qhe) throws IOException {
        if ("filter_default_profile_image".equals(s)) {
            jsonAdvancedNotificationFilters.d = qhe.l();
        }
        else if ("filter_new_users".equals(s)) {
            jsonAdvancedNotificationFilters.c = qhe.l();
        }
        else if ("filter_no_confirmed_email".equals(s)) {
            jsonAdvancedNotificationFilters.e = qhe.l();
        }
        else if ("filter_no_confirmed_phone".equals(s)) {
            jsonAdvancedNotificationFilters.f = qhe.l();
        }
        else if ("filter_not_following".equals(s)) {
            jsonAdvancedNotificationFilters.a = qhe.l();
        }
        else if ("filter_not_followed_by".equals(s)) {
            jsonAdvancedNotificationFilters.b = qhe.l();
        }
    }
    
    public JsonAdvancedNotificationFilters parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAdvancedNotificationFilters jsonAdvancedNotificationFilters, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAdvancedNotificationFilters, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAdvancedNotificationFilters)o, yfe, b);
    }
}
