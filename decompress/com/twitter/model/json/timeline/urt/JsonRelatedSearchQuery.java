// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import android.text.TextUtils;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRelatedSearchQuery extends tih<wbm>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        Object o;
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            o = null;
        }
        else {
            o = new wbm(this.a);
        }
        return o;
    }
}
