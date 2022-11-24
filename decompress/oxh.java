import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxh implements KSerializer<cxh>
{
    public static final oxh b;
    public final KSerializer<cxh> a;
    
    static {
        b = new oxh();
    }
    
    public oxh() {
        final cxh$b h = cxh.h;
        e0e.e((Object)h, "SERIALIZER");
        this.a = (ite$a)ite.b((nmp)h);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final cxh cxh = (cxh)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)cxh, "value");
        this.a.serialize(encoder, (Object)cxh);
    }
}
