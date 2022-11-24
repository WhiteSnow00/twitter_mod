// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUrl extends tih<c9t>
{
    @JsonField
    public String a;
    @JsonField(name = { "url_type", "urlType" }, typeConverter = JsonTimelineUrl.JsonTimelineUrl$a.class)
    public int b;
    @JsonField
    public ppv c;
    
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
                    final x7w.a a = new x7w.a();
                    a.a = this.a;
                    a.b = this.c;
                    o = a.j();
                }
            }
            else {
                final ief$a ief$a = new ief$a();
                ief$a.a = this.a;
                ief$a.b = this.c;
                o = ((z4j)ief$a).j();
            }
        }
        else {
            final ief$a ief$a2 = new ief$a();
            ief$a2.a = this.a;
            o = ((z4j)ief$a2).j();
        }
        return o;
    }
}
