// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.monetization;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\"" }, d2 = { "Lcom/twitter/android/av/monetization/MediaMonetizationContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lswg;", "component1", "mediaMonetizationMetadata", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lswg;", "getMediaMonetizationMetadata", "()Lswg;", "getMediaMonetizationMetadata$annotations", "()V", "<init>", "(Lswg;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILswg;Lhlp;)V", "Companion", "$serializer", "feature.tfa.media.monetization.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class MediaMonetizationContentViewResult implements bn6
{
    public static final Companion Companion;
    private final swg mediaMonetizationMetadata;
    
    static {
        Companion = new Companion();
    }
    
    public MediaMonetizationContentViewResult(final int n, @flp(with = wwg.class) final swg mediaMonetizationMetadata, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.mediaMonetizationMetadata = mediaMonetizationMetadata;
            return;
        }
        blz.a0(n, 1, MediaMonetizationContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public MediaMonetizationContentViewResult(final swg mediaMonetizationMetadata) {
        czd.f((Object)mediaMonetizationMetadata, "mediaMonetizationMetadata");
        this.mediaMonetizationMetadata = mediaMonetizationMetadata;
    }
    
    public static MediaMonetizationContentViewResult copy$default(final MediaMonetizationContentViewResult mediaMonetizationContentViewResult, swg mediaMonetizationMetadata, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            mediaMonetizationMetadata = mediaMonetizationContentViewResult.mediaMonetizationMetadata;
        }
        return mediaMonetizationContentViewResult.copy(mediaMonetizationMetadata);
    }
    
    @flp(with = wwg.class)
    public static void getMediaMonetizationMetadata$annotations() {
    }
    
    public static final void write$Self(final MediaMonetizationContentViewResult mediaMonetizationContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)mediaMonetizationContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)wwg.b, (Object)mediaMonetizationContentViewResult.mediaMonetizationMetadata);
    }
    
    public final swg component1() {
        return this.mediaMonetizationMetadata;
    }
    
    public final MediaMonetizationContentViewResult copy(final swg swg) {
        czd.f((Object)swg, "mediaMonetizationMetadata");
        return new MediaMonetizationContentViewResult(swg);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof MediaMonetizationContentViewResult && czd.a((Object)this.mediaMonetizationMetadata, (Object)((MediaMonetizationContentViewResult)o).mediaMonetizationMetadata));
    }
    
    public final swg getMediaMonetizationMetadata() {
        return this.mediaMonetizationMetadata;
    }
    
    @Override
    public int hashCode() {
        return this.mediaMonetizationMetadata.hashCode();
    }
    
    @Override
    public String toString() {
        final swg mediaMonetizationMetadata = this.mediaMonetizationMetadata;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaMonetizationContentViewResult(mediaMonetizationMetadata=");
        sb.append(mediaMonetizationMetadata);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/av/monetization/MediaMonetizationContentViewResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/android/av/monetization/MediaMonetizationContentViewResult;", "serializer", "feature.tfa.media.monetization.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<MediaMonetizationContentViewResult> serializer() {
            return (KSerializer<MediaMonetizationContentViewResult>)MediaMonetizationContentViewResult$$serializer.INSTANCE;
        }
    }
}
