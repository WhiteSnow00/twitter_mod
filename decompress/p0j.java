import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0j implements KSerializer<o0j$b>
{
    public static final p0j b;
    public final KSerializer<o0j$b> a;
    
    static {
        b = new p0j();
    }
    
    public p0j() {
        this.a = (ite$a)ite.b((nmp)o0j$b.g);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final o0j$b o0j$b = (o0j$b)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)o0j$b, "value");
        this.a.serialize(encoder, (Object)o0j$b);
    }
}
