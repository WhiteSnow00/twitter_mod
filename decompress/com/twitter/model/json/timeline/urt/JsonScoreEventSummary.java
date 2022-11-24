// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.common.InvalidJsonFormatException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonScoreEventSummary extends tih<uyo>
{
    @JsonField
    public pyo a;
    @JsonField(name = { "displayType" })
    public vyo b;
    
    @Override
    public final Object s() {
        final uyo$a uyo$a = new uyo$a();
        uyo$a.a = this.a;
        vyo b;
        if ((b = this.b) == null) {
            b = vyo.G0;
        }
        uyo$a.b = b;
        uyo uyo;
        if ((uyo = (uyo)((z4j)uyo$a).j()) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(JsonScoreEventSummary.class.getName());
            sb.append(" parsed error.");
            r9a.d((Throwable)new InvalidJsonFormatException(sb.toString()));
            uyo = null;
        }
        return uyo;
    }
}
