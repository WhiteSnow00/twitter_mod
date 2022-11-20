// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.video;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0004¢\u0006\u0004\b\u0018\u0010\rB\u001b\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001f ¨\u0006!" }, d2 = { "Lcom/twitter/android/av/video/TwitterMediaPlayerArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Li1;", "getDataSource", "()Li1;", "getDataSource$annotations", "()V", "dataSource", "Lefv;", "getScribeAssociation", "()Lefv;", "getScribeAssociation$annotations", "scribeAssociation", "", "getFromDock", "()Z", "fromDock", "<init>", "", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILhlp;)V", "Companion", "Lcom/twitter/android/av/video/AVMediaPlayerContentViewArgs;", "Lcom/twitter/android/av/video/BroadcastFullscreenContentViewArgs;", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class TwitterMediaPlayerArgs implements ContentViewArgs
{
    private static final qwe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = pps.m(2, (nsb)TwitterMediaPlayerArgs$a.D0);
    }
    
    private TwitterMediaPlayerArgs() {
    }
    
    public TwitterMediaPlayerArgs(final int n, final hlp hlp) {
    }
    
    public TwitterMediaPlayerArgs(final rf8 rf8) {
        this();
    }
    
    public static final qwe access$get$cachedSerializer$delegate$cp() {
        return TwitterMediaPlayerArgs.$cachedSerializer$delegate;
    }
    
    @flp(with = m1v.class)
    public static void getDataSource$annotations() {
    }
    
    @flp(with = ffv.class)
    public static void getScribeAssociation$annotations() {
    }
    
    public static final void write$Self(final TwitterMediaPlayerArgs twitterMediaPlayerArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)twitterMediaPlayerArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
    }
    
    public abstract i1 getDataSource();
    
    public abstract boolean getFromDock();
    
    public abstract efv getScribeAssociation();
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/av/video/TwitterMediaPlayerArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/android/av/video/TwitterMediaPlayerArgs;", "serializer", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<TwitterMediaPlayerArgs> serializer() {
            return (KSerializer<TwitterMediaPlayerArgs>)TwitterMediaPlayerArgs.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
