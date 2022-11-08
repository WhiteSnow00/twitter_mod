// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.args;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.rooms.subsystem.api.models.StationTrack;
import java.util.List;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%B?\b\u0017\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006," }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/StationsPlaylistArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "Lcom/twitter/rooms/subsystem/api/models/StationTrack;", "component2", "", "component3", "()Ljava/lang/Integer;", "stationName", "stationTracks", "currentTrackIndex", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/twitter/rooms/subsystem/api/args/StationsPlaylistArgs;", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getStationName", "()Ljava/lang/String;", "Ljava/util/List;", "getStationTracks", "()Ljava/util/List;", "Ljava/lang/Integer;", "getCurrentTrackIndex", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class StationsPlaylistArgs implements ContentViewArgs
{
    public static final Companion Companion;
    private final Integer currentTrackIndex = currentTrackIndex;
    private final String stationName = stationName;
    private final List<StationTrack> stationTracks = stationTracks;
    
    static {
        Companion = new Companion();
    }
    
    public StationsPlaylistArgs(final String stationName, final List<? extends StationTrack> stationTracks, final Integer currentTrackIndex) {
        zzd.f((Object)stationName, "stationName");
        zzd.f((Object)stationTracks, "stationTracks");
        this.stationName = stationName;
        this.stationTracks = (List<StationTrack>)stationTracks;
        this.currentTrackIndex = currentTrackIndex;
    }
    
    public static final void write$Self(final StationsPlaylistArgs stationsPlaylistArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)stationsPlaylistArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, stationsPlaylistArgs.stationName);
        sd6.T(serialDescriptor, 1, (skp)new ys0((KSerializer)StationTrack.Companion.serializer()), (Object)stationsPlaylistArgs.stationTracks);
        sd6.x(serialDescriptor, 2, (skp)hud.a, (Object)stationsPlaylistArgs.currentTrackIndex);
    }
    
    public final String component1() {
        return this.stationName;
    }
    
    public final List<StationTrack> component2() {
        return this.stationTracks;
    }
    
    public final Integer component3() {
        return this.currentTrackIndex;
    }
    
    public final StationsPlaylistArgs copy(final String s, final List<? extends StationTrack> list, final Integer n) {
        zzd.f((Object)s, "stationName");
        zzd.f((Object)list, "stationTracks");
        return new StationsPlaylistArgs(s, list, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StationsPlaylistArgs)) {
            return false;
        }
        final StationsPlaylistArgs stationsPlaylistArgs = (StationsPlaylistArgs)o;
        return zzd.a((Object)this.stationName, (Object)stationsPlaylistArgs.stationName) && zzd.a((Object)this.stationTracks, (Object)stationsPlaylistArgs.stationTracks) && zzd.a((Object)this.currentTrackIndex, (Object)stationsPlaylistArgs.currentTrackIndex);
    }
    
    public final Integer getCurrentTrackIndex() {
        return this.currentTrackIndex;
    }
    
    public final String getStationName() {
        return this.stationName;
    }
    
    public final List<StationTrack> getStationTracks() {
        return this.stationTracks;
    }
    
    @Override
    public int hashCode() {
        final int m = hy8.m((List)this.stationTracks, this.stationName.hashCode() * 31, 31);
        final Integer currentTrackIndex = this.currentTrackIndex;
        int hashCode;
        if (currentTrackIndex == null) {
            hashCode = 0;
        }
        else {
            hashCode = currentTrackIndex.hashCode();
        }
        return m + hashCode;
    }
    
    @Override
    public String toString() {
        return hy8.p(gp.B("StationsPlaylistArgs(stationName=", this.stationName, ", stationTracks=", (List)this.stationTracks, ", currentTrackIndex="), this.currentTrackIndex, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/StationsPlaylistArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/args/StationsPlaylistArgs;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<StationsPlaylistArgs> serializer() {
            return (KSerializer<StationsPlaylistArgs>)StationsPlaylistArgs$$serializer.INSTANCE;
        }
    }
}
