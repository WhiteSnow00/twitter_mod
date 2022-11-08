// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.unifiedcard.componentitems;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.unifiedcard.components.JsonTextContent;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicDetail extends aih<dlt>
{
    @JsonField
    public JsonTextContent a;
    @JsonField
    public JsonTextContent b;
    
    public final dlt t() {
        final dlt$a dlt$a = new dlt$a();
        final String a = this.a.a;
        final String s = "";
        String b = a;
        if (a == null) {
            b = "";
        }
        dlt$a.b = b;
        final JsonTextContent b2 = this.b;
        String a2 = s;
        if (b2 != null) {
            a2 = b2.a;
            if (a2 == null) {
                a2 = s;
            }
        }
        dlt$a.c = a2;
        return (dlt)((h4j)dlt$a).e();
    }
}
