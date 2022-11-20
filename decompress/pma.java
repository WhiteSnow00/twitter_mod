import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pma implements KSerializer<oma>
{
    public static final pma b;
    public final KSerializer<oma> a;
    
    static {
        b = new pma();
    }
    
    public pma() {
        final oma$b i = oma.i;
        czd.e((Object)i, "SERIALIZER");
        this.a = (lse$a)lse.b((rlp)i);
    }
    
    public final Object deserialize(final Decoder decoder) {
        czd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final oma oma = (oma)o;
        czd.f((Object)encoder, "encoder");
        czd.f((Object)oma, "value");
        this.a.serialize(encoder, (Object)oma);
    }
}
