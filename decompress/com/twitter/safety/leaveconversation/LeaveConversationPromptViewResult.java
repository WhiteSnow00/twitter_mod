// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safety.leaveconversation;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB%\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006!" }, d2 = { "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "()Ljava/lang/Long;", "tweetId", "copy", "(Ljava/lang/Long;)Lcom/twitter/safety/leaveconversation/LeaveConversationPromptViewResult;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/Long;", "getTweetId", "<init>", "(Ljava/lang/Long;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/Long;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.core-safety.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class LeaveConversationPromptViewResult implements bn6
{
    public static final int $stable = 0;
    public static final Companion Companion;
    private final Long tweetId;
    
    static {
        Companion = new Companion();
    }
    
    public LeaveConversationPromptViewResult(final int n, final Long tweetId, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.tweetId = tweetId;
            return;
        }
        blz.a0(n, 1, LeaveConversationPromptViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public LeaveConversationPromptViewResult(final Long tweetId) {
        this.tweetId = tweetId;
    }
    
    public static LeaveConversationPromptViewResult copy$default(final LeaveConversationPromptViewResult leaveConversationPromptViewResult, Long tweetId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            tweetId = leaveConversationPromptViewResult.tweetId;
        }
        return leaveConversationPromptViewResult.copy(tweetId);
    }
    
    public static final void write$Self(final LeaveConversationPromptViewResult leaveConversationPromptViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)leaveConversationPromptViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.y(serialDescriptor, 0, (jlp)ccg.a, (Object)leaveConversationPromptViewResult.tweetId);
    }
    
    public final Long component1() {
        return this.tweetId;
    }
    
    public final LeaveConversationPromptViewResult copy(final Long n) {
        return new LeaveConversationPromptViewResult(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof LeaveConversationPromptViewResult && czd.a((Object)this.tweetId, (Object)((LeaveConversationPromptViewResult)o).tweetId));
    }
    
    public final Long getTweetId() {
        return this.tweetId;
    }
    
    @Override
    public int hashCode() {
        final Long tweetId = this.tweetId;
        int hashCode;
        if (tweetId == null) {
            hashCode = 0;
        }
        else {
            hashCode = tweetId.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final Long tweetId = this.tweetId;
        final StringBuilder sb = new StringBuilder();
        sb.append("LeaveConversationPromptViewResult(tweetId=");
        sb.append(tweetId);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptViewResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptViewResult;", "serializer", "subsystem.tfa.core-safety.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<LeaveConversationPromptViewResult> serializer() {
            return (KSerializer<LeaveConversationPromptViewResult>)LeaveConversationPromptViewResult$$serializer.INSTANCE;
        }
    }
}
