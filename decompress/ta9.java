import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ta9 implements KSerializer<qa9>
{
    public static final ta9 b;
    public final KSerializer<qa9> a;
    
    static {
        b = new ta9();
    }
    
    public ta9() {
        final qa9$c i = qa9.I;
        e0e.e((Object)i, "SERIALIZER");
        this.a = (ite$a)ite.b((nmp)i);
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final qa9 qa9 = (qa9)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)qa9, "value");
        this.a.serialize(encoder, (Object)qa9);
    }
}
