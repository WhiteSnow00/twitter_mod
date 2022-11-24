// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEmailNotificationSettingsInput extends nge
{
    @JsonField
    public Boolean a;
    @JsonField
    public Boolean b;
    @JsonField
    public Boolean c;
    @JsonField
    public Boolean d;
    @JsonField
    public Boolean e;
    @JsonField
    public Boolean f;
    @JsonField
    public Boolean g;
    @JsonField
    public Boolean h;
    @JsonField
    public Boolean i;
    @JsonField
    public Boolean j;
    @JsonField
    public Boolean k;
    @JsonField
    public Boolean l;
    @JsonField
    public Boolean m;
    @JsonField
    public Boolean n;
    @JsonField
    public Boolean o;
    @JsonField
    public Boolean p;
    @JsonField(typeConverter = kfe.class)
    public j0a q;
    @JsonField(typeConverter = lfe.class)
    public k0a r;
    
    public JsonEmailNotificationSettingsInput() {
        this.q = j0a.K0;
        this.r = k0a.I0;
    }
}
