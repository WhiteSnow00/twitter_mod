// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.args;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.rooms.model.PodcastEpisode;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/StationFragmentContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Lcom/twitter/rooms/model/PodcastEpisode;", "component1", "podcastEpisode", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/rooms/model/PodcastEpisode;", "getPodcastEpisode", "()Lcom/twitter/rooms/model/PodcastEpisode;", "<init>", "(Lcom/twitter/rooms/model/PodcastEpisode;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILcom/twitter/rooms/model/PodcastEpisode;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class StationFragmentContentViewArgs implements ContentViewArgs
{
    public static final Companion Companion;
    private final PodcastEpisode podcastEpisode = podcastEpisode;
    
    static {
        Companion = new Companion();
    }
    
    public StationFragmentContentViewArgs(final PodcastEpisode podcastEpisode) {
        zzd.f((Object)podcastEpisode, "podcastEpisode");
        this.podcastEpisode = podcastEpisode;
    }
    
    public static final void write$Self(final StationFragmentContentViewArgs stationFragmentContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)stationFragmentContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.T(serialDescriptor, 0, (skp)PodcastEpisode.$serializer.INSTANCE, (Object)stationFragmentContentViewArgs.podcastEpisode);
    }
    
    public final PodcastEpisode component1() {
        return this.podcastEpisode;
    }
    
    public final StationFragmentContentViewArgs copy(final PodcastEpisode podcastEpisode) {
        zzd.f((Object)podcastEpisode, "podcastEpisode");
        return new StationFragmentContentViewArgs(podcastEpisode);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof StationFragmentContentViewArgs && zzd.a((Object)this.podcastEpisode, (Object)((StationFragmentContentViewArgs)o).podcastEpisode));
    }
    
    public final PodcastEpisode getPodcastEpisode() {
        return this.podcastEpisode;
    }
    
    @Override
    public int hashCode() {
        return this.podcastEpisode.hashCode();
    }
    
    @Override
    public String toString() {
        final PodcastEpisode podcastEpisode = this.podcastEpisode;
        final StringBuilder sb = new StringBuilder();
        sb.append("StationFragmentContentViewArgs(podcastEpisode=");
        sb.append(podcastEpisode);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/StationFragmentContentViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/args/StationFragmentContentViewArgs;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<StationFragmentContentViewArgs> serializer() {
            return (KSerializer<StationFragmentContentViewArgs>)StationFragmentContentViewArgs$$serializer.INSTANCE;
        }
    }
}
