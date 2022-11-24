// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonShowAlertInstruction extends tih<lwv>
{
    @JsonField
    public bx a;
    @JsonField
    public xw b;
    @JsonField
    public ats c;
    @JsonField
    public JsonClientEventInfo d;
    @JsonField
    public fym e;
    @JsonField
    public List<String> f;
    @JsonField
    public List<ziw> g;
    @JsonField
    public long h;
    @JsonField
    public long i;
    @JsonField
    public long j;
    @JsonField
    public zss k;
    @JsonField
    public vss l;
    
    @Override
    public final Object s() {
        if (this.a == bx.H0) {
            final ats c = this.c;
            if (c == null) {
                return null;
            }
            if (flr.e((CharSequence)c.a)) {
                return null;
            }
        }
        final bx a = this.a;
        if (a != null && a != bx.F0) {
            final ArrayList g = this.g;
            if (g != null) {
                this.f = y4c.a(g, true);
            }
            return new lwv(new yss(this.a, this.b, this.h, this.i, this.j, this.f, this.e, this.k, this.l), yih.b(this.d), this.c);
        }
        return null;
    }
    
    @JsonObject
    public static class JsonAlertColorConfig extends tih<vss>
    {
        @JsonField
        public wov a;
        @JsonField
        public wov b;
        @JsonField
        public wov c;
        
        @Override
        public final Object s() {
            return new vss(this.a, this.b, this.c);
        }
    }
    
    @JsonObject
    public static class JsonAlertIconDisplay extends tih<zss>
    {
        @JsonField
        public zw a;
        @JsonField
        public wov b;
        @JsonField
        public ax c;
        
        @Override
        public final Object s() {
            return new zss(this.a, this.b, this.c);
        }
    }
    
    @JsonObject
    public static class JsonAlertNavigationMetadata extends tih<ats>
    {
        @JsonField
        public String a;
        
        @Override
        public final Object s() {
            return new ats(this.a);
        }
    }
}
