// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.models;

import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.rooms.model.StationsSocialProof;
import com.twitter.rooms.model.Image;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BY\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b¢\u0006\u0004\b.\u0010/Bu\b\u0017\u0012\u0006\u00100\u001a\u00020\u001e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u00c6\u0003Ji\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u00c6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b)\u0010%R!\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b,\u0010%R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b-\u0010(¨\u00066" }, d2 = { "Lcom/twitter/rooms/subsystem/api/models/StationFeed;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "Lcom/twitter/rooms/model/Image;", "component2", "component3", "Lcom/twitter/rooms/model/StationsSocialProof;", "component4", "component5", "component6", "Lcom/twitter/rooms/subsystem/api/models/StationTrack;", "component7", "description", "images", "title", "socialProof", "backgroundGradient", "stationMetadata", "stationTracks", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTitle", "getSocialProof", "getBackgroundGradient", "getStationMetadata", "getStationTracks", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class StationFeed
{
    public static final Companion Companion;
    private final String backgroundGradient = backgroundGradient;
    private final String description = description;
    private final List<Image> images = images;
    private final List<StationsSocialProof> socialProof = socialProof;
    private final String stationMetadata = stationMetadata;
    private final List<StationTrack> stationTracks = stationTracks;
    private final String title = title;
    
    static {
        Companion = new Companion();
    }
    
    public StationFeed(final String description, final List<Image> images, final String title, final List<StationsSocialProof> socialProof, final String backgroundGradient, final String stationMetadata, final List<? extends StationTrack> stationTracks) {
        zzd.f((Object)description, "description");
        zzd.f((Object)images, "images");
        zzd.f((Object)title, "title");
        zzd.f((Object)stationTracks, "stationTracks");
        this.description = description;
        this.images = images;
        this.title = title;
        this.socialProof = socialProof;
        this.backgroundGradient = backgroundGradient;
        this.stationMetadata = stationMetadata;
        this.stationTracks = (List<StationTrack>)stationTracks;
    }
    
    public static final void write$Self(final StationFeed stationFeed, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)stationFeed, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, stationFeed.description);
        sd6.T(serialDescriptor, 1, (skp)new ys0((KSerializer)Image.$serializer.INSTANCE), (Object)stationFeed.images);
        sd6.S(serialDescriptor, 2, stationFeed.title);
        sd6.x(serialDescriptor, 3, (skp)new ys0(BuiltinSerializersKt.e((KSerializer)StationsSocialProof.$serializer.INSTANCE)), (Object)stationFeed.socialProof);
        final njr a = njr.a;
        sd6.x(serialDescriptor, 4, (skp)a, (Object)stationFeed.backgroundGradient);
        sd6.x(serialDescriptor, 5, (skp)a, (Object)stationFeed.stationMetadata);
        sd6.T(serialDescriptor, 6, (skp)new ys0((KSerializer)StationTrack.Companion.serializer()), (Object)stationFeed.stationTracks);
    }
    
    public final String component1() {
        return this.description;
    }
    
    public final List<Image> component2() {
        return this.images;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final List<StationsSocialProof> component4() {
        return this.socialProof;
    }
    
    public final String component5() {
        return this.backgroundGradient;
    }
    
    public final String component6() {
        return this.stationMetadata;
    }
    
    public final List<StationTrack> component7() {
        return this.stationTracks;
    }
    
    public final StationFeed copy(final String s, final List<Image> list, final String s2, final List<StationsSocialProof> list2, final String s3, final String s4, final List<? extends StationTrack> list3) {
        zzd.f((Object)s, "description");
        zzd.f((Object)list, "images");
        zzd.f((Object)s2, "title");
        zzd.f((Object)list3, "stationTracks");
        return new StationFeed(s, list, s2, list2, s3, s4, list3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StationFeed)) {
            return false;
        }
        final StationFeed stationFeed = (StationFeed)o;
        return zzd.a((Object)this.description, (Object)stationFeed.description) && zzd.a((Object)this.images, (Object)stationFeed.images) && zzd.a((Object)this.title, (Object)stationFeed.title) && zzd.a((Object)this.socialProof, (Object)stationFeed.socialProof) && zzd.a((Object)this.backgroundGradient, (Object)stationFeed.backgroundGradient) && zzd.a((Object)this.stationMetadata, (Object)stationFeed.stationMetadata) && zzd.a((Object)this.stationTracks, (Object)stationFeed.stationTracks);
    }
    
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final List<Image> getImages() {
        return this.images;
    }
    
    public final List<StationsSocialProof> getSocialProof() {
        return this.socialProof;
    }
    
    public final String getStationMetadata() {
        return this.stationMetadata;
    }
    
    public final List<StationTrack> getStationTracks() {
        return this.stationTracks;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int a = l7k.a(this.title, hy8.m((List)this.images, this.description.hashCode() * 31, 31), 31);
        final List<StationsSocialProof> socialProof = this.socialProof;
        int hashCode = 0;
        int hashCode2;
        if (socialProof == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = socialProof.hashCode();
        }
        final String backgroundGradient = this.backgroundGradient;
        int hashCode3;
        if (backgroundGradient == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = backgroundGradient.hashCode();
        }
        final String stationMetadata = this.stationMetadata;
        if (stationMetadata != null) {
            hashCode = stationMetadata.hashCode();
        }
        return this.stationTracks.hashCode() + (((a + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31;
    }
    
    @Override
    public String toString() {
        final String description = this.description;
        final List<Image> images = this.images;
        final String title = this.title;
        final List<StationsSocialProof> socialProof = this.socialProof;
        final String backgroundGradient = this.backgroundGradient;
        final String stationMetadata = this.stationMetadata;
        final List<StationTrack> stationTracks = this.stationTracks;
        final StringBuilder b = gp.B("StationFeed(description=", description, ", images=", (List)images, ", title=");
        b.append(title);
        b.append(", socialProof=");
        b.append(socialProof);
        b.append(", backgroundGradient=");
        mag.m(b, backgroundGradient, ", stationMetadata=", stationMetadata, ", stationTracks=");
        return gp.A(b, (List)stationTracks, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/models/StationFeed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/models/StationFeed;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<StationFeed> serializer() {
            return (KSerializer<StationFeed>)StationFeed$$serializer.INSTANCE;
        }
    }
}
