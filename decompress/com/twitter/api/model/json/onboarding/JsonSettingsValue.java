// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.onboarding;

import com.twitter.model.json.onboarding.JsonToggleWrapperContent;
import android.annotation.SuppressLint;
import com.twitter.model.json.onboarding.JsonOcfHorizonIcon;
import com.twitter.model.json.onboarding.JsonButtonAppearance;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.twitter.model.json.onboarding.ocf.JsonUiLink;
import java.util.List;
import com.twitter.model.json.onboarding.JsonImageInfo;
import com.twitter.api.model.json.core.JsonApiTweet;
import java.util.Objects;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingsValue extends aih<fqp>
{
    @Deprecated
    @JsonField
    public JsonOcfRichText a;
    @Deprecated
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField(typeConverter = gqp.class)
    public int d;
    @JsonField
    public JsonSettingsValue.JsonSettingsValue$JsonValueData e;
    
    public final <T extends fqp.a<? extends fqp, T>> T t(final T t) {
        t.a = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        t.b = JsonOcfRichText.s(this.b);
        t.c = this.c;
        t.d = this.d;
        return t;
    }
    
    public final fqp u() {
        switch (this.d) {
            default: {
                final v1j.a a = new v1j.a();
                this.t(a);
                return (fqp)a.e();
            }
            case 17: {
                final cj3$a u = this.e.o.u();
                this.t(u);
                return (fqp)((h4j)u).e();
            }
            case 16: {
                final JsonSpacerData n = this.e.n;
                Objects.requireNonNull(n);
                final nnq$a nnq$a = new nnq$a();
                nnq$a.e = n.a;
                this.t(nnq$a);
                return (fqp)((h4j)nnq$a).e();
            }
            case 15: {
                final JsonAlertExampleData m = this.e.m;
                this.a = m.a;
                this.b = m.b;
                final xw$b u2 = m.u();
                this.t(u2);
                return (fqp)((h4j)u2).e();
            }
            case 14: {
                final JsonInfoItemData l = this.e.l;
                this.a = l.a;
                final qmd$a u3 = l.u();
                this.t(u3);
                return (fqp)((h4j)u3).e();
            }
            case 13: {
                final b9d$a u4 = this.e.k.u();
                this.t(u4);
                return (fqp)((h4j)u4).e();
            }
            case 12: {
                final i53$a u5 = this.e.j.u();
                this.t(u5);
                return (fqp)((h4j)u5).e();
            }
            case 11: {
                final JsonButtonItemData i = this.e.i;
                this.a = i.d;
                this.b = i.e;
                final a53$a u6 = i.u();
                this.t(u6);
                return (fqp)((h4j)u6).e();
            }
            case 10: {
                final JsonTweetData h = this.e.h;
                Objects.requireNonNull(h);
                final wru$a wru$a = new wru$a();
                final JsonApiTweet a2 = h.a;
                if (a2 != null) {
                    final rh0 e = ((lhh<rh0>)a2).s();
                    if (e != null) {
                        wru$a.e = e;
                    }
                }
                this.t(wru$a);
                return (fqp)((h4j)wru$a).e();
            }
            case 9: {
                final tft$a u7 = this.e.g.u();
                this.t(u7);
                return (fqp)((h4j)u7).e();
            }
            case 8: {
                final JsonProgressIndicatorData f = this.e.f;
                this.a = f.a;
                this.b = f.b;
                final fhl$a u8 = f.u();
                this.t(u8);
                return (fqp)((h4j)u8).e();
            }
            case 7: {
                final JsonListData e2 = this.e.e;
                Objects.requireNonNull(e2);
                final kmf$a kmf$a = new kmf$a();
                kmf$a.e = e2.a;
                kmf$a.f = e2.b;
                kmf$a.g = e2.c;
                this.t(kmf$a);
                return (fqp)((h4j)kmf$a).e();
            }
            case 5: {
                final JsonGroupSettingsData d = this.e.d;
                Objects.requireNonNull(d);
                final i9c$a i9c$a = new i9c$a();
                i9c$a.e = d.a;
                i9c$a.f = d.b;
                this.t(i9c$a);
                return (fqp)((h4j)i9c$a).e();
            }
            case 4: {
                final dl$b u9 = this.e.c.u();
                u9.f = true;
                this.t(u9);
                return (fqp)((h4j)u9).e();
            }
            case 3: {
                final dl$b u10 = this.e.c.u();
                this.t(u10);
                return (fqp)((h4j)u10).e();
            }
            case 2:
            case 6: {
                final JsonBooleanData b = this.e.b;
                Objects.requireNonNull(b);
                final n72$b n72$b = new n72$b();
                n72$b.e = b.a;
                this.t(n72$b);
                return (fqp)((h4j)n72$b).e();
            }
            case 1: {
                final JsonSettingsValue.JsonSettingsValue$JsonValueData e3 = this.e;
                u9r.a a6 = null;
                Label_0760: {
                    if (e3 != null) {
                        final JsonStaticTextData a3 = e3.a;
                        if (a3 != null) {
                            final u9r.a u11 = a3.u();
                            final JsonStaticTextData a4 = this.e.a;
                            final JsonOcfRichText a5 = a4.a;
                            if (a5 != null) {
                                this.a = a5;
                            }
                            final JsonOcfRichText b2 = a4.b;
                            a6 = u11;
                            if (b2 != null) {
                                this.b = b2;
                                a6 = u11;
                            }
                            break Label_0760;
                        }
                    }
                    a6 = new u9r.a();
                }
                this.t(a6);
                return (fqp)a6.e();
            }
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonActionData extends lhh<dl>
    {
        @JsonField
        public xrv a;
        
        public final dl$b u() {
            final dl$b dl$b = new dl$b();
            dl$b.e = this.a;
            return dl$b;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonAlertExampleData extends lhh<xw>
    {
        @JsonField
        public JsonOcfRichText a;
        @JsonField
        public JsonOcfRichText b;
        @JsonField
        public JsonImageInfo c;
        @JsonField
        public List<JsonOcfRichText> d;
        @JsonField
        public int e;
        @JsonField
        public JsonUiLink f;
        
        public final xw$b u() {
            final xw$b xw$b = new xw$b();
            ((fqp.a)xw$b).a = JsonOcfRichText.s(this.a);
            final int a = w4j.a;
            ((fqp.a)xw$b).b = JsonOcfRichText.s(this.b);
            xw$b.e = this.c.a;
            final List f = (List)Collection$_EL.stream((Collection)this.d).map((Function)oie.a).collect(Collectors.toList());
            zzd.f((Object)f, "buttonLabels");
            xw$b.f = f;
            xw$b.g = this.e;
            xw$b.h = this.f.t();
            return xw$b;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonBooleanData extends lhh<n72>
    {
        @JsonField
        public boolean a;
        
        @Override
        public final h4j t() {
            final n72$b n72$b = new n72$b();
            n72$b.e = this.a;
            return (h4j)n72$b;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonButtonData extends lhh<i53>
    {
        @JsonField
        public xrv a;
        @JsonField
        public JsonOcfRichText b;
        @JsonField
        public JsonButtonAppearance c;
        
        public final i53$a u() {
            final ecj.a a = new ecj.a();
            a.o(this.a);
            a.f = this.b.a;
            final JsonButtonAppearance c = this.c;
            a.c = c.a;
            a.p(c.b);
            final JsonButtonAppearance c2 = this.c;
            if (c2 != null) {
                a.b = c2.c;
                final hdj d = c2.d;
                if (d != null) {
                    a.e = d;
                }
            }
            final i53$a i53$a = new i53$a();
            i53$a.e = (ecj)a.e();
            return i53$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonButtonItemData extends lhh<a53>
    {
        @JsonField
        public xrv a;
        @JsonField
        public JsonOcfRichText b;
        @JsonField
        public JsonButtonAppearance c;
        @JsonField
        public JsonOcfRichText d;
        @JsonField
        public JsonOcfRichText e;
        
        public final a53$a u() {
            final ecj.a a = new ecj.a();
            a.o(this.a);
            a.f = this.b.a;
            final JsonButtonAppearance c = this.c;
            a.c = c.a;
            a.p(c.b);
            final ecj e = (ecj)a.e();
            final a53$a a53$a = new a53$a();
            ((fqp.a)a53$a).a = JsonOcfRichText.s(this.d);
            final int a2 = w4j.a;
            ((fqp.a)a53$a).b = JsonOcfRichText.s(this.e);
            a53$a.e = e;
            return a53$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonCardWrapperData extends lhh<cj3>
    {
        @JsonField
        public List<JsonSettingsValue> a;
        
        public final cj3$a u() {
            final cj3$a cj3$a = new cj3$a();
            final List e = (List)Collection$_EL.stream((Collection)this.a).map((Function)pie.a).collect(Collectors.toList());
            zzd.f((Object)e, "components");
            cj3$a.e = e;
            return cj3$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonGroupSettingsData extends lhh<i9c>
    {
        @JsonField
        public List<fqp> a;
        @JsonField
        public List<mxm> b;
        
        @Override
        public final h4j t() {
            final i9c$a i9c$a = new i9c$a();
            i9c$a.e = this.a;
            i9c$a.f = this.b;
            return (h4j)i9c$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonImageData extends lhh<b9d>
    {
        @JsonField
        public JsonImageInfo a;
        @JsonField(typeConverter = s8d.class)
        public int b;
        
        public final b9d$a u() {
            final b9d$a b9d$a = new b9d$a();
            final v7d a = this.a.a;
            zzd.f((Object)a, "imageModel");
            b9d$a.f = a;
            b9d$a.e = this.b;
            return b9d$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonInfoItemData extends lhh<qmd>
    {
        @JsonField
        public JsonOcfRichText a;
        @JsonField
        public JsonOcfHorizonIcon b;
        @JsonField(typeConverter = tmd.class)
        public int c;
        
        public final qmd$a u() {
            final qmd$a qmd$a = new qmd$a();
            ((fqp.a)qmd$a).a = JsonOcfRichText.s(this.a);
            final int a = w4j.a;
            final hdj a2 = this.b.a;
            zzd.f((Object)a2, "icon");
            qmd$a.e = a2;
            qmd$a.f = this.c;
            return qmd$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonListData extends lhh<kmf>
    {
        @JsonField
        public List<t94> a;
        @JsonField
        public List<String> b;
        @JsonField
        public boolean c;
        
        @Override
        public final h4j t() {
            final kmf$a kmf$a = new kmf$a();
            kmf$a.e = this.a;
            kmf$a.f = this.b;
            kmf$a.g = this.c;
            return (h4j)kmf$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonProgressIndicatorData extends lhh<fhl>
    {
        @JsonField
        public JsonOcfRichText a;
        @JsonField
        public JsonOcfRichText b;
        @JsonField
        public Integer c;
        
        public final fhl$a u() {
            final fhl$a fhl$a = new fhl$a();
            ((fqp.a)fhl$a).a = JsonOcfRichText.s(this.a);
            final int a = w4j.a;
            ((fqp.a)fhl$a).b = JsonOcfRichText.s(this.b);
            fhl$a.e = this.c;
            return fhl$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonSpacerData extends lhh<nnq>
    {
        @JsonField
        public int a;
        
        @Override
        public final h4j t() {
            final nnq$a nnq$a = new nnq$a();
            nnq$a.e = this.a;
            return (h4j)nnq$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonStaticTextData extends lhh<u9r>
    {
        @JsonField
        public JsonOcfRichText a;
        @JsonField
        public JsonOcfRichText b;
        @SuppressLint({ "NullableEnum" })
        @JsonField(typeConverter = u9r$d.class)
        public u9r$c c;
        
        public final u9r.a u() {
            final u9r.a a = new u9r.a();
            a.a = JsonOcfRichText.s(this.a);
            final int a2 = w4j.a;
            a.b = JsonOcfRichText.s(this.b);
            final u9r$c c = this.c;
            if (c != null) {
                zzd.f((Object)c, "style");
                a.e = c;
            }
            return a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonToggleWrapperData extends lhh<tft>
    {
        @JsonField
        public JsonOcfRichText a;
        @JsonField
        public Boolean b;
        @JsonField
        public JsonToggleWrapperContent c;
        @JsonField
        public JsonToggleWrapperContent d;
        @SuppressLint({ "NullableEnum" })
        @JsonField(typeConverter = tft$e.class)
        public tft$d e;
        
        public final tft$a u() {
            final tft$a tft$a = new tft$a();
            boolean b = false;
            Label_0068: {
                if (this.a != null && this.b != null) {
                    final JsonToggleWrapperContent c = this.c;
                    if (c != null && c.u()) {
                        final JsonToggleWrapperContent d = this.d;
                        if (d != null && d.u() && this.e != null) {
                            b = true;
                            break Label_0068;
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                return tft$a;
            }
            final tft$d e = this.e;
            zzd.f((Object)e, "toggleWrapperStyle");
            tft$a.j = e;
            tft$a.h = this.b;
            tft$a.i = true;
            final xdj s = JsonOcfRichText.s(this.a);
            final tft$b v = this.c.v();
            final tft$b v2 = this.d.v();
            if (s != null) {
                tft$a.g = s;
            }
            if (v != null) {
                tft$a.f = v;
            }
            if (v2 != null) {
                tft$a.e = v2;
            }
            return tft$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonTweetData extends lhh<wru>
    {
        @JsonField
        public JsonApiTweet a;
        
        @Override
        public final h4j t() {
            final wru$a wru$a = new wru$a();
            final JsonApiTweet a = this.a;
            if (a != null) {
                final rh0 e = ((lhh<rh0>)a).s();
                if (e != null) {
                    wru$a.e = e;
                }
            }
            return (h4j)wru$a;
        }
    }
}
