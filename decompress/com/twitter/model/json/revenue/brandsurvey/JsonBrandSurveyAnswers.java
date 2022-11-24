// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.revenue.brandsurvey;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonBrandSurveyAnswers extends nge
{
    @JsonField
    public List<List<Integer>> a;
}
