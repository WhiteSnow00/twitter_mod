import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nav implements KSerializer<mav>
{
    public static final nav b;
    
    static {
        b = new nav();
    }
    
    public nav() {
        this.a = (ate$a)ate.b((alp)mav.k);
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final mav mav = (mav)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)mav, "value");
        this.a.serialize(encoder, (Object)mav);
    }
}
