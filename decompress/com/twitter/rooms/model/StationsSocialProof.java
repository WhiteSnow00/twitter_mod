// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B)\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010!B?\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006(" }, d2 = { "Lcom/twitter/rooms/model/StationsSocialProof;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "Lcom/twitter/rooms/model/Image;", "component2", "component3", "text", "facePile", "iconDescription", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Ljava/util/List;", "getFacePile", "()Ljava/util/List;", "getIconDescription", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class StationsSocialProof
{
    public static final Companion Companion;
    private final List<Image> facePile = facePile;
    private final String iconDescription = iconDescription;
    private final String text = text;
    
    static {
        Companion = new Companion();
    }
    
    public StationsSocialProof(final String text, final List<Image> facePile, final String iconDescription) {
        zzd.f((Object)text, "text");
        this.text = text;
        this.facePile = facePile;
        this.iconDescription = iconDescription;
    }
    
    public static final void write$Self(final StationsSocialProof stationsSocialProof, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)stationsSocialProof, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, stationsSocialProof.text);
        sd6.x(serialDescriptor, 1, (skp)new ys0((KSerializer)Image.$serializer.INSTANCE), (Object)stationsSocialProof.facePile);
        sd6.x(serialDescriptor, 2, (skp)njr.a, (Object)stationsSocialProof.iconDescription);
    }
    
    public final String component1() {
        return this.text;
    }
    
    public final List<Image> component2() {
        return this.facePile;
    }
    
    public final String component3() {
        return this.iconDescription;
    }
    
    public final StationsSocialProof copy(final String s, final List<Image> list, final String s2) {
        zzd.f((Object)s, "text");
        return new StationsSocialProof(s, list, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StationsSocialProof)) {
            return false;
        }
        final StationsSocialProof stationsSocialProof = (StationsSocialProof)o;
        return zzd.a((Object)this.text, (Object)stationsSocialProof.text) && zzd.a((Object)this.facePile, (Object)stationsSocialProof.facePile) && zzd.a((Object)this.iconDescription, (Object)stationsSocialProof.iconDescription);
    }
    
    public final List<Image> getFacePile() {
        return this.facePile;
    }
    
    public final String getIconDescription() {
        return this.iconDescription;
    }
    
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.text.hashCode();
        final List<Image> facePile = this.facePile;
        int hashCode2 = 0;
        int hashCode3;
        if (facePile == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = facePile.hashCode();
        }
        final String iconDescription = this.iconDescription;
        if (iconDescription != null) {
            hashCode2 = iconDescription.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        return hi.I(gp.B("StationsSocialProof(text=", this.text, ", facePile=", (List)this.facePile, ", iconDescription="), this.iconDescription, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/StationsSocialProof.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/StationsSocialProof;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<StationsSocialProof>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.StationsSocialProof", (dzb)(INSTANCE = new $serializer()), 3);
            descriptor2.k("text", false);
            descriptor2.k("facePile", false);
            descriptor2.k("iconDescription", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, BuiltinSerializersKt.e((KSerializer)new ys0((KSerializer)Image.$serializer.INSTANCE)), BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public StationsSocialProof deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            String m;
            Object n2 = m = null;
            int n3 = 0;
            int i = 1;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                throw new UnknownFieldException(o);
                            }
                            n2 = c.n(descriptor, 2, (DeserializationStrategy)njr.a, n2);
                            n3 |= 0x4;
                        }
                        else {
                            n = c.n(descriptor, 1, (DeserializationStrategy)new ys0((KSerializer)Image.$serializer.INSTANCE), n);
                            n3 |= 0x2;
                        }
                    }
                    else {
                        m = c.m(descriptor, 0);
                        n3 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new StationsSocialProof(n3, m, (List)n, (String)n2, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final StationsSocialProof stationsSocialProof) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)stationsSocialProof, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            StationsSocialProof.write$Self(stationsSocialProof, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/StationsSocialProof$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/StationsSocialProof;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<StationsSocialProof> serializer() {
            return (KSerializer<StationsSocialProof>)$serializer.INSTANCE;
        }
    }
}
