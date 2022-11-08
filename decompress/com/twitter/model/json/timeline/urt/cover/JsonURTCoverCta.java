// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCoverCta extends aih<snv>
{
    @JsonField
    public String a;
    @JsonField
    public snv$a b;
    @JsonField
    public List<lnv> c;
    @JsonField
    public qzo d;
    @JsonField(typeConverter = q53.class)
    public int e;
    @JsonField(typeConverter = wke.class)
    public uov f;
    
    @Override
    public final Object s() {
        if (pjr.g((CharSequence)this.a)) {
            final snv$a b = this.b;
            if (b != null) {
                final String a = this.a;
                Object o;
                if ((o = this.c) == null) {
                    o = v2a.C0;
                }
                final qzo d = this.d;
                final int e = this.e;
                uov f = this.f;
                final uov d2 = uov.D0;
                if (f == null) {
                    f = d2;
                }
                return new snv(a, b, (List)o, d, e, f);
            }
        }
        return null;
    }
}
