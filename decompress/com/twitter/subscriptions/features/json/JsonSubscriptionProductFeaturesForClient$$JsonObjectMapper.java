// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubscriptionProductFeaturesForClient$$JsonObjectMapper extends JsonMapper<JsonSubscriptionProductFeaturesForClient>
{
    public static JsonSubscriptionProductFeaturesForClient _parse(final qhe qhe) throws IOException {
        final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient = new JsonSubscriptionProductFeaturesForClient();
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
            parseField(jsonSubscriptionProductFeaturesForClient, d, qhe);
            qhe.m0();
        }
        return jsonSubscriptionProductFeaturesForClient;
    }
    
    public static void _serialize(final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List<por> a = jsonSubscriptionProductFeaturesForClient.a;
        if (a != null) {
            final Iterator o = ffe.o(yfe, "subscription_product_features_for_client", a);
            while (o.hasNext()) {
                final por por = o.next();
                if (por != null) {
                    LoganSquare.typeConverterFor((Class)por.class).serialize((Object)por, "lslocalsubscription_product_features_for_clientElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient, final String s, final qhe qhe) throws IOException {
        if ("subscription_product_features_for_client".equals(s)) {
            if (qhe.e() != rje.P0) {
                Objects.requireNonNull(jsonSubscriptionProductFeaturesForClient);
                e0e.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (qhe.i0() != rje.Q0) {
                final por por = (por)LoganSquare.typeConverterFor((Class)por.class).parse(qhe);
                if (por != null) {
                    a.add(por);
                }
            }
            Objects.requireNonNull(jsonSubscriptionProductFeaturesForClient);
            jsonSubscriptionProductFeaturesForClient.a = a;
        }
    }
    
    public JsonSubscriptionProductFeaturesForClient parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSubscriptionProductFeaturesForClient, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSubscriptionProductFeaturesForClient)o, yfe, b);
    }
}
