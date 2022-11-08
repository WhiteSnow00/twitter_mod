// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.args;

import kotlinx.serialization.KSerializer;
import com.twitter.rooms.subsystem.api.models.StationFeed$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.rooms.subsystem.api.models.StationFeed;
import com.twitter.rooms.subsystem.api.models.StationTrack;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006&" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/StationsTabControllerContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Lcom/twitter/rooms/subsystem/api/models/StationTrack;", "component1", "Lcom/twitter/rooms/subsystem/api/models/StationFeed;", "component2", "currentTrack", "stationFeed", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/rooms/subsystem/api/models/StationTrack;", "getCurrentTrack", "()Lcom/twitter/rooms/subsystem/api/models/StationTrack;", "Lcom/twitter/rooms/subsystem/api/models/StationFeed;", "getStationFeed", "()Lcom/twitter/rooms/subsystem/api/models/StationFeed;", "<init>", "(Lcom/twitter/rooms/subsystem/api/models/StationTrack;Lcom/twitter/rooms/subsystem/api/models/StationFeed;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILcom/twitter/rooms/subsystem/api/models/StationTrack;Lcom/twitter/rooms/subsystem/api/models/StationFeed;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class StationsTabControllerContentViewArgs implements ContentViewArgs
{
    public static final Companion Companion;
    private final StationTrack currentTrack = currentTrack;
    private final StationFeed stationFeed = stationFeed;
    
    static {
        Companion = new Companion();
    }
    
    public StationsTabControllerContentViewArgs(final StationTrack currentTrack, final StationFeed stationFeed) {
        zzd.f((Object)currentTrack, "currentTrack");
        zzd.f((Object)stationFeed, "stationFeed");
        this.currentTrack = currentTrack;
        this.stationFeed = stationFeed;
    }
    
    public static final void write$Self(final StationsTabControllerContentViewArgs stationsTabControllerContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)stationsTabControllerContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.T(serialDescriptor, 0, (skp)StationTrack.Companion.serializer(), (Object)stationsTabControllerContentViewArgs.currentTrack);
        sd6.T(serialDescriptor, 1, (skp)StationFeed$$serializer.INSTANCE, (Object)stationsTabControllerContentViewArgs.stationFeed);
    }
    
    public final StationTrack component1() {
        return this.currentTrack;
    }
    
    public final StationFeed component2() {
        return this.stationFeed;
    }
    
    public final StationsTabControllerContentViewArgs copy(final StationTrack stationTrack, final StationFeed stationFeed) {
        zzd.f((Object)stationTrack, "currentTrack");
        zzd.f((Object)stationFeed, "stationFeed");
        return new StationsTabControllerContentViewArgs(stationTrack, stationFeed);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StationsTabControllerContentViewArgs)) {
            return false;
        }
        final StationsTabControllerContentViewArgs stationsTabControllerContentViewArgs = (StationsTabControllerContentViewArgs)o;
        return zzd.a((Object)this.currentTrack, (Object)stationsTabControllerContentViewArgs.currentTrack) && zzd.a((Object)this.stationFeed, (Object)stationsTabControllerContentViewArgs.stationFeed);
    }
    
    public final StationTrack getCurrentTrack() {
        return this.currentTrack;
    }
    
    public final StationFeed getStationFeed() {
        return this.stationFeed;
    }
    
    @Override
    public int hashCode() {
        return this.stationFeed.hashCode() + this.currentTrack.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StationTrack currentTrack = this.currentTrack;
        final StationFeed stationFeed = this.stationFeed;
        final StringBuilder sb = new StringBuilder();
        sb.append("StationsTabControllerContentViewArgs(currentTrack=");
        sb.append(currentTrack);
        sb.append(", stationFeed=");
        sb.append(stationFeed);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/StationsTabControllerContentViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/args/StationsTabControllerContentViewArgs;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<StationsTabControllerContentViewArgs> serializer() {
            return (KSerializer<StationsTabControllerContentViewArgs>)StationsTabControllerContentViewArgs$$serializer.INSTANCE;
        }
    }
}
