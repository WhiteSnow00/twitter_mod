// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import java.util.Locale;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUiLink extends tih<dtv>
{
    @JsonField(typeConverter = ubi.class)
    public int a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public boolean f;
    @JsonField
    public boolean g;
    @JsonField
    public vtr h;
    @JsonField
    public List<g0p> i;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final dtv t() {
        final int a = this.a;
        Object o = null;
        switch (a) {
            default: {
                fj1.h(String.format(Locale.US, "Unsupported navigation link %d, %s %s", a, this.b, this.c));
                o = new hpi();
                break;
            }
            case 9: {
                final String b = this.b;
                vmw.f(b);
                o = new rd8(b);
                break;
            }
            case 8: {
                final String b2 = this.b;
                vmw.f(b2);
                o = new na4(b2);
                break;
            }
            case 7: {
                final String b3 = this.b;
                vmw.f(b3);
                o = new mmx(b3);
                break;
            }
            case 6: {
                final String b4 = this.b;
                vmw.f(b4);
                o = new ld8(b4);
                break;
            }
            case 5: {
                final String b5 = this.b;
                vmw.f(b5);
                o = new sd8(b5);
                break;
            }
            case 4: {
                o = new c7();
                break;
            }
            case 3: {
                o = new v0b();
                break;
            }
            case 2: {
                final String c = this.c;
                vmw.f(c);
                o = new xtr(c, this.h, this.f);
                break;
            }
            case 1: {
                o = new dds();
                break;
            }
        }
        return new dtv((qbi)o, this.e, this.d, this.g, this.i);
    }
}
