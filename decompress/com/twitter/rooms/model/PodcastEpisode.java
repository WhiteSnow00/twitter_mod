// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,BU\b\u0017\u0012\u0006\u0010-\u001a\u00020\u001a\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u00c6\u0001J\t\u0010\u0019\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b)\u0010*¨\u00063" }, d2 = { "Lcom/twitter/rooms/model/PodcastEpisode;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "component2", "component3", "Lcom/twitter/rooms/model/Show;", "component4", "component5", "", "component6", "audioUrl", "description", "id", "show", "title", "pubDateMs", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAudioUrl", "()Ljava/lang/String;", "getDescription", "getId", "Lcom/twitter/rooms/model/Show;", "getShow", "()Lcom/twitter/rooms/model/Show;", "getTitle", "J", "getPubDateMs", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/rooms/model/Show;Ljava/lang/String;J)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/rooms/model/Show;Ljava/lang/String;JLqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class PodcastEpisode
{
    public static final Companion Companion;
    private final String audioUrl = audioUrl;
    private final String description = description;
    private final String id = id;
    private final long pubDateMs = pubDateMs;
    private final Show show = show;
    private final String title = title;
    
    static {
        Companion = new Companion();
    }
    
    public PodcastEpisode(final String audioUrl, final String description, final String id, final Show show, final String title, final long pubDateMs) {
        zzd.f((Object)audioUrl, "audioUrl");
        zzd.f((Object)description, "description");
        zzd.f((Object)id, "id");
        zzd.f((Object)show, "show");
        zzd.f((Object)title, "title");
        this.audioUrl = audioUrl;
        this.description = description;
        this.id = id;
        this.show = show;
        this.title = title;
        this.pubDateMs = pubDateMs;
    }
    
    public static final void write$Self(final PodcastEpisode podcastEpisode, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)podcastEpisode, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, podcastEpisode.audioUrl);
        sd6.S(serialDescriptor, 1, podcastEpisode.description);
        sd6.S(serialDescriptor, 2, podcastEpisode.id);
        sd6.T(serialDescriptor, 3, (skp)Show.$serializer.INSTANCE, (Object)podcastEpisode.show);
        sd6.S(serialDescriptor, 4, podcastEpisode.title);
        sd6.i0(serialDescriptor, 5, podcastEpisode.pubDateMs);
    }
    
    public final String component1() {
        return this.audioUrl;
    }
    
    public final String component2() {
        return this.description;
    }
    
    public final String component3() {
        return this.id;
    }
    
    public final Show component4() {
        return this.show;
    }
    
    public final String component5() {
        return this.title;
    }
    
    public final long component6() {
        return this.pubDateMs;
    }
    
    public final PodcastEpisode copy(final String s, final String s2, final String s3, final Show show, final String s4, final long n) {
        zzd.f((Object)s, "audioUrl");
        zzd.f((Object)s2, "description");
        zzd.f((Object)s3, "id");
        zzd.f((Object)show, "show");
        zzd.f((Object)s4, "title");
        return new PodcastEpisode(s, s2, s3, show, s4, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PodcastEpisode)) {
            return false;
        }
        final PodcastEpisode podcastEpisode = (PodcastEpisode)o;
        return zzd.a((Object)this.audioUrl, (Object)podcastEpisode.audioUrl) && zzd.a((Object)this.description, (Object)podcastEpisode.description) && zzd.a((Object)this.id, (Object)podcastEpisode.id) && zzd.a((Object)this.show, (Object)podcastEpisode.show) && zzd.a((Object)this.title, (Object)podcastEpisode.title) && this.pubDateMs == podcastEpisode.pubDateMs;
    }
    
    public final String getAudioUrl() {
        return this.audioUrl;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final long getPubDateMs() {
        return this.pubDateMs;
    }
    
    public final Show getShow() {
        return this.show;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int a = l7k.a(this.title, (this.show.hashCode() + l7k.a(this.id, l7k.a(this.description, this.audioUrl.hashCode() * 31, 31), 31)) * 31, 31);
        final long pubDateMs = this.pubDateMs;
        return a + (int)(pubDateMs ^ pubDateMs >>> 32);
    }
    
    @Override
    public String toString() {
        final String audioUrl = this.audioUrl;
        final String description = this.description;
        final String id = this.id;
        final Show show = this.show;
        final String title = this.title;
        final long pubDateMs = this.pubDateMs;
        final StringBuilder y = mb0.y("PodcastEpisode(audioUrl=", audioUrl, ", description=", description, ", id=");
        y.append(id);
        y.append(", show=");
        y.append(show);
        y.append(", title=");
        y.append(title);
        y.append(", pubDateMs=");
        y.append(pubDateMs);
        y.append(")");
        return y.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/PodcastEpisode.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/PodcastEpisode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<PodcastEpisode>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.PodcastEpisode", (dzb)(INSTANCE = new $serializer()), 6);
            descriptor2.k("audioUrl", false);
            descriptor2.k("description", false);
            descriptor2.k("id", false);
            descriptor2.k("show", false);
            descriptor2.k("title", false);
            descriptor2.k("pubDateMs", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, (KSerializer)a, (KSerializer)a, (KSerializer)Show.$serializer.INSTANCE, (KSerializer)a, (KSerializer)mcg.a };
        }
        
        public PodcastEpisode deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            final Show show = null;
            long g = 0L;
            final String s2;
            final String s = s2 = null;
            String i;
            String m = i = s2;
            int j = 1;
            int n = 0;
            String k = s2;
            String l = s;
            Object x = show;
            while (j != 0) {
                final int o = c.o(descriptor);
                switch (o) {
                    default: {
                        throw new UnknownFieldException(o);
                    }
                    case 5: {
                        g = c.g(descriptor, 5);
                        n |= 0x20;
                        continue;
                    }
                    case 4: {
                        i = c.m(descriptor, 4);
                        n |= 0x10;
                        continue;
                    }
                    case 3: {
                        x = c.x(descriptor, 3, (DeserializationStrategy)Show.$serializer.INSTANCE, x);
                        n |= 0x8;
                        continue;
                    }
                    case 2: {
                        m = c.m(descriptor, 2);
                        n |= 0x4;
                        continue;
                    }
                    case 1: {
                        k = c.m(descriptor, 1);
                        n |= 0x2;
                        continue;
                    }
                    case 0: {
                        l = c.m(descriptor, 0);
                        n |= 0x1;
                        continue;
                    }
                    case -1: {
                        j = 0;
                        continue;
                    }
                }
            }
            c.d(descriptor);
            return new PodcastEpisode(n, l, k, m, (Show)x, i, g, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final PodcastEpisode podcastEpisode) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)podcastEpisode, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            PodcastEpisode.write$Self(podcastEpisode, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/PodcastEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/PodcastEpisode;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<PodcastEpisode> serializer() {
            return (KSerializer<PodcastEpisode>)$serializer.INSTANCE;
        }
    }
}
