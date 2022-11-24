// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSmartActionDetails$$JsonObjectMapper extends JsonMapper<JsonNotificationSmartActionDetails>
{
    public static JsonNotificationSmartActionDetails _parse(final qhe qhe) throws IOException {
        final JsonNotificationSmartActionDetails jsonNotificationSmartActionDetails = new JsonNotificationSmartActionDetails();
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
            parseField(jsonNotificationSmartActionDetails, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSmartActionDetails;
    }
    
    public static void _serialize(final JsonNotificationSmartActionDetails jsonNotificationSmartActionDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("max_notification_slots", jsonNotificationSmartActionDetails.c);
        final ArrayList a = jsonNotificationSmartActionDetails.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "target_ids", a);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        yfe.u0("time_stamp", jsonNotificationSmartActionDetails.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSmartActionDetails jsonNotificationSmartActionDetails, final String s, final qhe qhe) throws IOException {
        if ("max_notification_slots".equals(s)) {
            jsonNotificationSmartActionDetails.c = qhe.T((String)null);
        }
        else if ("target_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonNotificationSmartActionDetails.a = a;
            }
            else {
                jsonNotificationSmartActionDetails.a = null;
            }
        }
        else if ("time_stamp".equals(s)) {
            jsonNotificationSmartActionDetails.b = qhe.T((String)null);
        }
    }
    
    public JsonNotificationSmartActionDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSmartActionDetails jsonNotificationSmartActionDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSmartActionDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSmartActionDetails)o, yfe, b);
    }
}
