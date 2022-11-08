import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lt5 implements KSerializer<kt5>
{
    public static final lt5 b;
    
    static {
        b = new lt5();
    }
    
    public lt5() {
        this.a = (ate$a)ate.b((alp)kt5.d);
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final kt5 kt5 = (kt5)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)kt5, "value");
        this.a.serialize(encoder, (Object)kt5);
    }
}
