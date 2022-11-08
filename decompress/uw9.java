import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uw9 implements KSerializer<rw9>
{
    public static final uw9 b;
    
    static {
        b = new uw9();
    }
    
    public uw9() {
        final rw9$a r0 = rw9.R0;
        zzd.e((Object)r0, "SERIALIZER");
        this.a = (ate$a)ate.b((alp)r0);
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final rw9 rw9 = (rw9)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)rw9, "value");
        this.a.serialize(encoder, (Object)rw9);
    }
}
