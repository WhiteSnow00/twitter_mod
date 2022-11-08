// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.pinnedreplies.core.requests;

import kotlin.Metadata;

public final class PinnedReplyTweetRepository
{
    public final psc a;
    
    public PinnedReplyTweetRepository(final psc a) {
        zzd.f((Object)a, "requestController");
        this.a = a;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Lcom/twitter/android/pinnedreplies/core/requests/PinnedReplyTweetRepository$PinnedReplyRequestFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "subsystem.tfa.pinnedreplies.core_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class PinnedReplyRequestFailedException extends Exception
    {
        public PinnedReplyRequestFailedException(final String s) {
            super(s);
        }
    }
}
