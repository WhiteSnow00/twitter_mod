// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.common.InvalidJsonFormatException;
import com.twitter.model.json.core.JsonColor;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonScoreEventParticipant extends tih<syo>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public JsonColor e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public l0h j;
    
    @Override
    public final Object s() {
        final syo$a syo$a = new syo$a();
        syo$a.a = this.a;
        syo$a.b = this.b;
        syo$a.c = this.c;
        syo$a.d = this.d;
        final JsonColor e = this.e;
        final syo syo = null;
        ur4 e2;
        if (e == null) {
            e2 = null;
        }
        else {
            final JsonColor e3 = this.e;
            e2 = new ur4((float)e3.d, e3.c, e3.b, e3.a);
        }
        syo$a.e = e2;
        syo$a.f = this.f;
        syo$a.g = this.g;
        syo$a.h = this.h;
        syo$a.i = this.i;
        syo$a.j = this.j;
        syo syo2 = (syo)((z4j)syo$a).j();
        if (syo2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(JsonScoreEventParticipant.class.getName());
            sb.append(" parsed error.");
            r9a.d((Throwable)new InvalidJsonFormatException(sb.toString()));
            syo2 = syo;
        }
        return syo2;
    }
}
