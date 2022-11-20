// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonFoundMediaResponse extends fih<smb>
{
    @JsonField
    public hmb a;
    @JsonField
    public gmb b;
    
    public final Object s() {
        final hmb a = this.a;
        Object o = null;
        if (a == null) {
            i48.t("JsonFoundMediaResponse has no data");
        }
        else {
            final gmb b = this.b;
            if (b == null) {
                i48.t("JsonFoundMediaResponse has no cursor");
            }
            else {
                o = new smb(a, b);
            }
        }
        return o;
    }
}
