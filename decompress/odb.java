// 
// Decompiled by Procyon v0.6.0
// 

public final class odb extends ste implements qsb<teb, fzv>
{
    public final puh<teb> D0;
    public final qsb<teb, fzv> E0;
    
    public odb(final puh<teb> d0, final qsb<? super teb, fzv> e0) {
        this.D0 = d0;
        this.E0 = (qsb<teb, fzv>)e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final teb value = (teb)o;
        czd.f((Object)value, "it");
        if (!czd.a(this.D0.getValue(), (Object)value)) {
            this.D0.setValue((Object)value);
            this.E0.invoke((Object)value);
        }
        return fzv.a;
    }
}
