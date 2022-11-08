// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonProductSubscriptions$$JsonObjectMapper extends JsonMapper<JsonProductSubscriptions>
{
    public static JsonProductSubscriptions _parse(final khe khe) throws IOException {
        final JsonProductSubscriptions jsonProductSubscriptions = new JsonProductSubscriptions();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonProductSubscriptions, d, khe);
            khe.m0();
        }
        return jsonProductSubscriptions;
    }
    
    public static void _serialize(final JsonProductSubscriptions jsonProductSubscriptions, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final List a = jsonProductSubscriptions.a;
        if (a != null) {
            final Iterator f = x30.F(tfe, "list_product_subscriptions", a);
            while (f.hasNext()) {
                final q3l q3l = f.next();
                if (q3l != null) {
                    LoganSquare.typeConverterFor((Class)q3l.class).serialize((Object)q3l, "lslocallist_product_subscriptionsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonProductSubscriptions jsonProductSubscriptions, final String s, final khe khe) throws IOException {
        if ("list_product_subscriptions".equals(s)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonProductSubscriptions);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (khe.i0() != lje.N0) {
                final q3l q3l = (q3l)LoganSquare.typeConverterFor((Class)q3l.class).parse(khe);
                if (q3l != null) {
                    a.add(q3l);
                }
            }
            Objects.requireNonNull(jsonProductSubscriptions);
            jsonProductSubscriptions.a = a;
        }
    }
    
    public JsonProductSubscriptions parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonProductSubscriptions jsonProductSubscriptions, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonProductSubscriptions, tfe, b);
    }
}
