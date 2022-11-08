// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.args;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/RoomScheduledSpaceMode;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "getRoomId", "()Ljava/lang/String;", "roomId", "<init>", "()V", "", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILqkp;)V", "Companion", "Scheduled", "Scheduling", "Lcom/twitter/rooms/subsystem/api/args/RoomScheduledSpaceMode$Scheduled;", "Lcom/twitter/rooms/subsystem/api/args/RoomScheduledSpaceMode$Scheduling;", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public abstract class RoomScheduledSpaceMode
{
    private static final gxe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = rp2.y0(2, (otb)RoomScheduledSpaceMode$a.C0);
    }
    
    private RoomScheduledSpaceMode() {
    }
    
    public static final /* synthetic */ gxe access$get$cachedSerializer$delegate$cp() {
        return RoomScheduledSpaceMode.$cachedSerializer$delegate;
    }
    
    public static final void write$Self(final RoomScheduledSpaceMode roomScheduledSpaceMode, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)roomScheduledSpaceMode, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
    }
    
    public abstract String getRoomId();
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/RoomScheduledSpaceMode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/args/RoomScheduledSpaceMode;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<RoomScheduledSpaceMode> serializer() {
            return (KSerializer<RoomScheduledSpaceMode>)RoomScheduledSpaceMode.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
