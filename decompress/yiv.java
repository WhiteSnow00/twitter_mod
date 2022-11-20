import java.util.concurrent.Callable;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yiv extends ste implements qsb<lvj<Object, ? extends String>, taj<? extends lvj<Object, ? extends List<cep>>>>
{
    public final ajv<Object, cep> D0;
    
    public yiv(final ajv<Object, cep> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object d0) {
        final lvj lvj = (lvj)d0;
        czd.f((Object)lvj, "<name for destructuring parameter 0>");
        d0 = lvj.D0;
        final String s = (String)lvj.E0;
        final q28 q28 = (q28)this.D0;
        Objects.requireNonNull(q28);
        final d38 d2 = (d38)d0;
        czd.f((Object)d2, "token");
        ikr.g((CharSequence)d2.a);
        Objects.requireNonNull(q28);
        return eaq.Q((lcq)q28.l.R((Object)new eur(d2.a, d2.b)).I(((ajv)q28).e).w((psb)new ld5((qsb)r28.D0, 6)), (lcq)eaq.t((Callable)new pq3((Object)q28, (Object)d2, 2)).I(((ajv)q28).e).w((psb)new pgl((qsb)new v28(q28), 5)), (zv1)new a2q((ftb)new s28(q28), 2)).s((psb)new qo((qsb)new xiv((ajv)this.D0, d0, s), 11));
    }
}
