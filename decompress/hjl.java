import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjl implements KSerializer<gjl>
{
    public static final hjl b;
    public final KSerializer<gjl> a;
    
    static {
        b = new hjl();
    }
    
    public hjl() {
        final gjl$b n = gjl.n;
        e0e.e((Object)n, "SERIALIZER");
        this.a = (ite$a)ite.b((nmp)n);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final gjl gjl = (gjl)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)gjl, "value");
        this.a.serialize(encoder, (Object)gjl);
    }
}
