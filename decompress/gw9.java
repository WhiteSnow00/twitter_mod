import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gw9 implements KSerializer<ew9>
{
    public static final gw9 b;
    public final KSerializer<ew9> a;
    
    static {
        b = new gw9();
    }
    
    public gw9() {
        final ew9$a s0 = ew9.S0;
        czd.e((Object)s0, "SERIALIZER");
        this.a = (lse$a)lse.b((rlp)s0);
    }
    
    public final Object deserialize(final Decoder decoder) {
        czd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final ew9 ew9 = (ew9)o;
        czd.f((Object)encoder, "encoder");
        czd.f((Object)ew9, "value");
        this.a.serialize(encoder, (Object)ew9);
    }
}
