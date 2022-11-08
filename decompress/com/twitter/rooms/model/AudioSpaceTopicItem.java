// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B!\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dB9\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006$" }, d2 = { "Lcom/twitter/rooms/model/AudioSpaceTopicItem;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "component2", "component3", "topicId", "name", "categoryId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTopicId", "()Ljava/lang/String;", "getName", "getCategoryId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class AudioSpaceTopicItem
{
    public static final Companion Companion;
    private final String categoryId;
    private final String name = name;
    private final String topicId = topicId;
    
    static {
        Companion = new Companion();
    }
    
    public AudioSpaceTopicItem(final String topicId, final String name, final String categoryId) {
        mo0.z(topicId, "topicId", name, "name", categoryId, "categoryId");
        this.topicId = topicId;
        this.name = name;
        this.categoryId = categoryId;
    }
    
    public static final void write$Self(final AudioSpaceTopicItem audioSpaceTopicItem, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)audioSpaceTopicItem, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final String topicId = audioSpaceTopicItem.topicId;
        boolean b = false;
        sd6.S(serialDescriptor, 0, topicId);
        sd6.S(serialDescriptor, 1, audioSpaceTopicItem.name);
        Label_0075: {
            if (!sd6.z(serialDescriptor)) {
                if (zzd.a((Object)audioSpaceTopicItem.categoryId, (Object)"")) {
                    break Label_0075;
                }
            }
            b = true;
        }
        if (b) {
            sd6.S(serialDescriptor, 2, audioSpaceTopicItem.categoryId);
        }
    }
    
    public final String component1() {
        return this.topicId;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.categoryId;
    }
    
    public final AudioSpaceTopicItem copy(final String s, final String s2, final String s3) {
        zzd.f((Object)s, "topicId");
        zzd.f((Object)s2, "name");
        zzd.f((Object)s3, "categoryId");
        return new AudioSpaceTopicItem(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioSpaceTopicItem)) {
            return false;
        }
        final AudioSpaceTopicItem audioSpaceTopicItem = (AudioSpaceTopicItem)o;
        return zzd.a((Object)this.topicId, (Object)audioSpaceTopicItem.topicId) && zzd.a((Object)this.name, (Object)audioSpaceTopicItem.name) && zzd.a((Object)this.categoryId, (Object)audioSpaceTopicItem.categoryId);
    }
    
    public final String getCategoryId() {
        return this.categoryId;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getTopicId() {
        return this.topicId;
    }
    
    @Override
    public int hashCode() {
        return this.categoryId.hashCode() + l7k.a(this.name, this.topicId.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        return hi.I(mb0.y("AudioSpaceTopicItem(topicId=", this.topicId, ", name=", this.name, ", categoryId="), this.categoryId, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/AudioSpaceTopicItem.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/AudioSpaceTopicItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<AudioSpaceTopicItem>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.AudioSpaceTopicItem", (dzb)(INSTANCE = new $serializer()), 3);
            descriptor2.k("topicId", false);
            descriptor2.k("name", false);
            descriptor2.k("categoryId", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, (KSerializer)a, (KSerializer)a };
        }
        
        public AudioSpaceTopicItem deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            String m = null;
            String j;
            String i = j = m;
            int k = 1;
            int n = 0;
            while (k != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                throw new UnknownFieldException(o);
                            }
                            j = c.m(descriptor, 2);
                            n |= 0x4;
                        }
                        else {
                            i = c.m(descriptor, 1);
                            n |= 0x2;
                        }
                    }
                    else {
                        m = c.m(descriptor, 0);
                        n |= 0x1;
                    }
                }
                else {
                    k = 0;
                }
            }
            c.d(descriptor);
            return new AudioSpaceTopicItem(n, m, i, j, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final AudioSpaceTopicItem audioSpaceTopicItem) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)audioSpaceTopicItem, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            AudioSpaceTopicItem.write$Self(audioSpaceTopicItem, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/AudioSpaceTopicItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/AudioSpaceTopicItem;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<AudioSpaceTopicItem> serializer() {
            return (KSerializer<AudioSpaceTopicItem>)$serializer.INSTANCE;
        }
    }
}
