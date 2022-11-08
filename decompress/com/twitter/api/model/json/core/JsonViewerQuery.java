// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.core.JsonViewer;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonViewerQuery extends ige
{
    @JsonField
    public JsonViewer a;
    @JsonField(typeConverter = ijw.class)
    public fjw b;
    @JsonField(typeConverter = dde.class)
    public uy c;
    
    public JsonViewerQuery() {
        this.b = fjw.G0;
        this.c = uy.D0;
    }
}
