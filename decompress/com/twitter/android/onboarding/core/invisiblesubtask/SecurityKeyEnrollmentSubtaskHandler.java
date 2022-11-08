// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.invisiblesubtask;

import com.google.android.gms.common.api.a$d;
import com.google.android.gms.common.api.b;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import j$.util.stream.Stream;
import kotlinx.serialization.json.JsonObject;
import com.google.android.gms.common.api.a$b;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.e;
import java.util.List;
import com.google.android.gms.fido.fido2.api.common.d;
import com.google.android.gms.fido.fido2.api.common.c;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.util.Base64;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonElement;
import java.util.Objects;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.app.Activity;
import kotlin.Metadata;

@a91
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/android/onboarding/core/invisiblesubtask/SecurityKeyEnrollmentSubtaskHandler;", "Lp0e;", "Lmap;", "Companion", "a", "b", "c", "feature.tfa.onboarding.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class SecurityKeyEnrollmentSubtaskHandler implements p0e<map>
{
    public static final a Companion;
    public final Activity a;
    public final pca<bo> b;
    public final NavigationHandler c;
    public final jxa d;
    public boolean e;
    
    static {
        Companion = new a();
    }
    
    public SecurityKeyEnrollmentSubtaskHandler(final Activity a, final pca<bo> b, final sso sso, final NavigationHandler c) {
        zzd.f((Object)a, "activity");
        zzd.f((Object)b, "activityResultObservable");
        zzd.f((Object)sso, "savedStateHandler");
        zzd.f((Object)c, "navigationHandler");
        final jxa d = new jxa(a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        sso.b((Object)this);
    }
    
    public final void a(final asr asr) {
        final map map = (map)asr;
        ro.b((pca)this.b, 1001, (rtb)new rap(this, map));
        if (this.e) {
            cag.g("SecurityKeyEnrollmentSubtaskHandler", "fido registration already in progress");
        }
        else {
            final String j = ((xap)((asr)map).b).j;
            final AttestationConveyancePreference d0 = AttestationConveyancePreference.D0;
            final Object o = null;
            Object o3 = null;
            try {
                final yce$a d2 = yce.d;
                Objects.requireNonNull(d2);
                zzd.f((Object)j, "string");
                final JsonObject s = bfe.s((JsonElement)((yce)d2).b((DeserializationStrategy)JsonElementSerializer.INSTANCE, j));
                final Object value = s.get((Object)"challenge");
                zzd.c(value);
                final byte[] decode = Base64.decode(bfe.t((JsonElement)value).getContent(), 11);
                Objects.requireNonNull(decode, "null reference");
                final Object value2 = s.get((Object)"rp");
                zzd.c(value2);
                final JsonObject s2 = bfe.s((JsonElement)value2);
                final Object value3 = s2.get((Object)"id");
                zzd.c(value3);
                final String content = bfe.t((JsonElement)value3).getContent();
                final Object value4 = s2.get((Object)"name");
                zzd.c(value4);
                final String content2 = bfe.t((JsonElement)value4).getContent();
                final JsonElement jsonElement = (JsonElement)s2.get((Object)"icon");
                String content3;
                if (jsonElement != null) {
                    content3 = bfe.t(jsonElement).getContent();
                }
                else {
                    content3 = null;
                }
                final sml sml = new sml(content, content2, content3);
                final Object value5 = s.get((Object)"user");
                zzd.c(value5);
                final JsonObject s3 = bfe.s((JsonElement)value5);
                final Object value6 = s3.get((Object)"id");
                zzd.c(value6);
                final byte[] bytes = bfe.t((JsonElement)value6).getContent().getBytes(zt3.b);
                zzd.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
                final Object value7 = s3.get((Object)"name");
                zzd.c(value7);
                final String content4 = bfe.t((JsonElement)value7).getContent();
                final Object value8 = s3.get((Object)"displayName");
                zzd.c(value8);
                final tml tml = new tml(bytes, content4, (String)null, bfe.t((JsonElement)value8).getContent());
                final JsonElement jsonElement2 = (JsonElement)s.get((Object)"pubKeyCredParams");
                Object o2 = null;
                Label_0467: {
                    if (jsonElement2 != null) {
                        final Stream stream = Collection$_EL.stream((Collection)bfe.r(jsonElement2));
                        if (stream != null) {
                            final Stream map2 = stream.map((Function)new oap((rtb)tap.C0));
                            if (map2 != null) {
                                final Stream map3 = map2.map((Function)new pap((rtb)uap.C0));
                                if (map3 != null) {
                                    o2 = r9x.E(map3);
                                    break Label_0467;
                                }
                            }
                        }
                    }
                    o2 = v2a.C0;
                }
                final JsonElement jsonElement3 = (JsonElement)s.get((Object)"timeout");
                Double value9;
                if (jsonElement3 != null) {
                    value9 = Double.valueOf(Long.parseLong(bfe.t(jsonElement3).getContent()));
                }
                else {
                    value9 = null;
                }
                final Object value10 = s.get((Object)"excludeCredentials");
                zzd.c(value10);
                final Stream map4 = Collection$_EL.stream((Collection)bfe.r((JsonElement)value10)).map((Function)new nap((rtb)vap.C0, 0)).map((Function)new qap((rtb)wap.C0));
                zzd.e((Object)map4, "challenge[\"excludeCreden\u2026  )\n                    }");
                final List e = r9x.E(map4);
                final Object value11 = s.get((Object)"attestation");
                zzd.c(value11);
                final String content5 = bfe.t((JsonElement)value11).getContent();
                final int hashCode = content5.hashCode();
                AttestationConveyancePreference attestationConveyancePreference;
                if (hashCode != -1331586071) {
                    if (hashCode != 3387192) {
                        if (hashCode != 116029774) {
                            attestationConveyancePreference = d0;
                        }
                        else if (!content5.equals("indirect")) {
                            attestationConveyancePreference = d0;
                        }
                        else {
                            attestationConveyancePreference = AttestationConveyancePreference.E0;
                        }
                    }
                    else {
                        content5.equals("none");
                        attestationConveyancePreference = d0;
                    }
                }
                else if (!content5.equals("direct")) {
                    attestationConveyancePreference = d0;
                }
                else {
                    attestationConveyancePreference = AttestationConveyancePreference.F0;
                }
                final com.google.android.gms.fido.fido2.api.common.d d3 = new com.google.android.gms.fido.fido2.api.common.d(sml, tml, decode, (List<e>)o2, value9, e, new com.google.android.gms.fido.fido2.api.common.c("cross-platform", null, null), null, null, attestationConveyancePreference.C0, null);
            }
            finally {
                o3 = o;
            }
            if (o3 == null) {
                this.b(map, "unable to parse challenge json for fido registration request");
            }
            else {
                final jxa d4 = this.d;
                Objects.requireNonNull(d4);
                final dbs$a dbs$a = new dbs$a();
                dbs$a.a = (jcm)new w3c((Object)d4, o3);
                final zas<Object> k = ((com.google.android.gms.common.api.b<a$d>)d4).k(0, (dbs<a$b, Object>)dbs$a.a());
                k.h(this.a, (ujj)new ku9((rtb)new sap(this), 0));
                k.e(this.a, (eij)new n4w((Object)this, (Object)map));
            }
        }
    }
    
    public final void b(final map map, final String s) {
        cag.g("SecurityKeyEnrollmentSubtaskHandler", s);
        this.c.e(((xap)((asr)map).b).l);
    }
    
    public static final class a
    {
    }
    
    public static final class b extends p0e$a<map>
    {
        public b() {
            super((Class)map.class);
        }
    }
    
    public static final class c extends p0e$b<map>
    {
        public c(final b b, final fxe<SecurityKeyEnrollmentSubtaskHandler> fxe) {
            zzd.f((Object)b, "matcher");
            zzd.f((Object)fxe, "handler");
            super((p0e$a)b, (fxe)fxe);
        }
    }
}
