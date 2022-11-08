// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUrl extends aih<q7t>
{
    @JsonField
    public String a;
    @JsonField(name = { "url_type", "urlType" }, typeConverter = JsonTimelineUrl.JsonTimelineUrl$a.class)
    public int b;
    @JsonField
    public fov c;
    
    @Override
    public final Object s() {
        final int b = this.b;
        Object o;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    o = null;
                }
                else {
                    final y6w$a y6w$a = new y6w$a();
                    y6w$a.a = this.a;
                    y6w$a.b = this.c;
                    o = ((h4j)y6w$a).j();
                }
            }
            else {
                final zdf.a a = new zdf.a();
                a.a = this.a;
                a.b = this.c;
                o = a.j();
            }
        }
        else {
            final zdf.a a2 = new zdf.a();
            a2.a = this.a;
            o = a2.j();
        }
        return o;
    }
}
