// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineModuleItem extends qfe
{
    @JsonField(name = { "entryId" })
    public String a;
    @JsonField(name = { "item" })
    public JsonTimelineItem b;
    @JsonField(name = { "dispensable" })
    public boolean c;
    @JsonField(name = { "treeDisplay" })
    public amh d;
}
