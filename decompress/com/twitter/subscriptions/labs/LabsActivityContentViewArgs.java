// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.labs;

import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.navigation.subscriptions.ReferringPage;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/subscriptions/labs/LabsActivityContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lcom/twitter/navigation/subscriptions/ReferringPage;", "component1", "referringPage", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/navigation/subscriptions/ReferringPage;", "getReferringPage", "()Lcom/twitter/navigation/subscriptions/ReferringPage;", "<init>", "(Lcom/twitter/navigation/subscriptions/ReferringPage;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILcom/twitter/navigation/subscriptions/ReferringPage;Ldmp;)V", "Companion", "$serializer", "feature.tfa.subscriptions.labs.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class LabsActivityContentViewArgs implements ContentViewArgs
{
    public static final LabsActivityContentViewArgs.LabsActivityContentViewArgs$Companion Companion;
    private final ReferringPage referringPage;
    
    static {
        Companion = new LabsActivityContentViewArgs.LabsActivityContentViewArgs$Companion();
    }
    
    public LabsActivityContentViewArgs(final int n, final ReferringPage referringPage, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.referringPage = referringPage;
            return;
        }
        shw.V0(n, 1, LabsActivityContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public LabsActivityContentViewArgs(final ReferringPage referringPage) {
        e0e.f((Object)referringPage, "referringPage");
        this.referringPage = referringPage;
    }
    
    public static LabsActivityContentViewArgs copy$default(final LabsActivityContentViewArgs labsActivityContentViewArgs, ReferringPage referringPage, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            referringPage = labsActivityContentViewArgs.referringPage;
        }
        return labsActivityContentViewArgs.copy(referringPage);
    }
    
    public static final void write$Self(final LabsActivityContentViewArgs labsActivityContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)labsActivityContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.T(serialDescriptor, 0, (fmp)ReferringPage.Companion.serializer(), (Object)labsActivityContentViewArgs.referringPage);
    }
    
    public final ReferringPage component1() {
        return this.referringPage;
    }
    
    public final LabsActivityContentViewArgs copy(final ReferringPage referringPage) {
        e0e.f((Object)referringPage, "referringPage");
        return new LabsActivityContentViewArgs(referringPage);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof LabsActivityContentViewArgs && e0e.a((Object)this.referringPage, (Object)((LabsActivityContentViewArgs)o).referringPage));
    }
    
    public final ReferringPage getReferringPage() {
        return this.referringPage;
    }
    
    @Override
    public int hashCode() {
        return this.referringPage.hashCode();
    }
    
    @Override
    public String toString() {
        final ReferringPage referringPage = this.referringPage;
        final StringBuilder sb = new StringBuilder();
        sb.append("LabsActivityContentViewArgs(referringPage=");
        sb.append(referringPage);
        sb.append(")");
        return sb.toString();
    }
}
