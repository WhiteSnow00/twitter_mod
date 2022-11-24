import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class shk implements KSerializer<v1c>
{
    public static final shk b;
    public final KSerializer<v1c> a;
    
    static {
        b = new shk();
    }
    
    public shk() {
        this.a = (ite$a)ite.b((nmp)v1c.d);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final v1c v1c = (v1c)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)v1c, "value");
        this.a.serialize(encoder, (Object)v1c);
    }
}
