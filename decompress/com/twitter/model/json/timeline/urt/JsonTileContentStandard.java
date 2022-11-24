// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentStandard extends tih<pqs>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public vg1 c;
    
    @Override
    public final Object s() {
        final pqs.a a = new pqs.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        final pqs pqs = (pqs)a.j();
        if (pqs == null) {
            c0e.i("title or supporting text or both are empty");
        }
        return pqs;
    }
}
