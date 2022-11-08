// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.educationprompts;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0011\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017" }, d2 = { "Lcom/twitter/app/educationprompts/SafetyEducationPromptContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "eventPage", "Ljava/lang/String;", "getEventPage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Lqkp;)V", "Companion", "$serializer", "feature.tfa.education-prompts.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class SafetyEducationPromptContentViewArgs implements ContentViewArgs
{
    public static final Companion Companion;
    private final String eventPage = eventPage;
    
    static {
        Companion = new Companion();
    }
    
    public SafetyEducationPromptContentViewArgs(final String eventPage) {
        zzd.f((Object)eventPage, "eventPage");
        this.eventPage = eventPage;
    }
    
    public static final void write$Self(final SafetyEducationPromptContentViewArgs safetyEducationPromptContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)safetyEducationPromptContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, safetyEducationPromptContentViewArgs.eventPage);
    }
    
    public final String getEventPage() {
        return this.eventPage;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/educationprompts/SafetyEducationPromptContentViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/app/educationprompts/SafetyEducationPromptContentViewArgs;", "serializer", "feature.tfa.education-prompts.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<SafetyEducationPromptContentViewArgs> serializer() {
            return (KSerializer<SafetyEducationPromptContentViewArgs>)SafetyEducationPromptContentViewArgs$$serializer.INSTANCE;
        }
    }
}
