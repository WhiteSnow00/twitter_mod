// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetContext extends tih<ufu>
{
    @JsonField(name = { "contextType" })
    public cee a;
    @JsonField
    public String b;
    @JsonField
    public List<String> c;
    @JsonField
    public c9t d;
    
    @Override
    public final Object s() {
        final cee a = this.a;
        ufu ufu;
        if (a != null) {
            final ufu.a a2 = new ufu.a();
            a2.a = a.a;
            a2.b = this.b;
            a2.c = this.c;
            a2.d = this.d;
            ufu = (ufu)a2.j();
        }
        else {
            ufu = null;
        }
        return ufu;
    }
}
