// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppUrlsByStore$$JsonObjectMapper extends JsonMapper<JsonMobileAppUrlsByStore>
{
    public static JsonMobileAppUrlsByStore _parse(final tge tge) throws IOException {
        final JsonMobileAppUrlsByStore jsonMobileAppUrlsByStore = new JsonMobileAppUrlsByStore();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonMobileAppUrlsByStore, d, tge);
            tge.l0();
        }
        return jsonMobileAppUrlsByStore;
    }
    
    public static void _serialize(final JsonMobileAppUrlsByStore jsonMobileAppUrlsByStore, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final List a = jsonMobileAppUrlsByStore.a;
        if (a != null) {
            final Iterator g = hee.g(afe, "apple_app_store", a);
            while (g.hasNext()) {
                afe.r0((String)g.next());
            }
            afe.f();
        }
        final List b2 = jsonMobileAppUrlsByStore.b;
        if (b2 != null) {
            final Iterator g2 = hee.g(afe, "google_play_store", b2);
            while (g2.hasNext()) {
                afe.r0((String)g2.next());
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMobileAppUrlsByStore jsonMobileAppUrlsByStore, final String s, final tge tge) throws IOException {
        if ("apple_app_store".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t = tge.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonMobileAppUrlsByStore.a = a;
            }
            else {
                jsonMobileAppUrlsByStore.a = null;
            }
        }
        else if ("google_play_store".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t2 = tge.T((String)null);
                    if (t2 != null) {
                        b.add(t2);
                    }
                }
                jsonMobileAppUrlsByStore.b = b;
            }
            else {
                jsonMobileAppUrlsByStore.b = null;
            }
        }
    }
    
    public JsonMobileAppUrlsByStore parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppUrlsByStore jsonMobileAppUrlsByStore, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppUrlsByStore, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppUrlsByStore)o, afe, b);
    }
}
