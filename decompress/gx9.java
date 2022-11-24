import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gx9 implements KSerializer<ex9>
{
    public static final gx9 b;
    public final KSerializer<ex9> a;
    
    static {
        b = new gx9();
    }
    
    public gx9() {
        final ex9.a u0 = ex9.U0;
        e0e.e((Object)u0, "SERIALIZER");
        this.a = (ite$a)ite.b((nmp)u0);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final ex9 ex9 = (ex9)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)ex9, "value");
        this.a.serialize(encoder, (Object)ex9);
    }
}
