// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.common.InvalidJsonFormatException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentScoreCard extends tih<oqs>
{
    @JsonField
    public uyo a;
    
    @Override
    public final Object s() {
        final oqs$a oqs$a = new oqs$a();
        oqs$a.a = this.a;
        oqs oqs;
        if ((oqs = (oqs)((z4j)oqs$a).j()) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(JsonTileContentScoreCard.class.getName());
            sb.append(" parsed error.");
            r9a.d((Throwable)new InvalidJsonFormatException(sb.toString()));
            oqs = null;
        }
        return oqs;
    }
}
