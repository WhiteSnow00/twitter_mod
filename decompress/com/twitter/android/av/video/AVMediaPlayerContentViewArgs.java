// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.video;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0002#\"B#\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cB;\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019¨\u0006$" }, d2 = { "Lcom/twitter/android/av/video/AVMediaPlayerContentViewArgs;", "Lcom/twitter/android/av/video/TwitterMediaPlayerArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "fromDock", "Z", "getFromDock", "()Z", "Lh1;", "dataSource", "Lh1;", "getDataSource", "()Lh1;", "getDataSource$annotations", "()V", "Lsfv;", "scribeAssociation", "Lsfv;", "getScribeAssociation", "()Lsfv;", "getScribeAssociation$annotations", "<init>", "(Lh1;Lsfv;Z)V", "", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILh1;Lsfv;ZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public class AVMediaPlayerContentViewArgs extends TwitterMediaPlayerArgs
{
    public static final AVMediaPlayerContentViewArgs.AVMediaPlayerContentViewArgs$Companion Companion;
    private final h1 dataSource;
    private final boolean fromDock;
    private final sfv scribeAssociation;
    
    static {
        Companion = new AVMediaPlayerContentViewArgs.AVMediaPlayerContentViewArgs$Companion();
    }
    
    public AVMediaPlayerContentViewArgs(final int n, @bmp(with = x1v.class) final h1 dataSource, @bmp(with = tfv.class) final sfv scribeAssociation, final boolean fromDock, final dmp dmp) {
        if (0x7 == (n & 0x7)) {
            super(n, (dmp)null);
            this.dataSource = dataSource;
            this.scribeAssociation = scribeAssociation;
            this.fromDock = fromDock;
            return;
        }
        shw.V0(n, 7, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public AVMediaPlayerContentViewArgs(final h1 dataSource, final sfv scribeAssociation, final boolean fromDock) {
        super((wg8)null);
        this.dataSource = dataSource;
        this.scribeAssociation = scribeAssociation;
        this.fromDock = fromDock;
    }
    
    @bmp(with = x1v.class)
    public static void getDataSource$annotations() {
    }
    
    @bmp(with = tfv.class)
    public static void getScribeAssociation$annotations() {
    }
    
    public static final void write$Self(final AVMediaPlayerContentViewArgs avMediaPlayerContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)avMediaPlayerContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        TwitterMediaPlayerArgs.write$Self((TwitterMediaPlayerArgs)avMediaPlayerContentViewArgs, ee6, serialDescriptor);
        ee6.y(serialDescriptor, 0, (fmp)x1v.b, (Object)avMediaPlayerContentViewArgs.getDataSource());
        ee6.y(serialDescriptor, 1, (fmp)tfv.b, (Object)avMediaPlayerContentViewArgs.getScribeAssociation());
        ee6.R(serialDescriptor, 2, avMediaPlayerContentViewArgs.getFromDock());
    }
    
    public h1 getDataSource() {
        return this.dataSource;
    }
    
    public boolean getFromDock() {
        return this.fromDock;
    }
    
    public sfv getScribeAssociation() {
        return this.scribeAssociation;
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/android/av/video/AVMediaPlayerContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/android/av/video/AVMediaPlayerContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<AVMediaPlayerContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.android.av.video.AVMediaPlayerContentViewArgs", (ezb)(INSTANCE = new $serializer()), 3);
            descriptor2.k("dataSource", false);
            descriptor2.k("scribeAssociation", false);
            descriptor2.k("fromDock", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)x1v.b), BuiltinSerializersKt.e((KSerializer)tfv.b), (KSerializer)p72.a };
        }
        
        public AVMediaPlayerContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n2 = null;
            int i = 1;
            int n3 = 0;
            boolean b = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                throw new UnknownFieldException(o);
                            }
                            b = c.B(descriptor, 2);
                            n3 |= 0x4;
                        }
                        else {
                            n2 = c.n(descriptor, 1, (DeserializationStrategy)tfv.b, n2);
                            n3 |= 0x2;
                        }
                    }
                    else {
                        n = c.n(descriptor, 0, (DeserializationStrategy)x1v.b, n);
                        n3 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new AVMediaPlayerContentViewArgs(n3, (h1)n, (sfv)n2, b, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final AVMediaPlayerContentViewArgs avMediaPlayerContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)avMediaPlayerContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            AVMediaPlayerContentViewArgs.write$Self(avMediaPlayerContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (AVMediaPlayerContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
