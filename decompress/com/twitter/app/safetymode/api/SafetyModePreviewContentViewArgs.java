// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0011\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017" }, d2 = { "Lcom/twitter/app/safetymode/api/SafetyModePreviewContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "eventPage", "Ljava/lang/String;", "getEventPage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ldmp;)V", "Companion", "$serializer", "feature.tfa.safety-mode.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class SafetyModePreviewContentViewArgs implements ContentViewArgs
{
    public static final SafetyModePreviewContentViewArgs.SafetyModePreviewContentViewArgs$Companion Companion;
    private final String eventPage;
    
    static {
        Companion = new SafetyModePreviewContentViewArgs.SafetyModePreviewContentViewArgs$Companion();
    }
    
    public SafetyModePreviewContentViewArgs(final int n, final String eventPage, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.eventPage = eventPage;
            return;
        }
        shw.V0(n, 1, SafetyModePreviewContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public SafetyModePreviewContentViewArgs(final String eventPage) {
        e0e.f((Object)eventPage, "eventPage");
        this.eventPage = eventPage;
    }
    
    public static final void write$Self(final SafetyModePreviewContentViewArgs safetyModePreviewContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)safetyModePreviewContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.S(serialDescriptor, 0, safetyModePreviewContentViewArgs.eventPage);
    }
    
    public final String getEventPage() {
        return this.eventPage;
    }
}
