import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxg implements KSerializer<lxg>
{
    public static final pxg b;
    public final KSerializer<lxg> a;
    
    static {
        b = new pxg();
    }
    
    public pxg() {
        this.a = (ite$a)ite.b((nmp)new lxg$b());
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final lxg lxg = (lxg)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)lxg, "value");
        this.a.serialize(encoder, (Object)lxg);
    }
}
