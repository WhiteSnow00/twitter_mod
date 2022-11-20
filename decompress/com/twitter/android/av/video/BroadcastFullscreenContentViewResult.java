// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.video;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u001e" }, d2 = { "Lcom/twitter/android/av/video/BroadcastFullscreenContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "isMuted", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "<init>", "(Z)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(IZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class BroadcastFullscreenContentViewResult implements bn6
{
    public static final Companion Companion;
    private final boolean isMuted;
    
    static {
        Companion = new Companion();
    }
    
    public BroadcastFullscreenContentViewResult(final int n, final boolean isMuted, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.isMuted = isMuted;
            return;
        }
        blz.a0(n, 1, BroadcastFullscreenContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BroadcastFullscreenContentViewResult(final boolean isMuted) {
        this.isMuted = isMuted;
    }
    
    public static BroadcastFullscreenContentViewResult copy$default(final BroadcastFullscreenContentViewResult broadcastFullscreenContentViewResult, boolean isMuted, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            isMuted = broadcastFullscreenContentViewResult.isMuted;
        }
        return broadcastFullscreenContentViewResult.copy(isMuted);
    }
    
    public static final void write$Self(final BroadcastFullscreenContentViewResult broadcastFullscreenContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)broadcastFullscreenContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.R(serialDescriptor, 0, broadcastFullscreenContentViewResult.isMuted);
    }
    
    public final boolean component1() {
        return this.isMuted;
    }
    
    public final BroadcastFullscreenContentViewResult copy(final boolean b) {
        return new BroadcastFullscreenContentViewResult(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BroadcastFullscreenContentViewResult && this.isMuted == ((BroadcastFullscreenContentViewResult)o).isMuted);
    }
    
    @Override
    public int hashCode() {
        int isMuted;
        if ((isMuted = (this.isMuted ? 1 : 0)) != 0) {
            isMuted = 1;
        }
        return isMuted;
    }
    
    public final boolean isMuted() {
        return this.isMuted;
    }
    
    @Override
    public String toString() {
        return ib0.C("BroadcastFullscreenContentViewResult(isMuted=", this.isMuted, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/av/video/BroadcastFullscreenContentViewResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/android/av/video/BroadcastFullscreenContentViewResult;", "serializer", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<BroadcastFullscreenContentViewResult> serializer() {
            return (KSerializer<BroadcastFullscreenContentViewResult>)BroadcastFullscreenContentViewResult$$serializer.INSTANCE;
        }
    }
}
