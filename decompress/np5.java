import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class np5 implements KSerializer<yh5>
{
    public static final np5 b;
    public final KSerializer<yh5> a;
    
    static {
        b = new np5();
    }
    
    public np5() {
        this.a = (ite$a)ite.b((nmp)yh5.I);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final yh5 yh5 = (yh5)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)yh5, "value");
        this.a.serialize(encoder, (Object)yh5);
    }
}
