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
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018B/\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c2\u0003J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u00c7\u0001J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/rooms/model/RaisedHand;", "", "", "component1", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "emoji", "getEmoji", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class RaisedHand
{
    public static final Companion Companion;
    private static final RaisedHand DEFAULT;
    private final String emoji;
    private final String value = s;
    
    static {
        Companion = new Companion();
        DEFAULT = new RaisedHand(null);
    }
    
    public RaisedHand(String s) {
        this.value = s;
        if (s == null || ckr.h1((CharSequence)s)) {
            s = null;
        }
        this.emoji = s;
    }
    
    private final String component1() {
        return this.value;
    }
    
    public static final void write$Self(final RaisedHand raisedHand, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)raisedHand, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final njr a = njr.a;
        final String value = raisedHand.value;
        final int n = 0;
        sd6.x(serialDescriptor, 0, (skp)a, (Object)value);
        int n2 = 0;
        Label_0126: {
            if (!sd6.z(serialDescriptor)) {
                final String emoji = raisedHand.emoji;
                final String value2 = raisedHand.value;
                String value3;
                if (value2 != null && !ckr.h1((CharSequence)value2)) {
                    value3 = raisedHand.value;
                }
                else {
                    value3 = null;
                }
                n2 = n;
                if (zzd.a((Object)emoji, (Object)value3)) {
                    break Label_0126;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 1, (skp)a, (Object)raisedHand.emoji);
        }
    }
    
    public final RaisedHand copy(final String s) {
        return new RaisedHand(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof RaisedHand && zzd.a((Object)this.value, (Object)((RaisedHand)o).value));
    }
    
    public final String getEmoji() {
        return this.emoji;
    }
    
    @Override
    public int hashCode() {
        final String value = this.value;
        int hashCode;
        if (value == null) {
            hashCode = 0;
        }
        else {
            hashCode = value.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        return zi.y("RaisedHand(value=", this.value, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/RaisedHand.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/RaisedHand;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<RaisedHand>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.RaisedHand", (dzb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("value", false);
            descriptor2.k("emoji", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public RaisedHand deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n2;
            Object n = n2 = null;
            int i = 1;
            int n3 = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        n2 = c.n(descriptor, 1, (DeserializationStrategy)njr.a, n2);
                        n3 |= 0x2;
                    }
                    else {
                        n = c.n(descriptor, 0, (DeserializationStrategy)njr.a, n);
                        n3 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new RaisedHand(n3, (String)n, (String)n2, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final RaisedHand raisedHand) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)raisedHand, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            RaisedHand.write$Self(raisedHand, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/RaisedHand$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/RaisedHand;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<RaisedHand> serializer() {
            return (KSerializer<RaisedHand>)$serializer.INSTANCE;
        }
    }
}
