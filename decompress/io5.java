import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class io5 implements KSerializer<tg5>
{
    public static final io5 b;
    public final KSerializer<tg5> a;
    
    static {
        b = new io5();
    }
    
    public io5() {
        this.a = (lse$a)lse.b((rlp)tg5.I);
    }
    
    public final Object deserialize(final Decoder decoder) {
        czd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final tg5 tg5 = (tg5)o;
        czd.f((Object)encoder, "encoder");
        czd.f((Object)tg5, "value");
        this.a.serialize(encoder, (Object)tg5);
    }
}
