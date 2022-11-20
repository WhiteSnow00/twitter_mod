// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppMetadataByStore$$JsonObjectMapper extends JsonMapper<JsonMobileAppMetadataByStore>
{
    public static JsonMobileAppMetadataByStore _parse(final tge tge) throws IOException {
        final JsonMobileAppMetadataByStore jsonMobileAppMetadataByStore = new JsonMobileAppMetadataByStore();
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
            parseField(jsonMobileAppMetadataByStore, d, tge);
            tge.l0();
        }
        return jsonMobileAppMetadataByStore;
    }
    
    public static void _serialize(final JsonMobileAppMetadataByStore jsonMobileAppMetadataByStore, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final List a = jsonMobileAppMetadataByStore.a;
        if (a != null) {
            final Iterator g = hee.g(afe, "apple_app_store", a);
            while (g.hasNext()) {
                final rch rch = g.next();
                if (rch != null) {
                    LoganSquare.typeConverterFor((Class)rch.class).serialize((Object)rch, "lslocalapple_app_storeElement", false, afe);
                }
            }
            afe.f();
        }
        final List b2 = jsonMobileAppMetadataByStore.b;
        if (b2 != null) {
            final Iterator g2 = hee.g(afe, "google_play_store", b2);
            while (g2.hasNext()) {
                final rch rch2 = g2.next();
                if (rch2 != null) {
                    LoganSquare.typeConverterFor((Class)rch.class).serialize((Object)rch2, "lslocalgoogle_play_storeElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMobileAppMetadataByStore jsonMobileAppMetadataByStore, final String s, final tge tge) throws IOException {
        if ("apple_app_store".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final rch rch = (rch)LoganSquare.typeConverterFor((Class)rch.class).parse(tge);
                    if (rch != null) {
                        a.add(rch);
                    }
                }
                jsonMobileAppMetadataByStore.a = a;
            }
            else {
                jsonMobileAppMetadataByStore.a = null;
            }
        }
        else if ("google_play_store".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final rch rch2 = (rch)LoganSquare.typeConverterFor((Class)rch.class).parse(tge);
                    if (rch2 != null) {
                        b.add(rch2);
                    }
                }
                jsonMobileAppMetadataByStore.b = b;
            }
            else {
                jsonMobileAppMetadataByStore.b = null;
            }
        }
    }
    
    public JsonMobileAppMetadataByStore parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppMetadataByStore jsonMobileAppMetadataByStore, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppMetadataByStore, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppMetadataByStore)o, afe, b);
    }
}
