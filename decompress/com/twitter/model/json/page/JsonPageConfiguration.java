// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPageConfiguration extends lhh<zrj>
{
    @JsonField
    public String a;
    @JsonField
    public xsj b;
    @JsonField
    public z3t c;
    @JsonField
    public bsj d;
    @JsonField
    public ksj e;
    
    @Override
    public final h4j t() {
        final zrj$a zrj$a = new zrj$a();
        zrj$a.a = this.a;
        zrj$a.b = this.b;
        zrj$a.c = this.c;
        zrj$a.d = this.d;
        zrj$a.e = this.e;
        return (h4j)zrj$a;
    }
}
