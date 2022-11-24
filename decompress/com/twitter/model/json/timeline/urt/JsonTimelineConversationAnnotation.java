// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineConversationAnnotation extends tih<yus>
{
    @JsonField(typeConverter = xq6.class)
    public int a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        final yus$a yus$a = new yus$a();
        yus$a.a = this.a;
        yus$a.b = this.b;
        yus$a.c = this.c;
        return ((z4j)yus$a).e();
    }
}
