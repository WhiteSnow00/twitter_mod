// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.api;

import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lcom/twitter/app/profiles/api/EditVerifiedPhoneContentViewResult;", "Lvn6;", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "()V", "feature.tfa.profiles.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class EditVerifiedPhoneContentViewResult implements vn6
{
    public static final EditVerifiedPhoneContentViewResult INSTANCE;
    
    static {
        INSTANCE = new EditVerifiedPhoneContentViewResult();
        $cachedSerializer$delegate = rp2.y0(2, (otb)EditVerifiedPhoneContentViewResult$a.C0);
    }
    
    private EditVerifiedPhoneContentViewResult() {
    }
    
    private final /* synthetic */ gxe get$cachedSerializer$delegate() {
        return EditVerifiedPhoneContentViewResult.$cachedSerializer$delegate;
    }
    
    public final KSerializer<EditVerifiedPhoneContentViewResult> serializer() {
        return (KSerializer<EditVerifiedPhoneContentViewResult>)this.get$cachedSerializer$delegate().getValue();
    }
}
