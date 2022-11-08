import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vdj implements KSerializer<udj>
{
    public static final vdj b;
    
    static {
        b = new vdj();
    }
    
    public vdj() {
        this.a = (ate$a)ate.b((alp)new udj.a());
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final udj udj = (udj)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)udj, "value");
        this.a.serialize(encoder, (Object)udj);
    }
}
