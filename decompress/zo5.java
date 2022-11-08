import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zo5 implements KSerializer<lh5>
{
    public static final zo5 b;
    
    static {
        b = new zo5();
    }
    
    public zo5() {
        this.a = (ate$a)ate.b((alp)lh5.I);
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final lh5 lh5 = (lh5)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)lh5, "value");
        this.a.serialize(encoder, (Object)lh5);
    }
}
