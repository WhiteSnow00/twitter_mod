// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineMoment extends aih<ozs>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(typeConverter = woh.class)
    public int c;
    @JsonField(typeConverter = d.class)
    public d4t d;
    
    public JsonTimelineMoment() {
        this.c = 1;
    }
    
    @Override
    public final Object s() {
        final ozs.a a = new ozs.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = poa.V(this.d);
        return a.j();
    }
}
