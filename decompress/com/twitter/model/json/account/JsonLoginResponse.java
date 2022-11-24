// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.twitter.util.user.UserIdentifier;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLoginResponse extends tih<lbg>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(name = { "login_verification_request_id" })
    public String c;
    @JsonField(name = { "login_verification_request_url" })
    public String d;
    @JsonField
    public String e;
    @JsonField(name = { "login_verification_user_id" })
    public long f;
    @JsonField(name = { "login_verification_request_type" })
    public int g;
    @JsonField(name = { "login_verification_request_cause" })
    public int h;
    
    @Override
    public final Object s() {
        lbg lbg;
        if (flr.g((CharSequence)this.a)) {
            lbg = new lbg(this.a, this.b, this.e);
        }
        else {
            lbg = new lbg(UserIdentifier.fromId(this.f), this.c, this.g, this.d, this.h);
        }
        return lbg;
    }
}
