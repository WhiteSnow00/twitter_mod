import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ziv extends ste implements qsb<lvj<Object, ? extends List<cep>>, fzv>
{
    public final ajv<Object, cep> D0;
    
    public ziv(final ajv<Object, cep> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        this.D0.f.onNext((Object)o);
        return fzv.a;
    }
}
