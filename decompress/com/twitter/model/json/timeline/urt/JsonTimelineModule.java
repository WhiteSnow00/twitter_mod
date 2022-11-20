// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineModule extends qfe implements JsonTimelineEntry$a
{
    @JsonField(name = { "items" })
    public List<JsonTimelineModuleItem> a;
    @JsonField(name = { "header" })
    public rlh b;
    @JsonField(name = { "footer" })
    public ilh c;
    @JsonField(name = { "displayType", "moduleDisplayType" })
    public String d;
    @JsonField(name = { "clientEventInfo" })
    public JsonClientEventInfo e;
    @JsonField(name = { "feedbackInfo" })
    public qvs f;
    @JsonField(name = { "metadata" })
    public c0t g;
    @JsonField(name = { "showMoreBehavior" }, typeConverter = c.class)
    public d0t h;
}
