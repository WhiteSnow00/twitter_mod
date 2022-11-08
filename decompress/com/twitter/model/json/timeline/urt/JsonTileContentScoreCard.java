// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.common.InvalidJsonFormatException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentScoreCard extends aih<eps>
{
    @JsonField
    public jxo a;
    
    @Override
    public final Object s() {
        final eps$a eps$a = new eps$a();
        eps$a.a = this.a;
        eps eps;
        if ((eps = (eps)((h4j)eps$a).j()) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(JsonTileContentScoreCard.class.getName());
            sb.append(" parsed error.");
            e9a.d((Throwable)new InvalidJsonFormatException(sb.toString()));
            eps = null;
        }
        return eps;
    }
}
