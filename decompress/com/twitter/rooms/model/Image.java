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

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bB-\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\"" }, d2 = { "Lcom/twitter/rooms/model/Image;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "component2", "is_profile_image", "url", "copy", "toString", "", "hashCode", "other", "equals", "Z", "()Z", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(ZLjava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(IZLjava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class Image
{
    public static final Companion Companion;
    private final boolean is_profile_image = is_profile_image;
    private final String url = url;
    
    static {
        Companion = new Companion();
    }
    
    public Image(final boolean is_profile_image, final String url) {
        zzd.f((Object)url, "url");
        this.is_profile_image = is_profile_image;
        this.url = url;
    }
    
    public static final void write$Self(final Image image, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)image, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.R(serialDescriptor, 0, image.is_profile_image);
        sd6.S(serialDescriptor, 1, image.url);
    }
    
    public final boolean component1() {
        return this.is_profile_image;
    }
    
    public final String component2() {
        return this.url;
    }
    
    public final Image copy(final boolean b, final String s) {
        zzd.f((Object)s, "url");
        return new Image(b, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Image)) {
            return false;
        }
        final Image image = (Image)o;
        return this.is_profile_image == image.is_profile_image && zzd.a((Object)this.url, (Object)image.url);
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        int is_profile_image;
        if ((is_profile_image = (this.is_profile_image ? 1 : 0)) != 0) {
            is_profile_image = 1;
        }
        return this.url.hashCode() + is_profile_image * 31;
    }
    
    public final boolean is_profile_image() {
        return this.is_profile_image;
    }
    
    @Override
    public String toString() {
        final boolean is_profile_image = this.is_profile_image;
        final String url = this.url;
        final StringBuilder sb = new StringBuilder();
        sb.append("Image(is_profile_image=");
        sb.append(is_profile_image);
        sb.append(", url=");
        sb.append(url);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/Image.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/Image;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<Image>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.Image", (dzb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("is_profile_image", false);
            descriptor2.k("url", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)k72.a, (KSerializer)njr.a };
        }
        
        public Image deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            String m = null;
            int i = 1;
            int n = 0;
            boolean b = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        m = c.m(descriptor, 1);
                        n |= 0x2;
                    }
                    else {
                        b = c.B(descriptor, 0);
                        n |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new Image(n, b, m, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final Image image) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)image, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            Image.write$Self(image, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/Image$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/Image;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<Image> serializer() {
            return (KSerializer<Image>)$serializer.INSTANCE;
        }
    }
}
