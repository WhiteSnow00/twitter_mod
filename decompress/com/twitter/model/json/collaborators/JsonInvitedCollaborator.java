// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.collaborators;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonInvitedCollaborator extends tih<ro4>
{
    @JsonField(name = { "collab_invitation_status" })
    public so4 a;
    @JsonField(name = { "collaborator", "collaborator_user" })
    public qgv b;
    
    @Override
    public final Object s() {
        return new ro4(this.a, this.b);
    }
}
