// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSocialContext extends tih<o5t>
{
    @JsonField(name = { "generalContext" })
    public JsonSocialContext.JsonSocialContext$JsonGeneralContext a;
    @JsonField(name = { "topicContext" })
    public JsonTopicContext b;
    
    @Override
    public final Object s() {
        final JsonSocialContext.JsonSocialContext$JsonGeneralContext a = this.a;
        o5t o5t;
        if (a != null) {
            final agv.b b = new agv.b();
            b.j = a.a.a;
            b.k = a.b;
            b.l = a.c;
            b.m = a.d;
            o5t = (o5t)b.j();
        }
        else {
            final JsonTopicContext b2 = this.b;
            if (b2 != null) {
                final lxd b3 = b2.b;
                String a2;
                if (b3 != null) {
                    a2 = b3.a;
                }
                else {
                    a2 = b2.a;
                }
                final bmt$a bmt$a = new bmt$a();
                bmt$a.a = a2;
                bmt$a.b = b2.c;
                bmt$a.c = b2.d;
                bmt$a.d = b2.e;
                o5t = (o5t)((z4j)bmt$a).j();
            }
            else {
                o5t = null;
            }
        }
        return o5t;
    }
    
    @JsonObject
    public static class JsonTopicContext extends tih<bmt>
    {
        @JsonField
        public String a;
        @JsonField
        public lxd b;
        @JsonField(typeConverter = hmt.class)
        public int c;
        @JsonField
        public fym d;
        @JsonField
        public fym e;
        
        public JsonTopicContext() {
            this.c = 1;
        }
        
        @Override
        public final /* bridge */ Object s() {
            return this.t();
        }
        
        public final bmt t() {
            if (this.b != null) {
                y4c.d().o(this.b);
                this.a = this.b.a;
            }
            bmt bmt;
            if (flr.g((CharSequence)this.a)) {
                final bmt$a bmt$a = new bmt$a();
                bmt$a.b = this.c;
                bmt$a.a = this.a;
                bmt$a.c = this.d;
                bmt$a.d = this.e;
                bmt = (bmt)((z4j)bmt$a).e();
            }
            else {
                bmt = null;
            }
            return bmt;
        }
    }
}
