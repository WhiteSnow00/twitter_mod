// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineConversationAnnotation extends aih<nts>
{
    @JsonField(typeConverter = lq6.class)
    public int a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        final nts$a nts$a = new nts$a();
        nts$a.a = this.a;
        nts$a.b = this.b;
        nts$a.c = this.c;
        return ((h4j)nts$a).e();
    }
}
