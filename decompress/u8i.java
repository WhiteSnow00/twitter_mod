import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import com.twitter.model.narrowcast.NarrowcastError;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8i implements KSerializer<NarrowcastError>
{
    public static final u8i b;
    
    static {
        b = new u8i();
    }
    
    public u8i() {
        this.a = (ate$a)ate.b((alp)NarrowcastError.SERIALIZER);
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final NarrowcastError narrowcastError = (NarrowcastError)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)narrowcastError, "value");
        this.a.serialize(encoder, (Object)narrowcastError);
    }
}
