// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safety.leaveconversation;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B1\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'BA\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000eH\u00c6\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u0013\u001a\u00020\u000e2\b\b\u0003\u0010\u0014\u001a\u00020\u000eH\u00c6\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b%\u0010$¨\u0006." }, d2 = { "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Long;", "", "component3", "component4", "educationOnly", "tweetId", "scribePage", "scribeSection", "copy", "(ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/twitter/safety/leaveconversation/LeaveConversationPromptArgs;", "toString", "", "hashCode", "", "other", "equals", "Z", "getEducationOnly", "()Z", "Ljava/lang/Long;", "getTweetId", "Ljava/lang/String;", "getScribePage", "()Ljava/lang/String;", "getScribeSection", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(IZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.core-safety.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class LeaveConversationPromptArgs implements ContentViewArgs
{
    public static final int $stable = 0;
    public static final Companion Companion;
    private final boolean educationOnly;
    private final String scribePage;
    private final String scribeSection;
    private final Long tweetId;
    
    static {
        Companion = new Companion();
    }
    
    public LeaveConversationPromptArgs() {
        this(false, null, null, null, 15, null);
    }
    
    public LeaveConversationPromptArgs(final int n, boolean educationOnly, final Long tweetId, final String scribePage, final String scribeSection, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                educationOnly = true;
            }
            this.educationOnly = educationOnly;
            if ((n & 0x2) == 0x0) {
                this.tweetId = null;
            }
            else {
                this.tweetId = tweetId;
            }
            if ((n & 0x4) == 0x0) {
                this.scribePage = "";
            }
            else {
                this.scribePage = scribePage;
            }
            if ((n & 0x8) == 0x0) {
                this.scribeSection = "";
            }
            else {
                this.scribeSection = scribeSection;
            }
            return;
        }
        blz.a0(n, 0, LeaveConversationPrompt.LeaveConversationPromptArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public LeaveConversationPromptArgs(final boolean educationOnly, final Long tweetId, final String scribePage, final String scribeSection) {
        czd.f((Object)scribePage, "scribePage");
        czd.f((Object)scribeSection, "scribeSection");
        this.educationOnly = educationOnly;
        this.tweetId = tweetId;
        this.scribePage = scribePage;
        this.scribeSection = scribeSection;
    }
    
    public LeaveConversationPromptArgs(boolean b, Long n, String s, String s2, final int n2, final rf8 rf8) {
        if ((n2 & 0x1) != 0x0) {
            b = true;
        }
        if ((n2 & 0x2) != 0x0) {
            n = null;
        }
        if ((n2 & 0x4) != 0x0) {
            s = "";
        }
        if ((n2 & 0x8) != 0x0) {
            s2 = "";
        }
        this(b, n, s, s2);
    }
    
    public static LeaveConversationPromptArgs copy$default(final LeaveConversationPromptArgs leaveConversationPromptArgs, boolean educationOnly, Long tweetId, String scribePage, String scribeSection, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            educationOnly = leaveConversationPromptArgs.educationOnly;
        }
        if ((n & 0x2) != 0x0) {
            tweetId = leaveConversationPromptArgs.tweetId;
        }
        if ((n & 0x4) != 0x0) {
            scribePage = leaveConversationPromptArgs.scribePage;
        }
        if ((n & 0x8) != 0x0) {
            scribeSection = leaveConversationPromptArgs.scribeSection;
        }
        return leaveConversationPromptArgs.copy(educationOnly, tweetId, scribePage, scribeSection);
    }
    
    public static final void write$Self(final LeaveConversationPromptArgs leaveConversationPromptArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)leaveConversationPromptArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0053: {
            if (!z) {
                if (leaveConversationPromptArgs.educationOnly) {
                    b = false;
                    break Label_0053;
                }
            }
            b = true;
        }
        if (b) {
            xc6.R(serialDescriptor, 0, leaveConversationPromptArgs.educationOnly);
        }
        boolean b2 = false;
        Label_0096: {
            if (!xc6.z(serialDescriptor)) {
                if (leaveConversationPromptArgs.tweetId == null) {
                    b2 = false;
                    break Label_0096;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.y(serialDescriptor, 1, (jlp)ccg.a, (Object)leaveConversationPromptArgs.tweetId);
        }
        boolean b3 = false;
        Label_0147: {
            if (!xc6.z(serialDescriptor)) {
                if (czd.a((Object)leaveConversationPromptArgs.scribePage, (Object)"")) {
                    b3 = false;
                    break Label_0147;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.S(serialDescriptor, 2, leaveConversationPromptArgs.scribePage);
        }
        int n2 = 0;
        Label_0193: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (czd.a((Object)leaveConversationPromptArgs.scribeSection, (Object)"")) {
                    break Label_0193;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.S(serialDescriptor, 3, leaveConversationPromptArgs.scribeSection);
        }
    }
    
    public final boolean component1() {
        return this.educationOnly;
    }
    
    public final Long component2() {
        return this.tweetId;
    }
    
    public final String component3() {
        return this.scribePage;
    }
    
    public final String component4() {
        return this.scribeSection;
    }
    
    public final LeaveConversationPromptArgs copy(final boolean b, final Long n, final String s, final String s2) {
        czd.f((Object)s, "scribePage");
        czd.f((Object)s2, "scribeSection");
        return new LeaveConversationPromptArgs(b, n, s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LeaveConversationPromptArgs)) {
            return false;
        }
        final LeaveConversationPromptArgs leaveConversationPromptArgs = (LeaveConversationPromptArgs)o;
        return this.educationOnly == leaveConversationPromptArgs.educationOnly && czd.a((Object)this.tweetId, (Object)leaveConversationPromptArgs.tweetId) && czd.a((Object)this.scribePage, (Object)leaveConversationPromptArgs.scribePage) && czd.a((Object)this.scribeSection, (Object)leaveConversationPromptArgs.scribeSection);
    }
    
    public final boolean getEducationOnly() {
        return this.educationOnly;
    }
    
    public final String getScribePage() {
        return this.scribePage;
    }
    
    public final String getScribeSection() {
        return this.scribeSection;
    }
    
    public final Long getTweetId() {
        return this.tweetId;
    }
    
    @Override
    public int hashCode() {
        int educationOnly;
        if ((educationOnly = (this.educationOnly ? 1 : 0)) != 0) {
            educationOnly = 1;
        }
        final Long tweetId = this.tweetId;
        int hashCode;
        if (tweetId == null) {
            hashCode = 0;
        }
        else {
            hashCode = tweetId.hashCode();
        }
        return this.scribeSection.hashCode() + hmg.f(this.scribePage, (educationOnly * 31 + hashCode) * 31, 31);
    }
    
    @Override
    public String toString() {
        final boolean educationOnly = this.educationOnly;
        final Long tweetId = this.tweetId;
        final String scribePage = this.scribePage;
        final String scribeSection = this.scribeSection;
        final StringBuilder sb = new StringBuilder();
        sb.append("LeaveConversationPromptArgs(educationOnly=");
        sb.append(educationOnly);
        sb.append(", tweetId=");
        sb.append(tweetId);
        sb.append(", scribePage=");
        return mb0.C(sb, scribePage, ", scribeSection=", scribeSection, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptArgs;", "serializer", "subsystem.tfa.core-safety.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<LeaveConversationPromptArgs> serializer() {
            return (KSerializer<LeaveConversationPromptArgs>)LeaveConversationPromptArgs$$serializer.INSTANCE;
        }
    }
}
