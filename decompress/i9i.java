import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i9i implements KSerializer<h9i>
{
    public static final i9i b;
    public final KSerializer<h9i> a;
    
    static {
        b = new i9i();
    }
    
    public i9i() {
        this.a = (lse$a)lse.b((rlp)h9i.a);
    }
    
    public final Object deserialize(final Decoder decoder) {
        czd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final h9i h9i = (h9i)o;
        czd.f((Object)encoder, "encoder");
        czd.f((Object)h9i, "value");
        this.a.serialize(encoder, (Object)h9i);
    }
}
