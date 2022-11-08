// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.models;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u000f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\u0013\b\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eB#\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\u0082\u0001\u000e#$%&'()*+,-./0¨\u00061" }, d2 = { "Lcom/twitter/rooms/subsystem/api/models/RoomViewType;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "isDeviceHeight", "Z", "()Z", "<init>", "(Z)V", "", "seen1", "Lqkp;", "serializationConstructorMarker", "(IZLqkp;)V", "Companion", "ConsumptionPreviewView", "CreationView", "Default", "HostReconnectView", "InviteView", "ManageSpeakersView", "MultiScheduledSpacesView", "ReplayView", "ScheduleSpaceDetailsView", "ScheduleSpaceTicketView", "ScheduleSpaceView", "SpaceView", "StationsView", "SubscriptionPrompt", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$ConsumptionPreviewView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$CreationView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$Default;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$HostReconnectView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$InviteView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$ManageSpeakersView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$MultiScheduledSpacesView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$ReplayView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$ScheduleSpaceDetailsView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$ScheduleSpaceTicketView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$ScheduleSpaceView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$SpaceView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$StationsView;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$SubscriptionPrompt;", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public abstract class RoomViewType
{
    private static final gxe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final boolean isDeviceHeight;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = rp2.y0(2, (otb)RoomViewType$a.C0);
    }
    
    private RoomViewType(final boolean isDeviceHeight) {
        this.isDeviceHeight = isDeviceHeight;
    }
    
    public static final /* synthetic */ gxe access$get$cachedSerializer$delegate$cp() {
        return RoomViewType.$cachedSerializer$delegate;
    }
    
    public static final void write$Self(final RoomViewType roomViewType, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)roomViewType, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        boolean b = false;
        Label_0045: {
            if (!sd6.z(serialDescriptor)) {
                if (!roomViewType.isDeviceHeight) {
                    b = false;
                    break Label_0045;
                }
            }
            b = true;
        }
        if (b) {
            sd6.R(serialDescriptor, 0, roomViewType.isDeviceHeight);
        }
    }
    
    public final boolean isDeviceHeight() {
        return this.isDeviceHeight;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/models/RoomViewType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/models/RoomViewType;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<RoomViewType> serializer() {
            return (KSerializer<RoomViewType>)RoomViewType.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
