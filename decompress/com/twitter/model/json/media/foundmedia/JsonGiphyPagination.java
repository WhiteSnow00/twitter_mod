// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyPagination extends tih<b4c>
{
    @JsonField(name = { "total_count" })
    public int a;
    @JsonField(name = { "count" })
    public int b;
    @JsonField(name = { "offset" })
    public int c;
    
    @Override
    public final Object s() {
        return new b4c();
    }
}
