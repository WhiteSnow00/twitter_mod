// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001¨\u0006\u0012" }, d2 = { "Lcom/twitter/app/safetymode/api/FlaggedAccountsContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "<init>", "()V", "", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILdmp;)V", "Companion", "$serializer", "feature.tfa.safety-mode.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class FlaggedAccountsContentViewArgs implements ContentViewArgs
{
    public static final FlaggedAccountsContentViewArgs.FlaggedAccountsContentViewArgs$Companion Companion;
    
    static {
        Companion = new FlaggedAccountsContentViewArgs.FlaggedAccountsContentViewArgs$Companion();
    }
    
    public FlaggedAccountsContentViewArgs() {
    }
    
    public FlaggedAccountsContentViewArgs(final int n, final dmp dmp) {
        if ((n & 0x0) == 0x0) {
            return;
        }
        shw.V0(n, 0, FlaggedAccountsContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public static final void write$Self(final FlaggedAccountsContentViewArgs flaggedAccountsContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)flaggedAccountsContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
    }
}
