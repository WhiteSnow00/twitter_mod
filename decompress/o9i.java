import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import com.twitter.model.narrowcast.NarrowcastError;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o9i implements KSerializer<NarrowcastError>
{
    public static final o9i b;
    public final KSerializer<NarrowcastError> a;
    
    static {
        b = new o9i();
    }
    
    public o9i() {
        this.a = (ite$a)ite.b((nmp)NarrowcastError.SERIALIZER);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final NarrowcastError narrowcastError = (NarrowcastError)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)narrowcastError, "value");
        this.a.serialize(encoder, (Object)narrowcastError);
    }
}
