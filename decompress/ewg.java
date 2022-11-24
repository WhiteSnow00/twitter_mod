import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewg implements KSerializer<dwg>
{
    public static final ewg b;
    public final KSerializer<dwg> a;
    
    static {
        b = new ewg();
    }
    
    public ewg() {
        this.a = (ite$a)ite.b((nmp)new dwg$a());
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final dwg dwg = (dwg)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)dwg, "value");
        this.a.serialize(encoder, (Object)dwg);
    }
}
