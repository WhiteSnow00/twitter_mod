// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model.helpers;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b" }, d2 = { "Lcom/twitter/rooms/model/helpers/StationTrackType;", "", "(Ljava/lang/String;I)V", "PODCAST", "LIVE", "RECORDED", "$serializer", "Companion", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
@okp
public enum StationTrackType
{
    private static final gxe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    
    LIVE, 
    PODCAST, 
    RECORDED;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = rp2.y0(2, (otb)StationTrackType$a.C0);
    }
    
    public static final /* synthetic */ gxe access$get$cachedSerializer$delegate$cp() {
        return StationTrackType.$cachedSerializer$delegate;
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/helpers/StationTrackType.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/helpers/StationTrackType;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<StationTrackType>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            INSTANCE = new $serializer();
            final d8a descriptor2 = new d8a("com.twitter.rooms.model.helpers.StationTrackType", 3);
            ((kok)descriptor2).k("PODCAST", false);
            ((kok)descriptor2).k("LIVE", false);
            ((kok)descriptor2).k("RECORDED", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[0];
        }
        
        public StationTrackType deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            return StationTrackType.values()[decoder.f(this.getDescriptor())];
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final StationTrackType stationTrackType) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)stationTrackType, "value");
            encoder.u(this.getDescriptor(), stationTrackType.ordinal());
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/helpers/StationTrackType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/helpers/StationTrackType;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<StationTrackType> serializer() {
            return (KSerializer<StationTrackType>)StationTrackType.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
