// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubscriptionProductFeaturesForClient$$JsonObjectMapper extends JsonMapper<JsonSubscriptionProductFeaturesForClient>
{
    public static JsonSubscriptionProductFeaturesForClient _parse(final khe khe) throws IOException {
        final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient = new JsonSubscriptionProductFeaturesForClient();
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
            parseField(jsonSubscriptionProductFeaturesForClient, d, khe);
            khe.m0();
        }
        return jsonSubscriptionProductFeaturesForClient;
    }
    
    public static void _serialize(final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final List a = jsonSubscriptionProductFeaturesForClient.a;
        if (a != null) {
            final Iterator f = x30.F(tfe, "subscription_product_features_for_client", a);
            while (f.hasNext()) {
                final zmr zmr = f.next();
                if (zmr != null) {
                    LoganSquare.typeConverterFor((Class)zmr.class).serialize((Object)zmr, "lslocalsubscription_product_features_for_clientElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient, final String s, final khe khe) throws IOException {
        if ("subscription_product_features_for_client".equals(s)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonSubscriptionProductFeaturesForClient);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (khe.i0() != lje.N0) {
                final zmr zmr = (zmr)LoganSquare.typeConverterFor((Class)zmr.class).parse(khe);
                if (zmr != null) {
                    a.add(zmr);
                }
            }
            Objects.requireNonNull(jsonSubscriptionProductFeaturesForClient);
            jsonSubscriptionProductFeaturesForClient.a = a;
        }
    }
    
    public JsonSubscriptionProductFeaturesForClient parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSubscriptionProductFeaturesForClient jsonSubscriptionProductFeaturesForClient, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSubscriptionProductFeaturesForClient, tfe, b);
    }
}
